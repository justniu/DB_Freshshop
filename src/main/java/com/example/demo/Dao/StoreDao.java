package com.example.demo.Dao;

import com.example.demo.Entities.StockLog;
import com.example.demo.Entities.Store;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
@Mapper
public interface StoreDao {
    @Select("select * from store")
    @Results(id="resultMap", value = {
            @Result(property = "id", column = "id"),
            @Result(property = "name", column = "name"),
            @Result(property = "address", column = "address"),
            @Result(property = "phone", column = "phone"),
    })
    List<Store> queryAll();

    @Insert("insert into store ( \"ID\",  \"NAME\",  \"ADDRESS\",  \"PHONE\") values(#{id}, #{name}, #{address}, #{phone})")
    int addStore(Store store);

    @SelectProvider(type=com.example.demo.Provider.StoreProvider.class, method = "selectWithParams")
    @ResultMap("resultMap")
    List<Store> query(Map<String, Object> param);

    @InsertProvider(type=com.example.demo.Provider.StoreProvider.class, method = "dynamicInsert")
    int insert(Store store);

    @UpdateProvider(type=com.example.demo.Provider.StoreProvider.class, method = "dynamicUpdate")
    int update(Store store);

    @DeleteProvider(type=com.example.demo.Provider.StoreProvider.class, method = "dynamicDelete")
    int delete(Store store);

    @SelectProvider(type=com.example.demo.Provider.StockLogProvider.class, method = "dynamicSelect")
    @ResultMap("resultMap")
    List<StockLog> select(StockLog stockLog);
}
