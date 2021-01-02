package com.example.demo.Dao;

import com.example.demo.Entities.ProductAttributeCategory;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface ProductAttributeCategoryDao {
    @Select("select * from product_attribute_category")
    @Results(id="resultMap", value = {
            @Result(property = "id", column = "id"),
            @Result(property = "productId", column = "product_id"),
            @Result(property = "attributeCount", column = "attribute_count"),
            @Result(property = "paramCount", column = "param_count"),
    })
    List<ProductAttributeCategory> queryAll();

    @Insert("insert into product_attribute_category ( \"ID\",  \"PRODUCT_ID\",  \"ATTRIBUTE_COUNT\",  \"PARAM_COUNT\") values(#{id}, #{productId}, #{attributeCount}, #{paramCount})"
    )
    int addProductAttrCate(ProductAttributeCategory productAttributeCategory);
}
