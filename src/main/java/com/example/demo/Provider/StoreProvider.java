package com.example.demo.Provider;

import org.apache.ibatis.jdbc.SQL;

import java.util.Map;

public class StoreProvider {
    public String selectWithParams(Map<String, Object> param){
        return new SQL(){
            {
                SELECT("*");
                FROM("store");
                if(param.get("id") != null){
                    WHERE("ID=#{id}");
                }
                if(param.get("name") != null){
                    WHERE("NAME=#{name}");
                }
                if(param.get("address") != null){
                    WHERE("ADDRESS=#{address}");
                }
                if(param.get("phone") != null){
                    WHERE("PHONE=#{phone}");
                }
            }
        }.toString();
    }
}
