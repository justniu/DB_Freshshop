package com.example.demo.Provider;

import com.example.demo.Entities.Store;
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

    public String dynamicInsert(Store store){
        return new SQL(){
            {
                INSERT_INTO("store");
                if(store.getId() != null){
                    VALUES("ID", "#{id}");
                }
                if(store.getName() != null){
                    VALUES("NAME", "#{name}");
                }
                if(store.getAddress() != null){
                    VALUES("ADDRESS", "#{address}");
                }
                if(store.getPhone() != null){
                    VALUES("PHONE", "#{phone}");
                }
            }
        }.toString();
    }

    public String dynamicUpdate(Store store){
        return new SQL(){
            {
                UPDATE("store");
                if(store.getName() != null){
                    SET("NAME=#{name}");
                }
                if(store.getAddress() != null){
                    SET("ADDRESS=#{address}");
                }
                if(store.getPhone() != null){
                    SET("PHONE=#{phone}");
                }
                WHERE("ID=#{id}");
            }
        }.toString();
    }

    public String dynamicDelete(Store store){
        return new SQL(){
            {
                DELETE_FROM("store");
                if(store.getId() != null){
                    WHERE("ID=#{id}");
                }
                if(store.getName() != null){
                    WHERE("NAME=#{name}");
                }
                if(store.getAddress() != null){
                    WHERE("ADDRESS=#{address}");
                }
                if(store.getPhone() != null){
                    WHERE("PHONE=#{phone}");
                }
            }
        }.toString();
    }

    public String dynamicSelect(Store store){
        return new SQL(){
            {
                SELECT("*");
                FROM("store");
                if(store.getId() != null){
                    WHERE("ID=#{id}");
                }
                if(store.getName() != null){
                    WHERE("NAME=#{name}");
                }
                if(store.getAddress() != null){
                    WHERE("ADDRESS=#{address}");
                }
                if(store.getPhone() != null){
                    WHERE("PHONE=#{phone}");
                }
            }
        }.toString();
    }
}
