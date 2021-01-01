package com.example.demo.Entities;


import lombok.Data;

@Data
public class UserOrderDetail {
    private String userOrderDetailId;
    private String userOrderDetailOrderId;
    private String userOrderDetailProductId;
    private int userOrderDetailNumber;
    private float userOrderDetailPrice;
    private float userOrderDetailDiscount;
    private float userOrderDetailSpend;
    private String productSkuCode;
    private String stockSkuId;
}
