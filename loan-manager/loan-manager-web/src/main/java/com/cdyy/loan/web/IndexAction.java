package com.cdyy.loan.web;


import com.cdyy.loan.pojo.vo.Role;
import com.cdyy.loan.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;




@Controller
@Scope("prototype")
public class IndexAction {

    @RequestMapping("/")
    public String doLogin()  {
        return "login";

    }
    @RequestMapping("/{page}")
    public String page(@PathVariable String page) {
        return page;
    }

    @RequestMapping("/index")
    public String index() {
        return "index";
    }


}
