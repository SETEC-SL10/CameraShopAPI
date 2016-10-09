package com.setec_ecomerce.repository.products.dto.old_accessory;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.setec_ecomerce.repository.products.dto.color.Color;

public class OldAccessoryImage {

	@JsonProperty("ID")
	private int old_accessory_image_id;
	@JsonProperty("PRO_ID")
	private String old_accessory_id;
	@JsonProperty("COLOR")
	private Color color;
	@JsonProperty("SERIAL")
	private String code_no;
	@JsonProperty("IMG_URL")
	private String image_url;
	@JsonProperty("STATUS")
	private boolean status;
	
	public String getCode_no() {
		return code_no;
	}
	public void setCode_no(String code_no) {
		this.code_no = code_no;
	}
	public int getOld_accessory_image_id() {
		return old_accessory_image_id;
	}
	public void setOld_accessory_image_id(int old_accessory_image_id) {
		this.old_accessory_image_id = old_accessory_image_id;
	}
	public String getOld_accessory_id() {
		return old_accessory_id;
	}
	public void setOld_accessory_id(String old_accessory_id) {
		this.old_accessory_id = old_accessory_id;
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
