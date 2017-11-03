package com.cdyy.loan.service;

import com.cdyy.loan.pojo.po.LoanCustomer;
import com.cdyy.loan.pojo.vo.Customer;

public interface SecurityService {
    void updatePassword(Customer customer);

    void updatePhoneNumber(Customer customer);

    LoanCustomer selectCustomer(Long uid);
}
