package com.setec_ecomerce.repository.back_end_transaction.products_import.dto.new_camera;

import java.math.BigDecimal;
import java.sql.Timestamp;

public class CameraNewImportMaster {

	private int new_camera_improt_id;
	
	private Timestamp new_camera_improt_date;
	
	private String new_camera_import_invoice_no;
	
	private Timestamp new_camera_import_invoice_date;
	
	private BigDecimal new_camera_import_total_amount;
	
	private int staff_id;
	
	private int supplier_id;

	public int getNew_camera_improt_id() {
		return new_camera_improt_id;
	}

	public void setNew_camera_improt_id(int new_camera_improt_id) {
		this.new_camera_improt_id = new_camera_improt_id;
	}

	public Timestamp getNew_camera_improt_date() {
		return new_camera_improt_date;
	}

	public void setNew_camera_improt_date(Timestamp new_camera_improt_date) {
		this.new_camera_improt_date = new_camera_improt_date;
	}

	public String getNew_camera_import_invoice_no() {
		return new_camera_import_invoice_no;
	}

	public void setNew_camera_import_invoice_no(String new_camera_import_invoice_no) {
		this.new_camera_import_invoice_no = new_camera_import_invoice_no;
	}

	public Timestamp getNew_camera_import_invoice_date() {
		return new_camera_import_invoice_date;
	}

	public void setNew_camera_import_invoice_date(Timestamp new_camera_import_invoice_date) {
		this.new_camera_import_invoice_date = new_camera_import_invoice_date;
	}

	public BigDecimal getNew_camera_import_total_amount() {
		return new_camera_import_total_amount;
	}

	public void setNew_camera_import_total_amount(BigDecimal new_camera_import_total_amount) {
		this.new_camera_import_total_amount = new_camera_import_total_amount;
	}

	public int getStaff_id() {
		return staff_id;
	}

	public void setStaff_id(int staff_id) {
		this.staff_id = staff_id;
	}

	public int getSupplier_id() {
		return supplier_id;
	}

	public void setSupplier_id(int supplier_id) {
		this.supplier_id = supplier_id;
	}
	
}
