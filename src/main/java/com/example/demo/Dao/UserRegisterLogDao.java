package com.example.demo.Dao;

import com.example.demo.Entities.UserRegisterLog;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
@Mapper
public interface UserRegisterLogDao {
    @Select("select * from user_register_log")
    @Results(id="resultMap", value = {
            @Result(property = "userId", column = "user_id"),
            @Result(property = "createTime", column = "create_time"),
            @Result(property = "userType", column = "user_type"),
    })
    List<UserRegisterLog> queryAll();

    @Insert("insert into user_register_log ( \"USER_ID\",  \"CREATE_TIME\",  \"USER_TYPE\") values(#{userId}, #{createTime}, #{userType})"
    )
    int addUserRegisterLog(UserRegisterLog userRegisterLog);
}
