package com.setec_ecomerce.repository.back_end_transaction.products_import.dto.new_accessory;

import java.math.BigDecimal;
import java.sql.Timestamp;

public class AccessoryNewImportMaster {
	
	private int new_accessory_import_id;
	
	private Timestamp new_accessory_import_date;
	
	private String new_accessory_import_invoice_no;
	
	private Timestamp new_accessory_import_invoice_date;
	
	private BigDecimal new_accessory_import_total_amount;
	
	private int staff_id;
	
	private int supplier_id;
	
	
	public int getNew_accessory_import_id() {
		return new_accessory_import_id;
	}
	public void setNew_accessory_import_id(int new_accessory_import_id) {
		this.new_accessory_import_id = new_accessory_import_id;
	}
	public Timestamp getNew_accessory_import_date() {
		return new_accessory_import_date;
	}
	public void setNew_accessory_import_date(Timestamp new_accessory_import_date) {
		this.new_accessory_import_date = new_accessory_import_date;
	}
	public String getNew_accessory_import_invoice_no() {
		return new_accessory_import_invoice_no;
	}
	public void setNew_accessory_import_invoice_no(String new_accessory_import_invoice_no) {
		this.new_accessory_import_invoice_no = new_accessory_import_invoice_no;
	}
	public Timestamp getNew_accessory_import_invoice_date() {
		return new_accessory_import_invoice_date;
	}
	public void setNew_accessory_import_invoice_date(Timestamp new_accessory_import_invoice_date) {
		this.new_accessory_import_invoice_date = new_accessory_import_invoice_date;
	}
	public BigDecimal getNew_accessory_import_total_amount() {
		return new_accessory_import_total_amount;
	}
	public void setNew_accessory_import_total_amount(BigDecimal new_accessory_import_total_amount) {
		this.new_accessory_import_total_amount = new_accessory_import_total_amount;
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
