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

import com.setec_ecomerce.repository.products.dto.color.Color;
import com.setec_ecomerce.repository.utils.Utils;
import com.setec_ecomerce.service.products.ColorService;

@RestController
@RequestMapping("api/products")
public class ProductColorController {
	@Autowired
	private ColorService colorService;
	
	@RequestMapping(value="/Color",method=RequestMethod.POST)//
	public ResponseEntity<Map<String, Object>> insertColor(@RequestBody Color color){
		color = colorService.insertColor(color);
		if( color == null ){
			return Utils.respondJson("Unsuccess Insert Color", null, HttpStatus.OK);
		}else{
			return Utils.respondJson("Success Insert Color", color, HttpStatus.OK);
		}
	}
	
	@RequestMapping(value="/Color",method=RequestMethod.PUT)//
	public ResponseEntity<Map<String, Object>> updateColor(@RequestBody Color color){
		color = colorService.updateColor(color);
		if( color == null ){
			return Utils.respondJson("Unsuccess Update Color", null, HttpStatus.OK);
		}else{
			return Utils.respondJson("Success Update Color", color, HttpStatus.OK);
		}
	}
	
	@RequestMapping(value="/Color/{id}",method=RequestMethod.DELETE)
	public ResponseEntity<Map<String, Object>> deleteColor(@PathVariable int id){
		boolean result = colorService.deletColor(id);
		if(result){
			return Utils.respondJson("Success delete Color", result, HttpStatus.OK);
		}else{
			return Utils.respondJson("Unsuccess delete Color", result, HttpStatus.OK);
		}
	}
	
	@RequestMapping(value="/Color/{id}",method=RequestMethod.GET)
	public ResponseEntity<Map<String, Object>> findByColorID(@PathVariable int id){
		Color color = colorService.findColor(id);
		if(color == null){
			return Utils.respondJson("Record Not Found", null, HttpStatus.OK);
		}else{
			return Utils.respondJson("Record Found", color, HttpStatus.OK);
		}
	}
	
	@RequestMapping(value="/Color",method=RequestMethod.GET)
	public ResponseEntity<Map<String, Object>> findColors(){
		ArrayList<Color> result = colorService.findColors();
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
