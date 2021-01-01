package com.example.demo.Entities;

import lombok.Data;

@Data
public class PurchaseOrderDetail {
    private String id;
    private String orderId;
    private String productId;
    private int counts;
    private float price;
    private float discount;
    private float spend;
    private String productSkuId;
    private String stockSkuId;
}
