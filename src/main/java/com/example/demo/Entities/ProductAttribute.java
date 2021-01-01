package com.example.demo.Entities;

import lombok.Data;

@Data
public class ProductAttribute {
    private String id;
    private String productAttributeCategoryId;
    private String name;
    private Boolean attType;
}
