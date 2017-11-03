package com.cdyy.loan.pojo.po;

import java.util.Date;

public class LoanRepayment {
    private Long rid;

    private Long uid;

    private Long lid;

    private Integer reperiods;

    private Date rexpiretime;

    private Double rmoney;

    private Date rtime;

    private Integer rtype;

    private Integer rstate;

    public Long getRid() {
        return rid;
    }

    public void setRid(Long rid) {
        this.rid = rid;
    }

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public Long getLid() {
        return lid;
    }

    public void setLid(Long lid) {
        this.lid = lid;
    }

    public Integer getReperiods() {
        return reperiods;
    }

    public void setReperiods(Integer reperiods) {
        this.reperiods = reperiods;
    }

    public Date getRexpiretime() {
        return rexpiretime;
    }

    public void setRexpiretime(Date rexpiretime) {
        this.rexpiretime = rexpiretime;
    }

    public Double getRmoney() {
        return rmoney;
    }

    public void setRmoney(Double rmoney) {
        this.rmoney = rmoney;
    }

    public Date getRtime() {
        return rtime;
    }

    public void setRtime(Date rtime) {
        this.rtime = rtime;
    }

    public Integer getRtype() {
        return rtype;
    }

    public void setRtype(Integer rtype) {
        this.rtype = rtype;
    }

    public Integer getRstate() {
        return rstate;
    }

    public void setRstate(Integer rstate) {
        this.rstate = rstate;
    }
}