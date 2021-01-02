package com.freshshop.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.freshshop.demo.service.UserService;
import com.freshshop.demo.utils.R;

@RestController
public class UserController {
	@Autowired
	UserService userService;
	
	@GetMapping("/users")
	public R users() {
		System.out.println(R.ok().data("items",userService.getAllBooks()));
		return R.ok().data("items",userService.getAllBooks());
	}
}
