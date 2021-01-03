package com.example.demo.Dao;

import com.example.demo.Entities.StockLog;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
@Mapper
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

    @Insert("insert into stock_log ( \"ID\",  \"REPOSITORY_ID\",  \"PRODUCT_ID\",  \"SKU_CODE\",  \"TIME\",  \"COUNTS\",  \"LOG_TYPE\") values(#{id}, #{repositoryId}, #{productId}, #{skuCode}, #{time}, #{counts}, #{logType})"
    )
    int addStockLog(StockLog stockLog);

    @SelectProvider(type=com.example.demo.Provider.StockLogProvider.class, method = "selectWithParams")
    @ResultMap("resultMap")
    List<StockLog> query(Map<String, Object> param);

    @InsertProvider(type=com.example.demo.Provider.StockLogProvider.class, method = "dynamicInsert")
    int insert(StockLog stockLog);

    @DeleteProvider(type=com.example.demo.Provider.StockLogProvider.class, method = "dynamicDelete")
    int delete(StockLog stockLog);

    @UpdateProvider(type=com.example.demo.Provider.StockLogProvider.class, method = "dynamicUpdate")
    int update(StockLog stockLog);

    @SelectProvider(type=com.example.demo.Provider.StockLogProvider.class, method = "dynamicSelect")
    @ResultMap("resultMap")
    List<StockLog> select(StockLog stockLog);
}
