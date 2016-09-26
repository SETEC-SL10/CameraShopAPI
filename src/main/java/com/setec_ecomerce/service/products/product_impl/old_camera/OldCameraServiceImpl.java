package com.setec_ecomerce.service.products.product_impl.old_camera;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.setec_ecomerce.repository.products.dao.old_camera.OldCameraDAO;
import com.setec_ecomerce.repository.products.dto.PageForm;
import com.setec_ecomerce.repository.products.dto.old_camera.OldCamera;
import com.setec_ecomerce.repository.products.dto.products_form.ProductForm;
import com.setec_ecomerce.service.products.OldCameraService;

@Service
public class OldCameraServiceImpl implements OldCameraService{
	
	@Autowired
	private OldCameraDAO oldCameraDao;
	
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
		}else if(page.getColumnName().equals("name")){
			return oldCameraDao.getAllOldCameraName(page);
		}else if(page.getColumnName().equals("code")){
			return oldCameraDao.getAllOldCameraCode(page);
		}else if(page.getColumnName().equals("category")){
			return oldCameraDao.getAllOldCameraCategory(page);
		}else if(page.getColumnName().equals("brand")){
			return oldCameraDao.getAllOldCameraBrand(page);
		}else if(page.getColumnName().equals("model")){
			return oldCameraDao.getAllOldCameraModel(page);
		}else{
			return null;
		}
	}
	
	@Override
	public int countPageAllOldCamera(PageForm page){
		if( page.getColumnName().equals("all")){
			return oldCameraDao.countPageAllOldCamera(page);
		}else if(page.getColumnName().equals("name")){
			return oldCameraDao.countPageAllOldCameraName(page);
		}else if(page.getColumnName().equals("code")){
			return oldCameraDao.countPageAllOldCameraCode(page);
		}else if(page.getColumnName().equals("category")){
			return oldCameraDao.countPageAllOldCameraCategory(page);
		}else if(page.getColumnName().equals("brand")){
			return oldCameraDao.countPageAllOldCameraBrand(page);
		}else if(page.getColumnName().equals("model")){
			return oldCameraDao.countPageAllOldCameraModel(page);
		}else{
			return 0;
		}
	}

}
