package com.freshshop.demo.entity;

public class SkuStock {
    private String skuId;
    private int stock;
    private int lowStock;
    private String repositoryId;
    private String id;
	public String getSkuId() {
		return skuId;
	}
	public void setSkuId(String skuId) {
		this.skuId = skuId;
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
	public String getRepositoryId() {
		return repositoryId;
	}
	public void setRepositoryId(String repositoryId) {
		this.repositoryId = repositoryId;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
    
    
}
