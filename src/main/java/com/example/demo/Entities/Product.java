package com.example.demo.Entities;

import lombok.Data;

import java.util.Date;

@Data
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
}
