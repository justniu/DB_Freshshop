package com.freshshop.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.freshshop.demo.service.CommentService;
import com.freshshop.demo.utils.R;

@RestController
public class CommentController {
	@Autowired
	CommentService commentService;
	
	@GetMapping("/comments")
	public R comments() {
		return R.ok().data("items", commentService.getAllComments());
	}
}
