package com.cdyy.loan.service;

import com.cdyy.common.dto.Order;
import com.cdyy.common.dto.Page;
import com.cdyy.common.dto.Result;
import com.cdyy.loan.pojo.po.LoanSysrole;
import com.cdyy.loan.pojo.vo.Role;
import com.cdyy.loan.pojo.vo.RoleQuery;

import java.util.List;

/**
 *
 * Date: 2017/10/23
 * Time: 10:08
 * Version:V1.0
 * 角色管理的接口
 */
public interface RoleService {
    Result<Role> listRole(Page page, Order order, RoleQuery query);

    int updateRolesByIds3(List<Long> ids);

    int updateRolesByIds2(List<Long> ids);

    int updateRolesByIds1(List<Long> ids);

    int saveRole(LoanSysrole loanSysrole);

    LoanSysrole selectRoleById(long roleid);

    void updateRole(LoanSysrole loanSysrole);

    String checkRole(String rolename);

    String roleCheck(String rolename,String rpassword);

    //String checkRole2(Role role);


}
