package com.example.demo.Dao;

import com.example.demo.Entities.UserRegisterLog;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserRegisterLogDao {
    @Select("select * from user_register_log")
    @Results(id="resultMap", value = {
            @Result(property = "userId", column = "user_id"),
            @Result(property = "createTime", column = "create_time"),
            @Result(property = "userType", column = "user_type"),
    })
    List<UserRegisterLog> queryAll();

    @Insert("insert into user_register_log ( \"user_id\",  \"create_time\",  \"user_type\") values(#{userId}, #{createTime}, #{userType})"
    )
    int addUserRegisterLog(UserRegisterLog userRegisterLog);
}
