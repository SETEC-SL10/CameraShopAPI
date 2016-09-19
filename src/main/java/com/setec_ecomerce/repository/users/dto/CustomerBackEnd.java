package com.setec_ecomerce.repository.users.dto;

import java.sql.Timestamp;

public class CustomerBackEnd {

	private int customer_id;
	
	private String customer_last_name;
	
	private String customer_first_name;
	
	private String customer_email;
	
	private String customer_phone;
	
	private String customer_address;
	
	private Timestamp customer_register_date;
	
	private boolean customer_status;

	public int getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}

	public String getCustomer_last_name() {
		return customer_last_name;
	}

	public void setCustomer_last_name(String customer_last_name) {
		this.customer_last_name = customer_last_name;
	}

	public String getCustomer_first_name() {
		return customer_first_name;
	}

	public void setCustomer_first_name(String customer_first_name) {
		this.customer_first_name = customer_first_name;
	}

	public String getCustomer_email() {
		return customer_email;
	}

	public void setCustomer_email(String customer_email) {
		this.customer_email = customer_email;
	}

	public String getCustomer_phone() {
		return customer_phone;
	}

	public void setCustomer_phone(String customer_phone) {
		this.customer_phone = customer_phone;
	}

	public String getCustomer_address() {
		return customer_address;
	}

	public void setCustomer_address(String customer_address) {
		this.customer_address = customer_address;
	}

	public Timestamp getCustomer_register_date() {
		return customer_register_date;
	}

	public void setCustomer_register_date(Timestamp customer_register_date) {
		this.customer_register_date = customer_register_date;
	}

	public boolean isCustomer_status() {
		return customer_status;
	}

	public void setCustomer_status(boolean customer_status) {
		this.customer_status = customer_status;
	}
	
}
