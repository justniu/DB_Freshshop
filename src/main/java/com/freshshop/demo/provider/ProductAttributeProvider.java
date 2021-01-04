package com.freshshop.demo.provider;

import com.freshshop.demo.entity.ProductAttribute;
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

    public String dynamicUpdate(ProductAttribute productattribute){
        return new SQL(){
            {
                UPDATE("product_attribute");
                if(productattribute.getProductAttributeCategoryId() != null){
                    SET("PRODUCT_ATTRIBUTE_CATEGORY_ID=#{productAttributeCategoryId}");
                }
                if(productattribute.getName() != null){
                    SET("NAME=#{name}");
                }
                if(productattribute.getAttType() != null){
                    SET("ATT_TYPE=#{attType}");
                }
                WHERE("ID=#{id}");
            }
        }.toString();
    }

    public String dynamicDelete(ProductAttribute productattribute){
        return new SQL(){
            {
                DELETE_FROM("product_attribute");
                if(productattribute.getId() != null){
                    WHERE("ID=#{id}");
                }
                if(productattribute.getProductAttributeCategoryId() != null){
                    WHERE("PRODUCT_ATTRIBUTE_CATEGORY_ID=#{productAttributeCategoryId}");
                }
                if(productattribute.getName() != null){
                    WHERE("NAME=#{name}");
                }
                if(productattribute.getAttType() != null){
                    WHERE("ATT_TYPE=#{attType}");
                }
            }
        }.toString();
    }

    public String dynamicSelect(ProductAttribute productattribute){
        return new SQL(){
            {
                SELECT("*");
                FROM("product_attribute");
                if(productattribute.getId() != null){
                    WHERE("ID=#{id}");
                }
                if(productattribute.getProductAttributeCategoryId() != null){
                    WHERE("PRODUCT_ATTRIBUTE_CATEGORY_ID=#{productAttributeCategoryId}");
                }
                if(productattribute.getName() != null){
                    WHERE("NAME=#{name}");
                }
                if(productattribute.getAttType() != null){
                    WHERE("ATT_TYPE=#{attType}");
                }
            }
        }.toString();
    }
}
