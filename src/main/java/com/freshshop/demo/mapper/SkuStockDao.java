package com.freshshop.demo.mapper;

import com.freshshop.demo.entity.SkuStock;
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

    @SelectProvider(type=com.freshshop.demo.provider.SkuStockProvider.class, method = "selectWithParams")
    @ResultMap("resultMap")
    List<SkuStock> query(Map<String, Object> param);

    @InsertProvider(type=com.freshshop.demo.provider.SkuStockProvider.class, method = "dynamicInsert")
    int insert(SkuStock skuStock);

    @UpdateProvider(type=com.freshshop.demo.provider.SkuStockProvider.class, method = "dynamicUpdate")
    int update(SkuStock skuStock);

    @DeleteProvider(type=com.freshshop.demo.provider.SkuStockProvider.class, method = "dynamicDelete")
    int delete(SkuStock skuStock);

    @SelectProvider(type=com.freshshop.demo.provider.SkuStockProvider.class, method = "dynamicSelect")
    @ResultMap("resultMap")
    List<SkuStock> select(SkuStock skuStock);
    
    @Update("update sku_stock set stock = stock-#{num} where sku_id=#{skuId}")
    void updateSkuStock(int num,String skuId);
    
    @Select("select repository_id from sku_stock where sku_id = #{skuId}")
    String selectRepositoryId(String skuId);
}
