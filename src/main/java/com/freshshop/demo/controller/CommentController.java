package com.freshshop.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.freshshop.demo.entity.Comment;
import com.freshshop.demo.service.CommentService;

@RestController
public class CommentController {
	@Autowired
	CommentService commentService;
	
	@GetMapping("/comments")
	public List<Comment> comments() {
		List<Comment> comments = commentService.getAllComments();
		return comments;
	}
}
