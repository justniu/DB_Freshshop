package com.freshshop.demo.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.freshshop.demo.entity.UserInfo;
import com.freshshop.demo.service.UserInfoService;
import com.freshshop.demo.utils.R;

import io.swagger.annotations.ApiParam;

@RestController
public class UserInfoController {
	@Autowired
	UserInfoService userInfoService;
	
	@GetMapping("/userInfos") // 获取所有用户的信息
	public R findAllUserInfo() {
		return R.ok().data("items", userInfoService.findAll());
	}
	
	// http://localhost:8014/findUserInfoById/5fefff260e3a508e69ba1bbf
	@GetMapping("/findUserInfoById/{id}") // 根据ID查询指定用户信息
	public R findUserInfoById(
			@ApiParam(name = "id")
			@PathVariable String id) {
		return R.ok().data("items", userInfoService.findById(id));
	}
	
	// http://localhost:8014/findUserInfoByUserName/Horatio
	@GetMapping("/findUserInfoByUserName/{username}") // 根据用户名查询指定用户信息
	public R findUserInfoByUsername(
			@ApiParam(name = "username")
			@PathVariable String username) {
		return R.ok().data("items", userInfoService.findAllByUserName(username));
	}
	
	// 插入一条用户信息
	@GetMapping("/insertOneUserInfo/{id}/{userName}/{userPassword}/{userTel}/{userEmail}/{userAddress}/{userComment}")
	public R insertUserInfo(
			@ApiParam(name = "id")
			@PathVariable String id,
			@ApiParam(name = "userName")
			@PathVariable String userName,
			@ApiParam(name = "userPassword")
			@PathVariable String userPassword,
			@ApiParam(name = "userTel")
			@PathVariable String userTel,
			@ApiParam(name = "userEmail")
			@PathVariable String userEmail,
			@ApiParam(name = "userAddress")
			@PathVariable Map<String, String> userAddress,
			@ApiParam(name = "userComment")
			@PathVariable List<String> userComment) {
		UserInfo userInfo = new UserInfo();
		userInfo.setId(id);
		userInfo.setUserName(userName);
		userInfo.setUserPassword(userPassword);
		userInfo.setUserTel(userTel);
		userInfo.setUserEmail(userEmail);
		userInfo.setUserAddress(userAddress);
		userInfo.setUserComment(userComment);
		try {
			userInfoService.insert(userInfo);
			return R.ok().data("create","success");
		} catch (Exception e) {
			return R.error().data("create","fail");
		}
	}
	
	@GetMapping("/deleteUserInfoById/{id}")// 删除指定ID的用户信息
	public R deleteUserInfoById(
			@ApiParam(name = "id")
			@PathVariable String id) {
		try {
			userInfoService.deleteById(id);
			return R.ok().data("delete","success");
		} catch (Exception e) {
			return R.error().data("delete","fail");
		}
	}
	
	// 按照用户ID更新一条用户信息
	@GetMapping("/saveOneUserInfo/{id}/{userName}/{userPassword}/{userTel}/{userEmail}/{userAddress}/{userComment}")
	public R saveUserInfo(
			@ApiParam(name = "id")
			@PathVariable String id,
			@ApiParam(name = "userName")
			@PathVariable String userName,
			@ApiParam(name = "userPassword")
			@PathVariable String userPassword,
			@ApiParam(name = "userTel")
			@PathVariable String userTel,
			@ApiParam(name = "userEmail")
			@PathVariable String userEmail,
			@ApiParam(name = "userAddress")
			@PathVariable Map<String, String> userAddress,
			@ApiParam(name = "userComment")
			@PathVariable List<String> userComment) {
		UserInfo userInfo = new UserInfo();
		userInfo.setId(id);
		userInfo.setUserName(userName);
		userInfo.setUserPassword(userPassword);
		userInfo.setUserTel(userTel);
		userInfo.setUserEmail(userEmail);
		userInfo.setUserAddress(userAddress);
		userInfo.setUserComment(userComment);
		try {
			userInfoService.save(userInfo);
			return R.ok().data("update","success");
		} catch (Exception e) {
			return R.error().data("update","fail");
		}
	}
	
	// http://localhost:8014/findByUserIdAndUserPassword/Horatio/Horatio
	// 验证用户名和密码
	@GetMapping("/findByUserIdAndUserPassword/{userName}/{userPassword}")
	public R findByUserNameAndUserPassword(
			@ApiParam(name = "userName")
			@PathVariable String userName,
			@ApiParam(name = "userPassword")
			@PathVariable String userPassword) {
		return R.ok().data("items", userInfoService.findByUserNameAndUserPassword(userName,userPassword));
	}
}
