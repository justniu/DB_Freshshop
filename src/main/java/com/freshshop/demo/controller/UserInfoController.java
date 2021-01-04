package com.freshshop.demo.controller;

import com.freshshop.demo.entity.UserInfo;
import com.freshshop.demo.service.UserInfoService;
import com.freshshop.demo.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserInfoController {
	@Autowired
	UserInfoService userInfoService;
	
	@GetMapping("/Infos") // 获取所有用户的信息
	public R findAllUserInfo() {
		return R.ok().data("items", userInfoService.findAll());
	}
	
	@GetMapping("/findById") // 根据ID查询指定用户信息
	public R findUserInfoById(@RequestBody UserInfo params) {
		return R.ok().data("items", userInfoService.findById(params.getId()));
	}
	
	@GetMapping("/findByUserName") // 根据用户名查询指定用户信息
	public R findUserInfoByUsername(@RequestBody UserInfo params) {
		return R.ok().data("items", userInfoService.findAllByUserName(params.getUserName()));
	}
	
	// 插入一条用户信息
	@GetMapping("/insert")
	public R insertUserInfo(@RequestBody UserInfo params) {
		try {
			userInfoService.insert(params);
			return R.ok().data("create","success");
		} catch (Exception e) {
			return R.error().data("create","fail");
		}
	}
	
	@GetMapping("/deleteById")// 删除指定ID的用户信息
	public R deleteUserInfoById(@RequestBody UserInfo params) {
		try {
			userInfoService.deleteById(params.getId());
			return R.ok().data("delete","success");
		} catch (Exception e) {
			return R.error().data("delete","fail");
		}
	}
	
	// 按照用户ID更新一条用户信息
	@GetMapping("/saveInfo")
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
