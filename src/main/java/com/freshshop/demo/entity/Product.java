package com.freshshop.demo.entity;

import java.util.Date;

public class Product {
    private String productId;
    private String productCategoryId;
    private Date updateTime;
    private String name;
    private int deleteStatus;
    private int publishStatus;
    private int newStatus;
    private int sale;
    private float productPrice;
    private float promotionPrice;
    private int stock;
    private int lowStock;
    private String unit;
    private float weight;
    private int promotionType;
    private Date promotionStartTime;
    private Date promotionEndTime;
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getProductCategoryId() {
		return productCategoryId;
	}
	public void setProductCategoryId(String productCategoryId) {
		this.productCategoryId = productCategoryId;
	}
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDeleteStatus() {
		return deleteStatus;
	}
	public void setDeleteStatus(int deleteStatus) {
		this.deleteStatus = deleteStatus;
	}
	public int getPublishStatus() {
		return publishStatus;
	}
	public void setPublishStatus(int publishStatus) {
		this.publishStatus = publishStatus;
	}
	public int getNewStatus() {
		return newStatus;
	}
	public void setNewStatus(int newStatus) {
		this.newStatus = newStatus;
	}
	public int getSale() {
		return sale;
	}
	public void setSale(int sale) {
		this.sale = sale;
	}
	public float getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(float productPrice) {
		this.productPrice = productPrice;
	}
	public float getPromotionPrice() {
		return promotionPrice;
	}
	public void setPromotionPrice(float promotionPrice) {
		this.promotionPrice = promotionPrice;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public int getLowStock() {
		return lowStock;
	}
	public void setLowStock(int lowStock) {
		this.lowStock = lowStock;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	public int getPromotionType() {
		return promotionType;
	}
	public void setPromotionType(int promotionType) {
		this.promotionType = promotionType;
	}
	public Date getPromotionStartTime() {
		return promotionStartTime;
	}
	public void setPromotionStartTime(Date promotionStartTime) {
		this.promotionStartTime = promotionStartTime;
	}
	public Date getPromotionEndTime() {
		return promotionEndTime;
	}
	public void setPromotionEndTime(Date promotionEndTime) {
		this.promotionEndTime = promotionEndTime;
	}
    
    
}
