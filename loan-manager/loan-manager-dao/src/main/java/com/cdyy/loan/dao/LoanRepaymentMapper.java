package com.cdyy.loan.dao;

import com.cdyy.loan.pojo.po.LoanRepayment;
import com.cdyy.loan.pojo.po.LoanRepaymentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LoanRepaymentMapper {
    int countByExample(LoanRepaymentExample example);

    int deleteByExample(LoanRepaymentExample example);

    int deleteByPrimaryKey(Long rid);

    int insert(LoanRepayment record);

    int insertSelective(LoanRepayment record);

    List<LoanRepayment> selectByExample(LoanRepaymentExample example);

    LoanRepayment selectByPrimaryKey(Long rid);

    int updateByExampleSelective(@Param("record") LoanRepayment record, @Param("example") LoanRepaymentExample example);

    int updateByExample(@Param("record") LoanRepayment record, @Param("example") LoanRepaymentExample example);

    int updateByPrimaryKeySelective(LoanRepayment record);

    int updateByPrimaryKey(LoanRepayment record);
}