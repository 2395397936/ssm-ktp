package com.pys.controller;

import com.google.gson.Gson;
import com.pys.bean.User;
import com.pys.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping(value = "/login",produces = "text/html;charset=utf-8",method = RequestMethod.POST)
    @ResponseBody
    public String login(String id, String password){
        return new Gson().toJson(userService.queryUserByIdAndPassword(id, password));
    }

    @RequestMapping(value = "/register",produces = "text/html;charset=utf-8",method = RequestMethod.POST)
    @ResponseBody
    public String register(String id, String status, String name, String password){
        if (userService.queryUserById(id)!=null) {
            return "用户名已存在";
        } else {
            userService.saveUser(new User(id,status,name,name,password));
            return "success";
        }
    }

}
