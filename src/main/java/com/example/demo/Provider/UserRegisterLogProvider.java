package com.example.demo.Provider;

import org.apache.ibatis.jdbc.SQL;

import java.util.Map;

public class UserRegisterLogProvider {
    public String selectWithParams(Map<String, Object> param){
        return new SQL(){
            {
                SELECT("*");
                FROM("user_register_log");
                if(param.get("userId") != null){
                    WHERE("USER_ID=#{userId}");
                }
                if(param.get("createTime") != null){
                    WHERE("CREATE_TIME=#{createTime}");
                }
                if(param.get("userType") != null){
                    WHERE("USER_TYPE=#{userType}");
                }
            }
        }.toString();
    }
}
