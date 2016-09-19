package com.setec_ecomerce.repository.products.dto.type;

public class Type {
	private int type_id;
	private String type_name;
	private String description;
	private boolean type_status;
	
	public int getType_id() {
		return type_id;
	}
	public void setType_id(int type_id) {
		this.type_id = type_id;
	}
	public String getType_name() {
		return type_name;
	}
	public void setType_name(String type_name) {
		this.type_name = type_name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public boolean isType_status() {
		return type_status;
	}
	public void setType_status(boolean type_status) {
		this.type_status = type_status;
	}
	
}
