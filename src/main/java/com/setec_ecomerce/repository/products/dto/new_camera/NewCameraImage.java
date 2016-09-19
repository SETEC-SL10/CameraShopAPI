package com.setec_ecomerce.repository.products.dto.new_camera;

import com.setec_ecomerce.repository.products.dto.color.Color;

public class NewCameraImage {
	
	private int new_camera_image_id;

	private String new_camera_id;

	private Color color;

	private String image_url;
	
	private boolean status;

	public NewCameraImage() {

	}

	public int getNew_camera_image_id() {
		return new_camera_image_id;
	}
	public void setNew_camera_image_id(int new_camera_image_id) {
		this.new_camera_image_id = new_camera_image_id;
	}
	public String getNew_camera_id() {
		return new_camera_id;
	}
	public void setNew_camera_id(String new_camera_id) {
		this.new_camera_id = new_camera_id;
	}
	
	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public String getImage_url() {
		return image_url;
	}
	public void setImage_url(String image_url) {
		this.image_url = image_url;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
}
