package com.freshshop.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.freshshop.demo.entity.Product;
import com.freshshop.demo.service.ProductService;
import com.freshshop.demo.utils.R;

import io.swagger.annotations.ApiParam;

@RestController
public class ProductController {
	@Autowired
	ProductService productService;
	
	@GetMapping("/products") // 获取所有商品的信息
	public R findAllProduct() {
		return R.ok().data("items", productService.findAll());
	}
	
	// http://localhost:8014/findProductById/1
	@GetMapping("/findProductById/{id}") // 根据产品ID查询指定商品信息
	public R findProductById(
			@ApiParam(name = "id")
			@PathVariable String id) {
		return R.ok().data("items", productService.findById(id));
	}
	
	// 插入一条商品信息
	@GetMapping("/insertOneProduct/{id}/{pic}/{note}/{detailTitle}/{detailDescribe}/{detailHtml}/{commentId}")
	public R insertOneProduct(
			@ApiParam(name = "id")
			@PathVariable String id,
			@ApiParam(name = "pic")
			@PathVariable String pic,
			@ApiParam(name = "note")
			@PathVariable String note,
			@ApiParam(name = "detailTitle")
			@PathVariable String detailTitle,
			@ApiParam(name = "detailDescribe")
			@PathVariable String detailDescribe,
			@ApiParam(name = "detailHtml")
			@PathVariable String detailHtml,
			@ApiParam(name = "commentId")
			@PathVariable List<String> commentId) {
		Product product = new Product();
		product.setId(id);
		product.setPic(pic);
		product.setNote(note);
		product.setDetailTitile(detailTitle);
		product.setDetailDescribe(detailDescribe);
		product.setDetailHtml(detailHtml);
		product.setCommentId(commentId);
		try {
			productService.insert(product);
			return R.ok().data("create","success");
		} catch (Exception e) {
			return R.error().data("create","fail");
		}
	}
	
	@GetMapping("/deleteProductById/{id}")// 删除指定ID的商品信息
	public R deleteProductById(
			@ApiParam(name = "id")
			@PathVariable String id) {
		try {
			productService.deleteById(id);
			return R.ok().data("delete","success");
		} catch (Exception e) {
			return R.error().data("delete","fail");
		}
	}
	
	// 按照商品ID更新一条商品信息
	@GetMapping("/saveOneProduct/{id}/{pic}/{note}/{detailTitle}/{detailDescribe}/{detailHtml}/{commentId}")
	public R saveOneProduct(
			@ApiParam(name = "id")
			@PathVariable String id,
			@ApiParam(name = "pic")
			@PathVariable String pic,
			@ApiParam(name = "note")
			@PathVariable String note,
			@ApiParam(name = "detailTitle")
			@PathVariable String detailTitle,
			@ApiParam(name = "detailDescribe")
			@PathVariable String detailDescribe,
			@ApiParam(name = "detailHtml")
			@PathVariable String detailHtml,
			@ApiParam(name = "commentId")
			@PathVariable List<String> commentId) {
		Product product = new Product();
		product.setId(id);
		product.setPic(pic);
		product.setNote(note);
		product.setDetailTitile(detailTitle);
		product.setDetailDescribe(detailDescribe);
		product.setDetailHtml(detailHtml);
		product.setCommentId(commentId);
		try {
			productService.save(product);
			return R.ok().data("update","success");
		} catch (Exception e) {
			return R.error().data("update","fail");
		}
	}
}
