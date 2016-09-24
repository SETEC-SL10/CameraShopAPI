package com.setec_ecomerce.repository.products.dto;

import com.setec_ecomerce.repository.products.dto.products_form.ProductForm;
import com.setec_ecomerce.repository.products.dto.specification.Specification;

public class ProductFormDetail {

	private ProductForm product;
	
	private Specification[] specifications;

	public ProductForm getProduct() {
		return product;
	}

	public void setProduct(ProductForm product) {
		this.product = product;
	}

	public Specification[] getSpecifications() {
		return specifications;
	}

	public void setSpecifications(Specification[] specifications) {
		this.specifications = specifications;
	}
	
	
}
