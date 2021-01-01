package com.example.demo.Dao;

import com.example.demo.Entities.UserOrderDetail;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserOrderDetailDao {
    @Select("select * from user_order_detail")
    @Results(id="resultMap", value = {
            @Result(property = "userOrderDetailId", column = "user_order_detail_id"),
            @Result(property = "userOrderDetailOrderId", column = "user_order_detail_order_id"),
            @Result(property = "userOrderDetailProductId", column = "user_order_detail_product_id"),
            @Result(property = "userOrderDetailNumber", column = "user_order_detail_number"),
            @Result(property = "userOrderDetailPrice", column = "user_order_detail_price"),
            @Result(property = "userOrderDetailDiscount", column = "user_order_detail_discount"),
            @Result(property = "userOrderDetailSpend", column = "user_order_detail_spend"),
            @Result(property = "productSkuCode", column = "product_sku_code"),
            @Result(property = "stockSkuId", column = "stock_sku_id"),
    })
    List<UserOrderDetail> queryAll();
}
