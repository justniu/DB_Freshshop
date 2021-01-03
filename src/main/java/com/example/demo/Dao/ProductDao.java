package com.example.demo.Dao;

import com.example.demo.Entities.Product;
import org.apache.ibatis.annotations.*;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
@Mapper
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

    @Insert("insert into product ( \"PRODUCT_ID\",  \"PRODUCT_CATEGORY_ID\",  \"UPDATE_TIME\",  \"NAME\",  \"DELETE_STATUS\",  \"PUBLISH_STATUS\",  \"NEW_STATUS\",  \"SALE\",  \"PRODUCT_PRICE\",  \"PROMOTION_PRICE\",  \"STOCK\",  \"LOW_STOCK\",  \"UNIT\",  \"WEIGHT\",  \"PROMOTION_TYPE\",  \"PROMOTION_START_TIME\",  \"PROMOTION_END_TIME\") values(#{productId}, #{productCategoryId}, #{updateTime}, #{name}, #{deleteStatus}, #{publishStatus}, #{newStatus}, #{sale}, #{productPrice}, #{promotionPrice}, #{stock}, #{lowStock}, #{unit}, #{weight}, #{promotionType}, #{promotionStartTime}, #{promotionEndTime})"
    )
    int addProduct(Product product);

    @SelectProvider(type=com.example.demo.Provider.ProductProvider.class, method = "selectWithParams")
    @ResultMap("resultMap")
    List<Product> query(Map<String, Object> param);

    @UpdateProvider(type=com.example.demo.Provider.ProductProvider.class, method = "dynamicUpdate")
    int update(Product product);

    @InsertProvider(type = com.example.demo.Provider.ProductProvider.class, method = "dynamicInsert")
    int insert(Product product);

    @DeleteProvider(type = com.example.demo.Provider.ProductProvider.class, method = "dynamicDelete")
    int delete(Product product);

    @SelectProvider(type=com.example.demo.Provider.ProductProvider.class, method = "dynamicSelect")
    @ResultMap("resultMap")
    List<Product> select(Product product);
}
