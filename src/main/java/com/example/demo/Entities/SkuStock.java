package com.example.demo.Entities;


import lombok.Data;

@Data
public class SkuStock {
    private String skuId;
    private String stock;
    private int lowStock;
    private String repositoryId;
    private String id;
}
