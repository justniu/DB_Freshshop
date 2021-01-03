package com.freshshop.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.freshshop.demo.entity.UserOrderDetail;
import com.freshshop.demo.mapper.UserOrderDetailDao;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/userOrder")
public class UserOrderDetailController {

    @Autowired
    private UserOrderDetailDao userOrderDetailDao;

    @PostMapping
    public String insert(@RequestBody UserOrderDetail userOrderDetail){
//        UserOrderDetail userOrderDetail = new UserOrderDetail();
//        userOrderDetail.setUserOrderDetailId("1");
//        userOrderDetail.setUserOrderDetailDiscount(0.9f);
//        userOrderDetail.setUserOrderDetailPrice(100);
//        userOrderDetail.setUserOrderDetailProductId("26");
//        userOrderDetail.setStockSkuId("4");
//        userOrderDetail.setProductSkuCode("100005368902");
//        userOrderDetail.setUserOrderDetailSpend(90);
//        userOrderDetail.setUserOrderDetailNumber(1);
//        userOrderDetail.setUserOrderDetailOrderId("5ff03e300e3a508e69ba1bc7");
        userOrderDetailDao.addUserOrderDetail(userOrderDetail);
        return "userOrder";
    }
    @GetMapping("/lists")
    public List<UserOrderDetail> queryAll(){
        List<UserOrderDetail> userOrderDetails = userOrderDetailDao.queryAll();
        return userOrderDetails;
    }

    @GetMapping("/list")
    public List<UserOrderDetail> query(@RequestParam Map<String, Object> param){
        return userOrderDetailDao.query(param);
    }
}
