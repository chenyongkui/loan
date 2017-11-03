package com.cdyy.loan.web;

import com.cdyy.loan.pojo.po.LoanCustomer;
import com.cdyy.loan.pojo.vo.Bank;
import com.cdyy.loan.pojo.vo.Capital;
import com.cdyy.loan.pojo.vo.Customer;
import com.cdyy.loan.service.BankService;
import com.cdyy.loan.service.CapitalService;
import com.cdyy.loan.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@Scope("prototype")
public class CustomerAction {

    @Autowired
    private CustomerService customerService;

    @Autowired
    private CapitalService capitalService;

    @Autowired
    private BankService bankService;

    //登录校验
    @ResponseBody
    @RequestMapping("login/cusLogin")
    public Map<String, Object> cusLogin(Customer customer, HttpSession session, HttpServletRequest req) throws Exception{


        System.out.println( customer.getUserpwd());
        System.out.println( customer.getUsername());
        Map<String, Object> map=new HashMap<>();
        map.put("phone", customer.getUsername());
        map.put("username", customer.getUsername());
        map.put("userpwd1", customer.getUserpwd());

        customer=customerService.cusLogin(map);
        System.out.println(customer);
        if(customer!=null){
            System.out.println(customer.getUsername());
            /*String name=null,idex=null,end = null,phoneindex=null;
            if(!"".equals(customer.getIdnumber())&&!"".equals(customer.getRealname())&&customer.getIdnumber()!=null&&customer.getRealname()!=null){
                idex = customer.getIdnumber().substring(0, 3);
                end = customer.getIdnumber().substring(14, 18);
                name = customer.getRealname().substring(1, customer.getRealname().length());
                customer.setRealname("*"+name);
                customer.setIdnumber(idex+"**************"+end);
			*//*	phoneindex = customer.getPhone().substring(0,3);*//*
                //phoneend = customer.getPhone().substring(8, 11);
				*//*customer.setCodephone(phoneindex+"*******"+phoneend);*//*
            }*/

            Capital capital =  capitalService.selectByCapital(customer.getUid());
            List<Bank> bank = bankService.queryByUid(customer.getUid());
            if (bank==null ||bank.isEmpty()){

            }
            session.setAttribute("bank",bank);
            session.setAttribute("capital",capital);
            session.setAttribute("customer", customer);
            HttpSession s = req.getSession();
            s.setAttribute("errorcode", "ok");
            map.put("result", "success");

        }else{
            map.put("result", "用户名或密码错误");
        }
        return map;
    }
    //注册
    @ResponseBody
    @RequestMapping("register/userregister")
    public Integer register(LoanCustomer loanCustomer) {
        int count = customerService.addCustomer(loanCustomer);
        return count;
    }


    //注销
    @RequestMapping("/logOut")
    public String logOut(HttpSession session) {
        session.removeAttribute("customer");
        return "client/index";
    }
}
