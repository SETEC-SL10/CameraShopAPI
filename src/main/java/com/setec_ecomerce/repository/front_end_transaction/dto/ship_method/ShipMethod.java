package com.setec_ecomerce.repository.front_end_transaction.dto.ship_method;

public class ShipMethod {

	private int ship_method_id;
	
	private String ship_method_name;
	
	private String deliver_name;
	
	private String phone;

	public int getShip_method_id() {
		return ship_method_id;
	}

	public void setShip_method_id(int ship_method_id) {
		this.ship_method_id = ship_method_id;
	}

	public String getShip_method_name() {
		return ship_method_name;
	}

	public void setShip_method_name(String ship_method_name) {
		this.ship_method_name = ship_method_name;
	}

	public String getDeliver_name() {
		return deliver_name;
	}

	public void setDeliver_name(String deliver_name) {
		this.deliver_name = deliver_name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
}
