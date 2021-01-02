package com.example.demo.Controller;

import com.example.demo.Dao.ProductAttributeCategoryDao;
import com.example.demo.Entities.ProductAttributeCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/ProdAttrCate")
public class ProductAttributeCategoryController {


    @Autowired
    private ProductAttributeCategoryDao productAttributeCategoryDao;

    @GetMapping
    public String insert(){
        ProductAttributeCategory productAttributeCategory = new ProductAttributeCategory();
        productAttributeCategory.setAttributeCount(1);
        productAttributeCategory.setProductId("4");
        productAttributeCategory.setId("5");
        productAttributeCategory.setParamCount(0);
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
