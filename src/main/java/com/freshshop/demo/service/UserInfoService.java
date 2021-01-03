package com.freshshop.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.freshshop.demo.entity.UserInfo;
import com.freshshop.demo.mapper.UserInfoMapper;

@Service
public class UserInfoService {
	@Autowired
	UserInfoMapper userInfoMapper;
	
	public List<UserInfo> findAll(){
		return userInfoMapper.findAll();
	}
	
	public Optional<UserInfo> findById(String id){
		return userInfoMapper.findById(id);
	}
	
	public List<UserInfo> findAllByUserName(String userName){
		return userInfoMapper.findAllByUserName(userName);
	}
	
	public UserInfo insert(UserInfo userInfo) {
		return userInfoMapper.insert(userInfo);
	}
	
	public void deleteById(String id) {
		userInfoMapper.deleteById(id);
		return ;
	}
	
	public UserInfo save(UserInfo userInfo) {
		return userInfoMapper.save(userInfo);
	}
	
	public List<UserInfo> findByUserNameAndUserPassword(String userName, String userPassword){
		return userInfoMapper.findByUserNameAndUserPassword(userName, userPassword);
	}
}
