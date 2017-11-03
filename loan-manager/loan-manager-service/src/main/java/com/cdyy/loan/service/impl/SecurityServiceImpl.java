package com.cdyy.loan.service.impl;

import com.cdyy.loan.dao.CustomerMapper;
import com.cdyy.loan.dao.LoanCustomerMapper;
import com.cdyy.loan.dao.LoanSysroleMapper;
import com.cdyy.loan.pojo.po.LoanCustomer;
import com.cdyy.loan.pojo.po.LoanCustomerExample;
import com.cdyy.loan.pojo.po.LoanSysroleExample;
import com.cdyy.loan.pojo.vo.Customer;
import com.cdyy.loan.service.SecurityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SecurityServiceImpl implements SecurityService {
    @Autowired
    private CustomerMapper customerMapper;

    @Autowired
    private LoanCustomerMapper loanCustomerMapper;
    //修改密码
    @Override
    public void updatePassword(Customer customer) {

        customerMapper.updatePassWord(customer);
    }

    @Override
    public void updatePhoneNumber(Customer customer) {
        customerMapper.updatePhoneNumber(customer);
    }

    @Override
    public LoanCustomer selectCustomer(Long uid) {
        return loanCustomerMapper.selectByPrimaryKey(uid);
    }
}
