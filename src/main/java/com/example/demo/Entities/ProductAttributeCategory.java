package com.example.demo.Entities;

import lombok.Data;

@Data
public class ProductAttributeCategory {
    private String id;
    private String productId;
    private int attributeCount;
    private int paramCount;

    public void setAttributeCount(int i) {
    }
}
