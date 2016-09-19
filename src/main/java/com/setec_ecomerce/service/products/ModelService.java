package com.setec_ecomerce.service.products;

import java.util.ArrayList;

import com.setec_ecomerce.repository.products.dto.model.Model;

public interface ModelService {
	
	Model insertModel(Model model);
	Model updateModel(Model model);
	boolean deleteModel(int id);
	Model findModel(int id);
	ArrayList<Model> findModelByCamera(int cameraType);
	ArrayList<Model> findModelByAccessory(int accessoryType);
	ArrayList<Model> findAllModels();
	
}
