package com.freshshop.demo.mapper;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.freshshop.demo.entity.Product;

public interface ProductMapper extends MongoRepository<Product, String>{
	List<Product> findAll(); // 查询所有商品信息
	Optional<Product> findById(String id); // 根据指定ID查询对应商品信息
	@SuppressWarnings("unchecked")
	Product insert(Product product); // 插入一条商品信息
	void deleteById(String id); // 根据ID删除对应商品信息
	@SuppressWarnings("unchecked")
	Product save(Product product); // 根据ID修改对应商品的信息
}
