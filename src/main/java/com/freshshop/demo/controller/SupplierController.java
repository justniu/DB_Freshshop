package com.freshshop.demo.controller;

import com.freshshop.demo.entity.Supplier;
import com.freshshop.demo.mapper.SupplierDao;
import com.freshshop.demo.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/supplier")
public class SupplierController {

    @Autowired
    private SupplierDao supplierDao;

    @GetMapping("/insert")
    public R insertr(@RequestBody Supplier supplier){
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
    	try {
    		supplierDao.addSupplier(supplier);
    		return R.ok().data("insert","success");
		} catch (Exception e) {
			return R.error().data("insert","fail");
		}
        
    }

    @GetMapping("/lists")
    public R queryAll(){
        return R.ok().data("items",supplierDao.queryAll());
    }

    @GetMapping("/list")
    public List<Supplier> query(@RequestParam Map<String, Object> param){
        return supplierDao.query(param);
    }
    
    @GetMapping("/delete")
    public R delete(@RequestBody Supplier supplier){
    	try {
    		supplierDao.deleteById(supplier.getSupplierId());
            return R.ok().data("delete","success");
		} catch (Exception e) {
			return R.error().data("delete","fail");
		}
        
    }
    
    @GetMapping("/update") // 更新
    public R update(@RequestBody Supplier supplier){
    	try {
    		supplierDao.update(supplier);
            return R.ok().data("update","success");
		} catch (Exception e) {
			return R.error().data("update","fail");
		}
        
    }
}
