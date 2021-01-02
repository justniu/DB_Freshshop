package com.example.demo.Provider;

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
}
