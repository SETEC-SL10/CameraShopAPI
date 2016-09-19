package com.setec_ecomerce.repository.products.dto.specification;


public class Specification {
	
	private String product_id;
	
	private int specification_id;
	
	private String specification_name;
	
	private String description;
	
	private boolean status;
	
	public String getProduct_id() {
		return product_id;
	}
	public void setProduct_id(String product_id) {
		this.product_id = product_id;
	}
	public int getSpecification_id() {
		return specification_id;
	}
	public void setSpecification_id(int specification_id) {
		this.specification_id = specification_id;
	}
	public String getSpecification_name() {
		return specification_name;
	}
	public void setSpecification_name(String specification_name) {
		this.specification_name = specification_name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
}
