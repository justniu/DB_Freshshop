package com.example.demo.Dao;

import com.example.demo.Entities.ProductAttributeValue;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
@Mapper
public interface ProductAttributeValueDao {
    @Select("select * from product_attribute_value")
    @Results(id="resultMap", value = {
            @Result(property = "id", column = "id"),
            @Result(property = "productAttributeId", column = "product_attribute_id"),
            @Result(property = "value", column = "value"),
    })
    List<ProductAttributeValue> queryAll();

    @Insert("insert into product_attribute_value ( \"ID\",  \"PRODUCT_ATTRIBUTE_ID\",  \"VALUE\") values(#{id}, #{productAttributeId}, #{value})"
    )
    int addProductAttrVal(ProductAttributeValue productAttributeValue);

    @SelectProvider(type=com.example.demo.Provider.ProductAttributeValueProvider.class, method = "selectWithParams")
    @ResultMap("resultMap")
    List<ProductAttributeValue> query(Map<String, Object> param);;
}
