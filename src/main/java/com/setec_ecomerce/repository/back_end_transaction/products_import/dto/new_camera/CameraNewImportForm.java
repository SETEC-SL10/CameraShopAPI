package com.setec_ecomerce.repository.back_end_transaction.products_import.dto.new_camera;

import java.util.List;

public class CameraNewImportForm {
	
	private CameraNewImportMaster importMaster;
	
	private List<CameraNewImportDetail> importDetails;

	public CameraNewImportMaster getImportMaster() {
		return importMaster;
	}

	public void setImportMaster(CameraNewImportMaster importMaster) {
		this.importMaster = importMaster;
	}

	public List<CameraNewImportDetail> getImportDetails() {
		return importDetails;
	}

	public void setImportDetails(List<CameraNewImportDetail> importDetails) {
		this.importDetails = importDetails;
	}
	
	public void setImportMasterID(){
		for (CameraNewImportDetail importDetail : this.importDetails) {
			importDetail.setNew_camera_import_id(importMaster.getNew_camera_improt_id());
		}
	}
	
}
