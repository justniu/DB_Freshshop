package com.freshshop.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.freshshop.demo.entity.Product;
import com.freshshop.demo.mapper.ProductDao;
import com.freshshop.demo.utils.R;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/product", method = RequestMethod.GET)
public class ProductController {

    @Autowired
    private ProductDao productDao;

    @PostMapping
    public String insert(@RequestBody Product product){
//        Product product = new Product();
//        product.setProductId("4");
//        product.setProductPrice(20);
//        product.setProductCategoryId("14");
//        product.setDeleteStatus(0);
//        product.setName("好味道");
//        product.setLowStock(2);
//        product.setNewStatus(1);
//        product.setPromotionType(0);
//        product.setPromotionStartTime(new Date());
//        product.setPromotionEndTime(new Date());
//        product.setPromotionPrice(15);
//        product.setPublishStatus(1);
//        product.setSale(1200);
//        product.setUnit("kg");
//        product.setWeight(1);
//        product.setStock(100);
//        product.setUpdateTime(new Date());
        productDao.addProduct(product);
        return "product";
    }
    @GetMapping("/lists")
    public List<Product> queryAll(){
        List<Product> products = productDao.queryAll();
        return products;
    }
    @GetMapping("/list")
    public List<Product> query(@RequestParam Map<String, Object> param){
        return productDao.query(param);
    }

    @GetMapping("/new")
    public R update(@RequestBody Product params){
//        Product product = new Product();
//        product.setProductId("4");
//        product.setProductPrice(20);
//        product.setProductCategoryId("14");
//        product.setDeleteStatus(0);
//        product.setName("好味道鸡爪");
//        product.setLowStock(2);
//        product.setNewStatus(1);
//        product.setPromotionType(0);
//        product.setPromotionStartTime(new Date());
//        product.setPromotionEndTime(new Date());
//        product.setPromotionPrice(15);
//        product.setPublishStatus(1);
//        product.setSale(1200);
//        product.setUnit("kg");
//        product.setWeight(1);
//        product.setStock(100);
//        product.setUpdateTime(new Date());
//        productDao.update(product);
//        return "new";
    	try {
    		productDao.update(params);
			return R.ok().data("create","success");
		} catch (Exception e) {
			return R.error().data("create","fail");
		}
    }
    
    @GetMapping("/find")
    public R find(@RequestBody Product params) {
    	return R.ok().data("items",productDao.findProductById(params.getProductId()));
    }
}