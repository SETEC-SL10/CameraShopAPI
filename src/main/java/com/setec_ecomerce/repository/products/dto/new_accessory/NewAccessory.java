package com.setec_ecomerce.repository.products.dto.new_accessory;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.setec_ecomerce.repository.products.dto.brand.Brand;
import com.setec_ecomerce.repository.products.dto.category.Category;
import com.setec_ecomerce.repository.products.dto.model.Model;

public class NewAccessory {
	@JsonProperty("ID")
	private String new_accessory_id;
	@JsonProperty("NAME")
	private String new_accessory_name;
	@JsonProperty("CODE")
	private String new_accessory_code;
	@JsonProperty("DESCRIPTION")
	private String description;
	@JsonProperty("QTY_STOCK")
	private int qty_in_stock;
	@JsonProperty("AVAILABLE_STOCK")
	private int available_stock;
	@JsonProperty("PROVINCE_SHIP_PRICE")
	private BigDecimal province_ship_price;
	@JsonProperty("LOCAL_SHIP_PRICE")
	private BigDecimal local_ship_price;
	@JsonProperty("TYPE_ID")
	private int type_id;
	@JsonProperty("CATEGORY")
	private Category category;
	@JsonProperty("BRAND")
	private Brand brand;
	@JsonProperty("MODEL")
	private Model model;
	@JsonProperty("DETAIL")
	private String detail;
	@JsonProperty("IMG_URL")
	private String img_url;
	@JsonProperty("CREATED_DATE")
	private Timestamp created_date;
	@JsonProperty("STATUS")
	private boolean status;
	
	
	public String getNew_accessory_id() {
		return new_accessory_id;
	}
	public void setNew_accessory_id(String new_accessory_id) {
		this.new_accessory_id = new_accessory_id;
	}
	public String getNew_accessory_name() {
		return new_accessory_name;
	}
	public void setNew_accessory_name(String new_accessory_name) {
		this.new_accessory_name = new_accessory_name;
	}
	public String getNew_accessory_code() {
		return new_accessory_code;
	}
	public void setNew_accessory_code(String new_accessory_code) {
		this.new_accessory_code = new_accessory_code;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getQty_in_stock() {
		return qty_in_stock;
	}
	public void setQty_in_stock(int qty_in_stock) {
		this.qty_in_stock = qty_in_stock;
	}
	public int getAvailable_stock() {
		return available_stock;
	}
	public void setAvailable_stock(int available_stock) {
		this.available_stock = available_stock;
	}
	public BigDecimal getProvince_ship_price() {
		return province_ship_price;
	}
	public void setProvince_ship_price(BigDecimal province_ship_price) {
		this.province_ship_price = province_ship_price;
	}
	public BigDecimal getLocal_ship_price() {
		return local_ship_price;
	}
	public void setLocal_ship_price(BigDecimal local_ship_price) {
		this.local_ship_price = local_ship_price;
	}
	public int getType_id() {
		return type_id;
	}
	public void setType_id(int type_id) {
		this.type_id = type_id;
	}
	
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public Brand getBrand() {
		return brand;
	}
	public void setBrand(Brand brand) {
		this.brand = brand;
	}
	public Model getModel() {
		return model;
	}
	public void setModel(Model model) {
		this.model = model;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public String getImg_url() {
		return img_url;
	}
	public void setImg_url(String img_url) {
		this.img_url = img_url;
	}
	public Timestamp getCreated_date() {
		return created_date;
	}
	public void setCreated_date(Timestamp created_date) {
		this.created_date = created_date;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
		
}
