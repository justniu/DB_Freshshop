package com.freshshop.demo.Provider;

import com.freshshop.demo.entity.PurchaseDetail;
import org.apache.ibatis.jdbc.SQL;

import java.util.Map;

public class PurchaseDetailProvider {
    public String selectWithParams(Map<String, Object> param){
        return new SQL(){
            {
                SELECT("*");
                FROM("purchase_detail");
                if(param.get("id") != null){
                    WHERE("ID=#{id}");
                }
                if(param.get("orderId") != null){
                    WHERE("ORDER_ID=#{orderId}");
                }
                if(param.get("productId") != null){
                    WHERE("PRODUCT_ID=#{productId}");
                }
                if(param.get("counts") != null){
                    WHERE("COUNTS=#{counts}");
                }
                if(param.get("price") != null){
                    WHERE("PRICE=#{price}");
                }
                if(param.get("discount") != null){
                    WHERE("DISCOUNT=#{discount}");
                }
                if(param.get("spend") != null){
                    WHERE("SPEND=#{spend}");
                }
                if(param.get("productSkuCode") != null){
                    WHERE("PRODUCT_SKU_CODE=#{productSkuCode}");
                }
                if(param.get("stockSkuId") != null){
                    WHERE("STOCK_SKU_ID=#{stockSkuId}");
                }
            }
        }.toString();
    }

    public String dynamicInsert(PurchaseDetail purchasedetail){
        return new SQL(){
            {
                INSERT_INTO("purchase_detail");
                if(purchasedetail.getId() != null){
                    VALUES("ID", "#{id}");
                }
                if(purchasedetail.getOrderId() != null){
                    VALUES("ORDER_ID", "#{orderId}");
                }
                if(purchasedetail.getProductId() != null){
                    VALUES("PRODUCT_ID", "#{productId}");
                }
                if(purchasedetail.getCounts() >=0){
                    VALUES("COUNTS", "#{counts}");
                }
                if(purchasedetail.getPrice() >=0){
                    VALUES("PRICE", "#{price}");
                }
                if(purchasedetail.getDiscount() >=0){
                    VALUES("DISCOUNT", "#{discount}");
                }
                if(purchasedetail.getSpend() >=0){
                    VALUES("SPEND", "#{spend}");
                }
                if(purchasedetail.getProductSkuCode() != null){
                    VALUES("PRODUCT_SKU_CODE", "#{productSkuCode}");
                }
                if(purchasedetail.getStockSkuId() != null){
                    VALUES("STOCK_SKU_ID", "#{stockSkuId}");
                }
            }
        }.toString();
    }

    public String dynamicUpdate(PurchaseDetail purchasedetail){
        return new SQL(){
            {
                UPDATE("purchase_detail");
                if(purchasedetail.getOrderId() != null){
                    SET("ORDER_ID=#{orderId}");
                }
                if(purchasedetail.getProductId() != null){
                    SET("PRODUCT_ID=#{productId}");
                }
                if(purchasedetail.getCounts() >=0){
                    SET("COUNTS=#{counts}");
                }
                if(purchasedetail.getPrice() >=0){
                    SET("PRICE=#{price}");
                }
                if(purchasedetail.getDiscount() >=0){
                    SET("DISCOUNT=#{discount}");
                }
                if(purchasedetail.getSpend() >=0){
                    SET("SPEND=#{spend}");
                }
                if(purchasedetail.getProductSkuCode() != null){
                    SET("PRODUCT_SKU_CODE=#{productSkuCode}");
                }
                if(purchasedetail.getStockSkuId() != null){
                    SET("STOCK_SKU_ID=#{stockSkuId}");
                }
                WHERE("ID=#{id}");
            }
        }.toString();
    }

    public String dynamicDelete(PurchaseDetail purchasedetail){
        return new SQL(){
            {
                DELETE_FROM("purchase_detail");
                if(purchasedetail.getId() != null){
                    WHERE("ID=#{id}");
                }
                if(purchasedetail.getOrderId() != null){
                    WHERE("ORDER_ID=#{orderId}");
                }
                if(purchasedetail.getProductId() != null){
                    WHERE("PRODUCT_ID=#{productId}");
                }
                if(purchasedetail.getCounts() >=0){
                    WHERE("COUNTS=#{counts}");
                }
                if(purchasedetail.getPrice() >=0){
                    WHERE("PRICE=#{price}");
                }
                if(purchasedetail.getDiscount() >=0){
                    WHERE("DISCOUNT=#{discount}");
                }
                if(purchasedetail.getSpend() >=0){
                    WHERE("SPEND=#{spend}");
                }
                if(purchasedetail.getProductSkuCode() != null){
                    WHERE("PRODUCT_SKU_CODE=#{productSkuCode}");
                }
                if(purchasedetail.getStockSkuId() != null){
                    WHERE("STOCK_SKU_ID=#{stockSkuId}");
                }
            }
        }.toString();
    }

    public String dynamicSelect(PurchaseDetail purchasedetail){
        return new SQL(){
            {
                SELECT("*");
                FROM("purchase_detail");
                if(purchasedetail.getId() != null){
                    WHERE("ID=#{id}");
                }
                if(purchasedetail.getOrderId() != null){
                    WHERE("ORDER_ID=#{orderId}");
                }
                if(purchasedetail.getProductId() != null){
                    WHERE("PRODUCT_ID=#{productId}");
                }
                if(purchasedetail.getCounts() >=0){
                    WHERE("COUNTS=#{counts}");
                }
                if(purchasedetail.getPrice() >=0){
                    WHERE("PRICE=#{price}");
                }
                if(purchasedetail.getDiscount() >=0){
                    WHERE("DISCOUNT=#{discount}");
                }
                if(purchasedetail.getSpend() >=0){
                    WHERE("SPEND=#{spend}");
                }
                if(purchasedetail.getProductSkuCode() != null){
                    WHERE("PRODUCT_SKU_CODE=#{productSkuCode}");
                }
                if(purchasedetail.getStockSkuId() != null){
                    WHERE("STOCK_SKU_ID=#{stockSkuId}");
                }
            }
        }.toString();
    }
}
