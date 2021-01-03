package com.example.demo.Provider;

import com.example.demo.Entities.ProductCategory;
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

    public String dynamicInsert(ProductCategory productcategory){
        return new SQL(){
            {
                INSERT_INTO("product_category");
                if(productcategory.getProductCategoryId() != null){
                    VALUES("PRODUCT_CATEGORY_ID", "#{productCategoryId}");
                }
                if(productcategory.getParentId() != null){
                    VALUES("PARENT_ID", "#{parentId}");
                }
                if(productcategory.getName() != null){
                    VALUES("NAME", "#{name}");
                }
                if(productcategory.getCategoryLevel() != null){
                    VALUES("CATEGORY_LEVEL", "#{categoryLevel}");
                }
                if(productcategory.getProductCount() >=0){
                    VALUES("PRODUCT_COUNT", "#{productCount}");
                }
                if(productcategory.getProductUnit() != null){
                    VALUES("PRODUCT_UNIT", "#{productUnit}");
                }
                if(productcategory.getKeywords() != null){
                    VALUES("KEYWORDS", "#{keywords}");
                }
                if(productcategory.getDescription() != null){
                    VALUES("DESCRIPTION", "#{description}");
                }
            }
        }.toString();
    }


    public String dynamicUpdate(ProductCategory productcategory){
        return new SQL(){
            {
                UPDATE("product_category");
                if(productcategory.getParentId() != null){
                    SET("PARENT_ID=#{parentId}");
                }
                if(productcategory.getName() != null){
                    SET("NAME=#{name}");
                }
                if(productcategory.getCategoryLevel() != null){
                    SET("CATEGORY_LEVEL=#{categoryLevel}");
                }
                if(productcategory.getProductCount() >=0){
                    SET("PRODUCT_COUNT=#{productCount}");
                }
                if(productcategory.getProductUnit() != null){
                    SET("PRODUCT_UNIT=#{productUnit}");
                }
                if(productcategory.getKeywords() != null){
                    SET("KEYWORDS=#{keywords}");
                }
                if(productcategory.getDescription() != null){
                    SET("DESCRIPTION=#{description}");
                }
                WHERE("PRODUCT_CATEGORY_ID=#{productCategoryId}");
            }
        }.toString();
    }

    public String dynamicDelete(ProductCategory productcategory){
        return new SQL(){
            {
                DELETE_FROM("product_category");
                if(productcategory.getProductCategoryId() != null){
                    WHERE("PRODUCT_CATEGORY_ID=#{productCategoryId}");
                }
                if(productcategory.getParentId() != null){
                    WHERE("PARENT_ID=#{parentId}");
                }
                if(productcategory.getName() != null){
                    WHERE("NAME=#{name}");
                }
                if(productcategory.getCategoryLevel() != null){
                    WHERE("CATEGORY_LEVEL=#{categoryLevel}");
                }
                if(productcategory.getProductCount() >=0){
                    WHERE("PRODUCT_COUNT=#{productCount}");
                }
                if(productcategory.getProductUnit() != null){
                    WHERE("PRODUCT_UNIT=#{productUnit}");
                }
                if(productcategory.getKeywords() != null){
                    WHERE("KEYWORDS=#{keywords}");
                }
                if(productcategory.getDescription() != null){
                    WHERE("DESCRIPTION=#{description}");
                }
            }
        }.toString();
    }

    public String dynamicSelect(ProductCategory productcategory){
        return new SQL(){
            {
                SELECT("*");
                FROM("product_category");
                if(productcategory.getProductCategoryId() != null){
                    WHERE("PRODUCT_CATEGORY_ID=#{productCategoryId}");
                }
                if(productcategory.getParentId() != null){
                    WHERE("PARENT_ID=#{parentId}");
                }
                if(productcategory.getName() != null){
                    WHERE("NAME=#{name}");
                }
                if(productcategory.getCategoryLevel() != null){
                    WHERE("CATEGORY_LEVEL=#{categoryLevel}");
                }
                if(productcategory.getProductCount() >=0){
                    WHERE("PRODUCT_COUNT=#{productCount}");
                }
                if(productcategory.getProductUnit() != null){
                    WHERE("PRODUCT_UNIT=#{productUnit}");
                }
                if(productcategory.getKeywords() != null){
                    WHERE("KEYWORDS=#{keywords}");
                }
                if(productcategory.getDescription() != null){
                    WHERE("DESCRIPTION=#{description}");
                }
            }
        }.toString();
    }
}
