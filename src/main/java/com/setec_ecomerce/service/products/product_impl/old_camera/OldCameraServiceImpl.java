package com.setec_ecomerce.service.products.product_impl.old_camera;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.setec_ecomerce.repository.products.dao.old_camera.OldCameraDAO;
import com.setec_ecomerce.repository.products.dao.old_camera.OldCameraFormDAO;
import com.setec_ecomerce.repository.products.dto.PageForm;
import com.setec_ecomerce.repository.products.dto.old_camera.OldCamera;
import com.setec_ecomerce.repository.products.dto.products_form.ProductForm;
import com.setec_ecomerce.service.products.OldCameraService;

@Service
public class OldCameraServiceImpl implements OldCameraService{
	
	@Autowired
	private OldCameraDAO oldCameraDao;
	
	@Autowired
	private OldCameraFormDAO oldCameraFormDao;
	
	@Override
	public OldCamera insertOldCameraService(OldCamera oldCamera) {
		// TODO Auto-generated method stub
		return oldCameraDao.insertOldCameraService(oldCamera);
	}

	@Override
	public OldCamera updateOldCameraService(OldCamera oldCamera) {
		// TODO Auto-generated method stub
		return oldCameraDao.updateOldCameraService(oldCamera);
	}

	@Override
	public boolean deletedOldCameraService(String id) {
		// TODO Auto-generated method stub
		return oldCameraDao.deletedOldCameraService(id);
	}

	@Override
	public OldCamera findOldCameraService(String id) {
		// TODO Auto-generated method stub
		return oldCameraDao.findOldCameraService(id);
	}

	@Override
	public ArrayList<OldCamera> getAllOldCamera(PageForm page) {
		if( page.getColumnName().equals("all")){
			return oldCameraDao.getAllOldCamera(page);
		}else if(page.getColumnName().equals("old_camera_name")){
			return oldCameraDao.getAllOldCameraName(page);
		}else if(page.getColumnName().equals("old_camera_code")){
			return oldCameraDao.getAllOldCameraCode(page);
		}else if(page.getColumnName().equals("category_name")){
			return oldCameraDao.getAllOldCameraCategory(page);
		}else if(page.getColumnName().equals("brand_name")){
			return oldCameraDao.getAllOldCameraBrand(page);
		}else if(page.getColumnName().equals("model_name")){
			return oldCameraDao.getAllOldCameraModel(page);
		}else{
			return null;
		}
	}

	@Override
	public ArrayList<ProductForm> getAllOldCameraForm(PageForm page) {
		// TODO Auto-generated method stub
		return oldCameraFormDao.getAllProductForm(page);
	}

}
