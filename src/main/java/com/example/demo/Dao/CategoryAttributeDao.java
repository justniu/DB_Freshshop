package com.example.demo.Dao;


import com.example.demo.Entities.CategoryAttribute;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

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

    @SelectProvider(type=com.example.demo.Provider.CategoryAttributeProvider.class, method = "selectWithParams")
    @ResultMap("resultMap")
    List<CategoryAttribute> query(Map<String, Object> param);

    @InsertProvider(type = com.example.demo.Provider.CategoryAttributeProvider.class, method = "dynamicInsert")
    int insert(CategoryAttribute categoryAttribute);

    @UpdateProvider(type=com.example.demo.Provider.CategoryAttributeProvider.class, method = "dynamicUpdate")
    int update(CategoryAttribute categoryAttribute);
}
