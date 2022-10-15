package com.pys.bean;


public class Course {
    String id;
    String cid;
    String joinDate;
    int series;
    int status;
    String cname;

    public Course(String id, String cid, String joinDate, int series, int status, String cname) {
        this.id = id;
        this.cid = cid;
        this.joinDate = joinDate;
        this.series = series;
        this.status = status;
        this.cname = cname;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(String joinDate) {
        this.joinDate = joinDate;
    }
}
