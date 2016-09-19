package com.setec_ecomerce.repository.products.dto.brand;

public class Brand {
	private int brand_id;
	private String brand_name;
	private String description;
	private boolean brand_camera;
	private boolean brand_accessory;
	private boolean brand_status;
	
	
	public int getBrand_id() {
		return brand_id;
	}
	public void setBrand_id(int brand_id) {
		this.brand_id = brand_id;
	}
	public String getBrand_name() {
		return brand_name;
	}
	public void setBrand_name(String brand_name) {
		this.brand_name = brand_name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public boolean getBrand_camera() {
		return brand_camera;
	}
	public void setBrand_camera(boolean brand_camera) {
		this.brand_camera = brand_camera;
	}
	public boolean getBrand_accessory() {
		return brand_accessory;
	}
	public void setBrand_accessory(boolean brand_accessory) {
		this.brand_accessory = brand_accessory;
	}
	public boolean getBrand_status() {
		return brand_status;
	}
	public void setBrand_status(boolean brand_status) {
		this.brand_status = brand_status;
	}
	
}
