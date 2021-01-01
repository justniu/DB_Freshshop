package com.example.demo.Entities;

import lombok.Data;

import java.util.Date;

@Data
public class UserRegisterLog {
    private String userId;
    private Date createTime;
    private int userType;
}
