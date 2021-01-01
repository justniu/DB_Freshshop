package com.example.demo.Entities;


import com.sun.org.apache.xpath.internal.operations.Bool;
import lombok.Data;

import java.util.Date;

@Data
public class UserLoginLog {
    private String id;
    private String userId;
    private Date loginTime;
    private int loginType;
    private String loginIp;
}
