package com.setec_ecomerce.service.products;

import java.util.ArrayList;

import com.setec_ecomerce.repository.products.dto.PageForm;
import com.setec_ecomerce.repository.products.dto.products_form.ProductForm;

public interface ProductsFormService {

	ArrayList<ProductForm> getAllProductForm(PageForm page);
	int countPageProductForm(PageForm page);
	ArrayList<ProductForm> getAllCameraNewForm(PageForm page);
	int countPageCameraNewForm(PageForm page);
	ArrayList<ProductForm> getAllCameraOldForm(PageForm page);
	int countPageCameraOldForm(PageForm page);
	ArrayList<ProductForm> getAllAccessoryOldForm(PageForm page);
	int countPageAccessoryOldForm(PageForm page);
	ArrayList<ProductForm> getAllAccessoryNewForm(PageForm page);
	int countPageAccessoryNewForm(PageForm page);
	ArrayList<ProductForm> getProductForm(ProductForm product);
	ArrayList<ProductForm> getProductFormRelated(ProductForm product);
	
}
