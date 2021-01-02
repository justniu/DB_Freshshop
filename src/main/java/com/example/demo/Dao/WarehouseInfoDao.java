package com.example.demo.Dao;

import com.example.demo.Entities.WarehouseInfo;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface WarehouseInfoDao {
    @Select("select * from warehouse_info")
    @Results(id="resultMap", value = {
            @Result(property = "userId", column = "user_id"),
            @Result(property = "createTime", column = "create_time"),
            @Result(property = "userType", column = "user_type"),
    })
    List<WarehouseInfo> queryAll();

    @Insert("insert into warehouse_info ( \"WAREHOUSE_ID\",  \"WAREHOUSE_NAME\",  \"WAREHOUSE_CAPACITY\",  \"WAREHOUSE_ADDRESS_DETAIL\") values(#{warehouseId}, #{warehouseName}, #{warehouseCapacity}, #{warehouseAddressDetail})"
    )
    int addWarehouseInfo(WarehouseInfo warehouseInfo);
}
