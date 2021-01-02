package com.example.demo.Controller;

import com.example.demo.Dao.WarehouseInfoDao;
import com.example.demo.Entities.WarehouseInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/warehouse")
public class WarehouseInfoController {
    @Autowired
    private WarehouseInfoDao warehouseInfoDao;

    @GetMapping
    public String insertWarehouseInfo(){
        WarehouseInfo warehouseInfo = new WarehouseInfo();
        warehouseInfo.setWarehouseId("2");
        warehouseInfo.setWarehouseName("华南二号");
        warehouseInfo.setWarehouseCapacity(5200);
        warehouseInfo.setWarehouseAddressDetail("广州市花都区狮岭镇康政西路11号");
        warehouseInfoDao.addWarehouseInfo(warehouseInfo);
        return "warehouseinfo!";
    }
}
