package com.example.demo.Controller;


import com.example.demo.Dao.ProductAttributeDao;
import com.example.demo.Entities.ProductAttribute;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/productAttr")
public class ProductAttributeController {

    @Autowired
    private ProductAttributeDao productAttributeDao;

    @GetMapping
    public String insert(){
        ProductAttribute productAttribute = new ProductAttribute();
        productAttribute.setProductAttributeCategoryId("4");
        productAttribute.setAttType(false);
        productAttribute.setId("8");
        productAttribute.setName("净含量");
        productAttributeDao.addProductAttr(productAttribute);
        return "productAttr";
    }
    @GetMapping("/lists")
    public List<ProductAttribute> queryAll(){
        List<ProductAttribute> productAttributes = productAttributeDao.queryAll();
        return productAttributes;
    }
}
