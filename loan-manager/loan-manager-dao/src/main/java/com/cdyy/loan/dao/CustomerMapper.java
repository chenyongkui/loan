package com.cdyy.loan.dao;

import java.util.List;
import java.util.Map;

import com.cdyy.loan.pojo.vo.Customer;

public interface CustomerMapper {
    int deleteByPrimaryKey(Integer uid);

    int insert(Customer record);

    int insertSelective(Customer record);

    Customer selectByPrimaryKey(Integer uid);

    int updateByPrimaryKeySelective(Customer record);

    int updateByPrimaryKey(Customer record);
    
    Customer cusLogin(Map<String, Object> map);
    
    List<Customer> queryAll(Map<String, Object> map);
    
    Long getTotal(Map<String, Object> map);
    
    

    Customer selectByName(String username);

    Customer selectByPhone(String phone);

    void updatePassWord(Customer customer);

    void updatePhoneNumber(Customer customer);
}