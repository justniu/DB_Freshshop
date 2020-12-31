package com.freshshop.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.freshshop.demo.entity.User;
import com.freshshop.demo.mapper.UserMapper;

@Service
public class UserService {
	@Autowired
	UserMapper userMapper;
	public List<User> getAllBooks() {
        return userMapper.getAllUsers();
    }
}
