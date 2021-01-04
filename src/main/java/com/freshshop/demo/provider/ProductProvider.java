package com.freshshop.demo.provider;

import com.freshshop.demo.entity.Product;
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
                if(product.getDeleteStatus() >=0){
                    VALUES("DELETE_STATUS", "#{deleteStatus}");
                }
                if(product.getPublishStatus() >=0){
                    VALUES("PUBLISH_STATUS", "#{publishStatus}");
                }
                if(product.getNewStatus() >=0){
                    VALUES("NEW_STATUS", "#{newStatus}");
                }
                if(product.getSale() >=0){
                    VALUES("SALE", "#{sale}");
                }
                if(product.getProductPrice() >=0){
                    VALUES("PRODUCT_PRICE", "#{productPrice}");
                }
                if(product.getPromotionPrice() >=0){
                    VALUES("PROMOTION_PRICE", "#{promotionPrice}");
                }
                if(product.getStock() >=0){
                    VALUES("STOCK", "#{stock}");
                }
                if(product.getLowStock() >=0){
                    VALUES("LOW_STOCK", "#{lowStock}");
                }
                if(product.getUnit() != null){
                    VALUES("UNIT", "#{unit}");
                }
                if(product.getWeight() >=0){
                    VALUES("WEIGHT", "#{weight}");
                }
                if(product.getPromotionType() >=0){
                    VALUES("PROMOTION_TYPE", "#{promotionType}");
                }
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
                if(product.getDeleteStatus() >=0){
                    SET("DELETE_STATUS=#{deleteStatus}");
                }
                if(product.getPublishStatus() >=0){
                    SET("PUBLISH_STATUS=#{publishStatus}");
                }
                if(product.getNewStatus() >=0){
                    SET("NEW_STATUS=#{newStatus}");
                }
                if(product.getSale() >=0){
                    SET("SALE=#{sale}");
                }
                if(product.getProductPrice() >=0){
                    SET("PRODUCT_PRICE=#{productPrice}");
                }
                if(product.getPromotionPrice() >=0){
                    SET("PROMOTION_PRICE=#{promotionPrice}");
                }
                if(product.getStock() >=0){
                    SET("STOCK=#{stock}");
                }
                if(product.getLowStock() >=0){
                    SET("LOW_STOCK=#{lowStock}");
                }
                if(product.getUnit() != null){
                    SET("UNIT=#{unit}");
                }
                if(product.getWeight() >=0){
                    SET("WEIGHT=#{weight}");
                }
                if(product.getPromotionType() >=0){
                    SET("PROMOTION_TYPE=#{promotionType}");
                }
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

    public String dynamicDelete(Product product){
        return new SQL(){
            {
                DELETE_FROM("product");
                if(product.getProductId() != null){
                    WHERE("PRODUCT_ID=#{productId}");
                }
                if(product.getProductCategoryId() != null){
                    WHERE("PRODUCT_CATEGORY_ID=#{productCategoryId}");
                }
                if(product.getUpdateTime() != null){
                    WHERE("UPDATE_TIME=#{updateTime}");
                }
                if(product.getName() != null){
                    WHERE("NAME=#{name}");
                }
                if(product.getDeleteStatus() >=0){
                    WHERE("DELETE_STATUS=#{deleteStatus}");
                }
                if(product.getPublishStatus() >=0){
                    WHERE("PUBLISH_STATUS=#{publishStatus}");
                }
                if(product.getNewStatus() >=0){
                    WHERE("NEW_STATUS=#{newStatus}");
                }
                if(product.getSale() >=0){
                    WHERE("SALE=#{sale}");
                }
                if(product.getProductPrice() >=0){
                    WHERE("PRODUCT_PRICE=#{productPrice}");
                }
                if(product.getPromotionPrice() >=0){
                    WHERE("PROMOTION_PRICE=#{promotionPrice}");
                }
                if(product.getStock() >=0){
                    WHERE("STOCK=#{stock}");
                }
                if(product.getLowStock() >=0){
                    WHERE("LOW_STOCK=#{lowStock}");
                }
                if(product.getUnit() != null){
                    WHERE("UNIT=#{unit}");
                }
                if(product.getWeight() >=0){
                    WHERE("WEIGHT=#{weight}");
                }
                if(product.getPromotionType() >=0){
                    WHERE("PROMOTION_TYPE=#{promotionType}");
                }
                if(product.getPromotionStartTime() != null){
                    WHERE("PROMOTION_START_TIME=#{promotionStartTime}");
                }
                if(product.getPromotionEndTime() != null){
                    WHERE("PROMOTION_END_TIME=#{promotionEndTime}");
                }
            }
        }.toString();
    }

    public String dynamicSelect(Product product){
        return new SQL(){
            {
                SELECT("*");
                FROM("product");
                if(product.getProductId() != null){
                    WHERE("PRODUCT_ID=#{productId}");
                }
                if(product.getProductCategoryId() != null){
                    WHERE("PRODUCT_CATEGORY_ID=#{productCategoryId}");
                }
                if(product.getUpdateTime() != null){
                    WHERE("UPDATE_TIME=#{updateTime}");
                }
                if(product.getName() != null){
                    WHERE("NAME=#{name}");
                }
                if(product.getDeleteStatus() >=0){
                    WHERE("DELETE_STATUS=#{deleteStatus}");
                }
                if(product.getPublishStatus() >=0){
                    WHERE("PUBLISH_STATUS=#{publishStatus}");
                }
                if(product.getNewStatus() >=0){
                    WHERE("NEW_STATUS=#{newStatus}");
                }
                if(product.getSale() >=0){
                    WHERE("SALE=#{sale}");
                }
                if(product.getProductPrice() >=0){
                    WHERE("PRODUCT_PRICE=#{productPrice}");
                }
                if(product.getPromotionPrice() >=0){
                    WHERE("PROMOTION_PRICE=#{promotionPrice}");
                }
                if(product.getStock() >=0){
                    WHERE("STOCK=#{stock}");
                }
                if(product.getLowStock() >=0){
                    WHERE("LOW_STOCK=#{lowStock}");
                }
                if(product.getUnit() != null){
                    WHERE("UNIT=#{unit}");
                }
                if(product.getWeight() >=0){
                    WHERE("WEIGHT=#{weight}");
                }
                if(product.getPromotionType() >=0){
                    WHERE("PROMOTION_TYPE=#{promotionType}");
                }
                if(product.getPromotionStartTime() != null){
                    WHERE("PROMOTION_START_TIME=#{promotionStartTime}");
                }
                if(product.getPromotionEndTime() != null){
                    WHERE("PROMOTION_END_TIME=#{promotionEndTime}");
                }
            }
        }.toString();
    }
}
