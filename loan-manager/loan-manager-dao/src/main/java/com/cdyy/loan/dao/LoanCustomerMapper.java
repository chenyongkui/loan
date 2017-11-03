package com.cdyy.loan.dao;

import com.cdyy.loan.pojo.po.LoanCustomer;
import com.cdyy.loan.pojo.po.LoanCustomerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LoanCustomerMapper {
    int countByExample(LoanCustomerExample example);

    int deleteByExample(LoanCustomerExample example);

    int deleteByPrimaryKey(Long uid);

    int insert(LoanCustomer record);

    int insertSelective(LoanCustomer record);

    List<LoanCustomer> selectByExample(LoanCustomerExample example);

    LoanCustomer selectByPrimaryKey(Long uid);

    int updateByExampleSelective(@Param("record") LoanCustomer record, @Param("example") LoanCustomerExample example);

    int updateByExample(@Param("record") LoanCustomer record, @Param("example") LoanCustomerExample example);

    int updateByPrimaryKeySelective(LoanCustomer record);

    int updateByPrimaryKey(LoanCustomer record);
}