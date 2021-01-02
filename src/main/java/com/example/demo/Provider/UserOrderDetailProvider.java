package com.example.demo.Provider;

import com.example.demo.Entities.UserOrderDetail;
import org.apache.ibatis.jdbc.SQL;

import java.util.Map;

public class UserOrderDetailProvider {
    public String selectWithParams(Map<String, Object> param){
        return new SQL(){
            {
                SELECT("*");
                FROM("user_order_detail");
                if(param.get("userOrderDetailId") != null){
                    WHERE("USER_ORDER_DETAIL_ID=#{userOrderDetailId}");
                }
                if(param.get("userOrderDetailOrderId") != null){
                    WHERE("USER_ORDER_DETAIL_ORDER_ID=#{userOrderDetailOrderId}");
                }
                if(param.get("userOrderDetailProductId") != null){
                    WHERE("USER_ORDER_DETAIL_PRODUCT_ID=#{userOrderDetailProductId}");
                }
                if(param.get("userOrderDetailNumber") != null){
                    WHERE("USER_ORDER_DETAIL_NUMBER=#{userOrderDetailNumber}");
                }
                if(param.get("userOrderDetailPrice") != null){
                    WHERE("USER_ORDER_DETAIL_PRICE=#{userOrderDetailPrice}");
                }
                if(param.get("userOrderDetailDiscount") != null){
                    WHERE("USER_ORDER_DETAIL_DISCOUNT=#{userOrderDetailDiscount}");
                }
                if(param.get("userOrderDetailSpend") != null){
                    WHERE("USER_ORDER_DETAIL_SPEND=#{userOrderDetailSpend}");
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

    public String dynamicInsert(UserOrderDetail userorderdetail){
        return new SQL(){
            {
                INSERT_INTO("user_order_detail");
                if(userorderdetail.getUserOrderDetailId() != null){
                    VALUES("USER_ORDER_DETAIL_ID", "#{userOrderDetailId}");
                }
                if(userorderdetail.getUserOrderDetailOrderId() != null){
                    VALUES("USER_ORDER_DETAIL_ORDER_ID", "#{userOrderDetailOrderId}");
                }
                if(userorderdetail.getUserOrderDetailProductId() != null){
                    VALUES("USER_ORDER_DETAIL_PRODUCT_ID", "#{userOrderDetailProductId}");
                }
//                if(userorderdetail.getUserOrderDetailNumber() != null){
//                    VALUES("USER_ORDER_DETAIL_NUMBER", "#{userOrderDetailNumber}");
//                }
//                if(userorderdetail.getUserOrderDetailPrice() != null){
//                    VALUES("USER_ORDER_DETAIL_PRICE", "#{userOrderDetailPrice}");
//                }
//                if(userorderdetail.getUserOrderDetailDiscount() != null){
//                    VALUES("USER_ORDER_DETAIL_DISCOUNT", "#{userOrderDetailDiscount}");
//                }
//                if(userorderdetail.getUserOrderDetailSpend() != null){
//                    VALUES("USER_ORDER_DETAIL_SPEND", "#{userOrderDetailSpend}");
//                }
                if(userorderdetail.getProductSkuCode() != null){
                    VALUES("PRODUCT_SKU_CODE", "#{productSkuCode}");
                }
                if(userorderdetail.getStockSkuId() != null){
                    VALUES("STOCK_SKU_ID", "#{stockSkuId}");
                }
            }
        }.toString();
    }
}
