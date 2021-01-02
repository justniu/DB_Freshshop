package com.example.demo.Provider;

import com.example.demo.Entities.CategoryAttribute;
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
    public String dynamicInsert(CategoryAttribute categoryattribute){
        return new SQL(){
            {
                INSERT_INTO("category_attribute");
                if(categoryattribute.getId() != null){
                    VALUES("ID", "#{id}");
                }
                if(categoryattribute.getProductCategoryId() != null){
                    VALUES("PRODUCT_CATEGORY_ID", "#{productCategoryId}");
                }
                if(categoryattribute.getProductAttributeId() != null){
                    VALUES("PRODUCT_ATTRIBUTE_ID", "#{productAttributeId}");
                }
            }
        }.toString();
    }
}
