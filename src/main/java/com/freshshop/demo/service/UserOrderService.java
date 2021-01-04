package com.freshshop.demo.service;

import com.freshshop.demo.entity.UserOrder;
import com.freshshop.demo.mapper.UserOrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserOrderService {
	@Autowired
	UserOrderMapper userOrderMapper;
	
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
}
