package com.freshshop.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.freshshop.demo.entity.ProductSku;
import com.freshshop.demo.mapper.ProductSkuMapper;

@Service
public class ProductSkuService {
	@Autowired
	ProductSkuMapper productSkuMapper;
	
	public List<ProductSku> findAll(){
		return productSkuMapper.findAll();
	}
	
	public Optional<ProductSku> findById(String id){
		return productSkuMapper.findById(id);
	}
	
	public List<ProductSku> findAllByProductId(String productId){
		return productSkuMapper.findAllByProductId(productId);
	}
	
	public ProductSku insert(ProductSku productSku) {
		return productSkuMapper.insert(productSku);
	}
	
	public void deleteById(String id) {
		productSkuMapper.deleteById(id);
		return ;
	}
	
	public ProductSku save(ProductSku product) {
		return productSkuMapper.save(product);
	}
}
