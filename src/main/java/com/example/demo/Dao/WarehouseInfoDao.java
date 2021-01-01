package com.example.demo.Dao;

import com.example.demo.Entities.WarehouseInfo;
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
}
