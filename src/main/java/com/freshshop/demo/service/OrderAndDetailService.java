package com.freshshop.demo.service;

import com.freshshop.demo.entity.OrderAndDetail;
import com.freshshop.demo.entity.UserOrderDetail;
import com.freshshop.demo.mapper.UserOrderDetailDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class OrderAndDetailService {
    @Autowired
    private UserOrderDetailDao userOrderDetailDao;
    @Transactional
    public void update(OrderAndDetail orderAndDetail){
        orderAndDetail.getUserOrderDetail().setUserOrderDetailOrderId(orderAndDetail.getOrderId());
        userOrderDetailDao.addUserOrderDetail(orderAndDetail.getUserOrderDetail());
    }
}
