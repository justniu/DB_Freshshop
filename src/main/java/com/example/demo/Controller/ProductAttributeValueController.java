package com.example.demo.Controller;

import com.example.demo.Dao.ProductAttributeValueDao;
import com.example.demo.Entities.ProductAttributeValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/prodAttrVal")
public class ProductAttributeValueController {

    @Autowired
    private ProductAttributeValueDao productAttributeValueDao;

    @PostMapping
    public String insert(@RequestBody ProductAttributeValue productAttributeValue){
//        ProductAttributeValue productAttributeValue = new ProductAttributeValue();
//        productAttributeValue.setProductAttributeId("1");
//        productAttributeValue.setValue("净重2斤");
//        productAttributeValue.setId("12");
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
