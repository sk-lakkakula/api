package com.vtt.apps.model;

public class User {
	private String storeName;
	private String userName;
	private String password;
	private String email;
	private String contactNo;
	private String role;
	private String gstNo;
	public String getStoreName() {
		return storeName;
	}
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContactNo() {
		return contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getGstNo() {
		return gstNo;
	}
	public void setGstNo(String gstNo) {
		this.gstNo = gstNo;
	}
	
	@Override
	public String toString() {
		return "User [storeName=" + storeName + ", userName=" + userName + ", password=" + password + ", email=" + email
				+ ", contactNo=" + contactNo + ", role=" + role + ", gstNo=" + gstNo + "]";
	}
}
