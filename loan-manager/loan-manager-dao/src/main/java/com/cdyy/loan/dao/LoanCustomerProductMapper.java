package com.cdyy.loan.dao;

import com.cdyy.loan.pojo.po.LoanCustomerProduct;
import com.cdyy.loan.pojo.po.LoanCustomerProductExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LoanCustomerProductMapper {
    int countByExample(LoanCustomerProductExample example);

    int deleteByExample(LoanCustomerProductExample example);

    int deleteByPrimaryKey(Long uid);

    int insert(LoanCustomerProduct record);

    int insertSelective(LoanCustomerProduct record);

    List<LoanCustomerProduct> selectByExample(LoanCustomerProductExample example);

    LoanCustomerProduct selectByPrimaryKey(Long uid);

    int updateByExampleSelective(@Param("record") LoanCustomerProduct record, @Param("example") LoanCustomerProductExample example);

    int updateByExample(@Param("record") LoanCustomerProduct record, @Param("example") LoanCustomerProductExample example);

    int updateByPrimaryKeySelective(LoanCustomerProduct record);

    int updateByPrimaryKey(LoanCustomerProduct record);
}