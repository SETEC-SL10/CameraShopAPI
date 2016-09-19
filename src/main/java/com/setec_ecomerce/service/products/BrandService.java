package com.setec_ecomerce.service.products;

import java.util.ArrayList;

import com.setec_ecomerce.repository.products.dto.brand.Brand;

public interface BrandService {

	Brand insertBrand(Brand brand);
	Brand updateBrand(Brand brand);
	boolean deleteBrand(int id);
	Brand findBrand(int id);
	ArrayList<Brand> findBrandByCamera(boolean typeCamera);
	ArrayList<Brand> findBrandByAccessory(boolean typeAccessory);
	ArrayList<Brand> findAllBrands();
}
