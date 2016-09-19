package com.setec_ecomerce.service.products;

import java.util.ArrayList;

import com.setec_ecomerce.repository.products.dto.category.Category;


public interface CategoryService {
	Category insertCategory(Category category);
	Category updateCategory(Category category);
	boolean deleteCategory(int id);
	Category findCategory(int id);
	ArrayList<Category> findCategoryByCamera(int typeCamera);
	ArrayList<Category> findCategoryByAccessory(int typeAccessory);
	ArrayList<Category> findAllCategorys();
}
