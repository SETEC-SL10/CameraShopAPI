package com.setec_ecomerce.repository.products.dto.color;

public class Color {
	private int color_id;
	private String color_name;
	private String description;
	private boolean color_status;
	private String color_code;
	
	public int getColor_id() {
		return color_id;
	}
	public void setColor_id(int color_id) {
		this.color_id = color_id;
	}
	public String getColor_name() {
		return color_name;
	}
	public void setColor_name(String color_name) {
		this.color_name = color_name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public boolean getColor_status() {
		return color_status;
	}
	public void setColor_status(boolean color_status) {
		this.color_status = color_status;
	}
	public String getColor_code() {
		return color_code;
	}
	public void setColor_code(String color_code) {
		this.color_code = color_code;
	}
	
}
