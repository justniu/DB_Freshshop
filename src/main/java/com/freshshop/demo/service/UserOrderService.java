package com.freshshop.demo.service;

import com.freshshop.demo.entity.Product;
import com.freshshop.demo.entity.UserOrder;
import com.freshshop.demo.entity.UserOrderDetail;
import com.freshshop.demo.mapper.ProductDao;
import com.freshshop.demo.mapper.UserOrderDetailDao;
import com.freshshop.demo.mapper.UserOrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;

@Service
public class UserOrderService {
	@Autowired
	UserOrderMapper userOrderMapper;
	@Autowired
	UserOrderDetailDao userOrderDetailDao;
	@Autowired
	ProductDao productDao;
	
	public List<UserOrder> findAll(){
		return userOrderMapper.findAll();
	}
	
	public Optional<UserOrder> findById(String id){
		return userOrderMapper.findById(id);
	}
	
	public List<UserOrder> findAllByUserId(String userId){
		return userOrderMapper.findAllByUserId(userId);
	}
	
	public UserOrder insert(UserOrder purchaseOrder) {
		return userOrderMapper.insert(purchaseOrder);
	}
	
	public void deleteById(String id) {
		userOrderMapper.deleteById(id);
		return ;
	}
	
	public UserOrder save(UserOrder userOrder) {
		return userOrderMapper.save(userOrder);
	}

	@Transactional
	public Map<Object, Object> queryAllDetail(String userId){
		HashMap<Object, Object> objectObjectHashMap1 = new HashMap<>();
		List<UserOrder> all = userOrderMapper.findAllByUserId(userId);
		for(UserOrder userOrder:all){
			if(userOrder.getUserOrderDetail()!=null){
				for(String orderDetailID:userOrder.getUserOrderDetail()){
					HashMap<String, Object> objectObjectHashMap = new HashMap<>();
					objectObjectHashMap.put("userOrderDetailId", orderDetailID);
					List<Product> productById = productDao.findProductById(userOrderDetailDao.query(objectObjectHashMap).get(0).getUserOrderDetailProductId());
					objectObjectHashMap1.put(orderDetailID, productById);
				}
			}
		}
		return objectObjectHashMap1;
	}
}
