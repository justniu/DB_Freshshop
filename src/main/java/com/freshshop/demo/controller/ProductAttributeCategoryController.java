package com.freshshop.demo.controller;

import com.freshshop.demo.entity.ProductAttributeCategory;
import com.freshshop.demo.mapper.ProductAttributeCategoryDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/ProdAttrCate")
public class ProductAttributeCategoryController {


    @Autowired
    private ProductAttributeCategoryDao productAttributeCategoryDao;

    @GetMapping("/insert")
    public String insert(@RequestBody ProductAttributeCategory productAttributeCategory){
        productAttributeCategoryDao.addProductAttrCate(productAttributeCategory);
        return "prodAttrCate";
    }
    @GetMapping("/lists")
    public List<ProductAttributeCategory> queryAll(){
        List<ProductAttributeCategory> productAttributeCategories = productAttributeCategoryDao.queryAll();
        return productAttributeCategories;
    }

    @GetMapping("/list")
    public List<ProductAttributeCategory> query(@RequestParam Map<String, Object> param){
        return productAttributeCategoryDao.query(param);
    }
}
