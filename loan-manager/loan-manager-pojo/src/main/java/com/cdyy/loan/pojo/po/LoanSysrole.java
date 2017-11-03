package com.cdyy.loan.pojo.po;

public class LoanSysrole {
    private Long roleid;

    private String rolename;

    private Integer rolestate;

    private Integer roledesc;

    private String rpassword;

    public Long getRoleid() {
        return roleid;
    }

    public void setRoleid(Long roleid) {
        this.roleid = roleid;
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename == null ? null : rolename.trim();
    }

    public Integer getRolestate() {
        return rolestate;
    }

    public void setRolestate(Integer rolestate) {
        this.rolestate = rolestate;
    }

    public Integer getRoledesc() {
        return roledesc;
    }

    public void setRoledesc(Integer roledesc) {
        this.roledesc = roledesc;
    }

    public String getRpassword() {
        return rpassword;
    }

    public void setRpassword(String rpassword) {
        this.rpassword = rpassword == null ? null : rpassword.trim();
    }
}