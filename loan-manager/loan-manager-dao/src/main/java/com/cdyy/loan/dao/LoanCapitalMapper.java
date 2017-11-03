package com.cdyy.loan.dao;

import com.cdyy.loan.pojo.po.LoanCapital;
import com.cdyy.loan.pojo.po.LoanCapitalExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LoanCapitalMapper {
    int countByExample(LoanCapitalExample example);

    int deleteByExample(LoanCapitalExample example);

    int deleteByPrimaryKey(Long cid);

    int insert(LoanCapital record);

    int insertSelective(LoanCapital record);

    List<LoanCapital> selectByExample(LoanCapitalExample example);

    LoanCapital selectByPrimaryKey(Long cid);

    int updateByExampleSelective(@Param("record") LoanCapital record, @Param("example") LoanCapitalExample example);

    int updateByExample(@Param("record") LoanCapital record, @Param("example") LoanCapitalExample example);

    int updateByPrimaryKeySelective(LoanCapital record);

    int updateByPrimaryKey(LoanCapital record);
}