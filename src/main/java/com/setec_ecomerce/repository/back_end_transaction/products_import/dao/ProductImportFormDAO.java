package com.setec_ecomerce.repository.back_end_transaction.products_import.dao;

import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.mapping.StatementType;
import org.springframework.stereotype.Repository;

import com.setec_ecomerce.repository.back_end_transaction.products_import.dto.ProductImportForm;

@Repository
public interface ProductImportFormDAO {
	
	/*String C_ProductImport = "{ call \"insertToImportForm\"(#{import_master},#{import_detail})}";*/
	String C_ProductImport = "SELECT \"insertToImportForm\"(#{productForm,javaType=String,jdbcType=OTHER}::json)";
	
	/*@Select(C_ProductImport)
	@Options(statementType = StatementType.CALLABLE)
	void insertImport(ProductImportForm productForm);*/
	
	@Select(C_ProductImport)
	String insertImport(String productForm);
}
