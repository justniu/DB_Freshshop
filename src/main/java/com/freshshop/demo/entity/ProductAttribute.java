package com.freshshop.demo.entity;

public class ProductAttribute {
    private String id;
    private String productAttributeCategoryId;
    private String name;
    private Boolean attType;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getProductAttributeCategoryId() {
		return productAttributeCategoryId;
	}
	public void setProductAttributeCategoryId(String productAttributeCategoryId) {
		this.productAttributeCategoryId = productAttributeCategoryId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Boolean getAttType() {
		return attType;
	}
	public void setAttType(Boolean attType) {
		this.attType = attType;
	}
    
    
}
