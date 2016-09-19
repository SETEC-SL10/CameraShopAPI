package com.setec_ecomerce.service.products.product_impl.brand;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.setec_ecomerce.repository.products.dao.brand.BrandDAO;
import com.setec_ecomerce.repository.products.dto.brand.Brand;
import com.setec_ecomerce.service.products.BrandService;

@Service
public class BrandServiceImpl implements BrandService{
	
	@Autowired
	private BrandDAO brandDao;

	@Override
	public Brand insertBrand(Brand brand) {
		// TODO Auto-generated method stub
		return brandDao.insertBrand(brand);
	}

	@Override
	public Brand updateBrand(Brand brand) {
		// TODO Auto-generated method stub
		return brandDao.updateBrand(brand);
	}

	@Override
	public boolean deleteBrand(int id) {
		// TODO Auto-generated method stub
		return brandDao.deleteBrand(id);
	}

	@Override
	public Brand findBrand(int id) {
		// TODO Auto-generated method stub
		return brandDao.findBrand(id);
	}

	@Override
	public ArrayList<Brand> findBrandByCamera(boolean typeCamera) {
		// TODO Auto-generated method stub
		return brandDao.findByBrandCamera(typeCamera);
	}

	@Override
	public ArrayList<Brand> findBrandByAccessory(boolean typeAccessory) {
		// TODO Auto-generated method stub
		return brandDao.findBrandByAccessory(typeAccessory);
	}

	@Override
	public ArrayList<Brand> findAllBrands() {
		// TODO Auto-generated method stub
		return brandDao.findAllBrands();
	}

}
