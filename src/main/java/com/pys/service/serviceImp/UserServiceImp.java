package com.pys.service.serviceImp;

import com.pys.bean.User;
import com.pys.dao.UserMapper;
import com.pys.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImp implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User queryUserByIdAndPassword(String id, String password) {
        return userMapper.queryUserByIdAndPassword(id,password);
    }

    @Override
    public int saveUser(User user) {
        return userMapper.saveUser(user);
    }

    @Override
    public User queryUserById(String id) {
        return userMapper.queryUserById(id);
    }

}
