package com.setec_ecomerce.repository.back_end_transaction.products_import.dto.new_camera;

import java.math.BigDecimal;

public class CameraNewImportDetail {

	private int new_camera_import_id;
	
	private String new_camera_id;
	
	private int color_id;
	
	private String new_camera_serial;
	
	private int new_camera_qty;
	
	private BigDecimal new_camera_cost;
	
	private BigDecimal new_camera_total_amount;
	
	private BigDecimal selling_price;

	public int getNew_camera_import_id() {
		return new_camera_import_id;
	}

	public void setNew_camera_import_id(int new_camera_import_id) {
		this.new_camera_import_id = new_camera_import_id;
	}

	public String getNew_camera_id() {
		return new_camera_id;
	}

	public void setNew_camera_id(String new_camera_id) {
		this.new_camera_id = new_camera_id;
	}

	public int getColor_id() {
		return color_id;
	}

	public void setColor_id(int color_id) {
		this.color_id = color_id;
	}

	public String getNew_camera_serial() {
		return new_camera_serial;
	}

	public void setNew_camera_serial(String new_camera_serial) {
		this.new_camera_serial = new_camera_serial;
	}

	public int getNew_camera_qty() {
		return new_camera_qty;
	}

	public void setNew_camera_qty(int new_camera_qty) {
		this.new_camera_qty = new_camera_qty;
	}

	public BigDecimal getNew_camera_cost() {
		return new_camera_cost;
	}

	public void setNew_camera_cost(BigDecimal new_camera_cost) {
		this.new_camera_cost = new_camera_cost;
	}

	public BigDecimal getNew_camera_total_amount() {
		return new_camera_total_amount;
	}

	public void setNew_camera_total_amount(BigDecimal new_camera_total_amount) {
		this.new_camera_total_amount = new_camera_total_amount;
	}

	public BigDecimal getSelling_price() {
		return selling_price;
	}

	public void setSelling_price(BigDecimal selling_price) {
		this.selling_price = selling_price;
	}
	
}
