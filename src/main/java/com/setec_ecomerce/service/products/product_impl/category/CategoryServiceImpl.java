package com.setec_ecomerce.service.products.product_impl.category;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.setec_ecomerce.repository.products.dao.category.CategoryDAO;
import com.setec_ecomerce.repository.products.dto.category.Category;
import com.setec_ecomerce.service.products.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService{

	@Autowired
	private CategoryDAO categoryDao;
	@Override
	public Category insertCategory(Category category) {
		// TODO Auto-generated method stub
		return categoryDao.insertCategory(category);
	}

	@Override
	public Category updateCategory(Category category) {
		// TODO Auto-generated method stub
		return categoryDao.updateCategory(category);
	}

	@Override
	public boolean deleteCategory(int id) {
		// TODO Auto-generated method stub
		return categoryDao.deleteCategory(id);
	}

	@Override
	public Category findCategory(int id) {
		// TODO Auto-generated method stub
		return categoryDao.findCategory(id);
	}

	@Override
	public ArrayList<Category> findCategoryByCamera(int typeCamera) {
		// TODO Auto-generated method stub
		return categoryDao.findCategoryByCamera(typeCamera);
	}

	@Override
	public ArrayList<Category> findCategoryByAccessory(int typeAccessory) {
		// TODO Auto-generated method stub
		return categoryDao.findCategoryByAccessory(typeAccessory);
	}

	@Override
	public ArrayList<Category> findAllCategorys() {
		// TODO Auto-generated method stub
		return categoryDao.findAllCategorys();
	}

}
