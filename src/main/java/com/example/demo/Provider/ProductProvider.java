package com.example.demo.Provider;

import org.apache.ibatis.jdbc.SQL;

import java.util.Map;

public class ProductProvider {
    public String selectWithParams(Map<String, Object> param){
        return new SQL(){
            {
                SELECT("*");
                FROM("product");
                if(param.get("productId") != null){
                    WHERE("PRODUCT_ID=#{productId}");
                }
                if(param.get("productCategoryId") != null){
                    WHERE("PRODUCT_CATEGORY_ID=#{productCategoryId}");
                }
                if(param.get("updateTime") != null){
                    WHERE("UPDATE_TIME=#{updateTime}");
                }
                if(param.get("name") != null){
                    WHERE("NAME=#{name}");
                }
                if(param.get("deleteStatus") != null){
                    WHERE("DELETE_STATUS=#{deleteStatus}");
                }
                if(param.get("publishStatus") != null){
                    WHERE("PUBLISH_STATUS=#{publishStatus}");
                }
                if(param.get("newStatus") != null){
                    WHERE("NEW_STATUS=#{newStatus}");
                }
                if(param.get("sale") != null){
                    WHERE("SALE=#{sale}");
                }
                if(param.get("productPrice") != null){
                    WHERE("PRODUCT_PRICE=#{productPrice}");
                }
                if(param.get("promotionPrice") != null){
                    WHERE("PROMOTION_PRICE=#{promotionPrice}");
                }
                if(param.get("stock") != null){
                    WHERE("STOCK=#{stock}");
                }
                if(param.get("lowStock") != null){
                    WHERE("LOW_STOCK=#{lowStock}");
                }
                if(param.get("unit") != null){
                    WHERE("UNIT=#{unit}");
                }
                if(param.get("weight") != null){
                    WHERE("WEIGHT=#{weight}");
                }
                if(param.get("promotionType") != null){
                    WHERE("PROMOTION_TYPE=#{promotionType}");
                }
                if(param.get("promotionStartTime") != null){
                    WHERE("PROMOTION_START_TIME=#{promotionStartTime}");
                }
                if(param.get("promotionEndTime") != null){
                    WHERE("PROMOTION_END_TIME=#{promotionEndTime}");
                }
            }
        }.toString();
    }
}
