package com.example.demo.Provider;

import org.apache.ibatis.jdbc.SQL;

import java.util.Map;

public class SupplierProvider {
    public String selectWithParams(Map<String, Object> param){
        return new SQL(){
            {
                SELECT("*");
                FROM("supplier");
                if(param.get("supplierId") != null){
                    WHERE("SUPPLIER_ID=#{supplierId}");
                }
                if(param.get("supplierName") != null){
                    WHERE("SUPPLIER_NAME=#{supplierName}");
                }
                if(param.get("supplierProductClassId") != null){
                    WHERE("SUPPLIER_PRODUCT_CLASS_ID=#{supplierProductClassId}");
                }
                if(param.get("supplierContactName") != null){
                    WHERE("SUPPLIER_CONTACT_NAME=#{supplierContactName}");
                }
                if(param.get("supplierTel") != null){
                    WHERE("SUPPLIER_TEL=#{supplierTel}");
                }
                if(param.get("supplierEmail") != null){
                    WHERE("SUPPLIER_EMAIL=#{supplierEmail}");
                }
                if(param.get("supplierAddressId") != null){
                    WHERE("SUPPLIER_ADDRESS_ID=#{supplierAddressId}");
                }
                if(param.get("supplierAddressDetail") != null){
                    WHERE("SUPPLIER_ADDRESS_DETAIL=#{supplierAddressDetail}");
                }
                if(param.get("supplierRemark") != null){
                    WHERE("SUPPLIER_REMARK=#{supplierRemark}");
                }
            }
        }.toString();
    }
}
