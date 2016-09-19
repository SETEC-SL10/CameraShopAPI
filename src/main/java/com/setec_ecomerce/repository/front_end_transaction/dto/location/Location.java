package com.setec_ecomerce.repository.front_end_transaction.dto.location;

public class Location {

	private int location_id;
	  
	private String location_name;
	  
	private String location_code;

	public int getLocation_id() {
		return location_id;
	}
	
	public void setLocation_id(int location_id) {
		this.location_id = location_id;
	}
	
	public String getLocation_name() {
		return location_name;
	}
	
	public void setLocation_name(String location_name) {
		this.location_name = location_name;
	}
	
	public String getLocation_code() {
		return location_code;
	}
	
	public void setLocation_code(String location_code) {
		this.location_code = location_code;
	}
  
}
