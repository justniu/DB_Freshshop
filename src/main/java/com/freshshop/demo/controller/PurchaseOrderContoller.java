package com.freshshop.demo.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.freshshop.demo.entity.PurchaseOrder;
import com.freshshop.demo.service.PurchaseOrderService;
import com.freshshop.demo.utils.R;

import io.swagger.annotations.ApiParam;

@RestController
public class PurchaseOrderContoller {
	@Autowired
	PurchaseOrderService purchaseOrderservice;
	
	@GetMapping("/purchaseOrders") // 获取所有采购订单
	public R findAllPurchaseOrder() {
		return R.ok().data("items", purchaseOrderservice.findAll());
	}
	
	// http://localhost:8014/findProductOrderById/5ff03df80e3a508e69ba1bc5
	@GetMapping("/findProductOrderById/{id}") // 根据ID查询指定采购订单
	public R findPurchaseOrderById(
			@ApiParam(name = "id")
			@PathVariable String id) {
		return R.ok().data("items", purchaseOrderservice.findById(id));
	}
	
	// http://localhost:8014/findProductOrderBySupplierId/1
	@GetMapping("/findProductOrderBySupplierId/{supplierId}") // 根据ID查询指定采购订单
	public R findPurchaseOrderBySupplierId(
			@ApiParam(name = "supplierId")
			@PathVariable String supplierId) {
		return R.ok().data("items", purchaseOrderservice.findAllBySupplierId(supplierId));
	}
	
	// 插入一条采购订单
	@GetMapping("/insertOnePurchaseOrder/{id}/{supplierId}/{purchaseOrderSpend}/{purchaseOrderDate}/{status}/{purchaseDetail}")
	public R insertOnePurchaseOrder(
			@ApiParam(name = "id")
			@PathVariable String id,
			@ApiParam(name = "supplierId")
			@PathVariable String supplierId,
			@ApiParam(name = "purchaseOrderSpend")
			@PathVariable float purchaseOrderSpend,
			@ApiParam(name = "purchaseOrderDate")
			@PathVariable Date purchaseOrderDate,
			@ApiParam(name = "status")
			@PathVariable String status,
			@ApiParam(name = "purchaseDetail")
			@PathVariable List<String> purchaseDetail) {
		PurchaseOrder purchaseOrder = new PurchaseOrder();
		purchaseOrder.setId(id);
		purchaseOrder.setSupplierId(supplierId);
		purchaseOrder.setPurchaseOrderSpend(purchaseOrderSpend);
		purchaseOrder.setPurchaseOrderDate(purchaseOrderDate);
		purchaseOrder.setStatus(status);
		purchaseOrder.setPurchaseDetail(purchaseDetail);
		try {
			purchaseOrderservice.insert(purchaseOrder);
			return R.ok().data("create","success");
		} catch (Exception e) {
			return R.error().data("create","fail");
		}
	}
	
	@GetMapping("/deletePurchaseOrderById/{id}")// 删除指定ID的采购订单
	public R deletepurchaseOrderById(
			@ApiParam(name = "id")
			@PathVariable String id) {
		try {
			purchaseOrderservice.deleteById(id);
			return R.ok().data("delete","success");
		} catch (Exception e) {
			return R.error().data("delete","fail");
		}
	}
	
	// 更新一条采购订单
	@GetMapping("/saveOnePurchaseOrder/{id}/{supplierId}/{purchaseOrderSpend}/{purchaseOrderDate}/{status}/{purchaseDetail}")
	public R SaveOnePurchaseOrder(
			@ApiParam(name = "id")
			@PathVariable String id,
			@ApiParam(name = "supplierId")
			@PathVariable String supplierId,
			@ApiParam(name = "purchaseOrderSpend")
			@PathVariable float purchaseOrderSpend,
			@ApiParam(name = "purchaseOrderDate")
			@PathVariable Date purchaseOrderDate,
			@ApiParam(name = "status")
			@PathVariable String status,
			@ApiParam(name = "purchaseDetail")
			@PathVariable List<String> purchaseDetail) {
		PurchaseOrder purchaseOrder = new PurchaseOrder();
		purchaseOrder.setId(id);
		purchaseOrder.setSupplierId(supplierId);
		purchaseOrder.setPurchaseOrderSpend(purchaseOrderSpend);
		purchaseOrder.setPurchaseOrderDate(purchaseOrderDate);
		purchaseOrder.setStatus(status);
		purchaseOrder.setPurchaseDetail(purchaseDetail);
		try {
			purchaseOrderservice.save(purchaseOrder);
			return R.ok().data("update","success");
		} catch (Exception e) {
			return R.error().data("update","fail");
		}
	}
}
