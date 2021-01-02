package com.example.demo.Controller;


import com.example.demo.Dao.ProductCategoryDao;
import com.example.demo.Entities.ProductCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/prodcate")
public class ProductCategoryController {

    @Autowired
    private ProductCategoryDao productCategoryDao;

    @GetMapping
    public String insert(){
        ProductCategory productCategory = new ProductCategory();
        productCategory.setProductCategoryId("14");
        productCategory.setCategoryLevel("3");
        productCategory.setProductUnit("kg");
        productCategory.setDescription("直接啃");
        productCategory.setName("鸡爪");
        productCategory.setParentId("8");
        productCategory.setKeywords("暂无");
        productCategory.setProductCount(100);
        productCategoryDao.addProductCate(productCategory);
        return "prodcate";
    }

    @GetMapping("/lists")
    public List<ProductCategory> queryAll(){
        List<ProductCategory> productCategories = productCategoryDao.queryAll();
        return productCategories;
    }
}
