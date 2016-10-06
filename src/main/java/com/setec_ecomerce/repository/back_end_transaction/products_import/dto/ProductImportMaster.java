package com.setec_ecomerce.repository.back_end_transaction.products_import.dto;

import java.sql.Timestamp;

public class ProductImportMaster {

	private int import_id;
	
	private String invoice_no;
	
	private Timestamp invoice_date;
	
	private int staff_id;
	
	private int supplier_id;

	public int getImport_id() {
		return import_id;
	}

	public void setImport_id(int import_id) {
		this.import_id = import_id;
	}

	public String getInvoice_no() {
		return invoice_no;
	}

	public void setInvoice_no(String invoice_no) {
		this.invoice_no = invoice_no;
	}

	public Timestamp getInvoice_date() {
		return invoice_date;
	}

	public void setInvoice_date(Timestamp invoice_date) {
		this.invoice_date = invoice_date;
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
