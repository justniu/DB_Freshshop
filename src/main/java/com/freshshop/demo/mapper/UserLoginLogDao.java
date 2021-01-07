package com.freshshop.demo.mapper;

import com.freshshop.demo.entity.UserLoginLog;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;


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

    @SelectProvider(type=com.freshshop.demo.provider.UserLoginLogProvider.class, method = "selectWithParams")
    @ResultMap("resultMap")
    List<UserLoginLog> query(Map<String, Object> param);

    @InsertProvider(type=com.freshshop.demo.provider.UserLoginLogProvider.class, method = "dynamicInsert")
    int insert(UserLoginLog userLoginLog);

    @UpdateProvider(type=com.freshshop.demo.provider.UserLoginLogProvider.class, method = "dynamicUpdate")
    int update(UserLoginLog userLoginLog);

    @DeleteProvider(type=com.freshshop.demo.provider.UserLoginLogProvider.class, method = "dynamicDelete")
    int delete(UserLoginLog userLoginLog);

    @SelectProvider(type=com.freshshop.demo.provider.UserLoginLogProvider.class, method = "dynamicSelect")
    @ResultMap("resultMap")
    List<UserLoginLog> select(UserLoginLog userLoginLog);
}
