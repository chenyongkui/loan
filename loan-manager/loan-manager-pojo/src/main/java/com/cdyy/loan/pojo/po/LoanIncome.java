package com.cdyy.loan.pojo.po;

import java.util.Date;

public class LoanIncome {
    private Long iid;

    private Long uid;

    private Integer itype;

    private Double imoney;

    private Date itime;

    private String iremarks;

    public Long getIid() {
        return iid;
    }

    public void setIid(Long iid) {
        this.iid = iid;
    }

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public Integer getItype() {
        return itype;
    }

    public void setItype(Integer itype) {
        this.itype = itype;
    }

    public Double getImoney() {
        return imoney;
    }

    public void setImoney(Double imoney) {
        this.imoney = imoney;
    }

    public Date getItime() {
        return itime;
    }

    public void setItime(Date itime) {
        this.itime = itime;
    }

    public String getIremarks() {
        return iremarks;
    }

    public void setIremarks(String iremarks) {
        this.iremarks = iremarks == null ? null : iremarks.trim();
    }
}