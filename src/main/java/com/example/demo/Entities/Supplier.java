package com.example.demo.Entities;


import lombok.Data;

@Data
public class Supplier {
    private String supplierId;
    private String supplierName;
    private int supplierProductClassId;
    private String supplierContactName;
    private String supplierTel;
    private String supplierEmail;
    private int supplierAddressId;
    private String supplierAddressDetail;
    private String supplierRemark;
}
