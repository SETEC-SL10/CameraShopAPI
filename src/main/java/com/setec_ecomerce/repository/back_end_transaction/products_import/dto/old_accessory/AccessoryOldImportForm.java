package com.setec_ecomerce.repository.back_end_transaction.products_import.dto.old_accessory;

import java.util.List;

public class AccessoryOldImportForm {

	private AccessoryOldImportMaster importMaster;

	private List<AccessoryOldImportDetail> importDetails;

	public AccessoryOldImportMaster getImportMaster() {
		return importMaster;
	}

	public void setImportMaster(AccessoryOldImportMaster importMaster) {
		this.importMaster = importMaster;
	}

	public List<AccessoryOldImportDetail> getImportDetails() {
		return importDetails;
	}

	public void setImportDetails(List<AccessoryOldImportDetail> importDetails) {
		this.importDetails = importDetails;
	}

	public void setImportMasterID(){
		for (AccessoryOldImportDetail importDetail : this.importDetails) {
			importDetail.setOld_accessory_import_id(importMaster.getOld_accessory_import_id());
		}
	}

}
