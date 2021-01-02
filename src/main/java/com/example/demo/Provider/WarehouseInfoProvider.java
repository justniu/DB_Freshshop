package com.example.demo.Provider;

import org.apache.ibatis.jdbc.SQL;

import java.util.Map;

public class WarehouseInfoProvider {
    public String selectWithParams(Map<String, Object> param){
        return new SQL(){
            {
                SELECT("*");
                FROM("warehouse_info");
                if(param.get("warehouseId") != null){
                    WHERE("WAREHOUSE_ID=#{warehouseId}");
                }
                if(param.get("warehouseName") != null){
                    WHERE("WAREHOUSE_NAME=#{warehouseName}");
                }
                if(param.get("warehouseCapacity") != null){
                    WHERE("WAREHOUSE_CAPACITY=#{warehouseCapacity}");
                }
                if(param.get("warehouseAddressDetail") != null){
                    WHERE("WAREHOUSE_ADDRESS_DETAIL=#{warehouseAddressDetail}");
                }
            }
        }.toString();
    }
}
