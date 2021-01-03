package com.example.demo.Provider;

import com.example.demo.Entities.Product;
import org.apache.ibatis.jdbc.SQL;

import java.util.Map;

public class ProductProvider {
    public String selectWithParams(Map<String, Object> param){
        return new SQL(){
            {
                SELECT("*");
                FROM("product");
                if(param.get("productId") != null){
                    WHERE("PRODUCT_ID=#{productId}");
                }
                if(param.get("productCategoryId") != null){
                    WHERE("PRODUCT_CATEGORY_ID=#{productCategoryId}");
                }
                if(param.get("updateTime") != null){
                    WHERE("UPDATE_TIME=#{updateTime}");
                }
                if(param.get("name") != null){
                    WHERE("NAME=#{name}");
                }
                if(param.get("deleteStatus") != null){
                    WHERE("DELETE_STATUS=#{deleteStatus}");
                }
                if(param.get("publishStatus") != null){
                    WHERE("PUBLISH_STATUS=#{publishStatus}");
                }
                if(param.get("newStatus") != null){
                    WHERE("NEW_STATUS=#{newStatus}");
                }
                if(param.get("sale") != null){
                    WHERE("SALE=#{sale}");
                }
                if(param.get("productPrice") != null){
                    WHERE("PRODUCT_PRICE=#{productPrice}");
                }
                if(param.get("promotionPrice") != null){
                    WHERE("PROMOTION_PRICE=#{promotionPrice}");
                }
                if(param.get("stock") != null){
                    WHERE("STOCK=#{stock}");
                }
                if(param.get("lowStock") != null){
                    WHERE("LOW_STOCK=#{lowStock}");
                }
                if(param.get("unit") != null){
                    WHERE("UNIT=#{unit}");
                }
                if(param.get("weight") != null){
                    WHERE("WEIGHT=#{weight}");
                }
                if(param.get("promotionType") != null){
                    WHERE("PROMOTION_TYPE=#{promotionType}");
                }
                if(param.get("promotionStartTime") != null){
                    WHERE("PROMOTION_START_TIME=#{promotionStartTime}");
                }
                if(param.get("promotionEndTime") != null){
                    WHERE("PROMOTION_END_TIME=#{promotionEndTime}");
                }
            }
        }.toString();
    }

    public String dynamicInsert(Product product){
        return new SQL(){
            {
                INSERT_INTO("product");
                if(product.getProductId() != null){
                    VALUES("PRODUCT_ID", "#{productId}");
                }
                if(product.getProductCategoryId() != null){
                    VALUES("PRODUCT_CATEGORY_ID", "#{productCategoryId}");
                }
                if(product.getUpdateTime() != null){
                    VALUES("UPDATE_TIME", "#{updateTime}");
                }
                if(product.getName() != null){
                    VALUES("NAME", "#{name}");
                }
//                if(product.getDeleteStatus() != null){
//                    VALUES("DELETE_STATUS", "#{deleteStatus}");
//                }
//                if(product.getPublishStatus() != null){
//                    VALUES("PUBLISH_STATUS", "#{publishStatus}");
//                }
//                if(product.getNewStatus() != null){
//                    VALUES("NEW_STATUS", "#{newStatus}");
//                }
//                if(product.getSale() != null){
//                    VALUES("SALE", "#{sale}");
//                }
//                if(product.getProductPrice() != null){
//                    VALUES("PRODUCT_PRICE", "#{productPrice}");
//                }
//                if(product.getPromotionPrice() != null){
//                    VALUES("PROMOTION_PRICE", "#{promotionPrice}");
//                }
//                if(product.getStock() != null){
//                    VALUES("STOCK", "#{stock}");
//                }
//                if(product.getLowStock() != null){
//                    VALUES("LOW_STOCK", "#{lowStock}");
//                }
//                if(product.getUnit() != null){
//                    VALUES("UNIT", "#{unit}");
//                }
//                if(product.getWeight() != null){
//                    VALUES("WEIGHT", "#{weight}");
//                }
//                if(product.getPromotionType() != null){
//                    VALUES("PROMOTION_TYPE", "#{promotionType}");
//                }
                if(product.getPromotionStartTime() != null){
                    VALUES("PROMOTION_START_TIME", "#{promotionStartTime}");
                }
                if(product.getPromotionEndTime() != null){
                    VALUES("PROMOTION_END_TIME", "#{promotionEndTime}");
                }
            }
        }.toString();
    }

    public String dynamicUpdate(Product product){
        return new SQL(){
            {
                UPDATE("product");
                if(product.getProductCategoryId() != null){
                    SET("PRODUCT_CATEGORY_ID=#{productCategoryId}");
                }
                if(product.getUpdateTime() != null){
                    SET("UPDATE_TIME=#{updateTime}");
                }
                if(product.getName() != null){
                    SET("NAME=#{name}");
                }
//                if(product.getDeleteStatus() != null){
//                    SET("DELETE_STATUS=#{deleteStatus}");
//                }
//                if(product.getPublishStatus() != null){
//                    SET("PUBLISH_STATUS=#{publishStatus}");
//                }
//                if(product.getNewStatus() != null){
//                    SET("NEW_STATUS=#{newStatus}");
//                }
//                if(product.getSale() != null){
//                    SET("SALE=#{sale}");
//                }
//                if(product.getProductPrice() != null){
//                    SET("PRODUCT_PRICE=#{productPrice}");
//                }
//                if(product.getPromotionPrice() != null){
//                    SET("PROMOTION_PRICE=#{promotionPrice}");
//                }
//                if(product.getStock() != null){
//                    SET("STOCK=#{stock}");
//                }
//                if(product.getLowStock() != null){
//                    SET("LOW_STOCK=#{lowStock}");
//                }
                if(product.getUnit() != null){
                    SET("UNIT=#{unit}");
                }
//                if(product.getWeight() != null){
//                    SET("WEIGHT=#{weight}");
//                }
//                if(product.getPromotionType() != null){
//                    SET("PROMOTION_TYPE=#{promotionType}");
//                }
                if(product.getPromotionStartTime() != null){
                    SET("PROMOTION_START_TIME=#{promotionStartTime}");
                }
                if(product.getPromotionEndTime() != null){
                    SET("PROMOTION_END_TIME=#{promotionEndTime}");
                }
                WHERE("PRODUCT_ID=#{productId}");
            }
        }.toString();
    }
}
