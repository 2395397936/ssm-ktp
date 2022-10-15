package com.pys.service;

import com.pys.bean.User;

public interface UserService {
    User queryUserByIdAndPassword(String id,String password);
     int saveUser(User user);
    User queryUserById(String id);

}
