package com.cdyy.loan.web;

import com.cdyy.common.utils.IDUtils;
import com.cdyy.loan.pojo.po.LoanCapital;
import com.cdyy.loan.pojo.vo.Bank;

import com.cdyy.loan.pojo.vo.Capital;
import com.cdyy.loan.pojo.vo.Customer;
import com.cdyy.loan.pojo.vo.Recharge;
import com.cdyy.loan.service.BankService;
import com.cdyy.loan.service.CapitalService;
import com.cdyy.loan.service.RechargeService;
import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@Scope("prototype")
public class RechargeAction {

    @Autowired
    private BankService bankService;
    @Autowired
    private RechargeService rechargeService;
    @Autowired
    private CapitalService capitalService;

    //判断银行卡是否存在
    @RequestMapping("/queryByBank")
    @ResponseBody
    public Map<String, Object> queryByBank(HttpServletRequest request) {
        HttpSession session = request.getSession();
        Customer cus = (Customer) session.getAttribute("customer");
        List<Bank> bank = bankService.queryByUid(cus.getUid());
        Map<String, Object> map = new HashMap<String, Object>();
        if (bank.isEmpty()) {
            map.put("errorMsg", "请先添加银行卡！");
            map.put("result", "fail");
        } else {
            map.put("result", "seccuss");
        }
        //request.setAttribute("bank", bank);
        session.setAttribute("bank",bank);
        return map;
    }

    //充值
    @RequestMapping("/recharge/add")
    public String add(Recharge recharge, HttpServletRequest request) throws Exception {
        HttpSession session = request.getSession();
        Customer customer = (Customer) session.getAttribute("customer");
        recharge.setUid(customer.getUid());
        recharge.setRtype(2);//充值类型 1:支付宝 2：银行
        recharge.setRcounterfee(0.0);

        recharge.setRactual(recharge.getRmoney());
        recharge.setRstate(1);//状态 1:待付款 2：已付款
        recharge.setRserial("");
        recharge.setRtime(new Date());
        long rid = IDUtils.getItemId();
        recharge.setRid(rid);
       List<Bank> bank = (List<Bank>) session.getAttribute("bank");
        recharge.setRbid(bank.get(0).getBid());
        int id = rechargeService.insertSelective(recharge);
        System.out.println(id);
        if (id != 0) {
            //int rid=rechargeService.queryByRserial(recharge);
            session.setAttribute("id", rid);
        }
        request.setAttribute("money", recharge.getRmoney());
        return "recharge/LastStep";
    }

    @RequestMapping("/recharge/update")
    @ResponseBody
    public Map<String, Object> upDate(Recharge recharge,HttpServletRequest request) throws Exception{
        recharge.setRstate(2);
        HttpSession session=request.getSession();
        Customer customer=(Customer)session.getAttribute("customer");
        int i=rechargeService.updateRecharge(recharge);
        Map<String, Object> map = new HashMap<String,Object>();


        Capital c=capitalService.selectByCapital(customer.getUid());
        System.out.println(c);
        if(c!=null && !"".equals(c)){
            Capital capital=new Capital();
            capital.setCid(c.getCid());
            capital.setAllasset(recharge.getRmoney()+c.getAllasset());//资产总额
            capital.setAvailable(recharge.getRmoney()+c.getAvailable());//可用金额
            capital.setCtime(new Date());
            capitalService.updateCapital(capital);

            session.setAttribute("capital",capital);
        }else{
            Capital capital=new Capital();
            capital.setUid(customer.getUid());
            capital.setAllasset(recharge.getRmoney());
            capital.setAvailable(recharge.getRmoney());
            capital.setCtime(new Date());
            capitalService.insertSelective(capital);
        }
        if(i==0){
            map.put("errorMsg", "请先添加银行卡！");
            map.put("result", "fail");
        }else{
            map.put("result","seccuss");
        }
        return map;
    }
}
