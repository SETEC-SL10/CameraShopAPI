package com.setec_ecomerce.restcontroller.products;

import java.util.ArrayList;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.setec_ecomerce.repository.products.dto.type.Type;
import com.setec_ecomerce.repository.utils.Utils;
import com.setec_ecomerce.service.products.TypeService;

@RestController
@RequestMapping("api/products")
public class ProductTypeController {

	@Autowired
	private TypeService typeService;
	
	
	@RequestMapping(value="/Type/{id}",method=RequestMethod.GET)
	public ResponseEntity<Map<String, Object>> findByTypeID(@PathVariable int id){
		Type type = typeService.findType(id);
		if(type == null){
			return Utils.respondJson("Record Not Found", null, HttpStatus.CONFLICT);
		}else{
			return Utils.respondJson("Record Found", type, HttpStatus.OK);
		}
	}
	
	@RequestMapping(value="/Type",method=RequestMethod.GET)
	public ResponseEntity<Map<String, Object>> findAllType(){
		ArrayList<Type> type = typeService.getAllType();
		if(type == null){
			return Utils.respondJson("Record Not Found", null, HttpStatus.CONFLICT);
		}else{
			return Utils.respondJson("Record Found", type, HttpStatus.OK);
		}
	}
	
}
