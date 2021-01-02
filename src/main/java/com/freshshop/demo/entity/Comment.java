package com.freshshop.demo.entity;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonFormat;

@Document(collection = "userComment")
public class Comment {
	@Id
	private String id;
//	@DateTimeFormat(pattern="yyyy-MM-dd")
	@JsonFormat(timezone="GMT+8",pattern="yyyy-MM-dd")
	private Date commentTime;
	private int commentScore;
	private String commentContent;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Date getCommentTime() {
		return commentTime;
	}
	public void setCommentTime(Date commentTime) {
		this.commentTime = commentTime;
	}
	public int getCommentScore() {
		return commentScore;
	}
	public void setCommentScore(int commentScore) {
		this.commentScore = commentScore;
	}
	public String getCommentContent() {
		return commentContent;
	}
	public void setCommentContent(String commentContent) {
		this.commentContent = commentContent;
	}
//	@Override
//	public String toString() {
//		return "{" +
//              "id=" + id +
//              ", Time='" + commentTime + '\'' +
//              ", Score='" + commentScore + '\'' + 
//              ", Content='" + commentContent + '\'' +
//              '}';
//	}
}
