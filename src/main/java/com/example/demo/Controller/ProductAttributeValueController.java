package com.example.demo.Controller;

import com.example.demo.Dao.ProductAttributeValueDao;
import com.example.demo.Entities.ProductAttributeValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/prodAttrVal")
public class ProductAttributeValueController {

    @Autowired
    private ProductAttributeValueDao productAttributeValueDao;

    @GetMapping
    public String insert(){
        ProductAttributeValue productAttributeValue = new ProductAttributeValue();
        productAttributeValue.setProductAttributeId("1");
        productAttributeValue.setValue("净重2斤");
        productAttributeValue.setId("12");
        productAttributeValueDao.addProductAttrVal(productAttributeValue);
        return "prodAttrVal";
    }
    @GetMapping("/lists")
    public List<ProductAttributeValue> queryAll(){
        List<ProductAttributeValue> productAttributeValues = productAttributeValueDao.queryAll();
        return productAttributeValues;
    }

    @GetMapping("/list")
    public List<ProductAttributeValue> query(@RequestParam Map<String, Object> param){
        return productAttributeValueDao.query(param);
    }
}
