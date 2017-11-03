package com.cdyy.loan.pojo.vo;

import com.cdyy.loan.pojo.po.LoanBank;
//银行卡
public class Bank extends LoanBank {
    private Customer customer;

    public Customer getCustomer() {

        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
