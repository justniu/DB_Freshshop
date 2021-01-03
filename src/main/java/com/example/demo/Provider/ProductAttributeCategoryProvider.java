package com.example.demo.Provider;

import com.example.demo.Entities.ProductAttributeCategory;
import org.apache.ibatis.jdbc.SQL;

import java.util.Map;

public class ProductAttributeCategoryProvider {
    public String selectWithParams(Map<String, Object> param){
        return new SQL(){
            {
                SELECT("*");
                FROM("product_attribute_category");
                if(param.get("id") != null){
                    WHERE("ID=#{id}");
                }
                if(param.get("productId") != null){
                    WHERE("PRODUCT_ID=#{productId}");
                }
                if(param.get("attributeCount") != null){
                    WHERE("ATTRIBUTE_COUNT=#{attributeCount}");
                }
                if(param.get("paramCount") != null){
                    WHERE("PARAM_COUNT=#{paramCount}");
                }
            }
        }.toString();
    }

    public String dynamicInsert(ProductAttributeCategory productattributecategory){
        return new SQL(){
            {
                INSERT_INTO("product_attribute_category");
                if(productattributecategory.getId() != null){
                    VALUES("ID", "#{id}");
                }
                if(productattributecategory.getProductId() != null){
                    VALUES("PRODUCT_ID", "#{productId}");
                }
//                if(productattributecategory.getAttributeCount() != null){
//                    VALUES("ATTRIBUTE_COUNT", "#{attributeCount}");
//                }
//                if(productattributecategory.getParamCount() != null){
//                    VALUES("PARAM_COUNT", "#{paramCount}");
//                }
            }
        }.toString();
    }

    public String dynamicUpdate(ProductAttributeCategory productattributecategory){
        return new SQL(){
            {
                UPDATE("product_attribute_category");
                if(productattributecategory.getProductId() != null){
                    SET("PRODUCT_ID=#{productId}");
                }
//                if(productattributecategory.getAttributeCount() != null){
//                    SET("ATTRIBUTE_COUNT=#{attributeCount}");
//                }
//                if(productattributecategory.getParamCount() != null){
//                    SET("PARAM_COUNT=#{paramCount}");
//                }
                WHERE("ID=#{id}");
            }
        }.toString();
    }
}
