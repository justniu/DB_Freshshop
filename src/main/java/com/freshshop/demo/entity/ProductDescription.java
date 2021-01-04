package com.freshshop.demo.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "product")
public class ProductDescription {
	@Id
	private String id;
	private String pic;
	private String note;
	private String detailTitle;
	private String detailDescribe;
	private String detailHtml;
	private List<String> commentId;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPic() {
		return pic;
	}
	public void setPic(String pic) {
		this.pic = pic;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public String getDetailTitle() {
		return detailTitle;
	}
	public void setDetailTitile(String detailTitle) {
		this.detailTitle = detailTitle;
	}
	public String getDetailDescribe() {
		return detailDescribe;
	}
	public void setDetailDescribe(String detailDescribe) {
		this.detailDescribe = detailDescribe;
	}
	public String getDetailHtml() {
		return detailHtml;
	}
	public void setDetailHtml(String detailHtml) {
		this.detailHtml = detailHtml;
	}
	public List<String> getCommentId() {
		return commentId;
	}
	public void setCommentId(List<String> commentId) {
		this.commentId = commentId;
	}
	
}
