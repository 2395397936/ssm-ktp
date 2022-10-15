package com.pys.service;

import com.pys.bean.Homework;

import java.util.List;

public interface HomeworkService {
    int submitHomework(Homework homework);
    int getScore(String hid,String score);
    List<Homework> queryHomeworkById(String id);
    List<Homework> getSubmitHomework(String hid);
    String queryNameById(String id);
}
