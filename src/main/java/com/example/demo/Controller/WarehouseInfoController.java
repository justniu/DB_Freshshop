package com.example.demo.Controller;

import com.example.demo.Dao.WarehouseInfoDao;
import com.example.demo.Entities.WarehouseInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

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

    @GetMapping("/list")
    public List<WarehouseInfo> query(@RequestParam Map<String, Object> param){
        return warehouseInfoDao.query(param);
    }

    @GetMapping("/del")
    public String delete(){
        WarehouseInfo warehouseInfo = new WarehouseInfo();
        warehouseInfo.setWarehouseId("2");
        warehouseInfo.setWarehouseName("华南二号");
        warehouseInfo.setWarehouseCapacity(5200);
        warehouseInfo.setWarehouseAddressDetail("广州市花都区狮岭镇康政西路11号");
        warehouseInfoDao.delete(warehouseInfo);
        return "del";
    }
}
