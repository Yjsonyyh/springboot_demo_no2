package com.yyy.springboot_demo_no2;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.yyy.springboot_demo_no2.dao")//通过 @MapperScan 注解指定DAO接口的包名
public class SpringbootDemoNo2Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootDemoNo2Application.class, args);
    }

}
