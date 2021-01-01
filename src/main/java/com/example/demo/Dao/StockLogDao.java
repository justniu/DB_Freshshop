package com.example.demo.Dao;

import com.example.demo.Entities.StockLog;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface StockLogDao {
    @Select("select * from stock_log")
    @Results(id="resultMap", value = {
            @Result(property = "id", column = "id"),
            @Result(property = "repositoryId", column = "repository_id"),
            @Result(property = "productId", column = "product_id"),
            @Result(property = "skuCode", column = "sku_code"),
            @Result(property = "time", column = "time"),
            @Result(property = "counts", column = "counts"),
            @Result(property = "logType", column = "log_type"),
    })
    List<StockLog> queryAll();
}
