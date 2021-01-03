package com.example.demo.Provider;

import com.example.demo.Entities.UserRegisterLog;
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

    public String dynamicInsert(UserRegisterLog userregisterlog){
        return new SQL(){
            {
                INSERT_INTO("user_register_log");
                if(userregisterlog.getUserId() != null){
                    VALUES("USER_ID", "#{userId}");
                }
                if(userregisterlog.getCreateTime() != null){
                    VALUES("CREATE_TIME", "#{createTime}");
                }
//                if(userregisterlog.getUserType() != null){
//                    VALUES("USER_TYPE", "#{userType}");
//                }
            }
        }.toString();
    }

    public String dynamicUpdate(UserRegisterLog userregisterlog){
        return new SQL(){
            {
                UPDATE("user_register_log");
                if(userregisterlog.getCreateTime() != null){
                    SET("CREATE_TIME=#{createTime}");
                }
//                if(userregisterlog.getUserType() != null){
//                    SET("USER_TYPE=#{userType}");
//                }
                WHERE("USER_ID=#{userId}");
            }
        }.toString();
    }
}
