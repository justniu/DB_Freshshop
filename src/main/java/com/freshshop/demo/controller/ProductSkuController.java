package com.freshshop.demo.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.freshshop.demo.entity.ProductSku;
import com.freshshop.demo.service.ProductSkuService;
import com.freshshop.demo.utils.R;

import io.swagger.annotations.ApiParam;

@RestController
public class ProductSkuController {
	@Autowired
	ProductSkuService productSkuService;
	
	@GetMapping("/productSkus") // 获取所有商品的Sku信息
	public R findAllProductSkus() {
		return R.ok().data("items", productSkuService.findAll());
	}
	
	// http://localhost:8014/findProductSkuById/63371141143
	@GetMapping("/findProductSkuById/{id}") // 根据ID查询指定商品Sku信息
	public R findProductSkuById(
			@ApiParam(name = "id")
			@PathVariable String id) {
		return R.ok().data("items", productSkuService.findById(id));
	}
	
	// http://localhost:8014/findAllProductSkuByProductId/1
	@GetMapping("/findAllProductSkuByProductId/{productId}") // 根据产品ID查询指定商品Sku信息
	public R findAllProductSkuByProductId(
			@ApiParam(name = "productId")
			@PathVariable String productId) {
		return R.ok().data("items", productSkuService.findAllByProductId(productId));
	}
	
	// 插入一条商品Sku信息
	@GetMapping("/insertOneProduct/{id}/{productId}/{price}/{sp}/{promotionPrice}/{sale}")
	public R insertOneProduct(
			@ApiParam(name = "id")
			@PathVariable String id,
			@ApiParam(name = "productId")
			@PathVariable String productId,
			@ApiParam(name = "price")
			@PathVariable String price,
			@ApiParam(name = "sp")
			@PathVariable Map<String, String> sp,
			@ApiParam(name = "promotionPrice")
			@PathVariable String promotionPrice,
			@ApiParam(name = "sale")
			@PathVariable int sale) {
		ProductSku productSku = new ProductSku();
		productSku.setId(id);
		productSku.setProductId(productId);
		productSku.setPrice(price);
		productSku.setSp(sp);
		productSku.setPromotionPrice(promotionPrice);
		productSku.setSale(sale);
		try {
			productSkuService.insert(productSku);
			return R.ok().data("create","success");
		} catch (Exception e) {
			return R.error().data("create","fail");
		}
	}
	
	@GetMapping("/deleteProductSkuById/{id}")// 删除指定ID的商品Sku信息
	public R deleteProductSkuById(
			@ApiParam(name = "id")
			@PathVariable String id) {
		try {
			productSkuService.deleteById(id);
			return R.ok().data("delete","success");
		} catch (Exception e) {
			return R.error().data("delete","fail");
		}
	}
	
	// 按照商品ID更新一条商品信息
	@GetMapping("/insertOneProductSku/{id}/{productId}/{price}/{sp}/{promotionPrice}/{sale}")
	public R insertOneProductSku(
			@ApiParam(name = "id")
			@PathVariable String id,
			@ApiParam(name = "productId")
			@PathVariable String productId,
			@ApiParam(name = "price")
			@PathVariable String price,
			@ApiParam(name = "sp")
			@PathVariable Map<String, String> sp,
			@ApiParam(name = "promotionPrice")
			@PathVariable String promotionPrice,
			@ApiParam(name = "sale")
			@PathVariable int sale) {
		ProductSku productSku = new ProductSku();
		productSku.setId(id);
		productSku.setProductId(productId);
		productSku.setPrice(price);
		productSku.setSp(sp);
		productSku.setPromotionPrice(promotionPrice);
		productSku.setSale(sale);
		try {
			productSkuService.save(productSku);
			return R.ok().data("update","success");
		} catch (Exception e) {
			return R.error().data("update","fail");
		}
	}
}
