package com.freshshop.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.freshshop.demo.entity.ProductDescription;
import com.freshshop.demo.mapper.ProductDescriptionMapper;

@Service
public class ProductDescriptionService {
	@Autowired
	ProductDescriptionMapper productMapper;
	
	public List<ProductDescription> findAll(){
		return productMapper.findAll();
	}
	
	public Optional<ProductDescription> findById(String id){
		return productMapper.findById(id);
	}
	
	public ProductDescription insert(ProductDescription product) {
		return productMapper.insert(product);
	}
	
	public void deleteById(String id) {
		productMapper.deleteById(id);
		return ;
	}
	
	public ProductDescription save(ProductDescription product) {
		return productMapper.save(product);
	}
}
