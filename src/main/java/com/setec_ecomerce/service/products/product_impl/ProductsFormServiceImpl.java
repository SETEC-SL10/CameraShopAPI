package com.setec_ecomerce.service.products.product_impl;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.setec_ecomerce.repository.products.dao.ProductFormDAO;
import com.setec_ecomerce.repository.products.dto.PageForm;
import com.setec_ecomerce.repository.products.dto.products_form.ProductForm;
import com.setec_ecomerce.service.products.ProductsFormService;

@Service
public class ProductsFormServiceImpl implements ProductsFormService{
	
	@Autowired
	private ProductFormDAO productDao;

	@Override
	public ArrayList<ProductForm> getAllProductForm(PageForm page) {
		if( page.getColumnName().equals("all")){
			return productDao.getAllProductForm(page);
		}else if(page.getColumnName().equals("name")){
			return productDao.getAllProductFormName(page);
		}else if(page.getColumnName().equals("category")){
			return productDao.getAllProductFormCategory(page);
		}else if(page.getColumnName().equals("brand")){
			return productDao.getAllProductFormBrand(page);
		}else if(page.getColumnName().equals("model")){
			return productDao.getAllProductFormModel(page);
		}else if(page.getColumnName().equals("color")){
			return productDao.getAllProductFormColor(page);
		}else{
			return null;
		}
	}

	@Override
	public ArrayList<ProductForm> getAllCameraNewForm(PageForm page) {
		if( page.getColumnName().equals("all")){
			return productDao.getAllCameraNewForm(page);
		}else if(page.getColumnName().equals("name")){
			return productDao.getAllCameraNewFormName(page);
		}else if(page.getColumnName().equals("category")){
			return productDao.getAllCameraNewFormCategory(page);
		}else if(page.getColumnName().equals("brand")){
			return productDao.getAllCameraNewFormBrand(page);
		}else if(page.getColumnName().equals("model")){
			return productDao.getAllCameraNewFormModel(page);
		}else if(page.getColumnName().equals("color")){
			return productDao.getAllCameraNewFormColor(page);
		}else{
			return null;
		}
	}

	@Override
	public ArrayList<ProductForm> getAllCameraOldForm(PageForm page) {
		if( page.getColumnName().equals("all")){
			return productDao.getAllCameraOldForm(page);
		}else if(page.getColumnName().equals("name")){
			return productDao.getAllCameraOldFormName(page);
		}else if(page.getColumnName().equals("category")){
			return productDao.getAllCameraOldFormCategory(page);
		}else if(page.getColumnName().equals("brand")){
			return productDao.getAllCameraOldFormBrand(page);
		}else if(page.getColumnName().equals("model")){
			return productDao.getAllCameraOldFormModel(page);
		}else if(page.getColumnName().equals("color")){
			return productDao.getAllCameraOldFormColor(page);
		}else{
			return null;
		}
	}

	@Override
	public ArrayList<ProductForm> getAllAccessoryOldForm(PageForm page) {
		if( page.getColumnName().equals("all")){
			return productDao.getAllAccessoryOldForm(page);
		}else if(page.getColumnName().equals("name")){
			return productDao.getAllAccessoryOldFormName(page);
		}else if(page.getColumnName().equals("category")){
			return productDao.getAllAccessoryOldFormCategory(page);
		}else if(page.getColumnName().equals("brand")){
			return productDao.getAllAccessoryOldFormBrand(page);
		}else if(page.getColumnName().equals("model")){
			return productDao.getAllAccessoryOldFormModel(page);
		}else if(page.getColumnName().equals("color")){
			return productDao.getAllAccessoryOldFormColor(page);
		}else{
			return null;
		}
	}

	@Override
	public ArrayList<ProductForm> getAllAccessoryNewForm(PageForm page) {
		if( page.getColumnName().equals("all")){
			return productDao.getAllAccessoryNewForm(page);
		}else if(page.getColumnName().equals("name")){
			return productDao.getAllAccessoryNewFormName(page);
		}else if(page.getColumnName().equals("category")){
			return productDao.getAllAccessoryNewFormCategory(page);
		}else if(page.getColumnName().equals("brand")){
			return productDao.getAllAccessoryNewFormBrand(page);
		}else if(page.getColumnName().equals("model")){
			return productDao.getAllAccessoryNewFormModel(page);
		}else if(page.getColumnName().equals("color")){
			return productDao.getAllAccessoryNewFormColor(page);
		}else{
			return null;
		}
	}

	@Override
	public int countPageProductForm(PageForm page) {
		if( page.getColumnName().equals("all")){
			return (int) Math.ceil(productDao.countAllProductForm(page) / (double)page.getLimit());
		}else if(page.getColumnName().equals("name")){
			return (int) Math.ceil(productDao.countAllProductFormName(page) / (double)page.getLimit());
		}else if(page.getColumnName().equals("category")){
			return (int) Math.ceil(productDao.countAllProductFormCategory(page) / (double)page.getLimit());
		}else if(page.getColumnName().equals("brand")){
			return (int) Math.ceil(productDao.countAllProductFormBrand(page) / (double)page.getLimit());
		}else if(page.getColumnName().equals("model")){
			return (int) Math.ceil(productDao.countAllProductFormModel(page) / (double)page.getLimit());
		}else if(page.getColumnName().equals("color")){
			return (int) Math.ceil(productDao.countAllProductFormColor(page) / (double)page.getLimit());
		}else{
			return 0;
		}
	}

