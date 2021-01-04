package com.freshshop.demo.controller;

import com.freshshop.demo.entity.SkuStock;
import com.freshshop.demo.mapper.SkuStockDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/skustock")
public class SkuStockController {

    @Autowired
    private SkuStockDao skuStockDao;

    @PostMapping
    public String insert(@RequestBody SkuStock skuStock){
//        SkuStock skuStock = new SkuStock();
//        skuStock.setSkuId("4683565");
//        skuStock.setStock("100");
//        skuStock.setLowStock(2);
//        skuStock.setId("5");
//        skuStock.setRepositoryId("2");
        skuStockDao.addSkuStock(skuStock);
        return "skustock";
    }
    @GetMapping("/lists")
    public List<SkuStock> queryAll(){
        List<SkuStock> skuStocks = skuStockDao.queryAll();
        return skuStocks;
    }

    @GetMapping("/list")
    public List<SkuStock> query(@RequestParam Map<String, Object> param){
        return skuStockDao.query(param);
    }
}
