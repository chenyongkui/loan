package com.cdyy.loan.dao;

import com.cdyy.loan.pojo.po.LoanIncome;
import com.cdyy.loan.pojo.po.LoanIncomeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LoanIncomeMapper {
    int countByExample(LoanIncomeExample example);

    int deleteByExample(LoanIncomeExample example);

    int deleteByPrimaryKey(Long iid);

    int insert(LoanIncome record);

    int insertSelective(LoanIncome record);

    List<LoanIncome> selectByExample(LoanIncomeExample example);

    LoanIncome selectByPrimaryKey(Long iid);

    int updateByExampleSelective(@Param("record") LoanIncome record, @Param("example") LoanIncomeExample example);

    int updateByExample(@Param("record") LoanIncome record, @Param("example") LoanIncomeExample example);

    int updateByPrimaryKeySelective(LoanIncome record);

    int updateByPrimaryKey(LoanIncome record);
}