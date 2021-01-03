package com.example.demo.Dao;

import com.example.demo.Entities.SkuStock;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
@Mapper
public interface SkuStockDao {
    @Select("select * from sku_stock")
    @Results(id="resultMap", value = {
            @Result(property = "skuId", column = "sku_id"),
            @Result(property = "stock", column = "stock"),
            @Result(property = "lowStock", column = "low_stock"),
            @Result(property = "repositoryId", column = "repository_id"),
            @Result(property = "id", column = "id"),
    })
    List<SkuStock> queryAll();

    @Insert("insert into sku_stock ( \"SKU_ID\",  \"STOCK\",  \"LOW_STOCK\",  \"REPOSITORY_ID\",  \"ID\") values(#{skuId}, #{stock}, #{lowStock}, #{repositoryId}, #{id})"
    )
    int addSkuStock(SkuStock skuStock);

    @SelectProvider(type=com.example.demo.Provider.SkuStockProvider.class, method = "selectWithParams")
    @ResultMap("resultMap")
    List<SkuStock> query(Map<String, Object> param);

    @InsertProvider(type=com.example.demo.Provider.SkuStockProvider.class, method = "dynamicInsert")
    int insert(SkuStock skuStock);

    @UpdateProvider(type=com.example.demo.Provider.SkuStockProvider.class, method = "dynamicUpdate")
    int update(SkuStock skuStock);

    @DeleteProvider(type=com.example.demo.Provider.SkuStockProvider.class, method = "dynamicDelete")
    int delete(SkuStock skuStock);
}
