package com.example.demo.Dao;

import com.example.demo.Entities.ProductCategory;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ProductCategoryDao {
    @Select("select * from product_category")
    @Results(id="resultMap", value = {
            @Result(property = "productCategoryId", column = "product_category_id"),
            @Result(property = "parentId", column = "parent_id"),
            @Result(property = "name", column = "name"),
            @Result(property = "categoryLevel", column = "category_level"),
            @Result(property = "productCount", column = "product_count"),
            @Result(property = "productUnit", column = "product_unit"),
            @Result(property = "keywords", column = "keywords"),
            @Result(property = "description", column = "description"),
    })
    List<ProductCategory> queryAll();

    @Insert("insert into product_category ( \"product_category_id\",  \"parent_id\",  \"name\",  \"category_level\",  \"product_count\",  \"product_unit\",  \"keywords\",  \"description\") values(#{productCategoryId}, #{parentId}, #{name}, #{categoryLevel}, #{productCount}, #{productUnit}, #{keywords}, #{description})"
    )
    int addProductCate(ProductCategory productCategory);
}
