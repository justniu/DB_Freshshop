package com.freshshop.demo.service;

import com.freshshop.demo.entity.Product;
import com.freshshop.demo.entity.ProductSku;
import com.freshshop.demo.mapper.ProductDao;
import com.freshshop.demo.mapper.ProductSkuMapper;
import com.freshshop.demo.utils.DateId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

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

	@Autowired
	ProductDao productDao;
	public void update(Product product){
		ProductSku productSku = new ProductSku();
		productSku.setId(DateId.toStr());
		productSku.setProductId(product.getProductId());
		productSku.setPrice(String.valueOf(product.getProductPrice()));
		productSku.setSale(100);
		Map<String, String> stringStringMap = new HashMap<>();
		stringStringMap.put("品质","95%");
		productSku.setSp(stringStringMap);
		productSku.setPromotionPrice(String.valueOf(product.getPromotionPrice()-2));
		insert(productSku);
	}
}
