package com.freshshop.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.freshshop.demo.entity.UserInfo;
import com.freshshop.demo.service.UserInfoService;
import com.freshshop.demo.utils.R;

@RestController
public class UserInfoController {
	@Autowired
	UserInfoService userInfoService;
	
	@GetMapping("/userInfos") // 获取所有用户的信息
	public R findAllUserInfo() {
		return R.ok().data("items", userInfoService.findAll());
	}
	
	@GetMapping("/findUserInfoById") // 根据ID查询指定用户信息
	public R findUserInfoById(@RequestBody UserInfo params) {
		return R.ok().data("items", userInfoService.findById(params.getId()));
	}
	
	@GetMapping("/findUserInfoByUserName") // 根据用户名查询指定用户信息
	public R findUserInfoByUsername(@RequestBody UserInfo params) {
		return R.ok().data("items", userInfoService.findAllByUserName(params.getUserName()));
	}
	
	// 插入一条用户信息
	@GetMapping("/insertOneUserInfo")
	public R insertUserInfo(@RequestBody UserInfo params) {
		try {
			userInfoService.insert(params);
			return R.ok().data("create","success");
		} catch (Exception e) {
			return R.error().data("create","fail");
		}
	}
	
	@GetMapping("/deleteUserInfoById")// 删除指定ID的用户信息
	public R deleteUserInfoById(@RequestBody UserInfo params) {
		try {
			userInfoService.deleteById(params.getId());
			return R.ok().data("delete","success");
		} catch (Exception e) {
			return R.error().data("delete","fail");
		}
	}
	
	// 按照用户ID更新一条用户信息
	@GetMapping("/saveOneUserInfo")
	public R saveUserInfo(@RequestBody UserInfo params) {
		try {
			userInfoService.save(params);
			return R.ok().data("update","success");
		} catch (Exception e) {
			return R.error().data("update","fail");
		}
	}
	
	@GetMapping("/findByUserIdAndUserPassword")
	public R findByUserNameAndUserPassword(@RequestBody UserInfo params) {
		return R.ok().data("items", userInfoService.findByUserNameAndUserPassword(params.getUserName(),params.getUserPassword()));
	}
}
