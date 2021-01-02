package com.example.demo.Entities;


import lombok.Data;

@Data
public class WarehouseInfo {
    private String warehouseId;
    private String warehouseName;
    private int warehouseCapacity;
    private String warehouseAddressDetail;
}
