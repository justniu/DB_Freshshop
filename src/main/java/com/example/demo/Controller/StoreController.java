package com.example.demo.Controller;

import com.example.demo.Dao.StoreDao;
import com.example.demo.Entities.Store;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/store")
public class StoreController {
    @Autowired
    private StoreDao storeDao;

    @GetMapping
    public String insertStore(){
        Store store = new Store();
        store.setAddress("广州市天河区黄村街道体委基地社区大观路1号");
        store.setId("1001");
        store.setName("001号");
        store.setPhone("13838458");
        storeDao.addStore(store);
        return "store";
    }

    @GetMapping("/lists")
    public List<Store> queryAll(){
        List<Store> stores = storeDao.queryAll();
        return stores;
    }
}
