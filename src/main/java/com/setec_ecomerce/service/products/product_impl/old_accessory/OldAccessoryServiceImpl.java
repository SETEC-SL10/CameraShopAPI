package com.setec_ecomerce.service.products.product_impl.old_accessory;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.setec_ecomerce.repository.products.dao.old_accessory.OldAccessoryDAO;
import com.setec_ecomerce.repository.products.dto.PageForm;
import com.setec_ecomerce.repository.products.dto.old_accessory.OldAccessory;
import com.setec_ecomerce.repository.products.dto.products_form.ProductForm;
import com.setec_ecomerce.service.products.OldAccessoryService;

@Service
public class OldAccessoryServiceImpl implements OldAccessoryService{
	
	@Autowired
	OldAccessoryDAO oldAccessoryDao;
	
	@Override
	public OldAccessory createOldAccessory(OldAccessory oldAccessory) {
		// TODO Auto-generated method stub
		return oldAccessoryDao.createOldAccessory(oldAccessory);
	}

	@Override
	public OldAccessory updateOldAccessory(OldAccessory oldAccessory) {
		// TODO Auto-generated method stub
		return oldAccessoryDao.updateOldAccessory(oldAccessory);
	}

	@Override
	public boolean deleteOldAccessory(String id) {
		// TODO Auto-generated method stub
		return oldAccessoryDao.deleteOldAccessory(id);
	}

	@Override
	public OldAccessory findOldAccessory(String id) {
		// TODO Auto-generated method stub
		return oldAccessoryDao.findOldAccessory(id);
	}

	@Override
	public ArrayList<OldAccessory> getAllOldAccessory(PageForm page) {
		if( page.getColumnName().equals("all")){
			return oldAccessoryDao.getAllOldAccessory(page);
		}else if(page.getColumnName().equals("name")){
			return oldAccessoryDao.getAllOldAccessoryName(page);
		}else if(page.getColumnName().equals("code")){
			return oldAccessoryDao.getAllOldAccessoryCode(page);
		}else if(page.getColumnName().equals("category")){
			return oldAccessoryDao.getAllOldAccessoryCategory(page);
		}else if(page.getColumnName().equals("brand")){
			return oldAccessoryDao.getAllOldAccessoryBrand(page);
		}else if(page.getColumnName().equals("model")){
			return oldAccessoryDao.getAllOldAccessoryModel(page);
		}else{
			return null;
		}
	}
	
	@Override
	public int countPageAllOldAccessory(PageForm page){
		if( page.getColumnName().equals("all")){
			return oldAccessoryDao.countPageAllOldAccessory(page);
		}else if(page.getColumnName().equals("name")){
			return oldAccessoryDao.countPageAllOldAccessoryName(page);
		}else if(page.getColumnName().equals("code")){
			return oldAccessoryDao.countPageAllOldAccessoryCode(page);
		}else if(page.getColumnName().equals("category")){
			return oldAccessoryDao.countPageAllOldAccessoryCategory(page);
		}else if(page.getColumnName().equals("brand")){
			return oldAccessoryDao.countPageAllOldAccessoryBrand(page);
		}else if(page.getColumnName().equals("model")){
			return oldAccessoryDao.countPageAllOldAccessoryModel(page);
		}else{
			return 0;
		}
	}
}
