package com.pys.dao;

import com.pys.bean.Course;
import com.pys.bean.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CourseMapper {
    List<Course> queryCourse(@Param("id") String id);

    int createCourse(Course course);

    int joinCourse(@Param("id")String id, @Param("cid")String cid,@Param("joinDate") String joinDate,@Param("series")int series,@Param("cname")String cname);


    List<User> queryAllUserByCourse(@Param("cid")String cid);

    int archive(@Param("id")String id,@Param("cid")String cid);
    int restore(@Param("id")String id,@Param("cid")String cid);

    int archiveAll(@Param("cid")String cid);

    int delete(@Param("id")String id,@Param("cid")String cid);

    int deleteAll(@Param("cid")String cid);

    String queryCNameByCid(@Param("cid") String cid);

}
