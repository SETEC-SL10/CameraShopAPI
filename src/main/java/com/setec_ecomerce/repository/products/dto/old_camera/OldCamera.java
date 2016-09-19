package com.setec_ecomerce.repository.products.dto.old_camera;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;
import com.setec_ecomerce.repository.products.dto.brand.Brand;
import com.setec_ecomerce.repository.products.dto.category.Category;
import com.setec_ecomerce.repository.products.dto.model.Model;

public class OldCamera {
	
	private String old_camera_id;

	private String old_camera_code;

	private String old_camera_name;

	private int qty_in_stock;

	private int available_stock;

	private Timestamp warranty;

	private BigDecimal province_ship_price;

	private BigDecimal local_ship_price;

	private int type_id;

	private Category category;
	
	private Brand brand;
	
	private Model model;

	private Date created_date;

	private String description;

	private String detail;

	private String img_url;

	private boolean status;
	
	
	public String getOld_camera_id() {
		return old_camera_id;
	}
	public void setOld_camera_id(String old_camera_id) {
		this.old_camera_id = old_camera_id;
	}
	public String getOld_camera_code() {
		return old_camera_code;
	}
	public void setOld_camera_code(String old_camera_code) {
		this.old_camera_code = old_camera_code;
	}
	public String getOld_camera_name() {
		return old_camera_name;
	}
	public void setOld_camera_name(String old_camera_name) {
		this.old_camera_name = old_camera_name;
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
	public Date getCreated_date() {
		return created_date;
	}
	public void setCreated_date(Date created_date) {
		this.created_date = created_date;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
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
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
}
