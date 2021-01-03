package com.freshshop.demo.entity;

public class PurchaseDetail {
    private String id;
    private String orderId;
    private String productId;
    private int counts;
    private float price;
    private float discount;
    private float spend;
    private String productSkuCode;
    private String stockSkuId;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public int getCounts() {
		return counts;
	}
	public void setCounts(int counts) {
		this.counts = counts;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public float getDiscount() {
		return discount;
	}
	public void setDiscount(float discount) {
		this.discount = discount;
	}
	public float getSpend() {
		return spend;
	}
	public void setSpend(float spend) {
		this.spend = spend;
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
