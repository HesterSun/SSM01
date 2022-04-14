package com.it.ssm.service.impl;

import com.it.ssm.mapper.UserMapper;
import com.it.ssm.pojo.User;
import com.it.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public User getUser(int id) {
        return userMapper.getUserById(id);
    }
}
