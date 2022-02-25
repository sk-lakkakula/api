package com.vtt.apps.model;

import java.time.LocalDateTime;
import java.util.Date;

public class InvoiceRequest {

	private String name;
	private String orderNo;
	private LocalDateTime arrivingDate;
	private LocalDateTime orderDate;
	private String address;
	private String itemsPrice;
	private String shippingPrice;
	private String totalPrice;
	private String to;
	private String subject;
	private String from;
	
	public LocalDateTime getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(LocalDateTime orderDate) {
		this.orderDate = orderDate;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public LocalDateTime getArrivingDate() {
		return arrivingDate;
	}
	public void setArrivingDate(LocalDateTime arrivingDate) {
		this.arrivingDate = arrivingDate;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getItemsPrice() {
		return itemsPrice;
	}
	public void setItemsPrice(String itemsPrice) {
		this.itemsPrice = itemsPrice;
	}
	public String getShippingPrice() {
		return shippingPrice;
	}
	public void setShippingPrice(String shippingPrice) {
		this.shippingPrice = shippingPrice;
	}
	public String getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(String totalPrice) {
		this.totalPrice = totalPrice;
	}
	@Override
	public String toString() {
		return "InvoiceRequest [name=" + name + ", orderNo=" + orderNo + ", arrivingDate=" + arrivingDate + ", address="
				+ address + ", itemsPrice=" + itemsPrice + ", shippingPrice=" + shippingPrice + ", totalPrice="
				+ totalPrice + ", to=" + to + ", subject=" + subject + ", from=" + from + "]";
	}
	
}

