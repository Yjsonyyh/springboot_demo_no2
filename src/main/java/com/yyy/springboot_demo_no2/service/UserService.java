package com.yyy.springboot_demo_no2.service;

import com.yyy.springboot_demo_no2.pojo.User;

import java.util.List;

public interface UserService {
    List<User> findAllUser();
}
