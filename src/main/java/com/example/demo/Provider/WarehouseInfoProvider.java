package com.example.demo.Provider;

import com.example.demo.Entities.WarehouseInfo;
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

    public String dynamicInsert(WarehouseInfo warehouseinfo){
        return new SQL(){
            {
                INSERT_INTO("warehouse_info");
                if(warehouseinfo.getWarehouseId() != null){
                    VALUES("WAREHOUSE_ID", "#{warehouseId}");
                }
                if(warehouseinfo.getWarehouseName() != null){
                    VALUES("WAREHOUSE_NAME", "#{warehouseName}");
                }
//                if(warehouseinfo.getWarehouseCapacity() != null){
//                    VALUES("WAREHOUSE_CAPACITY", "#{warehouseCapacity}");
//                }
                if(warehouseinfo.getWarehouseAddressDetail() != null){
                    VALUES("WAREHOUSE_ADDRESS_DETAIL", "#{warehouseAddressDetail}");
                }
            }
        }.toString();
    }

    public String dynamicUpdate(WarehouseInfo warehouseinfo){
        return new SQL(){
            {
                UPDATE("warehouse_info");
                if(warehouseinfo.getWarehouseName() != null){
                    SET("WAREHOUSE_NAME=#{warehouseName}");
                }
//                if(warehouseinfo.getWarehouseCapacity() != null){
//                    SET("WAREHOUSE_CAPACITY=#{warehouseCapacity}");
//                }
                if(warehouseinfo.getWarehouseAddressDetail() != null){
                    SET("WAREHOUSE_ADDRESS_DETAIL=#{warehouseAddressDetail}");
                }
                WHERE("WAREHOUSE_ID=#{warehouseId}");
            }
        }.toString();
    }

    public String dynamicDelete(WarehouseInfo warehouseinfo){
        return new SQL(){
            {
                DELETE_FROM("warehouse_info");
                if(warehouseinfo.getWarehouseId() != null){
                    WHERE("WAREHOUSE_ID=#{warehouseId}");
                }
                if(warehouseinfo.getWarehouseName() != null){
                    WHERE("WAREHOUSE_NAME=#{warehouseName}");
                }
//                if(warehouseinfo.getWarehouseCapacity() != null){
//                    WHERE("WAREHOUSE_CAPACITY=#{warehouseCapacity}");
//                }
                if(warehouseinfo.getWarehouseAddressDetail() != null){
                    WHERE("WAREHOUSE_ADDRESS_DETAIL=#{warehouseAddressDetail}");
                }
            }
        }.toString();
    }
}
