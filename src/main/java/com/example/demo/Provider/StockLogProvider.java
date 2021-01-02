package com.example.demo.Provider;

import org.apache.ibatis.jdbc.SQL;

import java.util.Map;

public class StockLogProvider {
    public String selectWithParams(Map<String, Object> param){
        return new SQL(){
            {
                SELECT("*");
                FROM("stock_log");
                if(param.get("id") != null){
                    WHERE("ID=#{id}");
                }
                if(param.get("repositoryId") != null){
                    WHERE("REPOSITORY_ID=#{repositoryId}");
                }
                if(param.get("productId") != null){
                    WHERE("PRODUCT_ID=#{productId}");
                }
                if(param.get("skuCode") != null){
                    WHERE("SKU_CODE=#{skuCode}");
                }
                if(param.get("time") != null){
                    WHERE("TIME=#{time}");
                }
                if(param.get("counts") != null){
                    WHERE("COUNTS=#{counts}");
                }
                if(param.get("logType") != null){
                    WHERE("LOG_TYPE=#{logType}");
                }
            }
        }.toString();
    }
}
