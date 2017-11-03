package com.cdyy.loan.pojo.po;

public class LoanProduct {
    private Long pid;

    private String pname;

    private Integer pcom;

    private Integer ptime;

    private String pcompany;

    private Double prate;

    private Integer pstatus;

    private String pdesc;

    private Integer pdate;

    public Long getPid() {
        return pid;
    }

    public void setPid(Long pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname == null ? null : pname.trim();
    }

    public Integer getPcom() {
        return pcom;
    }

    public void setPcom(Integer pcom) {
        this.pcom = pcom;
    }

    public Integer getPtime() {
        return ptime;
    }

    public void setPtime(Integer ptime) {
        this.ptime = ptime;
    }

    public String getPcompany() {
        return pcompany;
    }

    public void setPcompany(String pcompany) {
        this.pcompany = pcompany == null ? null : pcompany.trim();
    }

    public Double getPrate() {
        return prate;
    }

    public void setPrate(Double prate) {
        this.prate = prate;
    }

    public Integer getPstatus() {
        return pstatus;
    }

    public void setPstatus(Integer pstatus) {
        this.pstatus = pstatus;
    }

    public String getPdesc() {
        return pdesc;
    }

    public void setPdesc(String pdesc) {
        this.pdesc = pdesc == null ? null : pdesc.trim();
    }

    public Integer getPdate() {
        return pdate;
    }

    public void setPdate(Integer pdate) {
        this.pdate = pdate;
    }
}