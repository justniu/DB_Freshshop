package com.freshshop.demo.controller;

import com.freshshop.demo.entity.Product;
import com.freshshop.demo.entity.ProductCategory;
import com.freshshop.demo.entity.ProductSku;
import com.freshshop.demo.entity.SkuStock;
import com.freshshop.demo.mapper.ProductCategoryDao;
import com.freshshop.demo.mapper.ProductDao;
import com.freshshop.demo.service.ProductSkuService;
import com.freshshop.demo.utils.DateId;
import com.freshshop.demo.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/product", method = RequestMethod.GET)
public class ProductController {

    @Autowired
    private ProductDao productDao;
    @Autowired
    private ProductCategoryDao productCategoryDao;

    @Autowired
    private ProductSkuService productSkuService;

   
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
    public R insert(@RequestBody Product product){
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
    		productSkuService.update(product);
			return R.ok().data("create","success");
		} catch (Exception e) {
			return R.error().data("create","fail");
		}
    }
    
    @GetMapping("/find")
    public R find(@RequestBody Product params) {
    	return R.ok().data("items",productDao.findProductById(params.getProductId()));
    }
    
    @GetMapping("/findProductByCategoryId") // 按类别名称查询
    public R findProductByCategoryId(@RequestBody ProductCategory params) {
    	String id = productCategoryDao.findProductCategoryIdByname(params.getName());
    	return R.ok().data("items",productDao.findProductByCategoryId(id));
    }

    @GetMapping("/findProductByLike") // 模糊查询
    public R findProductByLike(@RequestBody Product params) {
    	return R.ok().data("items",productDao.findProductByLike("%"+params.getName()+"%"));
    }
    
    @GetMapping("/del")
    public R delete(@RequestParam String id) {
    	try {
        	productDao.deleteById(id);
        	return R.ok().data("del","success");
    	}catch(Exception e) {
    		return R.error().data("del", "fail");
    	}
    	
    }
    
    @GetMapping("/update")
    public void update(@RequestBody Product product) {
    	productDao.update(product);
    }
}
