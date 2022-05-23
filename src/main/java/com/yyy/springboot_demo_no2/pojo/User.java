package com.yyy.springboot_demo_no2.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;


@Data
public class User {
    private Integer id;
    private String username;
    private Integer age;
    //    @JsonFormat(
//            shape = JsonFormat.Shape.ANY,locale = "zh_CN",pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT")
    @JsonFormat(pattern = "YYYY-MM-dd :hh:mm:ss",timezone = "GMT",locale = "zh_CN")
    @DateTimeFormat(pattern = "YYYY-MM-DD :hh:mm:ss")
    private Date birthday;
    private Double money;
}
