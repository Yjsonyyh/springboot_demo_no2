package com.yyy.springboot_demo_no2.service.impl;

import com.yyy.springboot_demo_no2.dao.UserMapper;
import com.yyy.springboot_demo_no2.pojo.User;
import com.yyy.springboot_demo_no2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> findAllUser() {
        return userMapper.selectUsers();
    }
}
