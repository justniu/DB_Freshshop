package com.freshshop.demo.controller;

import com.freshshop.demo.entity.ProductSku;
import com.freshshop.demo.service.ProductSkuService;
import com.freshshop.demo.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductSkuController {
	@Autowired
	ProductSkuService productSkuService;
	
	@GetMapping("/productSkus") // 获取所有商品的Sku信息
	public R findAllProductSkus() {
		return R.ok().data("items", productSkuService.findAll());
	}
	
	@GetMapping("/findProductSkuById") // 根据ID查询指定商品Sku信息
	public R findProductSkuById(@RequestBody ProductSku params) {
		return R.ok().data("items", productSkuService.findById(params.getId()));
	}
	
	@GetMapping("/findAllProductSkuByProductId") // 根据产品ID查询指定商品Sku信息
	public R findAllProductSkuByProductId(@RequestBody ProductSku params) {
		return R.ok().data("items", productSkuService.findAllByProductId(params.getProductId()));
	}
	
	// 插入一条商品Sku信息
	@GetMapping("/insertOneProductSku")
	public R insertOneProduct(@RequestBody ProductSku params) {
		try {
			productSkuService.insert(params);
			return R.ok().data("create","success");
		} catch (Exception e) {
			return R.error().data("create","fail");
		}
	}
	
	@GetMapping("/deleteProductSkuById")// 删除指定ID的商品Sku信息
	public R deleteProductSkuById(@RequestBody ProductSku params) {
		try {
			productSkuService.deleteById(params.getId());
			return R.ok().data("delete","success");
		} catch (Exception e) {
			return R.error().data("delete","fail");
		}
	}
	
	// 按照商品ID更新一条商品信息
	@GetMapping("/saveOneProductSku")
	public R saveOneProductSku(@RequestBody ProductSku params) {
		try {
			productSkuService.save(params);
			return R.ok().data("update","success");
		} catch (Exception e) {
			return R.error().data("update","fail");
		}
	}
}
