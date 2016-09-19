package com.setec_ecomerce.repository.back_end_transaction.products_import.dto.old_accessory;

import java.math.BigDecimal;

public class AccessoryOldImportDetail {

	private int old_accessory_import_id;
	
	private String old_accessory_id;
	
	private int color_id;
	
	private String code_no;
	
	private String description;
	
	private int old_accessory_qty;
	
	private BigDecimal old_accessory_cost;
	
	private BigDecimal old_accessory_amount;
	
	private BigDecimal old_accessory_sell_price;

	public int getOld_accessory_import_id() {
		return old_accessory_import_id;
	}

	public void setOld_accessory_import_id(int old_accessory_import_id) {
		this.old_accessory_import_id = old_accessory_import_id;
	}

	public String getOld_accessory_id() {
		return old_accessory_id;
	}

	public void setOld_accessory_id(String old_accessory_id) {
		this.old_accessory_id = old_accessory_id;
	}

	public int getColor_id() {
		return color_id;
	}

	public void setColor_id(int color_id) {
		this.color_id = color_id;
	}

	public String getCode_no() {
		return code_no;
	}

	public void setCode_no(String code_no) {
		this.code_no = code_no;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getOld_accessory_qty() {
		return old_accessory_qty;
	}

	public void setOld_accessory_qty(int old_accessory_qty) {
		this.old_accessory_qty = old_accessory_qty;
	}

	public BigDecimal getOld_accessory_cost() {
		return old_accessory_cost;
	}

	public void setOld_accessory_cost(BigDecimal old_accessory_cost) {
		this.old_accessory_cost = old_accessory_cost;
	}

	public BigDecimal getOld_accessory_amount() {
		return old_accessory_amount;
	}

	public void setOld_accessory_amount(BigDecimal old_accessory_amount) {
		this.old_accessory_amount = old_accessory_amount;
	}

	public BigDecimal getOld_accessory_sell_price() {
		return old_accessory_sell_price;
	}

	public void setOld_accessory_sell_price(BigDecimal old_accessory_sell_price) {
		this.old_accessory_sell_price = old_accessory_sell_price;
	}
	
}
