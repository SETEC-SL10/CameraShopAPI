package com.setec_ecomerce.service.products;

import java.util.ArrayList;

import com.setec_ecomerce.repository.products.dto.ProductFormDetail;
import com.setec_ecomerce.repository.products.dto.products_form.ProductForm;


public interface ProductFormDetailService {
	
	public ArrayList<ProductFormDetail> getProductDetail(ProductForm product);

}
