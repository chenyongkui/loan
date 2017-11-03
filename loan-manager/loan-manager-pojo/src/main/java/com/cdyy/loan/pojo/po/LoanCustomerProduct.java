package com.cdyy.loan.pojo.po;

import java.util.Date;

public class LoanCustomerProduct {
    private Long uid;

    private Long pid;

    private Integer pnumber;

    private Integer pperiods;

    private Date pstarttime;

    private Date pendtime;

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public Long getPid() {
        return pid;
    }

    public void setPid(Long pid) {
        this.pid = pid;
    }

    public Integer getPnumber() {
        return pnumber;
    }

    public void setPnumber(Integer pnumber) {
        this.pnumber = pnumber;
    }

    public Integer getPperiods() {
        return pperiods;
    }

    public void setPperiods(Integer pperiods) {
        this.pperiods = pperiods;
    }

    public Date getPstarttime() {
        return pstarttime;
    }

    public void setPstarttime(Date pstarttime) {
        this.pstarttime = pstarttime;
    }

    public Date getPendtime() {
        return pendtime;
    }

    public void setPendtime(Date pendtime) {
        this.pendtime = pendtime;
    }
}