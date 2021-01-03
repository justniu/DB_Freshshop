package com.freshshop.demo.mapper;

import com.freshshop.demo.entity.UserOrderDetail;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;


@Component
@Mapper
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

    @Insert("insert into user_order_detail ( \"USER_ORDER_DETAIL_ID\",  \"USER_ORDER_DETAIL_ORDER_ID\",  \"USER_ORDER_DETAIL_PRODUCT_ID\",  \"USER_ORDER_DETAIL_NUMBER\",  \"USER_ORDER_DETAIL_PRICE\",  \"USER_ORDER_DETAIL_DISCOUNT\",  \"USER_ORDER_DETAIL_SPEND\",  \"PRODUCT_SKU_CODE\",  \"STOCK_SKU_ID\") values(#{userOrderDetailId}, #{userOrderDetailOrderId}, #{userOrderDetailProductId}, #{userOrderDetailNumber}, #{userOrderDetailPrice}, #{userOrderDetailDiscount}, #{userOrderDetailSpend}, #{productSkuCode}, #{stockSkuId})"
    )
    int addUserOrderDetail(UserOrderDetail userOrderDetail);

    @SelectProvider(type=com.freshshop.demo.Provider.UserOrderDetailProvider.class, method = "selectWithParams")
    @ResultMap("resultMap")
    List<UserOrderDetail> query(Map<String, Object> param);

    @InsertProvider(type=com.freshshop.demo.Provider.UserOrderDetailProvider.class, method = "dynamicInsert")
    int insert(UserOrderDetail userOrderDetail);

    @DeleteProvider(type=com.freshshop.demo.Provider.UserOrderDetailProvider.class, method = "dynamicDelete")
    int delete(UserOrderDetail userOrderDetail);

    @UpdateProvider(type=com.freshshop.demo.Provider.UserOrderDetailProvider.class, method = "dynamicUpdate")
    int update(UserOrderDetail userOrderDetail);

    @SelectProvider(type=com.freshshop.demo.Provider.UserOrderDetailProvider.class, method = "dynamicUpdate")
    @ResultMap("resultMap")
    List<UserOrderDetail> select(UserOrderDetail userOrderDetail);
}
