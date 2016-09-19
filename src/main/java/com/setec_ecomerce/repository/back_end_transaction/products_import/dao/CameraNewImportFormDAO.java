package com.setec_ecomerce.repository.back_end_transaction.products_import.dao;

import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.mapping.StatementType;
import org.springframework.stereotype.Repository;

import com.setec_ecomerce.repository.back_end_transaction.products_import.dto.new_camera.CameraNewImportDetail;
import com.setec_ecomerce.repository.back_end_transaction.products_import.dto.new_camera.CameraNewImportMaster;

@Repository
public interface CameraNewImportFormDAO {
	
	String C_ImportMaster = "{ call \"insertToNewCameraImport\"("
						    //OUT new_camera_improt_ids integer,
						    + "#{new_camera_import_invoice_no},"
						    + "#{new_camera_import_invoice_date},"
						    + "#{new_camera_import_total_amount},"
						    + "#{staff_id},"
						    + "#{supplier_id})}";
	
	String C_ImportDetail = "{ call \"insertToNewCameraImportDetail\"("
							+ "#{new_camera_import_id},"
							+ "#{new_camera_id},"
						    + "#{color_id},"
						    + "#{new_camera_serial},"
						    + "#{new_camera_cost},"
						    + "#{selling_price})}";
	
	
	@Select(C_ImportMaster)
	@Options(statementType = StatementType.CALLABLE)
	@Results({
		@Result(property = "new_camera_improt_id", column = "new_camera_improt_ids"),
		@Result(property = "new_camera_import_invoice_no", column = "new_camera_import_invoice_no"),
		@Result(property = "new_camera_import_invoice_date", column = "new_camera_import_invoice_date"),
		@Result(property = "new_camera_import_total_amount", column = "new_camera_import_total_amount"),
		@Result(property = "staff_id", column = "staff_id"),
		@Result(property = "supplier_id", column = "supplier_id")
	})
	CameraNewImportMaster insertToCameraNewImportMaster(CameraNewImportMaster importMaster);
	
	
	@Select(C_ImportDetail)
	@Options(statementType = StatementType.CALLABLE)
	boolean insertToCameraNewImportDetail(CameraNewImportDetail importDetail);
	
}
