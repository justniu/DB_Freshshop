package com.example.demo.Controller;


import com.example.demo.Dao.CategoryAttributeDao;
import com.example.demo.Entities.CategoryAttribute;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/category", method = RequestMethod.GET)
public class CategoryAttributeController {

    @Autowired
    private CategoryAttributeDao categoryAttributeDao;

    @GetMapping("/lists")
    public List<CategoryAttribute> queryAll(){
        List<CategoryAttribute> categoryAttributes = categoryAttributeDao.queryAll();
        return categoryAttributes;
    }
    @GetMapping
    public String insert(){
        CategoryAttribute categoryAttribute = new CategoryAttribute();
        categoryAttribute.setProductAttributeId("2");
        categoryAttribute.setProductCategoryId("1");
        categoryAttribute.setId("1001");
        categoryAttributeDao.insert(categoryAttribute);
        return "category_attr";
    }

    @GetMapping("/list")
    public List<CategoryAttribute> query(@RequestParam Map<String, Object> param){
        return categoryAttributeDao.query(param);
    }
}
