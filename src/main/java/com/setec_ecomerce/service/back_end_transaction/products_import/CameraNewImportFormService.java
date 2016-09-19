package com.setec_ecomerce.service.back_end_transaction.products_import;

import com.setec_ecomerce.repository.back_end_transaction.products_import.dto.new_camera.CameraNewImportForm;

public interface CameraNewImportFormService {
	
	boolean insertCameraNewImportForm(CameraNewImportForm importForm);
	
}
