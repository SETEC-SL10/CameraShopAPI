package com.setec_ecomerce.service.back_end_transaction.products_import.products_import_impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.setec_ecomerce.repository.back_end_transaction.products_import.dao.AccessoryNewImportFormDAO;
import com.setec_ecomerce.repository.back_end_transaction.products_import.dto.new_accessory.AccessoryNewImportDetail;
import com.setec_ecomerce.repository.back_end_transaction.products_import.dto.new_accessory.AccessoryNewImportForm;
import com.setec_ecomerce.repository.back_end_transaction.products_import.dto.new_accessory.AccessoryNewImportMaster;
import com.setec_ecomerce.service.back_end_transaction.products_import.AccessoryNewImportFormService;

@Service
public class AccessoryNewImportFormServiceImpl implements AccessoryNewImportFormService{

	@Autowired
	private AccessoryNewImportFormDAO importFormDao;
	
	@Override
	public boolean insertAccessoryNewImportForm(AccessoryNewImportForm importForm) {
		importForm.setImportMaster(insertToAccessoryNewImportMaster(importForm.getImportMaster()));
		if(importForm.getImportMaster() == null){
			return false;
		}else{
			importForm.setImportMasterID();
			return insertToAccessoryNewImportDetail(importForm.getImportDetail());
		}
	}
	
	private AccessoryNewImportMaster insertToAccessoryNewImportMaster(AccessoryNewImportMaster importMaster){
		return importFormDao.insertToAccessoryNewImportMaster(importMaster);
	}
	
	private boolean insertToAccessoryNewImportDetail(List<AccessoryNewImportDetail> importDetails){
		boolean result = false;
		for (AccessoryNewImportDetail importDetail : importDetails) {
			result = importFormDao.insertToAccessoryNewImportDetail(importDetail);
		}
		return result;
	}
	
}
