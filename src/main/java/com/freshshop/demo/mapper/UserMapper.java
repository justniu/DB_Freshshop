package com.freshshop.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.freshshop.demo.entity.User;

public interface UserMapper {
	@Select("select * from customer")
	List<User> getAllUsers();
}
