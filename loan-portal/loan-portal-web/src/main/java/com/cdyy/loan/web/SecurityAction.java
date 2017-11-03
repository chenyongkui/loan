package com.cdyy.loan.web;

import com.cdyy.loan.pojo.po.LoanCustomer;
import com.cdyy.loan.pojo.vo.Customer;
import com.cdyy.loan.service.SecurityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

@Controller
@Scope("prototype")
public class SecurityAction {
/**
 * 修改客户登录密码
 */
    @Autowired
    private SecurityService securityService;

    @RequestMapping("/updatePassword")
    public String updatePassword(HttpSession session, @RequestParam("newPassword") String newPassword) {
        Customer customer = (Customer) session.getAttribute("customer");
        //System.out.println(customer.getSex()+"222222222222");
        customer.setUserpwd(newPassword);
        //System.out.println(newPassword+"qweqeq");
        securityService.updatePassword(customer);
        session.removeAttribute("customer");
        return "client/login";
    }

    @RequestMapping("/UpdatePhoneNumber")
    public String updatePhoneNumber(Customer customer,HttpSession session) {

        Customer customer1 = (Customer) session.getAttribute("customer");
        System.out.println(customer1.getUsername());
        System.out.println(customer1.getEmail());
        securityService.updatePhoneNumber(customer);

        return  "client/security";
    }
}
