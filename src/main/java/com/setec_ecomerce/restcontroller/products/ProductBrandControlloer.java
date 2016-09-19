package com.setec_ecomerce.restcontroller.products;

import java.util.ArrayList;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.setec_ecomerce.repository.products.dto.brand.Brand;
import com.setec_ecomerce.repository.utils.Utils;
import com.setec_ecomerce.service.products.BrandService;

@RestController
@RequestMapping("api/products")
public class ProductBrandControlloer {
	
	@Autowired
	private BrandService brandService;
	
	@RequestMapping(value="/Brand",method=RequestMethod.POST)//
	public ResponseEntity<Map<String, Object>> insertBrand(@RequestBody Brand brand){
		brand = brandService.insertBrand(brand);
		if( brand == null ){
			return Utils.respondJson("Unsuccess Insert Brand", null, HttpStatus.OK);
		}else{
			return Utils.respondJson("Success Insert Brand", brand, HttpStatus.OK);
		}
	}
	
	@RequestMapping(value="/Brand",method=RequestMethod.PUT)//
	public ResponseEntity<Map<String, Object>> updateBrand(@RequestBody Brand brand){
		brand = brandService.updateBrand(brand);
		if( brand == null ){
			return Utils.respondJson("Unsuccess Update Brand", null, HttpStatus.OK);
		}else{
			return Utils.respondJson("Success Update Brand", brand, HttpStatus.OK);
		}
	}
	
	@RequestMapping(value="/Brand/{id}",method=RequestMethod.DELETE)
	public ResponseEntity<Map<String, Object>> deleteBrand(@PathVariable int id){
		boolean result = brandService.deleteBrand(id);
		if(result){
			return Utils.respondJson("Success delete Brand", result, HttpStatus.OK);
		}else{
			return Utils.respondJson("Unsuccess delete Brand", result, HttpStatus.OK);
		}
	}
	
	@RequestMapping(value="/Brand/{id}",method=RequestMethod.GET)
	public ResponseEntity<Map<String, Object>> findByBrandID(@PathVariable int id){
		Brand result = brandService.findBrand(id);
		if(result == null){
			return Utils.respondJson("Record Not Found", null, HttpStatus.OK);
		}else{
			return Utils.respondJson("Record Found", result, HttpStatus.OK);
		}
	}
	
	@RequestMapping(value="/Brand",method=RequestMethod.GET)
	public ResponseEntity<Map<String, Object>> findAllBrands(){
		ArrayList<Brand> result = brandService.findAllBrands();
		if(result == null){
			return Utils.respondJson("Record Not Found", null, HttpStatus.OK);
		}else{
			if(result.size() > 0){
				return Utils.respondJson("Record Found", result, HttpStatus.OK);
			}else{
				return Utils.respondJson("Record Not Found", null, HttpStatus.OK);
			}
		}
	}
	
	@RequestMapping(value="/Brand/{brand_type}",method=RequestMethod.POST)
	public ResponseEntity<Map<String, Object>> findByType(@PathVariable int brand_type){
		ArrayList<Brand> result;
		if( brand_type == 1){
			result = brandService.findBrandByCamera(true);
		}else{
			result = brandService.findBrandByAccessory(true);
		}
		if(result == null){
			return Utils.respondJson("Record Not Found", null, HttpStatus.OK);
		}else{
			if(result.size() > 0){
				return Utils.respondJson("Record Found", result, HttpStatus.OK);
			}else{
				return Utils.respondJson("Record Not Found", null, HttpStatus.OK);
			}
		}
	}
	
	

}
