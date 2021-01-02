package com.example.demo.Controller;


import com.example.demo.Dao.UserLoginLogDao;
import com.example.demo.Entities.User;
import com.example.demo.Entities.UserLoginLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/login")
public class UserLoginLogController {

    @Autowired
    private UserLoginLogDao userLoginLogDao;

    @GetMapping
    public String insertUserLoginLog(){
        UserLoginLog userLoginLog = new UserLoginLog();
        userLoginLog.setLoginIp("127.0.0.1");
        userLoginLog.setUserId("5fefff260e3a508e69ba1bbf");
        userLoginLog.setLoginType(1);
        userLoginLog.setLoginTime(new Date());
        userLoginLog.setId("1001");
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
