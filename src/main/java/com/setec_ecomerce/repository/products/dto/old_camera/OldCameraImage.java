package com.setec_ecomerce.repository.products.dto.old_camera;

import com.setec_ecomerce.repository.products.dto.color.Color;

public class OldCameraImage {
	
	private int old_camera_image_id;

	private String old_camera_id;

	private Color color;

	private String old_camera_serial;

	private String image_url;

	private boolean status;
	
	public int getOld_camera_image_id() {
		return old_camera_image_id;
	}
	public void setOld_camera_image_id(int old_camera_image_id) {
		this.old_camera_image_id = old_camera_image_id;
	}
	public String getOld_camera_id() {
		return old_camera_id;
	}
	public void setOld_camera_id(String old_camera_id) {
		this.old_camera_id = old_camera_id;
	}
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	public String getOld_camera_serial() {
		return old_camera_serial;
	}
	public void setOld_camera_serial(String old_camera_serial) {
		this.old_camera_serial = old_camera_serial;
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
