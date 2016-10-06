package com.setec_ecomerce.repository.back_end_transaction.products_import.dto;

import java.io.Serializable;
import java.util.List;

public class ProductImportForm implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private ProductImportMaster import_master;
	
	private List<ProductImportDetail> import_detail;

	public ProductImportMaster getImport_master() {
		return import_master;
	}

	public void setImport_master(ProductImportMaster import_master) {
		this.import_master = import_master;
	}

	public List<ProductImportDetail> getImport_detail() {
		return import_detail;
	}

	public void setImport_detail(List<ProductImportDetail> import_detail) {
		this.import_detail = import_detail;
	}
	
}
