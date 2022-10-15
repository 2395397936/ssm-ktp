package com.pys.bean;

public class PublicHomework {
    String id;
    String hid;
    String cid;
    String homeworkName;
    String deadDate;
    String detail;
    String publicDate;
    public PublicHomework(String id, String hid, String cid, String homeworkName, String deadDate, String detail, String publicDate) {
        this.id = id;
        this.hid = hid;
        this.cid = cid;
        this.homeworkName = homeworkName;
        this.deadDate = deadDate;
        this.detail = detail;
        this.publicDate = publicDate;
    }
    public String getPublicDate() {
        return publicDate;
    }

    public void setPublicDate(String publicDate) {
        this.publicDate = publicDate;
    }



    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getHid() {
        return hid;
    }

    public void setHid(String hid) {
        this.hid = hid;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getHomeworkName() {
        return homeworkName;
    }

    public void setHomeworkName(String homeworkName) {
        this.homeworkName = homeworkName;
    }

    public String getDeadDate() {
        return deadDate;
    }

    public void setDeadDate(String deadDate) {
        this.deadDate = deadDate;
    }
}
