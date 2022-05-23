package com.yyy.springboot_demo_no2.dao;

import com.yyy.springboot_demo_no2.pojo.User;

import java.util.List;

public interface UserMapper {

    List<User> selectUsers();
}
