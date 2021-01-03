package com.freshshop.demo.Provider;

import com.freshshop.demo.entity.Supplier;
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

    public String dynamicInsert(Supplier supplier){
        return new SQL(){
            {
                INSERT_INTO("supplier");
                if(supplier.getSupplierId() != null){
                    VALUES("SUPPLIER_ID", "#{supplierId}");
                }
                if(supplier.getSupplierName() != null){
                    VALUES("SUPPLIER_NAME", "#{supplierName}");
                }
                if(supplier.getSupplierProductClassId() >=0){
                    VALUES("SUPPLIER_PRODUCT_CLASS_ID", "#{supplierProductClassId}");
                }
                if(supplier.getSupplierContactName() != null){
                    VALUES("SUPPLIER_CONTACT_NAME", "#{supplierContactName}");
                }
                if(supplier.getSupplierTel() != null){
                    VALUES("SUPPLIER_TEL", "#{supplierTel}");
                }
                if(supplier.getSupplierEmail() != null){
                    VALUES("SUPPLIER_EMAIL", "#{supplierEmail}");
                }
                if(supplier.getSupplierAddressId() >=0){
                    VALUES("SUPPLIER_ADDRESS_ID", "#{supplierAddressId}");
                }
                if(supplier.getSupplierAddressDetail() != null){
                    VALUES("SUPPLIER_ADDRESS_DETAIL", "#{supplierAddressDetail}");
                }
                if(supplier.getSupplierRemark() != null){
                    VALUES("SUPPLIER_REMARK", "#{supplierRemark}");
                }
            }
        }.toString();
    }

    public String dynamicUpdate(Supplier supplier){
        return new SQL(){
            {
                UPDATE("supplier");
                if(supplier.getSupplierName() != null){
                    SET("SUPPLIER_NAME=#{supplierName}");
                }
                if(supplier.getSupplierProductClassId() >=0){
                    SET("SUPPLIER_PRODUCT_CLASS_ID=#{supplierProductClassId}");
                }
                if(supplier.getSupplierContactName() != null){
                    SET("SUPPLIER_CONTACT_NAME=#{supplierContactName}");
                }
                if(supplier.getSupplierTel() != null){
                    SET("SUPPLIER_TEL=#{supplierTel}");
                }
                if(supplier.getSupplierEmail() != null){
                    SET("SUPPLIER_EMAIL=#{supplierEmail}");
                }
                if(supplier.getSupplierAddressId() >=0){
                    SET("SUPPLIER_ADDRESS_ID=#{supplierAddressId}");
                }
                if(supplier.getSupplierAddressDetail() != null){
                    SET("SUPPLIER_ADDRESS_DETAIL=#{supplierAddressDetail}");
                }
                if(supplier.getSupplierRemark() != null){
                    SET("SUPPLIER_REMARK=#{supplierRemark}");
                }
                WHERE("SUPPLIER_ID=#{supplierId}");
            }
        }.toString();
    }

    public String dynamicDelete(Supplier supplier){
        return new SQL(){
            {
                DELETE_FROM("supplier");
                if(supplier.getSupplierId() != null){
                    WHERE("SUPPLIER_ID=#{supplierId}");
                }
                if(supplier.getSupplierName() != null){
                    WHERE("SUPPLIER_NAME=#{supplierName}");
                }
                if(supplier.getSupplierProductClassId() >=0){
                    WHERE("SUPPLIER_PRODUCT_CLASS_ID=#{supplierProductClassId}");
                }
                if(supplier.getSupplierContactName() != null){
                    WHERE("SUPPLIER_CONTACT_NAME=#{supplierContactName}");
                }
                if(supplier.getSupplierTel() != null){
                    WHERE("SUPPLIER_TEL=#{supplierTel}");
                }
                if(supplier.getSupplierEmail() != null){
                    WHERE("SUPPLIER_EMAIL=#{supplierEmail}");
                }
                if(supplier.getSupplierAddressId() >=0){
                    WHERE("SUPPLIER_ADDRESS_ID=#{supplierAddressId}");
                }
                if(supplier.getSupplierAddressDetail() != null){
                    WHERE("SUPPLIER_ADDRESS_DETAIL=#{supplierAddressDetail}");
                }
                if(supplier.getSupplierRemark() != null){
                    WHERE("SUPPLIER_REMARK=#{supplierRemark}");
                }
            }
        }.toString();
    }

    public String dynamicSelect(Supplier supplier){
        return new SQL(){
            {
                SELECT("*");
                FROM("supplier");
                if(supplier.getSupplierId() != null){
                    WHERE("SUPPLIER_ID=#{supplierId}");
                }
                if(supplier.getSupplierName() != null){
                    WHERE("SUPPLIER_NAME=#{supplierName}");
                }
                if(supplier.getSupplierProductClassId() >=0){
                    WHERE("SUPPLIER_PRODUCT_CLASS_ID=#{supplierProductClassId}");
                }
                if(supplier.getSupplierContactName() != null){
                    WHERE("SUPPLIER_CONTACT_NAME=#{supplierContactName}");
                }
                if(supplier.getSupplierTel() != null){
                    WHERE("SUPPLIER_TEL=#{supplierTel}");
                }
                if(supplier.getSupplierEmail() != null){
                    WHERE("SUPPLIER_EMAIL=#{supplierEmail}");
                }
                if(supplier.getSupplierAddressId() >=0){
                    WHERE("SUPPLIER_ADDRESS_ID=#{supplierAddressId}");
                }
                if(supplier.getSupplierAddressDetail() != null){
                    WHERE("SUPPLIER_ADDRESS_DETAIL=#{supplierAddressDetail}");
                }
                if(supplier.getSupplierRemark() != null){
                    WHERE("SUPPLIER_REMARK=#{supplierRemark}");
                }
            }
        }.toString();
    }
}
