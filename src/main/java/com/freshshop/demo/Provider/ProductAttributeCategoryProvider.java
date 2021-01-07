package com.freshshop.demo.provider;

import org.apache.ibatis.jdbc.SQL;

import com.freshshop.demo.entity.ProductAttributeCategory;

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
                if(productattributecategory.getAttributeCount() >= 0){
                    VALUES("ATTRIBUTE_COUNT", "#{attributeCount}");
                }
                if(productattributecategory.getParamCount() >=0){
                    VALUES("PARAM_COUNT", "#{paramCount}");
                }
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
                if(productattributecategory.getAttributeCount() >=0){
                    SET("ATTRIBUTE_COUNT=#{attributeCount}");
                }
                if(productattributecategory.getParamCount() >=0){
                    SET("PARAM_COUNT=#{paramCount}");
                }
                WHERE("ID=#{id}");
            }
        }.toString();
    }

    public String dynamicDelete(ProductAttributeCategory productattributecategory){
        return new SQL(){
            {
                DELETE_FROM("product_attribute_category");
                if(productattributecategory.getId() != null){
                    WHERE("ID=#{id}");
                }
                if(productattributecategory.getProductId() != null){
                    WHERE("PRODUCT_ID=#{productId}");
                }
                if(productattributecategory.getAttributeCount() >=0){
                    WHERE("ATTRIBUTE_COUNT=#{attributeCount}");
                }
                if(productattributecategory.getParamCount() >=0){
                    WHERE("PARAM_COUNT=#{paramCount}");
                }
            }
        }.toString();
    }

    public String dynamicSelect(ProductAttributeCategory productattributecategory){
        return new SQL(){
            {
                SELECT("*");
                FROM("product_attribute_category");
                if(productattributecategory.getId() != null){
                    WHERE("ID=#{id}");
                }
                if(productattributecategory.getProductId() != null){
                    WHERE("PRODUCT_ID=#{productId}");
                }
                if(productattributecategory.getAttributeCount() >=0){
                    WHERE("ATTRIBUTE_COUNT=#{attributeCount}");
                }
                if(productattributecategory.getParamCount() >=0){
                    WHERE("PARAM_COUNT=#{paramCount}");
                }
            }
        }.toString();
    }
}