package com.setec_ecomerce.repository.products.dto.model;

public class Model {

	private int model_id;
	private String model_name;
	private String description;
	private boolean model_camera;
	private boolean model_accessory;
	private boolean model_status;
	private int brand_id;
	public int getModel_id() {
		return model_id;
	}
	public void setModel_id(int model_id) {
		this.model_id = model_id;
	}
	public String getModel_name() {
		return model_name;
	}
	public void setModel_name(String model_name) {
		this.model_name = model_name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public boolean isModel_camera() {
		return model_camera;
	}
	public void setModel_camera(boolean model_camera) {
		this.model_camera = model_camera;
	}
	public boolean isModel_accessory() {
		return model_accessory;
	}
	public void setModel_accessory(boolean model_accessory) {
		this.model_accessory = model_accessory;
	}
	public boolean isModel_status() {
		return model_status;
	}
	public void setModel_status(boolean model_status) {
		this.model_status = model_status;
	}
	public int getBrand_id() {
		return brand_id;
	}
	public void setBrand_id(int brand_id) {
		this.brand_id = brand_id;
	}
	
}
