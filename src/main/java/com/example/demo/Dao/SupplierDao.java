package com.example.demo.Dao;

import com.example.demo.Entities.Supplier;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
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

    @Insert("insert into supplier ( \"SUPPLIER_ID\",  \"SUPPLIER_NAME\",  \"SUPPLIER_PRODUCT_CLASS_ID\",  \"SUPPLIER_CONTACT_NAME\",  \"SUPPLIER_TEL\",  \"SUPPLIER_EMAIL\",  \"SUPPLIER_ADDRESS_ID\",  \"SUPPLIER_ADDRESS_DETAIL\",  \"SUPPLIER_REMARK\") values(#{supplierId}, #{supplierName}, #{supplierProductClassId}, #{supplierContactName}, #{supplierTel}, #{supplierEmail}, #{supplierAddressId}, #{supplierAddressDetail}, #{supplierRemark})"
    )
    int addSupplier(Supplier supplier);
}
