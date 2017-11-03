package com.cdyy.loan.dao;

import com.cdyy.loan.pojo.po.LoanSysrole;
import com.cdyy.loan.pojo.po.LoanSysroleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LoanSysroleMapper {
    int countByExample(LoanSysroleExample example);

    int deleteByExample(LoanSysroleExample example);

    int deleteByPrimaryKey(Long roleid);

    int insert(LoanSysrole record);

    int insertSelective(LoanSysrole record);

    List<LoanSysrole> selectByExample(LoanSysroleExample example);

    LoanSysrole selectByPrimaryKey(Long roleid);

    int updateByExampleSelective(@Param("record") LoanSysrole record, @Param("example") LoanSysroleExample example);

    int updateByExample(@Param("record") LoanSysrole record, @Param("example") LoanSysroleExample example);

    int updateByPrimaryKeySelective(LoanSysrole record);

    int updateByPrimaryKey(LoanSysrole record);
}