package com.setec_ecomerce.repository.back_end_transaction.products_import.dto.old_camera;

import java.math.BigDecimal;
import java.sql.Timestamp;

public class CameraOldImportMaster {

	private int old_camera_improt_id;
	
	private Timestamp old_camera_improt_date;
	
	private String old_camera_import_invoice_no;
	
	private Timestamp old_camera_import_invoice_date;
	
	private BigDecimal old_camera_import_total_amount;
	
	private int staff_id;

	public int getOld_camera_improt_id() {
		return old_camera_improt_id;
	}

	public void setOld_camera_improt_id(int old_camera_improt_id) {
		this.old_camera_improt_id = old_camera_improt_id;
	}

	public Timestamp getOld_camera_improt_date() {
		return old_camera_improt_date;
	}

	public void setOld_camera_improt_date(Timestamp old_camera_improt_date) {
		this.old_camera_improt_date = old_camera_improt_date;
	}

	public String getOld_camera_import_invoice_no() {
		return old_camera_import_invoice_no;
	}

	public void setOld_camera_import_invoice_no(String old_camera_import_invoice_no) {
		this.old_camera_import_invoice_no = old_camera_import_invoice_no;
	}

	public Timestamp getOld_camera_import_invoice_date() {
		return old_camera_import_invoice_date;
	}

	public void setOld_camera_import_invoice_date(Timestamp old_camera_import_invoice_date) {
		this.old_camera_import_invoice_date = old_camera_import_invoice_date;
	}

	public BigDecimal getOld_camera_import_total_amount() {
		return old_camera_import_total_amount;
	}

	public void setOld_camera_import_total_amount(BigDecimal old_camera_import_total_amount) {
		this.old_camera_import_total_amount = old_camera_import_total_amount;
	}

	public int getStaff_id() {
		return staff_id;
	}

	public void setStaff_id(int staff_id) {
		this.staff_id = staff_id;
	}
	
	
}
