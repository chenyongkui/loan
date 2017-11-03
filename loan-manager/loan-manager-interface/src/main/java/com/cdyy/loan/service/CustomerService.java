package com.cdyy.loan.service;

import com.cdyy.loan.pojo.po.LoanCustomer;
import com.cdyy.loan.pojo.vo.Customer;

import java.util.Map;

public interface CustomerService {
    Customer cusLogin(Map<String, Object> map);

    int addCustomer(LoanCustomer loanCustomer);

}
