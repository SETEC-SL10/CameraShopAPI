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

import com.setec_ecomerce.repository.products.dto.model.Model;
import com.setec_ecomerce.repository.utils.Utils;
import com.setec_ecomerce.service.products.ModelService;

@RestController
@RequestMapping("api/products")
public class ProductModelController {
	@Autowired
	private ModelService modelService;
	
	@RequestMapping(value="/Model",method=RequestMethod.POST)//
	public ResponseEntity<Map<String, Object>> insertModel(@RequestBody Model model){
		model = modelService.insertModel(model);
		if( model == null ){
			return Utils.respondJson("Unsuccess Insert Model", null, HttpStatus.OK);
		}else{
			return Utils.respondJson("Success Insert Model", model, HttpStatus.OK);
		}
	}
	
	@RequestMapping(value="/Model",method=RequestMethod.PUT)//
	public ResponseEntity<Map<String, Object>> updateModel(@RequestBody Model model){
		model = modelService.updateModel(model);
		if( model == null ){
			return Utils.respondJson("Unsuccess Update Model", null, HttpStatus.OK);
		}else{
			return Utils.respondJson("Success Update Model", model, HttpStatus.OK);
		}
	}
	
	@RequestMapping(value="/Model/{id}",method=RequestMethod.DELETE)
	public ResponseEntity<Map<String, Object>> deleteModel(@PathVariable int id){
		boolean result = modelService.deleteModel(id);
		if(result){
			return Utils.respondJson("Success delete Model", result, HttpStatus.OK);
		}else{
			return Utils.respondJson("Unsuccess delete Model", result, HttpStatus.OK);
		}
	}
	
	@RequestMapping(value="/Model/{id}",method=RequestMethod.GET)
	public ResponseEntity<Map<String, Object>> findByModelID(@PathVariable int id){
		Model result = modelService.findModel(id);
		if(result == null){
			return Utils.respondJson("Record Not Found", null, HttpStatus.OK);
		}else{
			return Utils.respondJson("Record Found", result, HttpStatus.OK);
		}
	}
	
	@RequestMapping(value="/Model",method=RequestMethod.GET)
	public ResponseEntity<Map<String, Object>> findAllModels(){
		ArrayList<Model> result = modelService.findAllModels();
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
	
	@RequestMapping(value="/Model/{model_type}",method=RequestMethod.POST)
	public ResponseEntity<Map<String, Object>> findByType(@PathVariable int model_type){
		ArrayList<Model> result;
		if( model_type == 1){
			result = modelService.findModelByCamera(1);
		}else{
			result = modelService.findModelByAccessory(1);
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
