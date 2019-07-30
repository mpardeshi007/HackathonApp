package com.faceApp.hackathon.model;

import java.util.Date;

import javax.validation.constraints.Null;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class AccountHolder {

	@Id
	private String userId;
	private String faceId;
	private String name;
	private String accountNo;
	private Integer accountBalance;
	
	//@Null
	//private Date creationDate = new Date();
	
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getFaceId() {
		return faceId;
	}
	public void setFaceId(String faceId) {
		this.faceId = faceId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public Integer getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(Integer accountBalance) {
		this.accountBalance = accountBalance;
	}
	/*
	 * public Date getCreationDate() { return creationDate; } public void
	 * setCreationDate(Date creationDate) { this.creationDate = creationDate; }
	 */
}
