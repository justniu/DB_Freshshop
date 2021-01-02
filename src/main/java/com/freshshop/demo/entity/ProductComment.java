package com.freshshop.demo.entity;

//import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

//import com.fasterxml.jackson.annotation.JsonFormat;

@Document(collection = "productComment")
public class ProductComment {
	@Id
	private String id;
//	@DateTimeFormat(pattern="yyyy-MM-dd")
//	@JsonFormat(timezone="GMT+8",pattern="yyyy-MM-dd")
	private String userId;
	private String productId;
	private float score;
	private String content;
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
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public float getScore() {
		return score;
	}
	public void setScore(float score) {
		this.score = score;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	
}
