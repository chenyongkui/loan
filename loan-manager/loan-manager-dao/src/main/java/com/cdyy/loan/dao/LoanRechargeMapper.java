package com.cdyy.loan.dao;

import com.cdyy.loan.pojo.po.LoanRecharge;
import com.cdyy.loan.pojo.po.LoanRechargeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LoanRechargeMapper {
    int countByExample(LoanRechargeExample example);

    int deleteByExample(LoanRechargeExample example);

    int deleteByPrimaryKey(Long rid);

    int insert(LoanRecharge record);

    int insertSelective(LoanRecharge record);

    List<LoanRecharge> selectByExample(LoanRechargeExample example);

    LoanRecharge selectByPrimaryKey(Long rid);

    int updateByExampleSelective(@Param("record") LoanRecharge record, @Param("example") LoanRechargeExample example);

    int updateByExample(@Param("record") LoanRecharge record, @Param("example") LoanRechargeExample example);

    int updateByPrimaryKeySelective(LoanRecharge record);

    int updateByPrimaryKey(LoanRecharge record);
}