package com.example.demo.Provider;

import com.example.demo.Entities.ProductAttribute;
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

    public String dynamicInsert(ProductAttribute productattribute){
        return new SQL(){
            {
                INSERT_INTO("product_attribute");
                if(productattribute.getId() != null){
                    VALUES("ID", "#{id}");
                }
                if(productattribute.getProductAttributeCategoryId() != null){
                    VALUES("PRODUCT_ATTRIBUTE_CATEGORY_ID", "#{productAttributeCategoryId}");
                }
                if(productattribute.getName() != null){
                    VALUES("NAME", "#{name}");
                }
                if(productattribute.getAttType() != null){
                    VALUES("ATT_TYPE", "#{attType}");
                }
            }
        }.toString();
    }
}
