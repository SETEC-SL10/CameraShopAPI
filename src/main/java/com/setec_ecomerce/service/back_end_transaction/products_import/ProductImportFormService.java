package com.setec_ecomerce.service.back_end_transaction.products_import;

import com.setec_ecomerce.repository.back_end_transaction.products_import.dto.ProductImportForm;

public interface ProductImportFormService {
	/*void insertImport(ProductImportForm productForm);*/
	
	String insertImport(String productForm);
}
