package com.pys.bean;

import lombok.Data;
import org.springframework.context.annotation.Bean;

import java.io.Serializable;

@Data
public class User  {
    public String id;
    public String status;
    public String name;
    public String username;
    public String password;

    public User() {
    }

    public User(String id, String status, String name, String username,  String password) {
        this.id = id;
        this.status = status;
        this.name = name;
        this.username = username;
        this.password = password;
    }

//    public String getId() {
//        return id;
//    }
//
//    public void setId(String id) {
//        this.id = id;
//    }
//
//    public String getStatus() {
//        return status;
//    }
//
//    public void setStatus(String status) {
//        this.status = status;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getUsername() {
//        return username;
//    }
//
//    public void setUsername(String username) {
//        this.username = username;
//    }
//
//
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
}
