package com.setec_ecomerce.service.products.product_impl.new_camera;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.setec_ecomerce.repository.products.dao.new_camera.NewCameraDAO;
import com.setec_ecomerce.repository.products.dao.new_camera.NewCameraFormDAO;
import com.setec_ecomerce.repository.products.dto.PageForm;
import com.setec_ecomerce.repository.products.dto.new_camera.NewCamera;
import com.setec_ecomerce.repository.products.dto.products_form.ProductForm;
import com.setec_ecomerce.service.products.NewCameraService;

@Service
public class NewCameraServiceImpl implements NewCameraService{
	
	@Autowired
	private NewCameraDAO newCameraDao;
	
	@Autowired
	private NewCameraFormDAO newCameraFormDao;
	
	@Override
	public NewCamera insertNewCameraService(NewCamera newCamera) {
		return newCameraDao.createNewCamera(newCamera);
	}

	@Override
	public NewCamera updateNewCameraService(NewCamera newCamera) {
		return newCameraDao.updateNewCamera(newCamera);
	}

	@Override
	public boolean deletedNewCameraService(String id) {
		return newCameraDao.deleteNewCamera(id);
	}

	@Override
	public NewCamera findNewCameraService(String id) {
		// TODO Auto-generated method stub
		return newCameraDao.findNewCameraService(id);
	}

	@Override
	public ArrayList<NewCamera> getAllNewCamera(PageForm page) {
		if( page.getColumnName().equals("all")){
			return newCameraDao.getAllNewCamera(page);
		}else if(page.getColumnName().equals("new_camera_name")){
			return newCameraDao.getAllNewCameraName(page);
		}else if(page.getColumnName().equals("new_camera_code")){
			return newCameraDao.getAllNewCameraCode(page);
		}else if(page.getColumnName().equals("category_name")){
			return newCameraDao.getAllNewCameraCategory(page);
		}else if(page.getColumnName().equals("brand_name")){
			return newCameraDao.getAllNewCameraBrand(page);
		}else if(page.getColumnName().equals("model_name")){
			return newCameraDao.getAllNewCameraModel(page);
		}else{
			return null;
		}
	}

	@Override
	public ArrayList<ProductForm> getAllNewCameraForm(PageForm page) {
		// TODO Auto-generated method stub
		return newCameraFormDao.getAllProductForm(page);
	}
}
