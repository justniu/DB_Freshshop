package com.example.demo.Provider;

import com.example.demo.Entities.StockLog;
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

    public String dynamicInsert(StockLog stocklog){
        return new SQL(){
            {
                INSERT_INTO("stock_log");
                if(stocklog.getId() != null){
                    VALUES("ID", "#{id}");
                }
                if(stocklog.getRepositoryId() != null){
                    VALUES("REPOSITORY_ID", "#{repositoryId}");
                }
                if(stocklog.getProductId() != null){
                    VALUES("PRODUCT_ID", "#{productId}");
                }
                if(stocklog.getSkuCode() != null){
                    VALUES("SKU_CODE", "#{skuCode}");
                }
                if(stocklog.getTime() != null){
                    VALUES("TIME", "#{time}");
                }
//                if(stocklog.getCounts() != null){
//                    VALUES("COUNTS", "#{counts}");
//                }
//                if(stocklog.getLogType() != null){
//                    VALUES("LOG_TYPE", "#{logType}");
//                }
            }
        }.toString();
    }
}
