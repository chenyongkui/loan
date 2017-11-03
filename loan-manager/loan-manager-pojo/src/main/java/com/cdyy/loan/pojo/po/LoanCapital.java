package com.cdyy.loan.pojo.po;

import java.util.Date;

public class LoanCapital {
    private Long cid;

    private Long uid;

    private Double allasset;

    private Double income;

    private Double expenditure;

    private Double available;

    private Double frozen;

    private Double still;

    private Date ctime;

    public Long getCid() {
        return cid;
    }

    public void setCid(Long cid) {
        this.cid = cid;
    }

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public Double getAllasset() {
        return allasset;
    }

    public void setAllasset(Double allasset) {
        this.allasset = allasset;
    }

    public Double getIncome() {
        return income;
    }

    public void setIncome(Double income) {
        this.income = income;
    }

    public Double getExpenditure() {
        return expenditure;
    }

    public void setExpenditure(Double expenditure) {
        this.expenditure = expenditure;
    }

    public Double getAvailable() {
        return available;
    }

    public void setAvailable(Double available) {
        this.available = available;
    }

    public Double getFrozen() {
        return frozen;
    }

    public void setFrozen(Double frozen) {
        this.frozen = frozen;
    }

    public Double getStill() {
        return still;
    }

    public void setStill(Double still) {
        this.still = still;
    }

    public Date getCtime() {
        return ctime;
    }

    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }
}