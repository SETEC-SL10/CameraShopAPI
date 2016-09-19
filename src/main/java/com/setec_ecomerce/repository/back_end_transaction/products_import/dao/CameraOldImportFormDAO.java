package com.setec_ecomerce.repository.back_end_transaction.products_import.dao;

import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.mapping.StatementType;
import org.springframework.stereotype.Repository;

import com.setec_ecomerce.repository.back_end_transaction.products_import.dto.old_camera.CameraOldImportDetail;
import com.setec_ecomerce.repository.back_end_transaction.products_import.dto.old_camera.CameraOldImportMaster;

@Repository
public interface CameraOldImportFormDAO {

	String C_ImportMaster = "{ call \"insertToOldCameraImport\"("
						    //OUT old_camera_improt_ids integer,
						    + "#{old_camera_import_invoice_no},"
						    + "#{old_camera_import_invoice_date},"
						    + "#{old_camera_import_total_amount},"
						    + "#{staff_id})}";
	
	String C_ImportDetail = "{ call \"insertToOldCameraImportDetail\"("
							+ "#{old_camera_import_id},"
							+ "#{old_camera_id},"
						    + "#{color_id},"
						    + "#{old_camera_serial},"
						    + "#{old_camera_cost},"
						    + "#{selling_price},"
						    + "#{description})}";
	
	@Select(C_ImportMaster)
	@Options(statementType = StatementType.CALLABLE)
	@Results({
		@Result(property = "old_camera_improt_id", column = "old_camera_improt_ids"),
		@Result(property = "old_camera_import_invoice_no", column = "old_camera_import_invoice_no"),
		@Result(property = "old_camera_import_invoice_date", column = "old_camera_import_invoice_date"),
		@Result(property = "old_camera_import_total_amount", column = "old_camera_import_total_amount"),
		@Result(property = "staff_id", column = "staff_id")
	})
	CameraOldImportMaster insertToCameraOldImportMaster(CameraOldImportMaster importMaster);
	

	@Select(C_ImportDetail)
	@Options(statementType = StatementType.CALLABLE)
	boolean insertToCameraOldImportDetail(CameraOldImportDetail importDetail);
	
}
