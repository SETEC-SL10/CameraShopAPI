package com.setec_ecomerce.service.products.product_impl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.setec_ecomerce.repository.products.dao.ProductFormDetailDAO;
import com.setec_ecomerce.repository.products.dto.ProductFormDetail;
import com.setec_ecomerce.repository.products.dto.products_form.ProductForm;
import com.setec_ecomerce.service.products.ProductFormDetailService;

@Service
public class ProductFormDetailServiceImpl implements ProductFormDetailService{

	@Autowired
	private ProductFormDetailDAO productFormDetailDAO;
	@Override
	public ArrayList<ProductFormDetail> getProductDetail(ProductForm product) {
		return productFormDetailDAO.getAllProductFormDetail(product);
	}

}
