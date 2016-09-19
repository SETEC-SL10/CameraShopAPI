package com.setec_ecomerce.service.back_end_transaction.back_end_invoice;

import java.math.BigDecimal;

import com.setec_ecomerce.repository.products.dto.products_form.ProductForm;

public class InvoiceDetail {

	private int backend_invoice_id;
	
	private ProductForm product;
	
	private int qty;
	
	private BigDecimal cost;
	
	private BigDecimal price;
	
	private BigDecimal discount;
	
	private BigDecimal amount;

	public int getBackend_invoice_id() {
		return backend_invoice_id;
	}

	public void setBackend_invoice_id(int backend_invoice_id) {
		this.backend_invoice_id = backend_invoice_id;
	}

	public ProductForm getProduct() {
		return product;
	}

	public void setProduct(ProductForm product) {
		this.product = product;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public BigDecimal getCost() {
		return cost;
	}

	public void setCost(BigDecimal cost) {
		this.cost = cost;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public BigDecimal getDiscount() {
		return discount;
	}

	public void setDiscount(BigDecimal discount) {
		this.discount = discount;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	
}
