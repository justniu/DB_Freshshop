package com.freshshop.demo.mapper;

import com.freshshop.demo.entity.ProductAttribute;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

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

    @SelectProvider(type=com.freshshop.demo.provider.ProductAttributeProvider.class, method = "selectWithParams")
    @ResultMap("resultMap")
    List<ProductAttribute> query(Map<String, Object> param);

    @UpdateProvider(type=com.freshshop.demo.provider.ProductAttributeProvider.class, method = "dynamicUpdate")
    int update(ProductAttribute productAttribute);

    @InsertProvider(type=com.freshshop.demo.provider.ProductAttributeProvider.class, method = "dynamicInsert")
    int insert(ProductAttribute productAttribute);

    @DeleteProvider(type=com.freshshop.demo.provider.ProductAttributeProvider.class, method = "dynamicDelete")
    int delete(ProductAttribute productAttribute);

    @SelectProvider(type=com.freshshop.demo.provider.ProductAttributeProvider.class, method = "dynamicSelect")
    @ResultMap("resultMap")
    List<ProductAttribute> select(ProductAttribute productAttribute);

}