	@Override
	public int countPageCameraNewForm(PageForm page) {
		if( page.getColumnName().equals("all")){
			return (int) Math.ceil(productDao.countAllCameraNewForm(page) / (double)page.getLimit());
		}else if(page.getColumnName().equals("name")){
			return (int) Math.ceil(productDao.countAllCameraNewFormName(page) / (double)page.getLimit());
		}else if(page.getColumnName().equals("category")){
			return (int) Math.ceil(productDao.countAllCameraNewFormCategory(page) / (double)page.getLimit());
		}else if(page.getColumnName().equals("brand")){
			return (int) Math.ceil(productDao.countAllCameraNewFormBrand(page) / (double)page.getLimit());
		}else if(page.getColumnName().equals("model")){
			return (int) Math.ceil(productDao.countAllCameraNewFormModel(page) / (double)page.getLimit());
		}else if(page.getColumnName().equals("color")){
			return (int) Math.ceil(productDao.countAllCameraNewFormColor(page) / (double)page.getLimit());
		}else{
			return 0;
		}
	}

	@Override
	public int countPageCameraOldForm(PageForm page) {
		if( page.getColumnName().equals("all")){
			return (int) Math.ceil(productDao.countAllCameraOldForm(page) / (double)page.getLimit());
		}else if(page.getColumnName().equals("name")){
			return (int) Math.ceil(productDao.countAllCameraOldFormName(page) / (double)page.getLimit());
		}else if(page.getColumnName().equals("category")){
			return (int) Math.ceil(productDao.countAllCameraOldFormCategory(page) / (double)page.getLimit());
		}else if(page.getColumnName().equals("brand")){
			return (int) Math.ceil(productDao.countAllCameraOldFormBrand(page) / (double)page.getLimit());
		}else if(page.getColumnName().equals("model")){
			return (int) Math.ceil(productDao.countAllCameraOldFormModel(page) / (double)page.getLimit());
		}else if(page.getColumnName().equals("color")){
			return (int) Math.ceil(productDao.countAllCameraOldFormColor(page) / (double)page.getLimit());
		}else{
			return 0;
		}
	}

	@Override
	public int countPageAccessoryOldForm(PageForm page) {
		if( page.getColumnName().equals("all")){
			return (int) Math.ceil(productDao.countAllAccessoryOldForm(page) / (double)page.getLimit());
		}else if(page.getColumnName().equals("name")){
			return (int) Math.ceil(productDao.countAllAccessoryOldFormName(page) / (double)page.getLimit());
		}else if(page.getColumnName().equals("category")){
			return (int) Math.ceil(productDao.countAllAccessoryOldFormCategory(page) / (double)page.getLimit());
		}else if(page.getColumnName().equals("brand")){
			return (int) Math.ceil(productDao.countAllAccessoryOldFormBrand(page) / (double)page.getLimit());
		}else if(page.getColumnName().equals("model")){
			return (int) Math.ceil(productDao.countAllAccessoryOldFormModel(page) / (double)page.getLimit());
		}else if(page.getColumnName().equals("color")){
			return (int) Math.ceil(productDao.countAllAccessoryOldFormColor(page) / (double)page.getLimit());
		}else{
			return 0;
		}
	}

	@Override
	public int countPageAccessoryNewForm(PageForm page) {
		if( page.getColumnName().equals("all")){
			return (int) Math.ceil(productDao.countAllAccessoryNewForm(page) / (double)page.getLimit());
		}else if(page.getColumnName().equals("name")){
			return (int) Math.ceil(productDao.countAllAccessoryNewFormName(page) / (double)page.getLimit());
		}else if(page.getColumnName().equals("category")){
			return (int) Math.ceil(productDao.countAllAccessoryNewFormCategory(page) / (double)page.getLimit());
		}else if(page.getColumnName().equals("brand")){
			return (int) Math.ceil(productDao.countAllAccessoryNewFormBrand(page) / (double)page.getLimit());
		}else if(page.getColumnName().equals("model")){
			return (int) Math.ceil(productDao.countAllAccessoryNewFormModel(page) / (double)page.getLimit());
		}else if(page.getColumnName().equals("color")){
			return (int) Math.ceil(productDao.countAllAccessoryNewFormColor(page) / (double)page.getLimit());
		}else{
			return 0;
		}
	}

	@Override
	public ArrayList<ProductForm> getProductForm(ProductForm product) {
		if(product.getProduct_id().substring(1, 2).equals("O")){
			return productDao.getAllProductOldForm(product);
		}else{
			return productDao.getAllProductNewForm(product);
		}
	}

	@Override
	public ArrayList<ProductForm> getProductFormRelated(ProductForm product) {
		if(product.getProduct_id().substring(1, 2).equals("O")){
			return productDao.getAllProductOldFormRelated(product);
		}else{
			return productDao.getAllProductNewFormRelated(getProductForm(product).get(0));
		}
	}

}
