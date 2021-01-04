package com.freshshop.demo.entity;

import com.freshshop.demo.entity.UserOrderDetail;
import com.freshshop.demo.mapper.UserOrderDetailDao;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

@Data
public class OrderAndDetail {
     private String orderId;
     private UserOrderDetail userOrderDetail;
}
