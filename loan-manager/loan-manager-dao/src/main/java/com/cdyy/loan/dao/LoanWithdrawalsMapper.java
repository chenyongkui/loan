package com.cdyy.loan.dao;

import com.cdyy.loan.pojo.po.LoanWithdrawals;
import com.cdyy.loan.pojo.po.LoanWithdrawalsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LoanWithdrawalsMapper {
    int countByExample(LoanWithdrawalsExample example);

    int deleteByExample(LoanWithdrawalsExample example);

    int deleteByPrimaryKey(Long wid);

    int insert(LoanWithdrawals record);

    int insertSelective(LoanWithdrawals record);

    List<LoanWithdrawals> selectByExample(LoanWithdrawalsExample example);

    LoanWithdrawals selectByPrimaryKey(Long wid);

    int updateByExampleSelective(@Param("record") LoanWithdrawals record, @Param("example") LoanWithdrawalsExample example);

    int updateByExample(@Param("record") LoanWithdrawals record, @Param("example") LoanWithdrawalsExample example);

    int updateByPrimaryKeySelective(LoanWithdrawals record);

    int updateByPrimaryKey(LoanWithdrawals record);
}