package com.setec_ecomerce.restcontroller.users;

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

import com.setec_ecomerce.repository.users.dto.CustomerFrontEnd;
import com.setec_ecomerce.repository.utils.Utils;
import com.setec_ecomerce.service.users.CustomerFrontEndService;

@RestController
@RequestMapping("api/user")
public class CustomerFrontEndController {
	
	@Autowired
	private CustomerFrontEndService customerService;
	
	@RequestMapping(value="/CustomerFrontEnd",method=RequestMethod.POST)
	public ResponseEntity<Map<String, Object>> insertCustomerFrontEnd(@RequestBody CustomerFrontEnd customer){
		customer = customerService.createCustomerFrontEnd(customer);
		if( customer == null ){
			return Utils.respondJson("Unsuccess Insert CustomerFrontEnd", null, HttpStatus.OK);
		}else{
			return Utils.respondJson("Success Insert CustomerFrontEnd", customer, HttpStatus.OK);
		}
	}
	
	@RequestMapping(value="/CustomerFrontEnd/login",method=RequestMethod.POST)
	public ResponseEntity<Map<String, Object>> loginCustomerFrontEnd(@RequestBody CustomerFrontEnd customer){
		customer = customerService.CustomerFrontEndLogin(customer);
		if( customer == null ){
			return Utils.respondJson("Unsuccess Login", null, HttpStatus.OK);
		}else{
			return Utils.respondJson("Success Login", customer, HttpStatus.OK);
		}
	}
	
	@RequestMapping(value="/CustomerFrontEnd",method=RequestMethod.PUT)//
	public ResponseEntity<Map<String, Object>> updateCustomerFrontEnd(@RequestBody CustomerFrontEnd customer){
		customer = customerService.updateCustomerFrontEnd(customer);
		if( customer == null ){
			return Utils.respondJson("Unsuccess Update CustomerFrontEnd", null, HttpStatus.OK);
		}else{
			return Utils.respondJson("Success Update CustomerFrontEnd", customer, HttpStatus.OK);
		}
	}
	
	@RequestMapping(value="/CustomerFrontEnd/{id}",method=RequestMethod.DELETE)
	public ResponseEntity<Map<String, Object>> deleteCustomerFrontEnd(@PathVariable int id){
		boolean result = customerService.deleteCustomerFrontEnd(id);
		if(result){
			return Utils.respondJson("Success delete CustomerFrontEnd", result, HttpStatus.OK);
		}else{
			return Utils.respondJson("Unsuccess delete CustomerFrontEnd", result, HttpStatus.OK);
		}
	}
	
	@RequestMapping(value="/CustomerFrontEnd/{id}",method=RequestMethod.GET)
	public ResponseEntity<Map<String, Object>> findByCustomerFrontEndID(@PathVariable int id){
		CustomerFrontEnd result = customerService.findCustomerFrontEnd(id);
		if(result == null){
			return Utils.respondJson("Record Not Found", null, HttpStatus.OK);
		}else{
			return Utils.respondJson("Record Found", result, HttpStatus.OK);
		}
	}
	
	@RequestMapping(value="/CustomerFrontEnd",method=RequestMethod.GET)
	public ResponseEntity<Map<String, Object>> getAllCustomerFrontEnd(){
		ArrayList<CustomerFrontEnd>  results = customerService.getAllCustomerFrontEnd();
		if(results == null){
			return Utils.respondJson("Record Not Found", null, HttpStatus.OK);
		}else{
			return Utils.respondJson("Record Found", results, HttpStatus.OK);
		}
	}

}
