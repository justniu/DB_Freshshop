package com.freshshop.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.freshshop.demo.entity.Product;
import com.freshshop.demo.mapper.ProductMapper;

@Service
public class ProductService {
	@Autowired
	ProductMapper productMapper;
	
	public List<Product> findAll(){
		return productMapper.findAll();
	}
	
	public Optional<Product> findById(String id){
		return productMapper.findById(id);
	}
	
	public Product insert(Product product) {
		return productMapper.insert(product);
	}
	
	public void deleteById(String id) {
		productMapper.deleteById(id);
		return ;
	}
	
	public Product save(Product product) {
		return productMapper.save(product);
	}
}
