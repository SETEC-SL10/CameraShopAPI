package com.setec_ecomerce.repository.products.dto.new_camera;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.setec_ecomerce.repository.products.dto.brand.Brand;
import com.setec_ecomerce.repository.products.dto.category.Category;
import com.setec_ecomerce.repository.products.dto.model.Model;

public class NewCamera {
	@JsonProperty("ID")
	private String new_camera_id;
	@JsonProperty("CODE")
	private String new_camera_code;
	@JsonProperty("NAME")
	private String new_camera_name;
	@JsonProperty("QTY_STOCK")
	private int qty_in_stock;
	@JsonProperty("AVAILABLE_STOCK")
	private int available_stock;
	@JsonProperty("WARRANTY")
	private Timestamp warranty;
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
	@JsonProperty("DESCRIPTION")
	private String description;
	@JsonProperty("IMG_URL")
	private String img_url;
	@JsonProperty("DETAIL")
	private String detail;
	@JsonProperty("CREATED_DATE")
	private Timestamp created_date;
	@JsonProperty("STATUS")
	private boolean status;
	
	public NewCamera() {
		// TODO Auto-generated constructor stub
	}
	
	
	public NewCamera(String new_camera_id, String new_camera_code, String new_camera_name, int qty_in_stock,
			int available_stock, Timestamp warranty, BigDecimal province_ship_price, BigDecimal local_ship_price,
			int type_id, Category category, Brand brand, Model model, String description, String img_url, String detail,
			boolean status) {
		super();
		this.new_camera_id = new_camera_id;
		this.new_camera_code = new_camera_code;
		this.new_camera_name = new_camera_name;
		this.qty_in_stock = qty_in_stock;
		this.available_stock = available_stock;
		this.warranty = warranty;
		this.province_ship_price = province_ship_price;
		this.local_ship_price = local_ship_price;
		this.type_id = type_id;
		this.category = category;
		this.brand = brand;
		this.model = model;
		this.description = description;
		this.img_url = img_url;
		this.detail = detail;
		this.status = status;
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
	
	public String getNew_camera_id() {
		return new_camera_id;
	}
	public void setNew_camera_id(String new_camera_id) {
		this.new_camera_id = new_camera_id;
	}
	public String getNew_camera_code() {
		return new_camera_code;
	}
	public void setNew_camera_code(String new_camera_code) {
		this.new_camera_code = new_camera_code;
	}
	public String getNew_camera_name() {
		return new_camera_name;
	}
	public void setNew_camera_name(String new_camera_name) {
		this.new_camera_name = new_camera_name;
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
	public Timestamp getWarranty() {
		return warranty;
	}
	public void setWarranty(Timestamp warranty) {
		this.warranty = warranty;
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getImg_url() {
		return img_url;
	}
	public void setImg_url(String img_url) {
		this.img_url = img_url;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}


	public Timestamp getCreated_date() {
		return created_date;
	}


	public void setCreated_date(Timestamp created_date) {
		this.created_date = created_date;
	}
	
}
