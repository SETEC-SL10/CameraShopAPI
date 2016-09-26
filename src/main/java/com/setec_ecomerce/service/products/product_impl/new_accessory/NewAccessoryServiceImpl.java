package com.setec_ecomerce.service.products.product_impl.new_accessory;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.setec_ecomerce.repository.products.dao.new_accessory.NewAccessoryDAO;
import com.setec_ecomerce.repository.products.dto.PageForm;
import com.setec_ecomerce.repository.products.dto.new_accessory.NewAccessory;
import com.setec_ecomerce.repository.products.dto.products_form.ProductForm;
import com.setec_ecomerce.service.products.NewAccessoryService;

@Service
public class NewAccessoryServiceImpl implements NewAccessoryService{
	
	@Autowired
	private NewAccessoryDAO newAccessoryDao;
	
	@Override
	public NewAccessory createNewAccessory(NewAccessory newAccessory) {
		// TODO Auto-generated method stub
		return newAccessoryDao.createNewAccessory(newAccessory);
	}

	@Override
	public NewAccessory updateNewAccessory(NewAccessory newAccessory) {
		// TODO Auto-generated method stub
		return newAccessoryDao.updateNewAccessory(newAccessory);
	}

	@Override
	public boolean deleteNewAccessory(String id) {
		// TODO Auto-generated method stub
		return newAccessoryDao.deleteNewAccessory(id);
	}

	@Override
	public NewAccessory findNewAccessory(String id) {
		// TODO Auto-generated method stub
		return newAccessoryDao.findNewAccessory(id);
	}

	@Override
	public ArrayList<NewAccessory> getAllNewAccessory(PageForm page) {
		if( page.getColumnName().equals("all")){
			return newAccessoryDao.getAllNewAccessory(page);
		}else if(page.getColumnName().equals("name")){
			return newAccessoryDao.getAllNewAccessoryName(page);
		}else if(page.getColumnName().equals("code")){
			return newAccessoryDao.getAllNewAccessoryCode(page);
		}else if(page.getColumnName().equals("category")){
			return newAccessoryDao.getAllNewAccessoryCategory(page);
		}else if(page.getColumnName().equals("brand")){
			return newAccessoryDao.getAllNewAccessoryBrand(page);
		}else if(page.getColumnName().equals("model")){
			return newAccessoryDao.getAllNewAccessoryModel(page);
		}else{
			return null;
		}
	}
	
	@Override
	public int countPageAllNewAccessory(PageForm page){
		if( page.getColumnName().equals("all")){
			return newAccessoryDao.countPageAllNewAccessory(page);
		}else if(page.getColumnName().equals("name")){
			return newAccessoryDao.countPageAllNewAccessoryName(page);
		}else if(page.getColumnName().equals("code")){
			return newAccessoryDao.countPageAllNewAccessoryCode(page);
		}else if(page.getColumnName().equals("category")){
			return newAccessoryDao.countPageAllNewAccessoryCategory(page);
		}else if(page.getColumnName().equals("brand")){
			return newAccessoryDao.countPageAllNewAccessoryBrand(page);
		}else if(page.getColumnName().equals("model")){
			return newAccessoryDao.countPageAllNewAccessoryModel(page);
		}else{
			return 0;
		}
	}

}
