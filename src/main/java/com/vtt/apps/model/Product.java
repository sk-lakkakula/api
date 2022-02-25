package com.vtt.apps.model;

public class Product {
	private String name;
	private String description;
	private String brand;
	private String imageUrl;
	private String countInStock;
	private String isTaxable;
	private String taxPercent;
	private String isVttBestSeller;
	
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
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public String getCountInStock() {
		return countInStock;
	}
	public void setCountInStock(String countInStock) {
		this.countInStock = countInStock;
	}
	public String getIsTaxable() {
		return isTaxable;
	}
	public void setIsTaxable(String isTaxable) {
		this.isTaxable = isTaxable;
	}
	public String getTaxPercent() {
		return taxPercent;
	}
	public void setTaxPercent(String taxPercent) {
		this.taxPercent = taxPercent;
	}
	public String getIsVttBestSeller() {
		return isVttBestSeller;
	}
	public void setIsVttBestSeller(String isVttBestSeller) {
		this.isVttBestSeller = isVttBestSeller;
	}
	@Override
	public String toString() {
		return "Product [name=" + name + ", description=" + description + ", brand=" + brand + ", imageUrl=" + imageUrl
				+ ", countInStock=" + countInStock + ", isTaxable=" + isTaxable + ", taxPercent=" + taxPercent
				+ ", isVttBestSeller=" + isVttBestSeller + "]";
	}
	
	
	
}
