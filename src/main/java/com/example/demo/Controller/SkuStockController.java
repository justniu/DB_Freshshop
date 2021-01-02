package com.example.demo.Controller;

import com.example.demo.Dao.SkuStockDao;
import com.example.demo.Entities.SkuStock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/skustock")
public class SkuStockController {

    @Autowired
    private SkuStockDao skuStockDao;

    @GetMapping
    public String insert(){
        SkuStock skuStock = new SkuStock();
        skuStock.setSkuId("4683565");
        skuStock.setStock("100");
        skuStock.setLowStock(2);
        skuStock.setId("5");
        skuStock.setRepositoryId("2");
        skuStockDao.addSkuStock(skuStock);
        return "skustock";
    }
    @GetMapping("/lists")
    public List<SkuStock> queryAll(){
        List<SkuStock> skuStocks = skuStockDao.queryAll();
        return skuStocks;
    }
}
