package com.setec_ecomerce.repository.back_end_transaction.products_import.dao;

import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.mapping.StatementType;
import org.springframework.stereotype.Repository;

import com.setec_ecomerce.repository.back_end_transaction.products_import.dto.new_accessory.AccessoryNewImportDetail;
import com.setec_ecomerce.repository.back_end_transaction.products_import.dto.new_accessory.AccessoryNewImportMaster;

@Repository
public interface AccessoryNewImportFormDAO {
	
	String C_ImportMaster = "{ call \"insertToNewAccessoryImport\"("
						    //+ "#{new_accessory_import_ids},"
						    + "#{new_accessory_import_invoice_no},"
						    + "#{new_accessory_import_invoice_date},"
						    + "#{new_accessory_import_total_amount},"
						    + "#{staff_id},"
						    + "#{supplier_id})}";
	
	String C_ImportDetail = "{ call \"insertToNewAccessoryImportDetail\"("
							+ "#{new_accessory_import_id},"
							+ "#{new_accessory_id},"
						    + "#{new_accessory_qty},"
						    + "#{new_accessory_cost},"
						    + "#{new_accessory_amount},"
						    + "#{color_id},"
						    + "#{selling_price})}";
	
	
	@Select(C_ImportMaster)
	@Options(statementType = StatementType.CALLABLE)
	@Results({
		@Result(property = "new_accessory_import_id", column = "new_accessory_import_ids"),
		@Result(property = "new_accessory_import_invoice_no", column = "new_accessory_import_invoice_no"),
		@Result(property = "new_accessory_import_invoice_date", column = "new_accessory_import_invoice_date"),
		@Result(property = "new_accessory_import_total_amount", column = "new_accessory_import_total_amount"),
		@Result(property = "staff_id", column = "staff_id"),
		@Result(property = "supplier_id", column = "supplier_id")
	})
	AccessoryNewImportMaster insertToAccessoryNewImportMaster(AccessoryNewImportMaster importMaster);
	
	
	@Select(C_ImportDetail)
	@Options(statementType = StatementType.CALLABLE)
	boolean insertToAccessoryNewImportDetail(AccessoryNewImportDetail importDetail);
	
}
