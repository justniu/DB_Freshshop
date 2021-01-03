package com.example.demo.Dao;

import com.example.demo.Entities.ProductAttributeCategory;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

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

    @SelectProvider(type=com.example.demo.Provider.ProductAttributeCategoryProvider.class, method = "selectWithParams")
    @ResultMap("resultMap")
    List<ProductAttributeCategory> query(Map<String, Object> param);

    @InsertProvider(type=com.example.demo.Provider.ProductAttributeCategoryProvider.class, method = "dynamicInsert")
    int insert(ProductAttributeCategory productAttributeCategory);

    @UpdateProvider(type=com.example.demo.Provider.ProductAttributeCategoryProvider.class, method = "dynamicUpdate")
    int update(ProductAttributeCategory productAttributeCategory);

    @DeleteProvider(type = com.example.demo.Provider.ProductAttributeCategoryProvider.class,method = "dynamicDelete")
    int delete(ProductAttributeCategory productAttributeCategory);
}
