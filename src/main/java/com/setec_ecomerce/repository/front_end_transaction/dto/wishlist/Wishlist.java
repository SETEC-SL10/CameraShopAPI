package com.setec_ecomerce.repository.front_end_transaction.dto.wishlist;

import com.setec_ecomerce.repository.products.dto.products_form.ProductForm;

public class Wishlist {
	
	private int wishlist_id;
	
	private int customer_id;
	
	private ProductForm product;

	public int getWishlist_id() {
		return wishlist_id;
	}

	public void setWishlist_id(int wishlist_id) {
		this.wishlist_id = wishlist_id;
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
	
}
