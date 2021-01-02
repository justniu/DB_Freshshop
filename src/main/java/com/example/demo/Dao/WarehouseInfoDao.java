package com.example.demo.Dao;

import com.example.demo.Entities.WarehouseInfo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface WarehouseInfoDao {
    @Select("select * from warehouse_info")
    @Results(id="resultMap", value = {
            @Result(property = "userId", column = "user_id"),
            @Result(property = "createTime", column = "create_time"),
            @Result(property = "userType", column = "user_type"),
    })
    List<WarehouseInfo> queryAll();

    @Insert("insert into warehouse_info ( \"warehouse_id\",  \"warehouse_name\",  \"warehouse_capacity\",  \"warehouse_address_detail\") values(#{warehouseId}, #{warehouseName}, #{warehouseCapacity}, #{warehouseAddressDetail})"
    )
    int addWarehouseInfo(WarehouseInfo warehouseInfo);
}
