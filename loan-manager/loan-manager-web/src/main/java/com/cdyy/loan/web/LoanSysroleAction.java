package com.cdyy.loan.web;

import com.cdyy.common.dto.Order;
import com.cdyy.common.dto.Page;
import com.cdyy.common.dto.Result;
import com.cdyy.loan.pojo.po.LoanSysrole;
import com.cdyy.loan.pojo.vo.Role;
import com.cdyy.loan.pojo.vo.RoleQuery;
import com.cdyy.loan.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;


/**
 * User: DHC
 * Date: 2017/10/23
 * Time: 10:08
 * Version:V1.0
 * 角色管理的控制层代码
 */
@Controller
@Scope("prototype")
public class LoanSysroleAction {

    @Autowired
    private RoleService roleService;

    /*@ResponseBody
    @RequestMapping("/role")
    public List<LoanSysrole> listRole() {
        return roleService.listRole();
    }*/

   //状态删除修改
    @ResponseBody
    @RequestMapping("/roles/batch")
    public int updateRolesByIds3(@RequestParam("ids[]") List<Long> ids ) {
        return roleService.updateRolesByIds3(ids);
    }
    //状态冻结修改
    @ResponseBody
    @RequestMapping("/roles/freeze")
    public int updateRolesByIds2(@RequestParam("ids[]") List<Long> ids ) {
        return roleService.updateRolesByIds2(ids);
    }
    //状态解冻修改
    @ResponseBody
    @RequestMapping("/roles/open")
    public int updateRolesByIds1(@RequestParam("ids[]") List<Long> ids ) {
        return roleService.updateRolesByIds1(ids);
    }

    // /分页查询
    @ResponseBody
    @RequestMapping("/role")
    public Result<Role> listRoles(Page page,Order order,RoleQuery query){
        return roleService.listRole(page,order,query);
    }
    //添加角色
    @ResponseBody
    @RequestMapping("/add")
    public Integer saveRole(LoanSysrole loanSysrole) {
        return roleService.saveRole(loanSysrole);
    }
    //更新角色
    @ResponseBody
    @RequestMapping("/update")
    public void updateRole(LoanSysrole loanSysrole) {
         roleService.updateRole(loanSysrole);
    }

    //查找编辑角色
    @ResponseBody
    @RequestMapping("/roles/update")
    public LoanSysrole findupdateRole(@RequestParam("roleid") long roleid, HttpSession session) {

        LoanSysrole loanSysrole =  roleService.selectRoleById(roleid);
        session.setAttribute("role",loanSysrole);
        return loanSysrole;
    }

    @ResponseBody
    @RequestMapping("/login")
    public String roleCheck(Role role) {
        String rolename = role.getRolename();
        String rpassword = role.getRpassword();
        String mess = roleService.roleCheck(rolename,rpassword);
        return mess;
    }

}
