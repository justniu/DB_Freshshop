package com.example.demo.Dao;


import com.example.demo.Entities.CategoryAttribute;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface CategoryAttributeDao {
    @Select("select * from category_attribute")
    @Results(id="resultMap", value={
            @Result(property = "id", column = "id"),
            @Result(property = "productCategoryId", column = "product_category_id"),
            @Result(property = "productAttributeId", column = "product_attribute_id"),
    })
    List<CategoryAttribute> queryAll();

    @Insert("insert into category_attribute ( \"ID\",  \"PRODUCT_CATEGORY_ID\",  \"PRODUCT_ATTRIBUTE_ID\") values(#{id}, #{productCategoryId}, #{productAttributeId})"
    )
    int addCategoryAttr(CategoryAttribute categoryAttribute);
}
