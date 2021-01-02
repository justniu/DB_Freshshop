package com.example.demo.Dao;

import com.example.demo.Entities.UserLoginLog;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
@Mapper
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

    @Insert("insert into user_login_log ( \"ID\",  \"USER_ID\",  \"LOGIN_TIME\",  \"LOGIN_TYPE\",  \"LOGIN_IP\") values(#{id}, #{userId}, #{loginTime}, #{loginType}, #{loginIp})"
    )
    int addUserLoginLog(UserLoginLog userLoginLog);
}
