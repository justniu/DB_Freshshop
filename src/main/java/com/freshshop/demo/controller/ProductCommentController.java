package com.freshshop.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.freshshop.demo.entity.ProductComment;
import com.freshshop.demo.service.ProductCommentService;
import com.freshshop.demo.utils.R;

import io.swagger.annotations.ApiParam;

@RestController
public class ProductCommentController {
	@Autowired
	ProductCommentService productCommentService;
	
	@GetMapping("/productComments")// 查询所有产品的评论
	public R allProductComments() {
		return R.ok().data("items", productCommentService.getAllProductComments());
	}
	
	// http://localhost:8014/findProductCommentsById/3
	@GetMapping("/findProductCommentsById/{productId}")// 根据指定产品ID查询评论
	public R findProductCommentsById(
			@ApiParam(name = "productId")
			@PathVariable String productId) {
		return R.ok().data("items", productCommentService.findProductCommentsById(productId));
	}
	
	// http://localhost:8014/insertOneComment/cgahvtakvha/1001/1002/4.5/good!
	@GetMapping("/insertOneComment/{id}/{userId}/{productId}/{score}/{content}") // 插入一条数据
	public R insertOneComment(
			@ApiParam(name = "id")
			@PathVariable String id,
			@ApiParam(name = "userId")
			@PathVariable String userId,
			@ApiParam(name = "productId")
			@PathVariable String productId,
			@ApiParam(name = "score")
			@PathVariable float score,
			@ApiParam(name = "content")
			@PathVariable String content) {
		ProductComment productComment = new ProductComment();
		productComment.setId(id);
		productComment.setUserId(userId);
		productComment.setProductId(productId);
		productComment.setScore(score);
		productComment.setContent(content);
		try {
			productCommentService.insertOne(productComment);
			return R.ok().data("create","success");
		} catch (Exception e) {
			return R.error().data("create","fail");
		}
	}
	
	// http://localhost:8014/deleteCommentsById/cgahvtakvha
	@GetMapping("/deleteCommentById/{id}")// 删除指定ID的评论
	public R deleteCommentById(
			@ApiParam(name = "id")
			@PathVariable String id) {
		try {
			productCommentService.deleteById(id);
			return R.ok().data("delete","success");
		} catch (Exception e) {
			return R.error().data("delete","fail");
		}
	}
	
	// http://localhost:8014/saveOne/cgahvtakvha/1001/1002/5/bad!
	@GetMapping("/saveOneComment/{id}/{userId}/{productId}/{score}/{content}") // 更新一条数据 根据 _id
	public R saveOneComment(
			@ApiParam(name = "id")
			@PathVariable String id,
			@ApiParam(name = "userId")
			@PathVariable String userId,
			@ApiParam(name = "productId")
			@PathVariable String productId,
			@ApiParam(name = "score")
			@PathVariable float score,
			@ApiParam(name = "content")
			@PathVariable String content) {
		ProductComment productComment = new ProductComment();
		productComment.setId(id);
		productComment.setUserId(userId);
		productComment.setProductId(productId);
		productComment.setScore(score);
		productComment.setContent(content);
		try {
			productCommentService.saveOne(productComment);
			return R.ok().data("update","success");
		} catch (Exception e) {
			return R.error().data("update","fail");
		}
	}
}
