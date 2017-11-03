package com.cdyy.loan.pojo.po;

import java.util.Date;

public class LoanBank {
    private Long bid;

    private Long uid;

    private String baccount;

    private String bcardnumber;

    private Date btime;

    private Integer bstate;

    public Long getBid() {
        return bid;
    }

    public void setBid(Long bid) {
        this.bid = bid;
    }

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public String getBaccount() {
        return baccount;
    }

    public void setBaccount(String baccount) {
        this.baccount = baccount == null ? null : baccount.trim();
    }

    public String getBcardnumber() {
        return bcardnumber;
    }

    public void setBcardnumber(String bcardnumber) {
        this.bcardnumber = bcardnumber == null ? null : bcardnumber.trim();
    }

    public Date getBtime() {
        return btime;
    }

    public void setBtime(Date btime) {
        this.btime = btime;
    }

    public Integer getBstate() {
        return bstate;
    }

    public void setBstate(Integer bstate) {
        this.bstate = bstate;
    }
}