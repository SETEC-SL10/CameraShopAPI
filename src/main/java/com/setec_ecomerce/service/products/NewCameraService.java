package com.setec_ecomerce.service.products;

import java.util.ArrayList;

import com.setec_ecomerce.repository.products.dto.PageForm;
import com.setec_ecomerce.repository.products.dto.new_camera.NewCamera;
import com.setec_ecomerce.repository.products.dto.products_form.ProductForm;

public interface NewCameraService {
	NewCamera insertNewCameraService(NewCamera newCamera);
	NewCamera updateNewCameraService(NewCamera newCamera);
	boolean deletedNewCameraService(String id);
	NewCamera findNewCameraService(String id);
	ArrayList<NewCamera> getAllNewCamera(PageForm page);
	public int countPageAllNewCamera(PageForm page);
}
