package com.freshshop.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.freshshop.demo.entity.User;
import com.freshshop.demo.service.UserService;
import com.freshshop.demo.utils.R;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import io.swagger.annotations.ApiParam;

@RestController
public class UserController {
	@Autowired
	UserService userService;
	
	// http://localhost:8014/users/2/2
	@GetMapping("/users/{pageNum}/{pageSize}")
	public R users( @ApiParam(name = "pageNum")
					@PathVariable int pageNum, 
					@ApiParam(name = "pageSize")
					@PathVariable int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		return R.ok().data("items",new PageInfo<User>(userService.getAllBooks()));
	}
}
