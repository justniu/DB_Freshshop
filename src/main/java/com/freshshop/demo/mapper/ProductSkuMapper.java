package com.freshshop.demo.mapper;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.freshshop.demo.entity.ProductSku;

public interface ProductSkuMapper extends MongoRepository<ProductSku, String>{
	List<ProductSku> findAll(); // 查询所有商品sku信息
	Optional<ProductSku> findById(String id); // 根据指定ID sku
	List<ProductSku> findAllByProductId(String productId); // 根据指定产品ID 查询sku
	@SuppressWarnings("unchecked")
	ProductSku insert(ProductSku productSku); // 插入一条sku
	void deleteById(String id); // 根据ID删除对应商品sku
	@SuppressWarnings("unchecked")
	ProductSku save(ProductSku productSku); // 根据ID修改对应商品的sku信息
}
