package com.freshshop.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.freshshop.demo.entity.Comment;
import com.freshshop.demo.mapper.CommentMapper;

@Service
public class CommentService {
	@Autowired
	CommentMapper commentMapper;
	public List<Comment> getAllComments() {
        return commentMapper.findAll();
    }
}
