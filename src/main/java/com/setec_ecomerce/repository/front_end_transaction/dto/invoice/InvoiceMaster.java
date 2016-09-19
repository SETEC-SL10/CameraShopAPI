package com.setec_ecomerce.repository.front_end_transaction.dto.invoice;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.setec_ecomerce.repository.front_end_transaction.dto.location.Location;
import com.setec_ecomerce.repository.front_end_transaction.dto.ship_method.ShipMethod;

public class InvoiceMaster {

	  private int customer_invoice_id;
	  
	  private int customer_id;
	  
	  private Timestamp customer_invoice_date;
	  
	  private BigDecimal otal_amount;
	  
	  private BigDecimal total_ship_price;
	  
	  private BigDecimal total_discount;
	  
	  private BigDecimal sub_total;
	  
	  private String address;
	  
	  private String phone;
	  
	  private Location location;
	  
	  private ShipMethod shipMethod;

	public int getCustomer_invoice_id() {
		return customer_invoice_id;
	}

	public void setCustomer_invoice_id(int customer_invoice_id) {
		this.customer_invoice_id = customer_invoice_id;
	}

	public int getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}

	public Timestamp getCustomer_invoice_date() {
		return customer_invoice_date;
	}

	public void setCustomer_invoice_date(Timestamp customer_invoice_date) {
		this.customer_invoice_date = customer_invoice_date;
	}

	public BigDecimal getOtal_amount() {
		return otal_amount;
	}

	public void setOtal_amount(BigDecimal otal_amount) {
		this.otal_amount = otal_amount;
	}

	public BigDecimal getTotal_ship_price() {
		return total_ship_price;
	}

	public void setTotal_ship_price(BigDecimal total_ship_price) {
		this.total_ship_price = total_ship_price;
	}

	public BigDecimal getTotal_discount() {
		return total_discount;
	}

	public void setTotal_discount(BigDecimal total_discount) {
		this.total_discount = total_discount;
	}

	public BigDecimal getSub_total() {
		return sub_total;
	}

	public void setSub_total(BigDecimal sub_total) {
		this.sub_total = sub_total;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public ShipMethod getShipMethod() {
		return shipMethod;
	}

	public void setShipMethod(ShipMethod shipMethod) {
		this.shipMethod = shipMethod;
	}
}
