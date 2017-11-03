package com.cdyy.loan.dao;

import com.cdyy.loan.pojo.po.LoanBank;
import com.cdyy.loan.pojo.po.LoanBankExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LoanBankMapper {
    int countByExample(LoanBankExample example);

    int deleteByExample(LoanBankExample example);

    int deleteByPrimaryKey(Long bid);

    int insert(LoanBank record);

    int insertSelective(LoanBank record);

    List<LoanBank> selectByExample(LoanBankExample example);

    LoanBank selectByPrimaryKey(Long bid);

    int updateByExampleSelective(@Param("record") LoanBank record, @Param("example") LoanBankExample example);

    int updateByExample(@Param("record") LoanBank record, @Param("example") LoanBankExample example);

    int updateByPrimaryKeySelective(LoanBank record);

    int updateByPrimaryKey(LoanBank record);
}