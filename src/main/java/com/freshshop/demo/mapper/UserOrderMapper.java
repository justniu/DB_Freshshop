package com.freshshop.demo.mapper;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.freshshop.demo.entity.UserOrder;

public interface UserOrderMapper  extends MongoRepository<UserOrder, String>{
	List<UserOrder> findAll(); // 查询所有销售订单
	Optional<UserOrder> findById(String id); // 根据指定ID查询对应销售信息
	List<UserOrder> findAllByUserId(String userId); // 根据指定用户ID查询对应销售信息
	@SuppressWarnings("unchecked")
	UserOrder insert(UserOrder userOrder); // 插入一条销售信息
	void deleteById(String id); // 根据ID删除对应销售订单
	@SuppressWarnings("unchecked")
	UserOrder save(UserOrder userOrder); // 根据ID修改对应订单的销售信息
}
