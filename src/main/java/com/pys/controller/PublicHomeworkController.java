package com.pys.controller;

import com.google.gson.Gson;
import com.pys.bean.PublicHomework;
import com.pys.dao.PublicHomeworkMapper;
import com.pys.service.PublicHomeworkService;
import com.pys.util.Time;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
@Controller
public class PublicHomeworkController {
    @Autowired
    private PublicHomeworkService publicHomeworkService;

    @RequestMapping("/public")
    @ResponseBody
    public void publicHomeWork(String id, String hid, String cid, String homeworkName, String deadDate,String detail) {
        publicHomeworkService.publicHomework(new PublicHomework(id, hid, cid, homeworkName, deadDate,detail, Time.getTime()));
    }

    @RequestMapping(value="/getHomework",produces = "text/html;charset=utf-8")
    @ResponseBody
    public String getHomework(String cid) {
        return new Gson().toJson(publicHomeworkService.acceptHomework(cid));
    }


}
