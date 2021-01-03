package com.freshshop.demo.entity;

import java.util.List;
import java.util.Map;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "userInfo")
public class UserInfo {
	@Id
	private String id;
	private String userName;
	private String userPassword;
	private String userTel;
	private String userEmail;
	private Map<String, String> userAddress;
	private List<String> userComment;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getUserTel() {
		return userTel;
	}
	public void setUserTel(String userTel) {
		this.userTel = userTel;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public Map<String, String> getUserAddress() {
		return userAddress;
	}
	public void setUserAddress(Map<String, String> userAddress) {
		this.userAddress = userAddress;
	}
	public List<String> getUserComment() {
		return userComment;
	}
	public void setUserComment(List<String> userComment) {
		this.userComment = userComment;
	}
	
	
}
