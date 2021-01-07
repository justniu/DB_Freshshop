package com.freshshop.demo.mapper;

import com.freshshop.demo.entity.UserRegisterLog;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;


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

    @SelectProvider(type=com.freshshop.demo.provider.UserRegisterLogProvider.class, method = "selectWithParams")
    @ResultMap("resultMap")
    List<UserRegisterLog> query(Map<String, Object> param);

    @InsertProvider(type=com.freshshop.demo.provider.UserRegisterLogProvider.class, method = "dynamicInsert")
    int insert(UserRegisterLog userRegisterLog);

    @UpdateProvider(type=com.freshshop.demo.provider.UserRegisterLogProvider.class, method = "dynamicUpdate")
    int update(UserRegisterLog userRegisterLog);

    @DeleteProvider(type=com.freshshop.demo.provider.UserRegisterLogProvider.class, method = "dynamicDelete")
    int delete(UserRegisterLog userRegisterLog);

    @SelectProvider(type=com.freshshop.demo.provider.UserRegisterLogProvider.class, method = "dynamicSelect")
    @ResultMap("resultMap")
    List<UserRegisterLog> select(UserRegisterLog userRegisterLog);

}
