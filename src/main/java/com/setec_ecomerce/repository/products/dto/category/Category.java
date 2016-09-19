package com.setec_ecomerce.repository.products.dto.category;



public class Category {
	
	private int category_id;
	private String category_name;
	private String description;
	private int type_id;
	private boolean category_camera;
	private boolean category_accessory;
	private boolean status;
	
	
	public int getCategory_id() {
		return category_id;
	}
	public void setCategory_id(int category_id) {
		this.category_id = category_id;
	}
	public String getCategory_name() {
		return category_name;
	}
	public void setCategory_name(String category_name) {
		this.category_name = category_name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getType_id() {
		return type_id;
	}
	public void setType_id(int type_id) {
		this.type_id = type_id;
	}
	public boolean isCategory_camera() {
		return category_camera;
	}
	public void setCategory_camera(boolean category_camera) {
		this.category_camera = category_camera;
	}
	public boolean isCategory_accessory() {
		return category_accessory;
	}
	public void setCategory_accessory(boolean category_accessory) {
		this.category_accessory = category_accessory;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
}
