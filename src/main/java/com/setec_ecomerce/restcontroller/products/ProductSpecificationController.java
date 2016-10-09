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

import com.setec_ecomerce.repository.products.dto.specification.Specification;
import com.setec_ecomerce.repository.utils.Utils;
import com.setec_ecomerce.service.products.SpecificationService;

@RestController
@RequestMapping("api/products")
public class ProductSpecificationController {

	@Autowired
	private SpecificationService specificationService;
	
	@RequestMapping(value="/Specification/{id}",method=RequestMethod.GET)//
	public ResponseEntity<Map<String, Object>> findSpecificationByID(@PathVariable int id){
		Specification spec = specificationService.findSpecification(id);
		if( spec == null ){
			return Utils.respondJson("Record not found", null, HttpStatus.OK);
		}else{
			return Utils.respondJson("Record found", spec, HttpStatus.OK);
		}
	}
	
	@RequestMapping(value="/pro_d/Specification/{pro_id}",method=RequestMethod.GET)//
	public ResponseEntity<Map<String, Object>> findSpecificationByPro_ID(@PathVariable String pro_id){
		ArrayList<Specification> specs = specificationService.getSpecificationByPro_ID(pro_id);
		if( specs == null ){
			return Utils.respondJson("Record not found", null, HttpStatus.OK);
		}else{
			if(specs.size() > 0){
				return Utils.respondJson("Record found", specs, HttpStatus.OK);
			}else{
				return Utils.respondJson("Record not found", null, HttpStatus.OK);
			}
		}
	}
	
	@RequestMapping(value="/Specification",method=RequestMethod.POST)//
	public ResponseEntity<Map<String, Object>> insertSpecification(@RequestBody Specification spec){
		spec = specificationService.createSpecification(spec);
		if( spec == null ){
			return Utils.respondJson("UNSUCCESS", null, HttpStatus.OK);
		}else{
			return Utils.respondJson("SUCCESS", spec, HttpStatus.OK);
		}
	}
	
	@RequestMapping(value="/Specification",method=RequestMethod.PUT)
	public ResponseEntity<Map<String, Object>> updateSpecification(@RequestBody Specification spec){
		spec = specificationService.updateSpecification(spec);
		if( spec == null ){
			return Utils.respondJson("UNSUCCESS", null, HttpStatus.OK);
		}else{
			return Utils.respondJson("SUCCESS", spec, HttpStatus.OK);
		}
	}
	
	@RequestMapping(value="/Specification/{id}",method=RequestMethod.DELETE)
	public ResponseEntity<Map<String, Object>> deleteSpecification(@PathVariable int id){
		boolean result = specificationService.deleteSpecification(id);
		if(result){
			return Utils.respondJson("SUCCESS", result, HttpStatus.OK);
		}else{
			return Utils.respondJson("UNSUCCESS", result, HttpStatus.OK);
		}
	}
}
