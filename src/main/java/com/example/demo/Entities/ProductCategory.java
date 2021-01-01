package com.example.demo.Entities;


import lombok.Data;

@Data
public class ProductCategory {
    private String productCategoryId;
    private String parentId;
    private String name;
    private String categoryLevel;
    private int productCount;
    private String productUnit;
    private String keywords;
    private String description;
}
