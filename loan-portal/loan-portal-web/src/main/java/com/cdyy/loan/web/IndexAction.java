package com.cdyy.loan.web;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Scope("prototype")
public class IndexAction {
    //首页
    @RequestMapping("/")
    public String index() {
        return "client/index";
    }
    //登录
    @RequestMapping("/login")
    public String login() {
        return "client/login";
    }
    //注册
    @RequestMapping("/register")
    public String register() {
        return "client/register";
    }

    @RequestMapping("/index1")
    public String index2() {
        return "client/index";
    }
    //账户总览
    @RequestMapping("/left")
    public String left() {
        return "client/left";
    }
    //充值
    @RequestMapping("/recharge")
    public String recharge() {
        return "client/recharge";
    }
    //提现
    @RequestMapping("/funds")
    public String funds() {
        return "client/funds";
    }
    //资金记录
    @RequestMapping("/MoneyRecord")
    public String moneyRecord() {
        return "client/MoneyRecord";
    }
    //投资管理
    @RequestMapping("/investment")
    public String investment() {
        return "client/investment";
    }
    //借款管理
    @RequestMapping("/BorrowMoney")
    public String borrowMoney() {
        return "client/BorrowMoney";
    }
    //我的银行卡
    @RequestMapping("/BankCard")
    public String bankCard() {
        return "client/BankCard";
    }
    //安全设置
    @RequestMapping("/security")
    public String security() {
        return "client/security";
    }
    //安全设置
    @RequestMapping("/AddCard")
    public String addCard() {
        return "bank/addCar";
    }
    //

}
