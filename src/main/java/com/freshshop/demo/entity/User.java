package com.freshshop.demo.entity;

public class User {
	private String userId;
	private String userName;
	private String userPassword;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
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
//	@Override
//	public String toString() {
//        return "{" +
//                "id=" + userId +
//                ", name='" + userName + '\'' +
//                ", password='" + userPassword + '\'' +
//                '}';
//    }
}
