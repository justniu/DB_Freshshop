package com.freshshop.demo.controller;

import com.freshshop.demo.entity.UserOrder;
import com.freshshop.demo.service.UserOrderService;
import com.freshshop.demo.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserOrderController {
	@Autowired
	UserOrderService userOrderservice;
	
	@GetMapping("/userOrders") // 获取所有销售订单
	public R findAlluserOrder() {
		return R.ok().data("items", userOrderservice.findAll());
	}
	
	@GetMapping("/findUserOrderById") // 根据ID查询指定销售订单
	public R findUserOrderById(@RequestBody UserOrder params) {
		return R.ok().data("items", userOrderservice.findById(params.getId()));
	}
	
	@GetMapping("/findProductOrderByUserId") // 根据用户ID查询指定销售订单
	public R findPurchaseOrderByUserId(@RequestBody UserOrder params) {
		return R.ok().data("items", userOrderservice.findAllByUserId(params.getUserId()));
	}
	
	// 插入一条销售订单
	@GetMapping("/insertOneUserOrder")
	public R insertOneUserOrder(@RequestBody UserOrder params) {
		try {
			userOrderservice.insert(params);
			return R.ok().data("create","success");
		} catch (Exception e) {
			return R.error().data("create","fail");
		}
	}
	
	@GetMapping("/deleteUserOrderById")// 删除指定ID的销售订单
	public R deleteUserOrderById(@RequestBody UserOrder params) {
		try {
			userOrderservice.deleteById(params.getId());
			return R.ok().data("delete","success");
		} catch (Exception e) {
			return R.error().data("delete","fail");
		}
	}
	
	// 更新一条销售订单
	@GetMapping("/saveOneUserOrder")
	public R saveOneUserOrder(@RequestBody UserOrder params) {
		try {
			userOrderservice.save(params);
			return R.ok().data("update","success");
		} catch (Exception e) {
			return R.error().data("update","fail");
		}
	}
}
