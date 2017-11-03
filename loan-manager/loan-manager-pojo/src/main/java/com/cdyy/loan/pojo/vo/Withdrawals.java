package com.cdyy.loan.pojo.vo;

import com.cdyy.loan.pojo.po.LoanWithdrawals;

public class Withdrawals extends LoanWithdrawals {
    private Customer customer;

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
