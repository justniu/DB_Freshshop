package com.freshshop.demo.controller;

import com.freshshop.demo.entity.Store;
import com.freshshop.demo.mapper.StoreDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/store")
public class StoreController {
    @Autowired
    private StoreDao storeDao;

    @PostMapping
    public String insert(@RequestBody Store store){
//        Store store = new Store();
//        store.setAddress("广州市天河区黄村街道体委基地社区大观路1号");
//        store.setId("1001");
//        store.setName("001号");
//        store.setPhone("13838458");
        storeDao.addStore(store);
        return "store";
    }

    @GetMapping("/lists")
    public List<Store> queryAll(){
        List<Store> stores = storeDao.queryAll();
        return stores;
    }

    @GetMapping("/list")
    public List<Store> query(@RequestParam Map<String, Object> param){
        return storeDao.query(param);
    }
}
