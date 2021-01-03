package com.freshshop.demo.mapper;

import com.freshshop.demo.entity.StockLog;
import com.freshshop.demo.entity.Supplier;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;


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

    @SelectProvider(type=com.freshshop.demo.Provider.SupplierProvider.class, method = "selectWithParams")
    @ResultMap("resultMap")
    List<Supplier> query(Map<String, Object> param);

    @DeleteProvider(type=com.freshshop.demo.Provider.SupplierProvider.class, method = "dynamicDelete")
    int delete(Supplier supplier);

    @UpdateProvider(type=com.freshshop.demo.Provider.SupplierProvider.class, method = "dynamicUpdate")
    int update(Supplier supplier);

    @InsertProvider(type=com.freshshop.demo.Provider.SupplierProvider.class, method = "dynamicInsert")
    int insert(Supplier supplier);

    @SelectProvider(type=com.freshshop.demo.Provider.StockLogProvider.class, method = "dynamicSelect")
    @ResultMap("resultMap")
    List<StockLog> select(StockLog stockLog);
    
    // 根据供应商ID删除数据
    @Delete("delete from supplier where supplier_id = #{supplierId}")
    void deleteById(String supplierId);
}

