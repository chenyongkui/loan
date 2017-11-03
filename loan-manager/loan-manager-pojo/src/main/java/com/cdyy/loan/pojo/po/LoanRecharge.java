package com.cdyy.loan.pojo.po;

import java.util.Date;

public class LoanRecharge {
    private Long rid;

    private Long uid;

    private Integer rtype;

    private Long rbid;

    private Double rmoney;

    private Double rcounterfee;

    private Double ractual;

    private String rserial;

    private Integer rstate;

    private Date rtime;

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

    public Integer getRtype() {
        return rtype;
    }

    public void setRtype(Integer rtype) {
        this.rtype = rtype;
    }

    public Long getRbid() {
        return rbid;
    }

    public void setRbid(Long rbid) {
        this.rbid = rbid;
    }

    public Double getRmoney() {
        return rmoney;
    }

    public void setRmoney(Double rmoney) {
        this.rmoney = rmoney;
    }

    public Double getRcounterfee() {
        return rcounterfee;
    }

    public void setRcounterfee(Double rcounterfee) {
        this.rcounterfee = rcounterfee;
    }

    public Double getRactual() {
        return ractual;
    }

    public void setRactual(Double ractual) {
        this.ractual = ractual;
    }

    public String getRserial() {
        return rserial;
    }

    public void setRserial(String rserial) {
        this.rserial = rserial == null ? null : rserial.trim();
    }

    public Integer getRstate() {
        return rstate;
    }

    public void setRstate(Integer rstate) {
        this.rstate = rstate;
    }

    public Date getRtime() {
        return rtime;
    }

    public void setRtime(Date rtime) {
        this.rtime = rtime;
    }
}