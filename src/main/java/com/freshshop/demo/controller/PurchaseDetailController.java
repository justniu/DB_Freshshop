package com.freshshop.demo.controller;

import com.freshshop.demo.entity.PurchaseDetail;
import com.freshshop.demo.mapper.PurchaseDetailDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/purchaseDetail")
public class PurchaseDetailController {

    @Autowired
    private PurchaseDetailDao purchaseOrderDetailDao;

    @PostMapping
    public String insert(@RequestBody PurchaseDetail purchaseDetail){
//        PurchaseDetail purchaseOrderDetail = new PurchaseDetail();
//        purchaseOrderDetail.setOrderId("1");
//        purchaseOrderDetail.setCounts(100);
//        purchaseOrderDetail.setId("1");
//        purchaseOrderDetail.setPrice(5000);
//        purchaseOrderDetail.setDiscount(0.9f);
//        purchaseOrderDetail.setSpend(4500);
//        purchaseOrderDetail.setStockSkuId("1");
//        purchaseOrderDetail.setProductId("1");
//        purchaseOrderDetail.setProductSkuCode("63371141142");
        purchaseOrderDetailDao.addPurchaseOrderDetail(purchaseDetail);
        return "purchaseDetail";
    }

    @GetMapping("/lists")
    public List<PurchaseDetail> queryAll(){
        List<PurchaseDetail> purchaseDetails = purchaseOrderDetailDao.queryAll();
        return purchaseDetails;
    }

    @GetMapping("/list")
    public List<PurchaseDetail> query(@RequestParam Map<String, Object> param){
        return purchaseOrderDetailDao.query(param);
    }
}
