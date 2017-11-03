package com.cdyy.loan.pojo.po;

import java.util.Date;

public class LoanWithdrawals {
    private Long wid;

    private Long uid;

    private Long bid;

    private Double wmoney;

    private Double wcounterfee;

    private Double wactual;

    private Integer wstate;

    private Date wtime;

    public Long getWid() {
        return wid;
    }

    public void setWid(Long wid) {
        this.wid = wid;
    }

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public Long getBid() {
        return bid;
    }

    public void setBid(Long bid) {
        this.bid = bid;
    }

    public Double getWmoney() {
        return wmoney;
    }

    public void setWmoney(Double wmoney) {
        this.wmoney = wmoney;
    }

    public Double getWcounterfee() {
        return wcounterfee;
    }

    public void setWcounterfee(Double wcounterfee) {
        this.wcounterfee = wcounterfee;
    }

    public Double getWactual() {
        return wactual;
    }

    public void setWactual(Double wactual) {
        this.wactual = wactual;
    }

    public Integer getWstate() {
        return wstate;
    }

    public void setWstate(Integer wstate) {
        this.wstate = wstate;
    }

    public Date getWtime() {
        return wtime;
    }

    public void setWtime(Date wtime) {
        this.wtime = wtime;
    }
}