package com.freshshop.demo.controller;

import com.freshshop.demo.entity.CategoryAttribute;
import com.freshshop.demo.mapper.CategoryAttributeDao;
import com.freshshop.demo.utils.R;
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
    public R queryAll(){
        return R.ok().data("items",categoryAttributeDao.queryAll());
    }
    
    @GetMapping("/insert")
    public R insert(@RequestBody CategoryAttribute categoryAttribute){
    	try {
    		categoryAttributeDao.insert(categoryAttribute);
    		return R.ok().data("insert","success");
		} catch (Exception e) {
			return R.error().data("insert","fail");
		}
    }

    @GetMapping("/new")
    public String update(@RequestBody CategoryAttribute params){
        categoryAttributeDao.update(params);
        return "new";
    }

    @GetMapping("/list")
    public List<CategoryAttribute> query(@RequestParam Map<String, Object> param){
        return categoryAttributeDao.query(param);
    }
}
