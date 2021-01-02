package com.example.demo.Provider;

import com.example.demo.Entities.UserLoginLog;
import org.apache.ibatis.jdbc.SQL;

import java.util.Map;

public class UserLoginLogProvider {
    public String selectWithParams(Map<String, Object> param){
        return new SQL(){
            {
                SELECT("*");
                FROM("user_login_log");
                if(param.get("id") != null){
                    WHERE("ID=#{id}");
                }
                if(param.get("userId") != null){
                    WHERE("USER_ID=#{userId}");
                }
                if(param.get("loginTime") != null){
                    WHERE("LOGIN_TIME=#{loginTime}");
                }
                if(param.get("loginType") != null){
                    WHERE("LOGIN_TYPE=#{loginType}");
                }
                if(param.get("loginIp") != null){
                    WHERE("LOGIN_IP=#{loginIp}");
                }
            }
        }.toString();
    }

    public String dynamicInsert(UserLoginLog userloginlog){
        return new SQL(){
            {
                INSERT_INTO("user_login_log");
                if(userloginlog.getId() != null){
                    VALUES("ID", "#{id}");
                }
                if(userloginlog.getUserId() != null){
                    VALUES("USER_ID", "#{userId}");
                }
                if(userloginlog.getLoginTime() != null){
                    VALUES("LOGIN_TIME", "#{loginTime}");
                }
//                if(userloginlog.getLoginType() != null){
//                    VALUES("LOGIN_TYPE", "#{loginType}");
//                }
                if(userloginlog.getLoginIp() != null){
                    VALUES("LOGIN_IP", "#{loginIp}");
                }
            }
        }.toString();
    }

}
