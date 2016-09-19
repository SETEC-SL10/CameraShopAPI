package com.setec_ecomerce.repository.back_end_transaction.products_import.dto.old_accessory;

import java.math.BigDecimal;
import java.sql.Timestamp;

public class AccessoryOldImportMaster {

	private int old_accessory_import_id;
	
	private Timestamp old_accessory_import_date;
	
	private String old_accessory_import_invoice_no;
	
	private Timestamp old_accessory_import_invoice_date;
	
	private BigDecimal old_accessory_import_total_amount;
	
	private int staff_id;

	public int getOld_accessory_import_id() {
		return old_accessory_import_id;
	}

	public void setOld_accessory_import_id(int old_accessory_import_id) {
		this.old_accessory_import_id = old_accessory_import_id;
	}

	public Timestamp getOld_accessory_import_date() {
		return old_accessory_import_date;
	}

	public void setOld_accessory_import_date(Timestamp old_accessory_import_date) {
		this.old_accessory_import_date = old_accessory_import_date;
	}

	public String getOld_accessory_import_invoice_no() {
		return old_accessory_import_invoice_no;
	}

	public void setOld_accessory_import_invoice_no(String old_accessory_import_invoice_no) {
		this.old_accessory_import_invoice_no = old_accessory_import_invoice_no;
	}

	public Timestamp getOld_accessory_import_invoice_date() {
		return old_accessory_import_invoice_date;
	}

	public void setOld_accessory_import_invoice_date(Timestamp old_accessory_import_invoice_date) {
		this.old_accessory_import_invoice_date = old_accessory_import_invoice_date;
	}

	public BigDecimal getOld_accessory_import_total_amount() {
		return old_accessory_import_total_amount;
	}

	public void setOld_accessory_import_total_amount(BigDecimal old_accessory_import_total_amount) {
		this.old_accessory_import_total_amount = old_accessory_import_total_amount;
	}

	public int getStaff_id() {
		return staff_id;
	}

	public void setStaff_id(int staff_id) {
		this.staff_id = staff_id;
	}
	
}
