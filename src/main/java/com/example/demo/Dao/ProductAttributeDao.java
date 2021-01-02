package com.example.demo.Dao;

import com.example.demo.Entities.ProductAttribute;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface ProductAttributeDao {
    @Select("select * from product_attribute")
    @Results(id="resultMap", value = {
            @Result(property = "id", column = "id"),
            @Result(property = "productAttributeCategoryId", column = "product_attribute_category_id"),
            @Result(property = "name", column = "name"),
            @Result(property = "attType", column = "att_type"),
    })
    List<ProductAttribute> queryAll();

    @Insert("insert into product_attribute ( \"ID\",  \"PRODUCT_ATTRIBUTE_CATEGORY_ID\",  \"NAME\",  \"ATT_TYPE\") values(#{id}, #{productAttributeCategoryId}, #{name}, #{attType})"
    )
    int addProductAttr(ProductAttribute productAttribute);
}
