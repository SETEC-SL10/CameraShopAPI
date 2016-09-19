package com.setec_ecomerce.repository.back_end_transaction.products_import.dao;

import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.mapping.StatementType;
import org.springframework.stereotype.Repository;

import com.setec_ecomerce.repository.back_end_transaction.products_import.dto.old_accessory.AccessoryOldImportDetail;
import com.setec_ecomerce.repository.back_end_transaction.products_import.dto.old_accessory.AccessoryOldImportMaster;

@Repository
public interface AccessoryOldImportFormDAO {

	String C_ImportMaster = "{ call \"insertToOldAccessoryImport\"("
						    //OUT old_accessory_import_ids},"
						    + "#{old_accessory_import_invoice_no},"
						    + "#{old_accessory_import_invoice_date},"
						    + "#{old_accessory_import_total_amount},"
						    + "#{staff_id})}";
	
	String C_ImportDetail = "{call \"insertToOldAccessoryImportDetail\"("
							+ "#{old_accessory_import_id},"
							+ "#{old_accessory_id},"
						    + "#{color_id},"
						    + "#{code_no},"
						    + "#{old_accessory_qty},"
						    + "#{old_accessory_cost},"
						    + "#{old_accessory_sell_price},"
						    + "#{description})}";
	
	@Select(C_ImportMaster)
	@Options(statementType = StatementType.CALLABLE)
	@Results({
		@Result(property = "old_accessory_import_id", column = "old_accessory_import_ids"),
		@Result(property = "old_accessory_import_invoice_no", column = "old_accessory_import_invoice_no"),
		@Result(property = "old_accessory_import_invoice_date", column = "old_accessory_import_invoice_date"),
		@Result(property = "old_accessory_import_total_amount", column = "old_accessory_import_total_amount"),
		@Result(property = "staff_id", column = "staff_id"),
	})
	AccessoryOldImportMaster intsertToAccessoryOldImportMaster(AccessoryOldImportMaster importMaster);
	
	
	@Select(C_ImportDetail)
	@Options(statementType = StatementType.CALLABLE)
	boolean intsertToAccessoryOldImportDetail(AccessoryOldImportDetail importDetail);
}
