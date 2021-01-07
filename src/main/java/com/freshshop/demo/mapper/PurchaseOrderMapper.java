package com.freshshop.demo.mapper;

import com.freshshop.demo.entity.PurchaseOrder;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface PurchaseOrderMapper extends MongoRepository<PurchaseOrder, String>{
	List<PurchaseOrder> findAll(); // 查询所有采购订单
	Optional<PurchaseOrder> findById(String id); // 根据指定ID查询对应采购信息
	List<PurchaseOrder> findAllBySupplierId(String supplierId); // 根据指定供应商ID查询对应采购信息
	@SuppressWarnings("unchecked")
	PurchaseOrder insert(PurchaseOrder purchaseOrder); // 插入一条采购信息
	void deleteById(String id); // 根据ID删除对应采购信息
	@SuppressWarnings("unchecked")
	PurchaseOrder save(PurchaseOrder purchaseOrder); // 根据ID修改对应商品的采购信息
}
