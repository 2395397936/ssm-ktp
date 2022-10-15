package com.pys.controller;

import com.google.gson.Gson;
import com.pys.bean.Course;
import com.pys.bean.User;
import com.pys.service.CourseService;
import com.pys.util.Time;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Controller
public class CourseController {
    @Autowired
    private CourseService courseService;

    @RequestMapping("/getCourse")
    @ResponseBody
    public String getCourse(String id) {
        return new Gson().toJson(courseService.queryCourse(id));
    }

    @RequestMapping("/archive")
    @ResponseBody
    public void archive(String id, String cid) {
        courseService.archive(id, cid);
    }

    @RequestMapping("/joinCourse")
    @ResponseBody
    public String joinCourse(String id, String cid) {
        if (courseService.queryAllUserByCourse(cid).size() != 0) {
            courseService.joinCourse(id, cid, Time.getTime(), courseService.queryCourse(id).size() + 1);
            return "success";
        } else {
            return "not exit";
        }
    }

    @RequestMapping("/createCourse")
    @ResponseBody
    public String createCourse(String id, String cid, String cname) {
        if (courseService.queryAllUserByCourse(cid).size() == 0) {
            courseService.createCourse(new Course(id, cid, Time.getTime(),  courseService.queryCourse(id).size() + 1,0, cname));
            return "success";
        } else {
            return "exit";
        }

    }

    @RequestMapping(value = "/queryClassPeople", produces = "text/html;charset=utf-8")
    @ResponseBody
    public String queryClassPeople(String cid) {
        return new Gson().toJson(courseService.queryAllUserByCourse(cid));
    }

    @RequestMapping(value = "/delete", produces = "text/html;charset=utf-8")
    @ResponseBody
    public void delete(String id,String cid) {
        courseService.delete(id,cid);
    }

    @RequestMapping(value = "/deleteAll", produces = "text/html;charset=utf-8")
    @ResponseBody
    public void deleteAll(String cid) {
        courseService.deleteAll(cid);
    }
    @RequestMapping(value = "/archiveAll", produces = "text/html;charset=utf-8")
    @ResponseBody
    public void archiveAll(String cid) {
        courseService.archiveAll(cid);
    }
    @RequestMapping(value = "/restore", produces = "text/html;charset=utf-8")
    @ResponseBody
    public void restore(String id,String cid) {
        courseService.restore(id,cid);
    }

}
