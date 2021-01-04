package com.freshshop.demo.mapper;

import com.freshshop.demo.entity.WarehouseInfo;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
@Mapper
public interface WarehouseInfoDao {
    @Select("select * from warehouse_info")
    @Results(id = "resultMap", value = {
            @Result(property = "userId", column = "user_id"),
            @Result(property = "createTime", column = "create_time"),
            @Result(property = "userType", column = "user_type"),
    })
    List<WarehouseInfo> queryAll();

    @Insert("insert into warehouse_info ( \"WAREHOUSE_ID\",  \"WAREHOUSE_NAME\",  \"WAREHOUSE_CAPACITY\",  \"WAREHOUSE_ADDRESS_DETAIL\") values(#{warehouseId}, #{warehouseName}, #{warehouseCapacity}, #{warehouseAddressDetail})"
    )
    int addWarehouseInfo(WarehouseInfo warehouseInfo);

    @SelectProvider(type = com.freshshop.demo.provider.WarehouseInfoProvider.class, method = "selectWithParams")
    @ResultMap("resultMap")
    List<WarehouseInfo> query(Map<String, Object> param);

    @DeleteProvider(type = com.freshshop.demo.provider.WarehouseInfoProvider.class, method = "dynamicDelete")
    int delete(WarehouseInfo warehouseInfo);

    @UpdateProvider(type = com.freshshop.demo.provider.WarehouseInfoProvider.class, method = "dynamicUpdate")
    int update(WarehouseInfo warehouseInfo);

    @InsertProvider(type = com.freshshop.demo.provider.WarehouseInfoProvider.class, method = "dynamicInsert")
    int insert(WarehouseInfo warehouseInfo);

    @SelectProvider(type = com.freshshop.demo.provider.WarehouseInfoProvider.class, method = "dynamicSelect")
    @ResultMap("resultMap")
    List<WarehouseInfo> select(WarehouseInfo warehouseInfo);
}
