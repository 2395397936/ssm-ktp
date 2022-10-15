package com.pys.dao;

import com.pys.bean.PublicHomework;

import java.util.List;

public interface PublicHomeworkMapper {
    int publicHomework(PublicHomework publicHomework);

    List<PublicHomework> acceptHomework(String cid);

}
