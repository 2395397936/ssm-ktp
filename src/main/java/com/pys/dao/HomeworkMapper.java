package com.pys.dao;

import com.pys.bean.Homework;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface HomeworkMapper {
    int submitHomework(Homework homework);

    int getScore(@Param("uid") String uid, @Param("score") String score);

    List<Homework> queryHomeworkById(String cid);

    List<Homework> getSubmitHomework(String hid);

    String queryNameById(String id);
}
