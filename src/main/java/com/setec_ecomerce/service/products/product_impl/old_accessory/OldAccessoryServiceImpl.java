package com.setec_ecomerce.service.products.product_impl.old_accessory;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.setec_ecomerce.repository.products.dao.old_accessory.OldAccessoryDAO;
import com.setec_ecomerce.repository.products.dao.old_accessory.OldAccessoryFormDAO;
import com.setec_ecomerce.repository.products.dto.PageForm;
import com.setec_ecomerce.repository.products.dto.old_accessory.OldAccessory;
import com.setec_ecomerce.repository.products.dto.products_form.ProductForm;
import com.setec_ecomerce.service.products.OldAccessoryService;

@Service
public class OldAccessoryServiceImpl implements OldAccessoryService{
	
	@Autowired
	OldAccessoryDAO oldAccessoryDao;

	@Autowired
	OldAccessoryFormDAO oldAccessoryFomrDao;
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
		}else if(page.getColumnName().equals("old_accessory_name")){
			return oldAccessoryDao.getAllOldAccessoryName(page);
		}else if(page.getColumnName().equals("old_accessory_code")){
			return oldAccessoryDao.getAllOldAccessoryCode(page);
		}else if(page.getColumnName().equals("category_name")){
			return oldAccessoryDao.getAllOldAccessoryCategory(page);
		}else if(page.getColumnName().equals("brand_name")){
			return oldAccessoryDao.getAllOldAccessoryBrand(page);
		}else if(page.getColumnName().equals("model_name")){
			return oldAccessoryDao.getAllOldAccessoryModel(page);
		}else{
			return null;
		}
	}

	@Override
	public ArrayList<ProductForm> getAllOldAccessoryForm(PageForm page) {
		// TODO Auto-generated method stub
		return oldAccessoryFomrDao.getAllProductForm(page);
	}

}
