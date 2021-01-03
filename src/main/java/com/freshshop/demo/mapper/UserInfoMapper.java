package com.freshshop.demo.mapper;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.freshshop.demo.entity.UserInfo;

public interface UserInfoMapper extends MongoRepository<UserInfo, String>{
	List<UserInfo> findAll(); // 查询所有用户信息
	Optional<UserInfo> findById(String id); // 根据指定ID查询对应用户信息
	List<UserInfo> findAllByUserName(String userName); // 按用户名查找用户信息
	@SuppressWarnings("unchecked")
	UserInfo insert(UserInfo userInfo); // 插入一条用户信息
	void deleteById(String id); // 根据ID删除对应用户信息
	@SuppressWarnings("unchecked")
	UserInfo save(UserInfo userInfo); // 根据ID修改对应商品的信息
	List<UserInfo> findByUserNameAndUserPassword(String userName, String userPassword); // 登录验证
}
