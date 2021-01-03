package com.freshshop.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.freshshop.demo.entity.ProductAttribute;
import com.freshshop.demo.mapper.ProductAttributeDao;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/productAttr")
public class ProductAttributeController {

    @Autowired
    private ProductAttributeDao productAttributeDao;

    @PostMapping
    public String insert(@RequestBody ProductAttribute productAttribute){
        productAttributeDao.addProductAttr(productAttribute);
        return "productAttr";
    }
    @GetMapping("/lists")
    public List<ProductAttribute> queryAll(){
        List<ProductAttribute> productAttributes = productAttributeDao.queryAll();
        return productAttributes;
    }

    @GetMapping("/list")
    public List<ProductAttribute> query(@RequestParam Map<String, Object> param){
        return productAttributeDao.query(param);
    }
}
