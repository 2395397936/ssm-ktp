package com.pys.dao;

import com.pys.bean.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    User queryUserByIdAndPassword(@Param("id") String id, @Param("password") String password);

    int saveUser(User user);

    User queryUserById(@Param("id") String id);
}
