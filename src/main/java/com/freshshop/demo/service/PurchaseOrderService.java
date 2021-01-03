package com.freshshop.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.freshshop.demo.entity.PurchaseOrder;
import com.freshshop.demo.mapper.PurchaseOrderMapper;

@Service
public class PurchaseOrderService {
	@Autowired
	PurchaseOrderMapper purchseOrderMapper;
	
	public List<PurchaseOrder> findAll(){
		return purchseOrderMapper.findAll();
	}
	
	public Optional<PurchaseOrder> findById(String id){
		return purchseOrderMapper.findById(id);
	}
	
	public List<PurchaseOrder> findAllBySupplierId(String supplierId){
		return purchseOrderMapper.findAllBySupplierId(supplierId);
	}
	
	public PurchaseOrder insert(PurchaseOrder purchaseOrder) {
		return purchseOrderMapper.insert(purchaseOrder);
	}
	
	public void deleteById(String id) {
		purchseOrderMapper.deleteById(id);
		return ;
	}
	
	public PurchaseOrder save(PurchaseOrder purchaseOrder) {
		return purchseOrderMapper.save(purchaseOrder);
	}
}
