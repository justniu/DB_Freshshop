package com.example.demo.Provider;

import org.apache.ibatis.jdbc.SQL;

import java.util.Map;

public class CategoryAttributeProvider {
    public String selectWithParams(Map<String, Object> param){
        return new SQL(){
            {
                SELECT("*");
                FROM("category_attribute");
                if(param.get("id") != null){
                    WHERE("ID=#{id}");
                }
                if(param.get("productCategoryId") != null){
                    WHERE("PRODUCT_CATEGORY_ID=#{productCategoryId}");
                }
                if(param.get("productAttributeId") != null){
                    WHERE("PRODUCT_ATTRIBUTE_ID=#{productAttributeId}");
                }
            }
        }.toString();
    }
}
