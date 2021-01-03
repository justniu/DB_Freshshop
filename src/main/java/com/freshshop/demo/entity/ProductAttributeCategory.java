package com.freshshop.demo.entity;

public class ProductAttributeCategory {
    private String id;
    private String productId;
    private int attributeCount;
    private int paramCount;

    public void setAttributeCount(int i) {
    }

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public int getParamCount() {
		return paramCount;
	}

	public void setParamCount(int paramCount) {
		this.paramCount = paramCount;
	}

	public int getAttributeCount() {
		return attributeCount;
	}
}
