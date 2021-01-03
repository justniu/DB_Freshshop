package com.freshshop.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.freshshop.demo.entity.UserRegisterLog;
import com.freshshop.demo.mapper.UserRegisterLogDao;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/register")
public class UserRegisterLogController {
    @Autowired
    private UserRegisterLogDao userRegisterLogDao;

    @GetMapping
    public String insert(@RequestBody UserRegisterLog userRegisterLog){
//        UserRegisterLog userRegisterLog = new UserRegisterLog();
//        userRegisterLog.setUserId("5fefff260e3a508e69ba1bc0");
//        userRegisterLog.setUserType(0);
//        userRegisterLog.setCreateTime(new Date());
        userRegisterLogDao.addUserRegisterLog(userRegisterLog);
        return "userregisterlog!";
    }

    @GetMapping("/list")
    public List<UserRegisterLog> query(@RequestParam Map<String, Object> param){
        return userRegisterLogDao.query(param);
    }
}
