package com.example.demo.Dao;

import com.example.demo.Entities.ProductAttribute;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ProductAttributeDao {
    @Select("select * from product_attribute")
    @Results(id="resultMap", value = {
            @Result(property = "id", column = "id"),
            @Result(property = "productAttributeCategoryId", column = "product_attribute_category_id"),
            @Result(property = "name", column = "name"),
            @Result(property = "attType", column = "att_type"),
    })
    List<ProductAttribute> queryAll();
}
