package com.example.demo.Controller;

import com.example.demo.Dao.PurchaseDetailDao;
import com.example.demo.Entities.PurchaseDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/purchaseDetail")
public class PurchaseDetailController {

    @Autowired
    private PurchaseDetailDao purchaseOrderDetailDao;

    @GetMapping
    public String insert(){
        PurchaseDetail purchaseOrderDetail = new PurchaseDetail();
        purchaseOrderDetail.setOrderId("1");
        purchaseOrderDetail.setCounts(100);
        purchaseOrderDetail.setId("1");
        purchaseOrderDetail.setPrice(5000);
        purchaseOrderDetail.setDiscount(0.9f);
        purchaseOrderDetail.setSpend(4500);
        purchaseOrderDetail.setStockSkuId("1");
        purchaseOrderDetail.setProductId("1");
        purchaseOrderDetail.setProductSkuCode("63371141142");
        purchaseOrderDetailDao.addPurchaseOrderDetail(purchaseOrderDetail);
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
