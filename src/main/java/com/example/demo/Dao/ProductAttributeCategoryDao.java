package com.example.demo.Dao;

import com.example.demo.Entities.ProductAttributeCategory;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ProductAttributeCategoryDao {
    @Select("select * from product_attribute_category")
    @Results(id="resultMap", value = {
            @Result(property = "id", column = "id"),
            @Result(property = "productId", column = "product_id"),
            @Result(property = "attributeCount", column = "attribute_count"),
            @Result(property = "paramCount", column = "param_count"),
    })
    List<ProductAttributeCategory> queryAll();

    @Insert("insert into product_attribute_category ( \"id\",  \"product_id\",  \"attribute_count\",  \"param_count\") values(#{id}, #{productId}, #{attributeCount}, #{paramCount})"
    )
    int addProductAttrCate(ProductAttributeCategory productAttributeCategory);
}
