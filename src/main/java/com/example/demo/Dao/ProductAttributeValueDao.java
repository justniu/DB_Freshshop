package com.example.demo.Dao;

import com.example.demo.Entities.ProductAttributeValue;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ProductAttributeValueDao {
    @Select("select * from product_attribute_value")
    @Results(id="resultMap", value = {
            @Result(property = "id", column = "id"),
            @Result(property = "productAttributeId", column = "product_attribute_id"),
            @Result(property = "value", column = "value"),
    })
    List<ProductAttributeValue> queryAll();

    @Insert("insert into product_attribute_value ( \"id\",  \"product_attribute_id\",  \"value\") values(#{id}, #{productAttributeId}, #{value})"
    )
    int addProductAttrVal(ProductAttributeValue productAttributeValue);
}
