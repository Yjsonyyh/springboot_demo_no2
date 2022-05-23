package com.yyy.springboot_demo_no2.controller;

import com.yyy.springboot_demo_no2.pojo.User;
import com.yyy.springboot_demo_no2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user") //请求地址映射
//属性：6个属性
//value：   指定请求的实际地址，指定的地址可以是URI Template 模式（后面将会说明）；
//method：  指定请求的method类型， GET、POST、PUT、DELETE等；


@CrossOrigin //处理跨域问题
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/queryAllUser")
    public List<User> queryAllUser() throws Exception {
        return userService.findAllUser();
    }

}
