package com.setec_ecomerce.repository.users.dto;

public class CustomerFrontEnd {
	
	private int customer_id;
	private String customer_last_name;
	private String customer_first_name;
	private String customer_email;
	private String customer_phone;
	private String customer_address;
	private String customer_password;
	private boolean customer_status;
	
	public int getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(int ustomer_id) {
		this.customer_id = ustomer_id;
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
	public String getCustomer_password() {
		return customer_password;
	}
	public void setCustomer_password(String customer_password) {
		this.customer_password = customer_password;
	}
	public boolean isCustomer_status() {
		return customer_status;
	}
	public void setCustomer_status(boolean customer_status) {
		this.customer_status = customer_status;
	}
	
}
