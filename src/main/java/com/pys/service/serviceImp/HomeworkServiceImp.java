package com.pys.service.serviceImp;

import com.pys.bean.Homework;
import com.pys.dao.HomeworkMapper;
import com.pys.service.HomeworkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class HomeworkServiceImp implements HomeworkService {
    @Autowired
    private HomeworkMapper homeworkMapper;

    @Override
    public int submitHomework(Homework homework) {
        return homeworkMapper.submitHomework(homework);
    }

    @Override
    public int getScore(String hid, String score) {
        return homeworkMapper.getScore(hid,score);
    }

    @Override
    public List<Homework> queryHomeworkById(String cid) {
        return homeworkMapper.queryHomeworkById(cid);
    }

    @Override
    public List<Homework> getSubmitHomework(String hid) {
        return homeworkMapper.getSubmitHomework(hid);
    }

    @Override
    public String queryNameById(String id) {
        return homeworkMapper.queryNameById(id);
    }

}
