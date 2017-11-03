package com.cdyy.loan.web;

import com.cdyy.common.dto.Page2;
import com.cdyy.loan.pojo.vo.Customer;
import com.cdyy.loan.pojo.vo.Recharge;
import com.cdyy.loan.service.RechargeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@Scope("prototype")
public class RechargeJ1Action {

    @Autowired
    private RechargeService rechargeService;
    //充值记录
    @RequestMapping("/rechargeJl")
    public String rechargeJl(HttpSession session) {
        Customer customer = (Customer) session.getAttribute("customer");

        Page2 pageBean1 = new Page2(1,5);
        int total = rechargeService.rechargeCount();
        Map<String,Object> map = new HashMap<>();
        pageBean1.setTotal(total);
        map.put("start",pageBean1.getStart());
        map.put("pageSize",pageBean1.getPageSize());
        map.put("uid",customer.getUid());

        List<Recharge> rechargeList = rechargeService.selectRecharge(map);
        session.setAttribute("rechargeList",rechargeList);
        return "client/rechargeJl";
    }
    @RequestMapping("/rechargeJlList")
    public String rechargeJlList(HttpSession session, @RequestParam("page")int page, @RequestParam("pageSize")int pageSize) {
        Customer customer = (Customer) session.getAttribute("customer");

        Page2 pageBean1 = new Page2(page,pageSize);
        int total = rechargeService.rechargeCount();
        Map<String,Object> map = new HashMap<>();
        pageBean1.setTotal(total);
        map.put("start",pageBean1.getStart());
        map.put("pageSize",pageBean1.getPageSize());
        map.put("uid",customer.getUid());
        List<Recharge> rechargeList = rechargeService.selectRecharge(map);
        session.setAttribute("rechargeList",rechargeList);
        session.setAttribute("Page",pageBean1);
        return "client/rechargeJl";
    }
}
