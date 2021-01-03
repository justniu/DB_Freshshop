package com.example.demo.Controller;

import com.example.demo.Dao.SupplierDao;
import com.example.demo.Entities.Supplier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.rsocket.context.LocalRSocketServerPort;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/supplier")
public class SupplierController {

    @Autowired
    private SupplierDao supplierDao;

    @PostMapping
    public String insertr(@RequestBody Supplier supplier){
//        Supplier supplier = new Supplier();
//        supplier.setSupplierId("1001");
//        supplier.setSupplierName("华南海鲜");
//        supplier.setSupplierTel("1234566");
//        supplier.setSupplierEmail("111@qq.com");
//        supplier.setSupplierAddressDetail("狮岭镇奥缇皮具厂欧州工业园");
//        supplier.setSupplierContactName("jack");
//        supplier.setSupplierProductClassId(2);
//        supplier.setSupplierRemark("");
//        supplier.setSupplierAddressId(1234);
        supplierDao.addSupplier(supplier);
        return "supplier!";
    }

    @GetMapping("/lists")
    public List<Supplier> queryAll(){
        List<Supplier> suppliers = supplierDao.queryAll();
        return suppliers;
    }

    @GetMapping("/list")
    public List<Supplier> query(@RequestParam Map<String, Object> param){
        return supplierDao.query(param);
    }
}
