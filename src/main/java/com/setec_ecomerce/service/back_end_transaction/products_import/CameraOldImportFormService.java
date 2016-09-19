package com.setec_ecomerce.service.back_end_transaction.products_import;

import com.setec_ecomerce.repository.back_end_transaction.products_import.dto.old_camera.CameraOldImportForm;

public interface CameraOldImportFormService {
	boolean insertCameraOldImportForm(CameraOldImportForm importForm);
}
