package com.freshshop.demo.entity;

public class UserOrderDetail {
    private String userOrderDetailId;
    private String userOrderDetailOrderId;
    private String userOrderDetailProductId;
    private int userOrderDetailNumber;
    private float userOrderDetailPrice;
    private float userOrderDetailDiscount;
    private float userOrderDetailSpend;
    private String productSkuCode;
    private String stockSkuId;
	public String getUserOrderDetailId() {
		return userOrderDetailId;
	}
	public void setUserOrderDetailId(String userOrderDetailId) {
		this.userOrderDetailId = userOrderDetailId;
	}
	public String getUserOrderDetailOrderId() {
		return userOrderDetailOrderId;
	}
	public void setUserOrderDetailOrderId(String userOrderDetailOrderId) {
		this.userOrderDetailOrderId = userOrderDetailOrderId;
	}
	public String getUserOrderDetailProductId() {
		return userOrderDetailProductId;
	}
	public void setUserOrderDetailProductId(String userOrderDetailProductId) {
		this.userOrderDetailProductId = userOrderDetailProductId;
	}
	public int getUserOrderDetailNumber() {
		return userOrderDetailNumber;
	}
	public void setUserOrderDetailNumber(int userOrderDetailNumber) {
		this.userOrderDetailNumber = userOrderDetailNumber;
	}
	public float getUserOrderDetailPrice() {
		return userOrderDetailPrice;
	}
	public void setUserOrderDetailPrice(float userOrderDetailPrice) {
		this.userOrderDetailPrice = userOrderDetailPrice;
	}
	public float getUserOrderDetailDiscount() {
		return userOrderDetailDiscount;
	}
	public void setUserOrderDetailDiscount(float userOrderDetailDiscount) {
		this.userOrderDetailDiscount = userOrderDetailDiscount;
	}
	public float getUserOrderDetailSpend() {
		return userOrderDetailSpend;
	}
	public void setUserOrderDetailSpend(float userOrderDetailSpend) {
		this.userOrderDetailSpend = userOrderDetailSpend;
	}
	public String getProductSkuCode() {
		return productSkuCode;
	}
	public void setProductSkuCode(String productSkuCode) {
		this.productSkuCode = productSkuCode;
	}
	public String getStockSkuId() {
		return stockSkuId;
	}
	public void setStockSkuId(String stockSkuId) {
		this.stockSkuId = stockSkuId;
	}
    
    
}
