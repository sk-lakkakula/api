package com.vtt.apps.model;

import java.util.List;

public class Order {
	private User user;
	private Store store;
	private List<OrderItem> orderItems;
	private String shippingPrice;
	private String totalPrice;
	private PaymentDetails paymentDetails;
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Store getStore() {
		return store;
	}
	public void setStore(Store store) {
		this.store = store;
	}
	public List<OrderItem> getOrderItems() {
		return orderItems;
	}
	public void setOrderItems(List<OrderItem> orderItems) {
		this.orderItems = orderItems;
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
	public PaymentDetails getPaymentDetails() {
		return paymentDetails;
	}
	public void setPaymentDetails(PaymentDetails paymentDetails) {
		this.paymentDetails = paymentDetails;
	}
	
	@Override
	public String toString() {
		return "Order [user=" + user + ", store=" + store + ", orderItems=" + orderItems + ", shippingPrice="
				+ shippingPrice + ", totalPrice=" + totalPrice + ", paymentDetails=" + paymentDetails + "]";
	}
}
