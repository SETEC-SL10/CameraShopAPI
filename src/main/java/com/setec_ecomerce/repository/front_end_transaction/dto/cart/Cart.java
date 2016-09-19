package com.setec_ecomerce.repository.front_end_transaction.dto.cart;

import com.setec_ecomerce.repository.products.dto.products_form.ProductForm;

public class Cart {

	private int cart_id;
	
	private int customer_id;
	
	private ProductForm product;
	
	private int product_qty;

	public int getCart_id() {
		return cart_id;
	}

	public void setCart_id(int cart_id) {
		this.cart_id = cart_id;
	}

	public int getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}

	public ProductForm getProduct() {
		return product;
	}

	public void setProduct(ProductForm product) {
		this.product = product;
	}

	public int getProduct_qty() {
		return product_qty;
	}

	public void setProduct_qty(int product_qty) {
		this.product_qty = product_qty;
	}
	
}
