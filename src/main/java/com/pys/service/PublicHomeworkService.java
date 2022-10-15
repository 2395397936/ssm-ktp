package com.pys.service;

import com.pys.bean.PublicHomework;

import java.util.List;

public interface PublicHomeworkService {
    int publicHomework(PublicHomework publicHomework);

    List<PublicHomework> acceptHomework(String cid);

}
