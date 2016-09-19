package com.setec_ecomerce.service.back_end_transaction.products_import.products_import_impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.setec_ecomerce.repository.back_end_transaction.products_import.dao.CameraOldImportFormDAO;
import com.setec_ecomerce.repository.back_end_transaction.products_import.dto.old_camera.CameraOldImportDetail;
import com.setec_ecomerce.repository.back_end_transaction.products_import.dto.old_camera.CameraOldImportForm;
import com.setec_ecomerce.repository.back_end_transaction.products_import.dto.old_camera.CameraOldImportMaster;
import com.setec_ecomerce.service.back_end_transaction.products_import.CameraOldImportFormService;

@Service
public class CameraOldImportFormServiceImpl implements CameraOldImportFormService{

	@Autowired
	private CameraOldImportFormDAO importFormDao;
	
	@Override
	public boolean insertCameraOldImportForm(CameraOldImportForm importForm) {
		importForm.setImportMaster(insertToCameraOldImportMaster(importForm.getImportMaster()));
		if(importForm.getImportMaster() == null){
			return false;
		}else{
			importForm.setImportMasterID();
			return insertToCameraOldImportDetail(importForm.getImportDetails());
		}
	}
	
	private CameraOldImportMaster insertToCameraOldImportMaster(CameraOldImportMaster importMaster){
		return importFormDao.insertToCameraOldImportMaster(importMaster);
	}
	
	private boolean insertToCameraOldImportDetail(List<CameraOldImportDetail> importDetails){
		boolean result = false;
		for (CameraOldImportDetail importDetail : importDetails) {
			result = importFormDao.insertToCameraOldImportDetail(importDetail);
		}
		return result;
	}

}
