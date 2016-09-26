package com.setec_ecomerce.service.products;

import java.util.ArrayList;

import com.setec_ecomerce.repository.products.dto.PageForm;
import com.setec_ecomerce.repository.products.dto.old_camera.OldCamera;
import com.setec_ecomerce.repository.products.dto.products_form.ProductForm;

public interface OldCameraService {
	OldCamera insertOldCameraService(OldCamera oldCamera);
	OldCamera updateOldCameraService(OldCamera oldCamera);
	boolean deletedOldCameraService(String id);
	OldCamera findOldCameraService(String id);
	ArrayList<OldCamera> getAllOldCamera(PageForm page);
	public int countPageAllOldCamera(PageForm page);
}
