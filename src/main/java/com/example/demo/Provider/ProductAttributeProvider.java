package com.example.demo.Provider;

import org.apache.ibatis.jdbc.SQL;

import java.util.Map;

public class ProductAttributeProvider {
    public String selectWithParams(Map<String, Object> param){
        return new SQL(){
            {
                SELECT("*");
                FROM("product_attribute");
                if(param.get("id") != null){
                    WHERE("ID=#{id}");
                }
                if(param.get("productAttributeCategoryId") != null){
                    WHERE("PRODUCT_ATTRIBUTE_CATEGORY_ID=#{productAttributeCategoryId}");
                }
                if(param.get("name") != null){
                    WHERE("NAME=#{name}");
                }
                if(param.get("attType") != null){
                    WHERE("ATT_TYPE=#{attType}");
                }

            }
        }.toString();
    }
}
