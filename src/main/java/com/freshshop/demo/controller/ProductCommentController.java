package com.freshshop.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.freshshop.demo.entity.ProductComment;
import com.freshshop.demo.service.ProductCommentService;
import com.freshshop.demo.utils.R;

@RestController
@RequestMapping(value = "/productComment", method = RequestMethod.GET)
public class ProductCommentController {
	@Autowired
	ProductCommentService productCommentService;
	
	@GetMapping("/lists")// 查询所有产品的评论
	public R allProductComments() {
		return R.ok().data("items", productCommentService.getAllProductComments());
	}
	
	
	@GetMapping("/findById")// 根据指定产品ID查询评论
	public R findProductCommentsById(@RequestBody ProductComment params) {
		return R.ok().data("items", productCommentService.findProductCommentsById(params.getProductId()));
	}
	
	@GetMapping("/findByUserId")// 根据指定用户ID查询评论
	public R findProductCommentsByUserId(@RequestBody ProductComment params) {
		return R.ok().data("items", productCommentService.findByUserId(params.getUserId()));
	}
	
	@GetMapping("/insert") // 插入一条数据
	public R insertOneComment(@RequestBody ProductComment params) {
		try {
			productCommentService.insertOne(params);
			return R.ok().data("create","success");
		} catch (Exception e) {
			return R.error().data("create","fail");
		}
	}
	
	@GetMapping("/deleteById")// 删除指定ID的评论
	public R deleteCommentById(@RequestBody ProductComment params) {
		try {
			productCommentService.deleteById(params.getId());
			return R.ok().data("delete","success");
		} catch (Exception e) {
			return R.error().data("delete","fail");
		}
	}
	
	@GetMapping("/saveOneComment") // 更新一条数据 根据 _id
	public R saveOneComment(@RequestBody ProductComment params) {
		try {
			productCommentService.saveOne(params);
			return R.ok().data("update","success");
		} catch (Exception e) {
			return R.error().data("update","fail");
		}
	}
}
