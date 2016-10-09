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

import com.setec_ecomerce.repository.products.dto.category.Category;
import com.setec_ecomerce.repository.utils.Utils;
import com.setec_ecomerce.service.products.CategoryService;

@RestController
@RequestMapping("api/products")
public class ProductCategoryController {
	@Autowired
	private CategoryService categoryService;
	
	@RequestMapping(value="/Category",method=RequestMethod.POST)//
	public ResponseEntity<Map<String, Object>> insertCategory(@RequestBody Category category){
		category = categoryService.insertCategory(category);
		if( category == null ){
			return Utils.respondJson("Unsuccess Insert Category", null, HttpStatus.OK);
		}else{
			return Utils.respondJson("Success Insert Category", category, HttpStatus.OK);
		}
	}
	
	@RequestMapping(value="/Category",method=RequestMethod.PUT)//
	public ResponseEntity<Map<String, Object>> updateCategory(@RequestBody Category category){
		category = categoryService.updateCategory(category);
		if( category == null ){
			return Utils.respondJson("Unsuccess Update Category", null, HttpStatus.OK);
		}else{
			return Utils.respondJson("Success Update Category", category, HttpStatus.OK);
		}
	}
	
	@RequestMapping(value="/Category/{id}",method=RequestMethod.DELETE)
	public ResponseEntity<Map<String, Object>> deleteCategory(@PathVariable int id){
		boolean result = categoryService.deleteCategory(id);
		if(result){
			return Utils.respondJson("Success delete Category", result, HttpStatus.OK);
		}else{
			return Utils.respondJson("Unsuccess delete Category", result, HttpStatus.OK);
		}
	}
	
	@RequestMapping(value="/Category/{id}",method=RequestMethod.GET)
	public ResponseEntity<Map<String, Object>> findByCategoryID(@PathVariable int id){
		Category result = categoryService.findCategory(id);
		if(result == null){
			return Utils.respondJson("Record Not Found", null, HttpStatus.OK);
		}else{
			return Utils.respondJson("Record Found", result, HttpStatus.OK);
		}
	}
	
	@RequestMapping(value="/Category",method=RequestMethod.GET)
	public ResponseEntity<Map<String, Object>> findAllCategorys(){
		ArrayList<Category> result = categoryService.findAllCategorys();
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
	
	@RequestMapping(value="/Category/{brand_type}",method=RequestMethod.POST)
	public ResponseEntity<Map<String, Object>> findByType(@PathVariable int brand_type){
		ArrayList<Category> result;
		if( brand_type == 1){
			result = categoryService.findCategoryByCamera(1);
		}else{
			result = categoryService.findCategoryByAccessory(1);
		}
		if(result == null){
			return Utils.respondJson("Record Not Found", null, HttpStatus.OK);
		}else{
			return Utils.respondJson("Record Found", result, HttpStatus.OK);
		}
	}
}
