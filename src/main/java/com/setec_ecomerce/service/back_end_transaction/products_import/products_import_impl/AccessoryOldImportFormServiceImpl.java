package com.setec_ecomerce.service.back_end_transaction.products_import.products_import_impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.setec_ecomerce.repository.back_end_transaction.products_import.dao.AccessoryOldImportFormDAO;
import com.setec_ecomerce.repository.back_end_transaction.products_import.dto.old_accessory.AccessoryOldImportDetail;
import com.setec_ecomerce.repository.back_end_transaction.products_import.dto.old_accessory.AccessoryOldImportForm;
import com.setec_ecomerce.repository.back_end_transaction.products_import.dto.old_accessory.AccessoryOldImportMaster;
import com.setec_ecomerce.service.back_end_transaction.products_import.AccessoryOldImportFormService;

@Service
public class AccessoryOldImportFormServiceImpl implements AccessoryOldImportFormService{

	@Autowired
	private AccessoryOldImportFormDAO importFormDao;
	
	@Override
	public boolean insertToAccessoryOldImportForm(AccessoryOldImportForm importForm) {
		importForm.setImportMaster(insertToAccessoryOldImportMaster(importForm.getImportMaster()));
		if(importForm.getImportMaster() == null){
			return false;
		}else{
			importForm.setImportMasterID();
			return insertToAccessoryOldImportDetail(importForm.getImportDetails());
		}
	}
	
	private AccessoryOldImportMaster insertToAccessoryOldImportMaster(AccessoryOldImportMaster importMaster){
		return importFormDao.intsertToAccessoryOldImportMaster(importMaster);
	}
	
	private boolean insertToAccessoryOldImportDetail(List<AccessoryOldImportDetail> importDetails){
		boolean result = false;
		for (AccessoryOldImportDetail importDetail : importDetails) {
			result = importFormDao.intsertToAccessoryOldImportDetail(importDetail);
		}
		return result;
	}

}
