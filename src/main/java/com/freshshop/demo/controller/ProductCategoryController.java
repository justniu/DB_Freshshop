package com.freshshop.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.freshshop.demo.entity.ProductCategory;
import com.freshshop.demo.mapper.ProductCategoryDao;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/prodcate")
public class ProductCategoryController {

    @Autowired
    private ProductCategoryDao productCategoryDao;

    @PostMapping
    public String insert(@RequestBody ProductCategory productCategory){
//        ProductCategory productCategory = new ProductCategory();
//        productCategory.setProductCategoryId("14");
//        productCategory.setCategoryLevel("3");
//        productCategory.setProductUnit("kg");
//        productCategory.setDescription("直接啃");
//        productCategory.setName("鸡爪");
//        productCategory.setParentId("8");
//        productCategory.setKeywords("暂无");
//        productCategory.setProductCount(100);
        productCategoryDao.addProductCate(productCategory);
        return "prodcate";
    }

    @GetMapping("/lists")
    public List<ProductCategory> queryAll(){
        List<ProductCategory> productCategories = productCategoryDao.queryAll();
        return productCategories;
    }

    @GetMapping("/list")
    public List<ProductCategory> query(@RequestParam Map<String, Object> param){
       return  productCategoryDao.query(param);
    }
}
