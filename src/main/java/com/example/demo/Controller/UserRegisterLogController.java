package com.example.demo.Controller;


import com.example.demo.Dao.UserRegisterLogDao;
import com.example.demo.Entities.UserRegisterLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/register")
public class UserRegisterLogController {
    @Autowired
    private UserRegisterLogDao userRegisterLogDao;

    @GetMapping
    public String insertUserRegisterLog(){
        UserRegisterLog userRegisterLog = new UserRegisterLog();
        userRegisterLog.setUserId("5fefff260e3a508e69ba1bc0");
        userRegisterLog.setUserType(0);
        userRegisterLog.setCreateTime(new Date());
        userRegisterLogDao.addUserRegisterLog(userRegisterLog);
        return "userregisterlog!";
    }


}
