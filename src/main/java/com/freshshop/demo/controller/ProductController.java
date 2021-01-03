package com.freshshop.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.freshshop.demo.entity.Product;
import com.freshshop.demo.service.ProductService;
import com.freshshop.demo.utils.R;

@RestController
public class ProductController {
	@Autowired
	ProductService productService;
	
	@GetMapping("/products") // 获取所有商品的信息
	public R findAllProduct() {
		return R.ok().data("items", productService.findAll());
	}
	
	
	@GetMapping("/findProductById") // 根据产品ID查询指定商品信息
	public R findProductById(@RequestBody Product params) {
		return R.ok().data("items", productService.findById(params.getId()));
	}
	
	// 插入一条商品信息
	@GetMapping("/insertOneProduct")
	public R insertOneProduct(@RequestBody Product params) {
		try {
			productService.insert(params);
			return R.ok().data("create","success");
		} catch (Exception e) {
			return R.error().data("create","fail");
		}
	}
	
	@GetMapping("/deleteProductById")// 删除指定ID的商品信息
	public R deleteProductById(@RequestBody Product params) {
		try {
			productService.deleteById(params.getId());
			return R.ok().data("delete","success");
		} catch (Exception e) {
			return R.error().data("delete","fail");
		}
	}
	
	// 按照商品ID更新一条商品信息
	@GetMapping("/saveOneProduct")
	public R saveOneProduct(@RequestBody Product params) {
		try {
			productService.save(params);
			return R.ok().data("update","success");
		} catch (Exception e) {
			return R.error().data("update","fail");
		}
	}
}
