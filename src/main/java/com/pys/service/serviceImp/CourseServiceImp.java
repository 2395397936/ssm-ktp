package com.pys.service.serviceImp;

import com.pys.bean.Course;
import com.pys.bean.User;
import com.pys.dao.CourseMapper;
import com.pys.dao.UserMapper;
import com.pys.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class CourseServiceImp implements CourseService {
    @Autowired
    private CourseMapper courseMapper;

    @Override
    public List<Course> queryCourse(String id) {
        return courseMapper.queryCourse(id);
    }

    @Override
    public int createCourse(Course course) {
        return courseMapper.createCourse(course);
    }

    @Override
    public int joinCourse(String id, String cid,String joinDate, int series) {
        String cname = courseMapper.queryCNameByCid(cid);
        return courseMapper.joinCourse(id, cid,joinDate,series, cname);
    }

    @Override
    public List<User> queryAllUserByCourse(String cid) {
        return courseMapper.queryAllUserByCourse(cid);
    }

    @Override
    public int archive(String id, String cid) {
        return courseMapper.archive(id, cid);
    }

    @Override
    public int restore(String id, String cid) {
        return courseMapper.restore(id,cid);
    }

    @Override
    public int delete(String id, String cid) {
        return courseMapper.delete(id,cid);
    }

    @Override
    public int archiveAll(String cid) {
        return courseMapper.archiveAll(cid);
    }

    @Override
    public int deleteAll(String cid) {
        return courseMapper.deleteAll(cid);
    }
}
