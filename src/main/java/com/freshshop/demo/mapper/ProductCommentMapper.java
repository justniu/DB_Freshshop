package com.freshshop.demo.mapper;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.freshshop.demo.entity.ProductComment;

public interface ProductCommentMapper extends MongoRepository<ProductComment, String>{
	List<ProductComment> findAll(); // 查询所有的产品评论
	List<ProductComment> findByProductId(String productId); // 查询指定商品的评论
	@SuppressWarnings("unchecked")
	ProductComment insert(ProductComment productComment); // 插入
	void deleteById(String id); // 删除指定评论
	@SuppressWarnings("unchecked")
	ProductComment save(ProductComment productComment); // 修改
}
