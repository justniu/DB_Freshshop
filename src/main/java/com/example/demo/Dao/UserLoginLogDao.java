package com.example.demo.Dao;

import com.example.demo.Entities.UserLoginLog;
import org.apache.ibatis.annotations.Insert;
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

    @Insert("insert into user_login_log ( \"id\",  \"user_id\",  \"login_time\",  \"login_type\",  \"login_ip\") values(#{id}, #{userId}, #{loginTime}, #{loginType}, #{loginIp})"
    )
    int addUserLoginLog(UserLoginLog userLoginLog);
}
