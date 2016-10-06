package com.setec_ecomerce.service.back_end_transaction.products_import.products_import_impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.setec_ecomerce.repository.back_end_transaction.products_import.dao.ProductImportFormDAO;
import com.setec_ecomerce.repository.back_end_transaction.products_import.dto.ProductImportForm;
import com.setec_ecomerce.service.back_end_transaction.products_import.ProductImportFormService;

@Service
public class ProductImportFormServiceImpl implements ProductImportFormService{

	@Autowired
	private ProductImportFormDAO importFormDAO;
	
	/*@Override
	public void insertImport(ProductImportForm productForm) {
		importFormDAO.insertImport(productForm);
	}*/
	
	@Override
	public String insertImport(String productForm) {
		return importFormDAO.insertImport(productForm);
	}

}
