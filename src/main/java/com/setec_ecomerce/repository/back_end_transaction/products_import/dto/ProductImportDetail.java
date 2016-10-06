package com.setec_ecomerce.repository.back_end_transaction.products_import.dto;

import java.math.BigDecimal;

public class ProductImportDetail {

	private int product_id;
	
	private int color_id;
	
	private String serial;
	
	private int qty;
	
	private BigDecimal product_cost;
	
	private BigDecimal selling_price;

	public int getProduct_id() {
		return product_id;
	}

	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}

	public int getColor_id() {
		return color_id;
	}

	public void setColor_id(int color_id) {
		this.color_id = color_id;
	}

	public String getSerial() {
		return serial;
	}

	public void setSerial(String serial) {
		this.serial = serial;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public BigDecimal getProduct_cost() {
		return product_cost;
	}

	public void setProduct_cost(BigDecimal product_cost) {
		this.product_cost = product_cost;
	}

	public BigDecimal getSelling_price() {
		return selling_price;
	}

	public void setSelling_price(BigDecimal selling_price) {
		this.selling_price = selling_price;
	}
	
}
