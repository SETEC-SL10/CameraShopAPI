package com.setec_ecomerce.repository.back_end_transaction.products_import.dto.new_accessory;

import java.math.BigDecimal;

public class AccessoryNewImportDetail {

	private int new_accessory_import_id;
	
	private String new_accessory_id;
	
	private int color_id;
	
	private int new_accessory_qty;
	
	private BigDecimal new_accessory_cost;
	
	private BigDecimal new_accessory_amount;
	
	private BigDecimal selling_price;
	
	
	public int getNew_accessory_import_id() {
		return new_accessory_import_id;
	}
	public void setNew_accessory_import_id(int new_accessory_import_id) {
		this.new_accessory_import_id = new_accessory_import_id;
	}
	public String getNew_accessory_id() {
		return new_accessory_id;
	}
	public void setNew_accessory_id(String new_accessory_id) {
		this.new_accessory_id = new_accessory_id;
	}
	public int getColor_id() {
		return color_id;
	}
	public void setColor_id(int color_id) {
		this.color_id = color_id;
	}
	public int getNew_accessory_qty() {
		return new_accessory_qty;
	}
	public void setNew_accessory_qty(int new_accessory_qty) {
		this.new_accessory_qty = new_accessory_qty;
	}
	public BigDecimal getNew_accessory_cost() {
		return new_accessory_cost;
	}
	public void setNew_accessory_cost(BigDecimal new_accessory_cost) {
		this.new_accessory_cost = new_accessory_cost;
	}
	public BigDecimal getNew_accessory_amount() {
		return new_accessory_amount;
	}
	public void setNew_accessory_amount(BigDecimal new_accessory_amount) {
		this.new_accessory_amount = new_accessory_amount;
	}
	public BigDecimal getSelling_price() {
		return selling_price;
	}
	public void setSelling_price(BigDecimal selling_price) {
		this.selling_price = selling_price;
	}
	
	public void show(){
		System.out.println(getNew_accessory_import_id() + "\t" + getNew_accessory_id() + "\t" + getColor_id() + "\t" );
	}
}
