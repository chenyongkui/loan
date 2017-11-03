package com.cdyy.loan.web;

import com.cdyy.common.dto.Page2;
import com.cdyy.common.utils.IDUtils;
import com.cdyy.loan.pojo.vo.Bank;
import com.cdyy.loan.pojo.vo.Capital;
import com.cdyy.loan.pojo.vo.Customer;
import com.cdyy.loan.pojo.vo.Withdrawals;
import com.cdyy.loan.service.CapitalService;
import com.cdyy.loan.service.WithdrawalsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@Scope("prototype")
public class WithdrawalsAction {

    @Autowired
    private WithdrawalsService withdrawalsService;
    @Autowired
    private CapitalService capitalService;

    @RequestMapping(value="/withdrawals",method= RequestMethod.POST)
    public String save(Withdrawals withdrawals, HttpServletRequest request) throws Exception{

        HttpSession session = request.getSession();
        List<Bank> bank = (List<Bank>) session.getAttribute("bank");
        Customer cus=(Customer)session.getAttribute("customer");
        long wid = IDUtils.getItemId();
        withdrawals.setWid(wid);
        withdrawals.setBid(bank.get(0).getBid());
        withdrawals.setUid(cus.getUid());
        withdrawals.setWstate(1);
        withdrawals.setWtime(new Date());

        withdrawalsService.insertSelective(withdrawals);

        Capital capital=capitalService.selectByCapital(cus.getUid());

        capital.setAllasset(capital.getAllasset()-withdrawals.getWmoney());//资产总额
        capital.setAvailable(capital.getAvailable()-withdrawals.getWmoney());//可用金额

        capital.setCtime(new Date());
        capitalService.updateCapital(capital);
        session.setAttribute("capital",capital);

        Page2 pageBean = new Page2(1,5);
        int total = withdrawalsService.withdrawalsCount();
        Map<String,Object> map = new HashMap<>();
        pageBean.setTotal(total);
        map.put("start",pageBean.getStart());
        map.put("pageSize",pageBean.getPageSize());
        map.put("uid",cus.getUid());
        List<Withdrawals> witList = withdrawalsService.selectWithdrawals(map);

        session.setAttribute("witList",witList);
        session.setAttribute("Page",pageBean);
        //queryAll(withdrawals, request, null, 0);
        return "/client/fundsAll";
    }

    @RequestMapping(value="/withdrawalsList")
    public String queryAll(Withdrawals withdrawals, HttpSession session,@RequestParam("page")int page,@RequestParam("pageSize")int pageSize) throws Exception {
        Customer cus=(Customer)session.getAttribute("customer");

        Page2 pageBean = new Page2(page,pageSize);

        int total = withdrawalsService.withdrawalsCount();
        Map<String,Object> map = new HashMap<>();
        pageBean.setTotal(total);
        map.put("start",pageBean.getStart());
        map.put("pageSize",pageBean.getPageSize());
        map.put("uid",cus.getUid());
        List<Withdrawals> witList = withdrawalsService.selectWithdrawals(map);

        session.setAttribute("witList",witList);
        session.setAttribute("Page",pageBean);

        return "/client/fundsAll";
    }

}
