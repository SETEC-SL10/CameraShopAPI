package com.setec_ecomerce.service.back_end_transaction.back_end_invoice;

import java.math.BigDecimal;
import java.sql.Timestamp;

public class InvoiceMaster {

	private int backend_invoice_id;
	
	private Timestamp backend_invoice_date;
	
	private BigDecimal total_amount;
	
	private BigDecimal total_discount;
	
	private BigDecimal sub_total;
	
	private int customer_id;
	
	private int staff_id;

	public int getBackend_invoice_id() {
		return backend_invoice_id;
	}

	public void setBackend_invoice_id(int backend_invoice_id) {
		this.backend_invoice_id = backend_invoice_id;
	}

	public Timestamp getBackend_invoice_date() {
		return backend_invoice_date;
	}

	public void setBackend_invoice_date(Timestamp backend_invoice_date) {
		this.backend_invoice_date = backend_invoice_date;
	}

	public BigDecimal getTotal_amount() {
		return total_amount;
	}

	public void setTotal_amount(BigDecimal total_amount) {
		this.total_amount = total_amount;
	}

	public BigDecimal getTotal_discount() {
		return total_discount;
	}

	public void setTotal_discount(BigDecimal total_discount) {
		this.total_discount = total_discount;
	}

	public BigDecimal getSub_total() {
		return sub_total;
	}

	public void setSub_total(BigDecimal sub_total) {
		this.sub_total = sub_total;
	}

	public int getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}

	public int getStaff_id() {
		return staff_id;
	}

	public void setStaff_id(int staff_id) {
		this.staff_id = staff_id;
	}
	
}
