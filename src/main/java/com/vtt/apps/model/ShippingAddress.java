package com.vtt.apps.model;

public class ShippingAddress {
	private String address;
	private String city;
	private String postalCode;
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	
	@Override
	public String toString() {
		return "ShippingAddress [address=" + address + ", city=" + city + ", postalCode=" + postalCode + "]";
	}
	
	
	
}
