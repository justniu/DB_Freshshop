package com.freshshop.demo.mapper;

import com.freshshop.demo.entity.ProductDescription;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface ProductDescriptionMapper extends MongoRepository<ProductDescription, String>{
	List<ProductDescription> findAll(); // 查询所有商品信息
	Optional<ProductDescription> findById(String id); // 根据指定ID查询对应商品信息
	@SuppressWarnings("unchecked")
	ProductDescription insert(ProductDescription product); // 插入一条商品信息
	void deleteById(String id); // 根据ID删除对应商品信息
	@SuppressWarnings("unchecked")
	ProductDescription save(ProductDescription product); // 根据ID修改对应商品的信息
}
