package com.vtt.apps.model;

public class OrderItem {
	private String name;
	private String description;
	private String quantityOrdered;
	private String imageUrl;
	private String orderType;
	private String unitPrice;
	private Product product;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getQuantityOrdered() {
		return quantityOrdered;
	}
	public void setQuantityOrdered(String quantityOrdered) {
		this.quantityOrdered = quantityOrdered;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public String getOrderType() {
		return orderType;
	}
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}
	public String getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(String unitPrice) {
		this.unitPrice = unitPrice;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	@Override
	public String toString() {
		return "OrderItem [name=" + name + ", description=" + description + ", quantityOrdered=" + quantityOrdered
				+ ", imageUrl=" + imageUrl + ", orderType=" + orderType + ", unitPrice=" + unitPrice + ", product="
				+ product + "]";
	}

}
