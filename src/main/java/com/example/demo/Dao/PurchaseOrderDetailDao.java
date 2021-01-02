package com.example.demo.Dao;

import com.example.demo.Entities.PurchaseOrderDetail;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface PurchaseOrderDetailDao {
    @Select("select * from purchase_order_detail")
    @Results(id="resultMap", value = {
            @Result(property = "id", column = "id"),
            @Result(property = "orderId", column = "order_id"),
            @Result(property = "productId", column = "product_id"),
            @Result(property = "counts", column = "counts"),
            @Result(property = "price", column = "price"),
            @Result(property = "discount", column = "discount"),
            @Result(property = "spend", column = "spend"),
            @Result(property = "productSkuId", column = "product_sku_id"),
            @Result(property = "stockSkuId", column = "stock_sku_id"),
    })
    List<PurchaseOrderDetail> queryAll();

    @Insert("insert into purchase_order_detail ( \"id\",  \"order_id\",  \"product_id\",  \"counts\",  \"price\",  \"discount\",  \"spend\",  \"product_sku_id\",  \"stock_sku_id\") values(#{id}, #{orderId}, #{productId}, #{counts}, #{price}, #{discount}, #{spend}, #{productSkuId}, #{stockSkuId})"
    )
    int addPurchaseOrderDetail(PurchaseOrderDetail purchaseOrderDetail);
}
