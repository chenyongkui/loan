package com.cdyy.loan.service.impl;

import com.cdyy.common.utils.IDUtils;
import com.cdyy.loan.dao.CustomerMapper;
import com.cdyy.loan.dao.LoanCustomerMapper;
import com.cdyy.loan.pojo.po.LoanCustomer;
import com.cdyy.loan.pojo.vo.Customer;
import com.cdyy.loan.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerMapper customerMapper;

    @Autowired
    private LoanCustomerMapper loanCustomerMapper;
    @Override
    public Customer cusLogin(Map<String, Object> map) {
        System.out.println(customerMapper.cusLogin(map));
        return customerMapper.cusLogin(map);
    }

    @Override
    public int addCustomer(LoanCustomer loanCustomer) {
        int count = 0;
        long uid = IDUtils.getItemId();

        loanCustomer.setCreatetime(new Date());
        loanCustomer.setCredit(0.0);
        loanCustomer.setUstate(1);
        loanCustomer.setUid(uid);
        String mess = checkRegister(loanCustomer.getUsername(), loanCustomer.getPhone());
        if(mess=="1") {
            count = loanCustomerMapper.insert(loanCustomer);
        }
        return count;
    }

    //验证用户是否存在
    private String checkRegister(String username,String phone) {
        String mess = null;
        Customer customer = customerMapper.selectByName(username);
        Customer customer1 = customerMapper.selectByPhone(phone);

        if(customer==null&&customer1==null) {
            mess="1";
        }else {
            mess="2";
        }
        return mess;
    }
}
