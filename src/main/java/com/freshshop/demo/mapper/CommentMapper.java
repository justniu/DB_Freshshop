package com.freshshop.demo.mapper;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.freshshop.demo.entity.Comment;

public interface CommentMapper extends MongoRepository<Comment, String>{
	List<Comment> findAll();
}
