package com.cdyy.loan.dao;

import com.cdyy.loan.pojo.po.LoanLoan;
import com.cdyy.loan.pojo.po.LoanLoanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LoanLoanMapper {
    int countByExample(LoanLoanExample example);

    int deleteByExample(LoanLoanExample example);

    int deleteByPrimaryKey(Long lid);

    int insert(LoanLoan record);

    int insertSelective(LoanLoan record);

    List<LoanLoan> selectByExample(LoanLoanExample example);

    LoanLoan selectByPrimaryKey(Long lid);

    int updateByExampleSelective(@Param("record") LoanLoan record, @Param("example") LoanLoanExample example);

    int updateByExample(@Param("record") LoanLoan record, @Param("example") LoanLoanExample example);

    int updateByPrimaryKeySelective(LoanLoan record);

    int updateByPrimaryKey(LoanLoan record);
}