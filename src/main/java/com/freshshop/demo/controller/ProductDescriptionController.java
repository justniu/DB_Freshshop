package com.freshshop.demo.controller;

import com.freshshop.demo.entity.ProductDescription;
import com.freshshop.demo.service.ProductDescriptionService;
import com.freshshop.demo.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductDescriptionController {
	@Autowired
	ProductDescriptionService productDescriptionService;
	
	@GetMapping("/productDescriptions") // 获取所有商品的信息
	public R findAllProductDescription() {
		return R.ok().data("items", productDescriptionService.findAll());
	}
	
	
	@GetMapping("/findProductDescriptionById") // 根据产品ID查询指定商品信息
	public R findProductDescriptionById(@RequestBody ProductDescription params) {
		return R.ok().data("items", productDescriptionService.findById(params.getId()));
	}
	
	// 插入一条商品信息
	@GetMapping("/insertOneProductDescription")
	public R insertOneProduct(@RequestBody ProductDescription params) {
		try {
			productDescriptionService.insert(params);
			return R.ok().data("create","success");
		} catch (Exception e) {
			return R.error().data("create","fail");
		}
	}
	
	@GetMapping("/deleteProductDescriptionById")// 删除指定ID的商品信息
	public R deleteProductDescriptionById(@RequestBody ProductDescription params) {
		try {
			productDescriptionService.deleteById(params.getId());
			return R.ok().data("delete","success");
		} catch (Exception e) {
			return R.error().data("delete","fail");
		}
	}
	
	// 按照商品ID更新一条商品信息
	@GetMapping("/saveOneProductDescription")
	public R saveOneProduct(@RequestBody ProductDescription params) {
		try {
			productDescriptionService.save(params);
			return R.ok().data("update","success");
		} catch (Exception e) {
			return R.error().data("update","fail");
		}
	}
}
