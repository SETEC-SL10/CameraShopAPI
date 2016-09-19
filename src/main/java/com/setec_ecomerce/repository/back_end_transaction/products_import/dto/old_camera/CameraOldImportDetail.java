package com.setec_ecomerce.repository.back_end_transaction.products_import.dto.old_camera;

import java.math.BigDecimal;

public class CameraOldImportDetail {

	private int old_camera_import_id;
	
	private String old_camera_id;
	
	private int color_id;
	
	private String old_camera_serial;
	
	private String description ;
	
	private int old_camera_qty;
	
	private BigDecimal old_camera_cost;
	
	private BigDecimal old_camera_total_amount;
	
	private BigDecimal selling_price;

	public int getOld_camera_import_id() {
		return old_camera_import_id;
	}

	public void setOld_camera_import_id(int old_camera_import_id) {
		this.old_camera_import_id = old_camera_import_id;
	}

	public String getOld_camera_id() {
		return old_camera_id;
	}

	public void setOld_camera_id(String old_camera_id) {
		this.old_camera_id = old_camera_id;
	}

	public int getColor_id() {
		return color_id;
	}

	public void setColor_id(int color_id) {
		this.color_id = color_id;
	}

	public String getOld_camera_serial() {
		return old_camera_serial;
	}

	public void setOld_camera_serial(String old_camera_serial) {
		this.old_camera_serial = old_camera_serial;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getOld_camera_qty() {
		return old_camera_qty;
	}

	public void setOld_camera_qty(int old_camera_qty) {
		this.old_camera_qty = old_camera_qty;
	}

	public BigDecimal getOld_camera_cost() {
		return old_camera_cost;
	}

	public void setOld_camera_cost(BigDecimal old_camera_cost) {
		this.old_camera_cost = old_camera_cost;
	}

	public BigDecimal getOld_camera_total_amount() {
		return old_camera_total_amount;
	}

	public void setOld_camera_total_amount(BigDecimal old_camera_total_amount) {
		this.old_camera_total_amount = old_camera_total_amount;
	}

	public BigDecimal getSelling_price() {
		return selling_price;
	}

	public void setSelling_price(BigDecimal selling_price) {
		this.selling_price = selling_price;
	}
	
	
}
