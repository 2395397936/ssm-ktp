package com.pys.service.serviceImp;

import com.pys.bean.PublicHomework;
import com.pys.dao.PublicHomeworkMapper;
import com.pys.service.PublicHomeworkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PublicHomeworkServiceImp implements PublicHomeworkService {
    @Autowired
    private PublicHomeworkMapper publicHomeworkMapper;

    @Override
    public int publicHomework(PublicHomework publicHomework) {
        return publicHomeworkMapper.publicHomework(publicHomework);
    }

    @Override
    public List<PublicHomework> acceptHomework(String cid){
        return publicHomeworkMapper.acceptHomework(cid);
    }


}
