package com.freshshop.demo.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.freshshop.demo.entity.UserOrder;
import com.freshshop.demo.service.UserOrderService;
import com.freshshop.demo.utils.R;

import io.swagger.annotations.ApiParam;

@RestController
public class UserOrderController {
	@Autowired
	UserOrderService userOrderservice;
	
	@GetMapping("/userOrders") // 获取所有销售订单
	public R findAlluserOrder() {
		return R.ok().data("items", userOrderservice.findAll());
	}
	
	// http://localhost:8014/findUserOrderById/5ff03e300e3a508e69ba1bc7
	@GetMapping("/findUserOrderById/{id}") // 根据ID查询指定销售订单
	public R findUserOrderById(
			@ApiParam(name = "id")
			@PathVariable String id) {
		return R.ok().data("items", userOrderservice.findById(id));
	}
	
	// http://localhost:8014/findProductOrderByUserId/5fefff260e3a508e69ba1bbf
	@GetMapping("/findProductOrderByUserId/{userId}") // 根据用户ID查询指定销售订单
	public R findPurchaseOrderByUserId(
			@ApiParam(name = "userId")
			@PathVariable String userId) {
		return R.ok().data("items", userOrderservice.findAllByUserId(userId));
	}
	
	// 插入一条销售订单
	@GetMapping("/insertOneUserOrder/{id}/{userId}/{userOrderSpend}/{userOrderDate}/{method}/{status}/{note}/{userOrderDetail}")
	public R insertOneUserOrder(
			@ApiParam(name = "id")
			@PathVariable String id,
			@ApiParam(name = "userId")
			@PathVariable String userId,
			@ApiParam(name = "userOrderSpend")
			@PathVariable float userOrderSpend,
			@ApiParam(name = "userOrderDate")
			@PathVariable Date userOrderDate,
			@ApiParam(name = "method")
			@PathVariable String method,
			@ApiParam(name = "status")
			@PathVariable String status,
			@ApiParam(name = "note")
			@PathVariable String note,
			@ApiParam(name = "userOrderDetail")
			@PathVariable List<String> userOrderDetail) {
		UserOrder userOrder = new UserOrder();
		userOrder.setId(id);
		userOrder.setUserId(userId);
		userOrder.setUserOrderSpend(userOrderSpend);
		userOrder.setUserOrderDate(userOrderDate);
		userOrder.setMethod(method);
		userOrder.setStatus(status);
		userOrder.setNote(note);
		userOrder.setUserOrderDetail(userOrderDetail);
		try {
			userOrderservice.insert(userOrder);
			return R.ok().data("create","success");
		} catch (Exception e) {
			return R.error().data("create","fail");
		}
	}
	
	@GetMapping("/deleteUserOrderById/{id}")// 删除指定ID的销售订单
	public R deleteUserOrderById(
			@ApiParam(name = "id")
			@PathVariable String id) {
		try {
			userOrderservice.deleteById(id);
			return R.ok().data("delete","success");
		} catch (Exception e) {
			return R.error().data("delete","fail");
		}
	}
	
	// 更新一条销售订单
	@GetMapping("/saveOneUserOrder/{id}/{userId}/{userOrderSpend}/{userOrderDate}/{method}/{status}/{note}/{userOrderDetail}")
	public R saveOneUserOrder(
			@ApiParam(name = "id")
			@PathVariable String id,
			@ApiParam(name = "userId")
			@PathVariable String userId,
			@ApiParam(name = "userOrderSpend")
			@PathVariable float userOrderSpend,
			@ApiParam(name = "userOrderDate")
			@PathVariable Date userOrderDate,
			@ApiParam(name = "method")
			@PathVariable String method,
			@ApiParam(name = "status")
			@PathVariable String status,
			@ApiParam(name = "note")
			@PathVariable String note,
			@ApiParam(name = "userOrderDetail")
			@PathVariable List<String> userOrderDetail) {
		UserOrder userOrder = new UserOrder();
		userOrder.setId(id);
		userOrder.setUserId(userId);
		userOrder.setUserOrderSpend(userOrderSpend);
		userOrder.setUserOrderDate(userOrderDate);
		userOrder.setMethod(method);
		userOrder.setStatus(status);
		userOrder.setNote(note);
		userOrder.setUserOrderDetail(userOrderDetail);
		try {
			userOrderservice.save(userOrder);
			return R.ok().data("create","success");
		} catch (Exception e) {
			return R.error().data("create","fail");
		}
	}
}
