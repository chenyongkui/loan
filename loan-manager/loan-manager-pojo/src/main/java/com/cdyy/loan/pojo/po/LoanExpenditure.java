package com.cdyy.loan.pojo.po;

import java.util.Date;

public class LoanExpenditure {
    private Long eid;

    private Long uid;

    private Integer etype;

    private Double emoney;

    private Date etime;

    private String eremarks;

    public Long getEid() {
        return eid;
    }

    public void setEid(Long eid) {
        this.eid = eid;
    }

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public Integer getEtype() {
        return etype;
    }

    public void setEtype(Integer etype) {
        this.etype = etype;
    }

    public Double getEmoney() {
        return emoney;
    }

    public void setEmoney(Double emoney) {
        this.emoney = emoney;
    }

    public Date getEtime() {
        return etime;
    }

    public void setEtime(Date etime) {
        this.etime = etime;
    }

    public String getEremarks() {
        return eremarks;
    }

    public void setEremarks(String eremarks) {
        this.eremarks = eremarks == null ? null : eremarks.trim();
    }
}