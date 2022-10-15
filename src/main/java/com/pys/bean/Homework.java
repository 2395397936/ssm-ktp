package com.pys.bean;

import java.io.File;

public class Homework {
    File file;
    String id;
    String uid;
    String hid;
    String cid;
    String score;
    String submitDate;

    public Homework(File file, String id, String uid, String hid, String cid, String score, String submitDate) {
        this.file = file;
        this.id = id;
        this.uid = uid;
        this.hid = hid;
        this.cid = cid;
        this.score = score;
        this.submitDate = submitDate;
    }

    public Homework(String id, String uid, String hid, String cid,String submitDate) {
        this.id = id;
        this.uid = uid;
        this.hid = hid;
        this.cid = cid;
        this.submitDate = submitDate;
    }

    public Homework(String id, String uid, String hid, String cid, String score, String submitDate) {
        this.id = id;
        this.uid = uid;
        this.hid = hid;
        this.cid = cid;
        this.score = score;
        this.submitDate = submitDate;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
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

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public String getSubmitDate() {
        return submitDate;
    }

    public void setSubmitDate(String submitDate) {
        this.submitDate = submitDate;
    }
}
