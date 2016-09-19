package com.setec_ecomerce.repository.back_end_transaction.products_import.dto.new_accessory;

import java.util.List;

public class AccessoryNewImportForm {
	
	private AccessoryNewImportMaster importMaster;
	
	private List<AccessoryNewImportDetail> importDetails;

	public AccessoryNewImportMaster getImportMaster() {
		return importMaster;
	}

	public void setImportMaster(AccessoryNewImportMaster importMaster) {
		this.importMaster = importMaster;
	}

	public List<AccessoryNewImportDetail> getImportDetail() {
		return importDetails;
	}

	public void setImportDetail(List<AccessoryNewImportDetail> importDetail) {
		this.importDetails = importDetail;
	}
	
	public void setImportMasterID(){
		for (AccessoryNewImportDetail importDetail : importDetails) {
			importDetail.setNew_accessory_import_id(importMaster.getNew_accessory_import_id());
		}
	}
	
}
