package com.freshshop.demo.service;

import com.freshshop.demo.entity.Product;
import com.freshshop.demo.entity.ProductSku;
import com.freshshop.demo.entity.SkuStock;
import com.freshshop.demo.mapper.ProductDao;
import com.freshshop.demo.mapper.ProductSkuMapper;
import com.freshshop.demo.mapper.SkuStockDao;
import com.freshshop.demo.utils.DateId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
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
	@Autowired
	SkuStockDao skuStockDao;
	
	@Transactional
	public void update(Product product){
		ProductSku productSku = new ProductSku();
		productSku.setId(new DateId().toString());
		productSku.setProductId(product.getProductId());
		productSku.setPrice(String.valueOf(product.getProductPrice()));
		productSku.setSale(0);
		Map<String, String> stringStringMap = new HashMap<>();
		stringStringMap.put("品质","95%");
		productSku.setSp(stringStringMap);
		productSku.setPromotionPrice(String.valueOf(product.getPromotionPrice()-2));
		productDao.addProduct(product);
		insert(productSku);
		SkuStock skuStock = new SkuStock();
		skuStock.setId(new DateId().toString());
		skuStock.setLowStock(2);
		skuStock.setRepositoryId("1");
		skuStock.setStock(0);
		skuStock.setSkuId(productSku.getId());
		System.out.println("+++++++++++++++");
		skuStockDao.addSkuStock(skuStock);
	}
}
