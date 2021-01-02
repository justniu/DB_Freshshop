package com.example.demo.Dao;

import com.example.demo.Entities.PurchaseDetail;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface PurchaseDetailDao {
    @Select("select * from purchase_detail")
    @Results(id="resultMap", value = {
            @Result(property = "id", column = "id"),
            @Result(property = "orderId", column = "order_id"),
            @Result(property = "productId", column = "product_id"),
            @Result(property = "counts", column = "counts"),
            @Result(property = "price", column = "price"),
            @Result(property = "discount", column = "discount"),
            @Result(property = "spend", column = "spend"),
            @Result(property = "productSkuCode", column = "product_sku_code"),
            @Result(property = "stockSkuId", column = "stock_sku_id"),
    })
    List<PurchaseDetail> queryAll();

    @Insert("insert into purchase_detail ( \"ID\",  \"ORDER_ID\",  \"PRODUCT_ID\",  \"COUNTS\",  \"PRICE\",  \"DISCOUNT\",  \"SPEND\",  \"PRODUCT_SKU_CODE\",  \"STOCK_SKU_ID\") values(#{id}, #{orderId}, #{productId}, #{counts}, #{price}, #{discount}, #{spend}, #{productSkuCode}, #{stockSkuId})"
    )
    int addPurchaseOrderDetail(PurchaseDetail purchaseOrderDetail);
}
