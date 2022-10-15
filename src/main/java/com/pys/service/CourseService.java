package com.pys.service;

import com.pys.bean.Course;
import com.pys.bean.User;

import java.util.List;

public interface CourseService {
    List<Course> queryCourse(String id);

    int createCourse(Course course);

    int joinCourse(String id, String cid, String joinDate, int series);

    List<User> queryAllUserByCourse(String cid);

    int archive(String id, String cid);

    int restore(String id, String cid);

    int delete(String id, String cid);

    int archiveAll(String cid);

    int deleteAll(String cid);

}
