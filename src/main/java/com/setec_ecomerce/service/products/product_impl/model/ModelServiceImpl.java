package com.setec_ecomerce.service.products.product_impl.model;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.setec_ecomerce.repository.products.dao.model.ModelDAO;
import com.setec_ecomerce.repository.products.dto.model.Model;
import com.setec_ecomerce.service.products.ModelService;

@Service
public class ModelServiceImpl implements ModelService{

	@Autowired
	private ModelDAO modelDao;
	
	@Override
	public Model insertModel(Model model) {
		// TODO Auto-generated method stub
		return modelDao.insertModel(model);
	}

	@Override
	public Model updateModel(Model model) {
		// TODO Auto-generated method stub
		return modelDao.updateModel(model);
	}

	@Override
	public boolean deleteModel(int id) {
		// TODO Auto-generated method stub
		return modelDao.deleteModel(id);
	}

	@Override
	public Model findModel(int id) {
		// TODO Auto-generated method stub
		return modelDao.findModel(id);
	}

	@Override
	public ArrayList<Model> findModelByCamera(int cameraType) {
		// TODO Auto-generated method stub
		return modelDao.findModelByCamera(cameraType);
	}

	@Override
	public ArrayList<Model> findModelByAccessory(int accessoryType) {
		// TODO Auto-generated method stub
		return modelDao.findModelByAccessory(accessoryType);
	}

	@Override
	public ArrayList<Model> findAllModels() {
		// TODO Auto-generated method stub
		return modelDao.findAllModels();
	}
	
}
