package com.setec_ecomerce.repository.back_end_transaction.products_import.dto.old_camera;

import java.util.List;

public class CameraOldImportForm {

	private CameraOldImportMaster importMaster;
	
	private List<CameraOldImportDetail> importDetails;

	public CameraOldImportMaster getImportMaster() {
		return importMaster;
	}

	public void setImportMaster(CameraOldImportMaster importMaster) {
		this.importMaster = importMaster;
	}

	public List<CameraOldImportDetail> getImportDetails() {
		return importDetails;
	}

	public void setImportDetails(List<CameraOldImportDetail> importDetails) {
		this.importDetails = importDetails;
	}
	
	public void setImportMasterID(){
		for (CameraOldImportDetail importDetail : this.importDetails) {
			importDetail.setOld_camera_import_id(this.getImportMaster().getOld_camera_improt_id());
		}
	}
}
