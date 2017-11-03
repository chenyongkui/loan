package com.cdyy.loan.dao;

import com.cdyy.loan.pojo.po.LoanExpenditure;
import com.cdyy.loan.pojo.po.LoanExpenditureExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LoanExpenditureMapper {
    int countByExample(LoanExpenditureExample example);

    int deleteByExample(LoanExpenditureExample example);

    int deleteByPrimaryKey(Long eid);

    int insert(LoanExpenditure record);

    int insertSelective(LoanExpenditure record);

    List<LoanExpenditure> selectByExample(LoanExpenditureExample example);

    LoanExpenditure selectByPrimaryKey(Long eid);

    int updateByExampleSelective(@Param("record") LoanExpenditure record, @Param("example") LoanExpenditureExample example);

    int updateByExample(@Param("record") LoanExpenditure record, @Param("example") LoanExpenditureExample example);

    int updateByPrimaryKeySelective(LoanExpenditure record);

    int updateByPrimaryKey(LoanExpenditure record);
}