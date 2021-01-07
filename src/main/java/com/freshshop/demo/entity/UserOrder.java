package com.freshshop.demo.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;

@Document(collection = "userOrder")
public class UserOrder {
	@Id
	private String id;
	private String userId;
	private float userOrderSpend;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date userOrderDate;
	private String method;
	private String status;
	private String note;
	private List<String> userOrderDetail;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public float getUserOrderSpend() {
		return userOrderSpend;
	}
	public void setUserOrderSpend(float userOrderSpend) {
		this.userOrderSpend = userOrderSpend;
	}
	public Date getUserOrderDate() {
		return userOrderDate;
	}
	public void setUserOrderDate(Date userOrderDate) {
		this.userOrderDate = userOrderDate;
	}
	public String getMethod() {
		return method;
	}
	public void setMethod(String method) {
		this.method = method;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public List<String> getUserOrderDetail() {
		return userOrderDetail;
	}
	public void setUserOrderDetail(List<String> userOrderDetail) {
		this.userOrderDetail = userOrderDetail;
	}
	
	
}
