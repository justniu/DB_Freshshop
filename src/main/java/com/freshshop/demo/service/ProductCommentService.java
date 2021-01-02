package com.freshshop.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.freshshop.demo.entity.ProductComment;
import com.freshshop.demo.mapper.ProductCommentMapper;

@Service
public class ProductCommentService {
	@Autowired
	ProductCommentMapper productCommentMapper;
	
	public List<ProductComment> getAllProductComments() {
        return productCommentMapper.findAll();
    }
	
	public List<ProductComment> findProductCommentsById(String productId) {
        return productCommentMapper.findByProductId(productId);
    }
	
	public ProductComment insertOne(ProductComment productComment) {
		return productCommentMapper.insert(productComment);
	}
	
	public void deleteById(String id) {
        productCommentMapper.deleteById(id);
        return ;
    }
	
	public ProductComment saveOne(ProductComment productComment) {
		return productCommentMapper.save(productComment);
	}
}
