package com.example.demo.Dao;

import com.example.demo.Entities.UserLoginLog;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserLoginLogDao {
    @Select("select * from user_login_log")
    @Results(id="resultMap", value = {
            @Result(property = "id", column = "id"),
            @Result(property = "userId", column = "user_id"),
            @Result(property = "loginTime", column = "login_time"),
            @Result(property = "loginType", column = "login_type"),
            @Result(property = "loginIp", column = "login_ip"),
    })
    List<UserLoginLog> queryAll();
}
