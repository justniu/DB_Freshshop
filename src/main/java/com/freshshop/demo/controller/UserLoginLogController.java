package com.freshshop.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.freshshop.demo.entity.UserLoginLog;
import com.freshshop.demo.mapper.UserLoginLogDao;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/login")
public class UserLoginLogController {

    @Autowired
    private UserLoginLogDao userLoginLogDao;

    @PostMapping
    public String insert(@RequestBody UserLoginLog userLoginLog){
//        UserLoginLog userLoginLog = new UserLoginLog();
//        userLoginLog.setLoginIp("127.0.0.1");
//        userLoginLog.setUserId("5fefff260e3a508e69ba1bbf");
//        userLoginLog.setLoginType(1);
//        userLoginLog.setLoginTime(new Date());
//        userLoginLog.setId("1001");
        userLoginLogDao.addUserLoginLog(userLoginLog);
        return "userloginlog!";
    }

    @GetMapping("/lists")
    public List<UserLoginLog> queryAll(){
        List<UserLoginLog> userLoginLogs = userLoginLogDao.queryAll();
        return userLoginLogs;
    }

    @GetMapping("/list")
    public List<UserLoginLog> query(@RequestParam Map<String, Object> param){
        return userLoginLogDao.query(param);
    }
}
