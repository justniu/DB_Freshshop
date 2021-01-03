package com.freshshop.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.freshshop.demo.entity.PurchaseOrder;
import com.freshshop.demo.service.PurchaseOrderService;
import com.freshshop.demo.utils.R;

@RestController
public class PurchaseOrderContoller {
	@Autowired
	PurchaseOrderService purchaseOrderservice;
	
	@GetMapping("/purchaseOrders") // 获取所有采购订单
	public R findAllPurchaseOrder() {
		return R.ok().data("items", purchaseOrderservice.findAll());
	}
	
	@GetMapping("/findProductOrderById") // 根据ID查询指定采购订单
	public R findPurchaseOrderById(@RequestBody PurchaseOrder params) {
		return R.ok().data("items", purchaseOrderservice.findById(params.getId()));
	}
	
	@GetMapping("/findProductOrderBySupplierId") // 根据ID查询指定采购订单
	public R findPurchaseOrderBySupplierId(@RequestBody PurchaseOrder params) {
		return R.ok().data("items", purchaseOrderservice.findAllBySupplierId(params.getSupplierId()));
	}
	
	// 插入一条采购订单
	@GetMapping("/insertOnePurchaseOrder")
	public R insertOnePurchaseOrder(@RequestBody PurchaseOrder params) {
		try {
			purchaseOrderservice.insert(params);
			return R.ok().data("create","success");
		} catch (Exception e) {
			return R.error().data("create","fail");
		}
	}
	
	@GetMapping("/deletePurchaseOrderById")// 删除指定ID的采购订单
	public R deletepurchaseOrderById(@RequestBody PurchaseOrder params) {
		try {
			purchaseOrderservice.deleteById(params.getId());
			return R.ok().data("delete","success");
		} catch (Exception e) {
			return R.error().data("delete","fail");
		}
	}
	
	// 更新一条采购订单
	@GetMapping("/saveOnePurchaseOrder")
	public R SaveOnePurchaseOrder(@RequestBody PurchaseOrder params) {
		try {
			purchaseOrderservice.save(params);
			return R.ok().data("update","success");
		} catch (Exception e) {
			return R.error().data("update","fail");
		}
	}
}
