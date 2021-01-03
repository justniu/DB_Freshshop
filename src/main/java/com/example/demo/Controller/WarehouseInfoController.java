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

    @PostMapping
    public String insert(@RequestBody WarehouseInfo warehouseInfo){
//        WarehouseInfo warehouseInfo = new WarehouseInfo();
//        warehouseInfo.setWarehouseId("1");
//        warehouseInfo.setWarehouseName("华南一号");
//        warehouseInfo.setWarehouseCapacity(4000);
//        warehouseInfo.setWarehouseAddressDetail("广州市天河区东站路99号");
        warehouseInfoDao.addWarehouseInfo(warehouseInfo);
        return "warehouseinfo!";
    }

    @GetMapping("/list")
    public List<WarehouseInfo> query(@RequestParam Map<String, Object> param){
        return warehouseInfoDao.query(param);
    }

    @PostMapping("/list")
    public String delete(@RequestBody WarehouseInfo warehouseInfo){
        warehouseInfoDao.delete(warehouseInfo);
        return "del";
    }
}
