package com.example.demo.Dao;

import com.example.demo.Entities.Product;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ProductDao {
    @Select("select * from product")
    @Results(id="resultMap", value={
            @Result(property = "productId", column = "product_id"),
            @Result(property = "productCategoryId", column = "product_category_id"),
            @Result(property = "updateTime", column = "update_time"),
            @Result(property = "name", column = "name"),
            @Result(property = "deleteStatus", column = "delete_status"),
            @Result(property = "publishStatus", column = "publish_status"),
            @Result(property = "newStatus", column = "new_status"),
            @Result(property = "sale", column = "sale"),
            @Result(property = "productPrice", column = "product_price"),
            @Result(property = "promotionPrice", column = "promotion_price"),
            @Result(property = "stock", column = "stock"),
            @Result(property = "lowStock", column = "low_stock"),
            @Result(property = "unit", column = "unit"),
            @Result(property = "weight", column = "weight"),
            @Result(property = "promotionType", column = "promotion_type"),
            @Result(property = "promotionStartTime", column = "promotion_start_time"),
            @Result(property = "promotionEndTime", column = "promotion_end_time"),
    })
    List<Product> queryAll();

    @Insert("insert into product ( \"product_id\",  \"product_category_id\",  \"update_time\",  \"name\",  \"delete_status\",  \"publish_status\",  \"new_status\",  \"sale\",  \"product_price\",  \"promotion_price\",  \"stock\",  \"low_stock\",  \"unit\",  \"weight\",  \"promotion_type\",  \"promotion_start_time\",  \"promotion_end_time\") values(#{productId}, #{productCategoryId}, #{updateTime}, #{name}, #{deleteStatus}, #{publishStatus}, #{newStatus}, #{sale}, #{productPrice}, #{promotionPrice}, #{stock}, #{lowStock}, #{unit}, #{weight}, #{promotionType}, #{promotionStartTime}, #{promotionEndTime})"
    )
    int addProduct(Product product);
}
