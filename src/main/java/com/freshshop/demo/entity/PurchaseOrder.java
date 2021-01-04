package com.freshshop.demo.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;

@Document(collection = "purchaseOrder")
public class PurchaseOrder {
	@Id
	private String id;
	private String supplierId;
	private float purchaseOrderSpend;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date purchaseOrderDate;
	private String status;
	private List<String> purchaseDetail;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getSupplierId() {
		return supplierId;
	}
	public void setSupplierId(String supplierId) {
		this.supplierId = supplierId;
	}
	public float getPurchaseOrderSpend() {
		return purchaseOrderSpend;
	}
	public void setPurchaseOrderSpend(float purchaseOrderSpend) {
		this.purchaseOrderSpend = purchaseOrderSpend;
	}
	public Date getPurchaseOrderDate() {
		return purchaseOrderDate;
	}
	public void setPurchaseOrderDate(Date purchaseOrderDate) {
		this.purchaseOrderDate = purchaseOrderDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public List<String> getPurchaseDetail() {
		return purchaseDetail;
	}
	public void setPurchaseDetail(List<String> purchaseDetail) {
		this.purchaseDetail = purchaseDetail;
	}
	
	
}
