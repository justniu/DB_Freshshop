package com.example.demo.Entities;

import lombok.Data;

import java.util.Date;

@Data
public class User {
    private String userId;
    private String userName;
    private String userPassword;
    private String userTel;
    private String userEmail;
    private String userZipCode;
    private String userAddressDetail;
    private String usertype;
    private Date userRegisterTime;
    private String realName;
}
