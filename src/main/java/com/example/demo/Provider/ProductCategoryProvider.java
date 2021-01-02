package com.example.demo.Provider;

import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.jdbc.SQL;

import java.util.Map;

public class ProductCategoryProvider {
    public String selectWithParams(Map<String, Object> param){
        return new SQL(){
            {
                SELECT("*");
                FROM("Product_Category");
                if(param.get("id") != null){
                    WHERE("product_category_id=#{id}");
                }
                if(param.get("parentId") != null) {
                    WHERE("parent_id=#{parentId}");
                }
                if (param.get("name") !=null) {
                    WHERE("name=#{name}");
                }
                if (param.get("categoryLevel") != null) {
                    WHERE("category_level=#{categoryLevel}");
                }
                if (param.get("keywords") != null) {
                    WHERE("keywords=#{keywords}");
                }
            }
        }.toString();
    }
}
