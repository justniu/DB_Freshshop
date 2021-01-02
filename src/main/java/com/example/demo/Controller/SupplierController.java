package com.example.demo.Controller;

import com.example.demo.Dao.SupplierDao;
import com.example.demo.Entities.Supplier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/supplier")
public class SupplierController {

    @Autowired
    private SupplierDao supplierDao;

    @GetMapping
    public String insertSupplier(){
        Supplier supplier = new Supplier();
        supplier.setSupplierId("1001");
        supplier.setSupplierName("华南海鲜");
        supplier.setSupplierTel("1234566");
        supplier.setSupplierEmail("111@qq.com");
        supplier.setSupplierAddressDetail("狮岭镇奥缇皮具厂欧州工业园");
        supplier.setSupplierContactName("jack");
        supplier.setSupplierProductClassId(2);
        supplier.setSupplierRemark("");
        supplier.setSupplierAddressId(1234);
        supplierDao.addSupplier(supplier);
        return "supplier!";
    }

    @GetMapping("/lists")
    public List<Supplier> queryAll(){
        List<Supplier> suppliers = supplierDao.queryAll();
        return suppliers;
    }
}
