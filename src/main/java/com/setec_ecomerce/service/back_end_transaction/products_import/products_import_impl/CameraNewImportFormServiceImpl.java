package com.setec_ecomerce.service.back_end_transaction.products_import.products_import_impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.setec_ecomerce.repository.back_end_transaction.products_import.dao.CameraNewImportFormDAO;
import com.setec_ecomerce.repository.back_end_transaction.products_import.dto.new_camera.CameraNewImportDetail;
import com.setec_ecomerce.repository.back_end_transaction.products_import.dto.new_camera.CameraNewImportForm;
import com.setec_ecomerce.repository.back_end_transaction.products_import.dto.new_camera.CameraNewImportMaster;
import com.setec_ecomerce.service.back_end_transaction.products_import.CameraNewImportFormService;

@Service
public class CameraNewImportFormServiceImpl implements CameraNewImportFormService{

	@Autowired
	private CameraNewImportFormDAO importFormDao;
	@Override
	public boolean insertCameraNewImportForm(CameraNewImportForm importForm) {
		importForm.setImportMaster(insertToCameraNewImportMaster(importForm.getImportMaster()));
		if(importForm.getImportMaster() == null){
			return false;
		}else{
			importForm.setImportMasterID();
			return insertToCameraNewImportDetail(importForm.getImportDetails());
		}
	}
	
	private CameraNewImportMaster insertToCameraNewImportMaster(CameraNewImportMaster importMaster){
		return importFormDao.insertToCameraNewImportMaster(importMaster);
	}
	
	private boolean insertToCameraNewImportDetail(List<CameraNewImportDetail> importDetails){
		boolean result = false;
		for (CameraNewImportDetail importDetail : importDetails) {
			result = importFormDao.insertToCameraNewImportDetail(importDetail);
		}
		return result;
	}

}
