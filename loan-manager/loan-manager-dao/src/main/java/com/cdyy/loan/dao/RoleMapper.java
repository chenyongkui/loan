package com.cdyy.loan.dao;

import com.cdyy.loan.pojo.po.LoanSysrole;
import com.cdyy.loan.pojo.vo.Role;

import java.util.List;
import java.util.Map;

public interface RoleMapper {
    /**
     * 分页查询出商品集合
     * @return
     */
    List<Role> listRolesByPage(Map<String, Object> map);
    /**
     * 查询所有商品的总记录数
     * @return
     */
    long countRoles(Map<String, Object> map);

    void updateRole(Role role);

    Role selectByName(String rolename);
}
