package com.freshshop.demo.provider;

import com.freshshop.demo.entity.ProductAttributeValue;
import org.apache.ibatis.jdbc.SQL;

import java.util.Map;

public class ProductAttributeValueProvider {
    public String selectWithParams(Map<String, Object> param){
        return new SQL(){
            {
                SELECT("*");
                FROM("product_attribute_value");
                if(param.get("id") != null){
                    WHERE("ID=#{id}");
                }
                if(param.get("productAttributeId") != null){
                    WHERE("PRODUCT_ATTRIBUTE_ID=#{productAttributeId}");
                }
                if(param.get("value") != null){
                    WHERE("VALUE=#{value}");
                }
            }
        }.toString();
    }

    public String dynamicInsert(ProductAttributeValue productattributevalue){
        return new SQL(){
            {
                INSERT_INTO("product_attribute_value");
                if(productattributevalue.getId() != null){
                    VALUES("ID", "#{id}");
                }
                if(productattributevalue.getProductAttributeId() != null){
                    VALUES("PRODUCT_ATTRIBUTE_ID", "#{productAttributeId}");
                }
                if(productattributevalue.getValue() != null){
                    VALUES("VALUE", "#{value}");
                }
            }
        }.toString();
    }

    public String dynamicUpdate(ProductAttributeValue productattributevalue){
        return new SQL(){
            {
                UPDATE("product_attribute_value");
                if(productattributevalue.getProductAttributeId() != null){
                    SET("PRODUCT_ATTRIBUTE_ID=#{productAttributeId}");
                }
                if(productattributevalue.getValue() != null){
                    SET("VALUE=#{value}");
                }
                WHERE("ID=#{id}");
            }
        }.toString();
    }

    public String dynamicDelete(ProductAttributeValue productattributevalue){
        return new SQL(){
            {
                DELETE_FROM("product_attribute_value");
                if(productattributevalue.getId() != null){
                    WHERE("ID=#{id}");
                }
                if(productattributevalue.getProductAttributeId() != null){
                    WHERE("PRODUCT_ATTRIBUTE_ID=#{productAttributeId}");
                }
                if(productattributevalue.getValue() != null){
                    WHERE("VALUE=#{value}");
                }
            }
        }.toString();
    }

    public String dynamicSelect(ProductAttributeValue productattributevalue){
        return new SQL(){
            {
                SELECT("*");
                FROM("product_attribute_value");
                if(productattributevalue.getId() != null){
                    WHERE("ID=#{id}");
                }
                if(productattributevalue.getProductAttributeId() != null){
                    WHERE("PRODUCT_ATTRIBUTE_ID=#{productAttributeId}");
                }
                if(productattributevalue.getValue() != null){
                    WHERE("VALUE=#{value}");
                }
            }
        }.toString();
    }

}
