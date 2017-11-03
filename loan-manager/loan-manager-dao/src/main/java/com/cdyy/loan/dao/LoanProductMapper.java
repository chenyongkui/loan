package com.cdyy.loan.dao;

import com.cdyy.loan.pojo.po.LoanProduct;
import com.cdyy.loan.pojo.po.LoanProductExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LoanProductMapper {
    int countByExample(LoanProductExample example);

    int deleteByExample(LoanProductExample example);

    int deleteByPrimaryKey(Long pid);

    int insert(LoanProduct record);

    int insertSelective(LoanProduct record);

    List<LoanProduct> selectByExample(LoanProductExample example);

    LoanProduct selectByPrimaryKey(Long pid);

    int updateByExampleSelective(@Param("record") LoanProduct record, @Param("example") LoanProductExample example);

    int updateByExample(@Param("record") LoanProduct record, @Param("example") LoanProductExample example);

    int updateByPrimaryKeySelective(LoanProduct record);

    int updateByPrimaryKey(LoanProduct record);
}