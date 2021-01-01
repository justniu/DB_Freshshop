package com.example.demo.Dao;

import com.example.demo.Entities.Supplier;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface SupplierDao {
    @Select("select * from supplier")
    @Results(id="resultMap", value = {
            @Result(property = "supplierId", column = "supplier_id"),
            @Result(property = "supplierName", column = "supplier_name"),
            @Result(property = "supplierProductClassId", column = "supplier_product_class_id"),
            @Result(property = "supplierContactName", column = "supplier_contact_name"),
            @Result(property = "supplierTel", column = "supplier_tel"),
            @Result(property = "supplierEmail", column = "supplier_email"),
            @Result(property = "supplierAddressId", column = "supplier_address_id"),
            @Result(property = "supplierAddressDetail", column = "supplier_address_detail"),
            @Result(property = "supplierRemark", column = "supplier_remark"),
    })
    List<Supplier> queryAll();
}
