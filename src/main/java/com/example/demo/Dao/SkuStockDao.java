package com.example.demo.Dao;

import com.example.demo.Entities.SkuStock;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface SkuStockDao {
    @Select("select * from sku_stock")
    @Results(id="resultMap", value = {
            @Result(property = "skuStock", column = "sku_stock"),
            @Result(property = "stock", column = "stock"),
            @Result(property = "lowStock", column = "low_stock"),
            @Result(property = "repositoryId", column = "repository_id"),
            @Result(property = "id", column = "id"),
    })
    List<SkuStock> queryAll();

}
