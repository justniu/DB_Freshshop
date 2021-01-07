package com.freshshop.demo.entity;

import java.util.List;


public class OrderAndDetail {
	// 主表
	private UserOrder userOrder;
	// 明细表
	private List<UserOrderDetail> userOrderDetail;
	public UserOrder getUserOrder() {
		return userOrder;
	}
	public void setUserOrder(UserOrder userOrder) {
		this.userOrder = userOrder;
	}
	public List<UserOrderDetail> getUserOrderDetail() {
		return userOrderDetail;
	}
	public void setUserOrderDetail(List<UserOrderDetail> userOrderDetail) {
		this.userOrderDetail = userOrderDetail;
	}
	
	
}
