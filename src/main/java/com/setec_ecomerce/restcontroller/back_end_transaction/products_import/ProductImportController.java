package com.setec_ecomerce.restcontroller.back_end_transaction.products_import;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.setec_ecomerce.repository.back_end_transaction.products_import.dao.ProductImportFormDAO;
import com.setec_ecomerce.repository.back_end_transaction.products_import.dto.ProductImportForm;
import com.setec_ecomerce.repository.back_end_transaction.products_import.dto.new_accessory.AccessoryNewImportForm;
import com.setec_ecomerce.repository.back_end_transaction.products_import.dto.new_camera.CameraNewImportForm;
import com.setec_ecomerce.repository.back_end_transaction.products_import.dto.old_accessory.AccessoryOldImportForm;
import com.setec_ecomerce.repository.back_end_transaction.products_import.dto.old_camera.CameraOldImportForm;
import com.setec_ecomerce.repository.utils.Utils;
import com.setec_ecomerce.service.back_end_transaction.products_import.AccessoryNewImportFormService;
import com.setec_ecomerce.service.back_end_transaction.products_import.AccessoryOldImportFormService;
import com.setec_ecomerce.service.back_end_transaction.products_import.CameraNewImportFormService;
import com.setec_ecomerce.service.back_end_transaction.products_import.CameraOldImportFormService;

@RestController
@RequestMapping("api/back_end_transaction/products_import")
public class ProductImportController {
	
	@Autowired
	private AccessoryNewImportFormService importAccessoryNewService;
	
	@Autowired
	private CameraNewImportFormService importCameraService;
	
	@Autowired
	private AccessoryOldImportFormService importAccessoryOldService;
	
	@Autowired
	private CameraOldImportFormService importCameraOldService;
	
	@Autowired
	private ProductImportFormDAO importProductFormService;
	
	@RequestMapping(value="/product",method=RequestMethod.POST)
	public ResponseEntity<Map<String, Object>> insertImportProduct(@RequestParam String data){
		return Utils.respondJson(importProductFormService.insertImport(data), null, HttpStatus.OK);
		/*if( result ){
			return Utils.respondJson("Unsuccess Import NewAccessory", null, HttpStatus.OK);
		}else{
			return Utils.respondJson("Success Import NewAccessory", null, HttpStatus.OK);
		}*/
	}
	
	@RequestMapping(value="/newAccessory",method=RequestMethod.POST)
	public ResponseEntity<Map<String, Object>> insertNewAccessoryImport(@RequestBody AccessoryNewImportForm importForm){
		boolean result = importAccessoryNewService.insertAccessoryNewImportForm(importForm);
		if( result ){
			return Utils.respondJson("Unsuccess Import NewAccessory", result, HttpStatus.OK);
		}else{
			return Utils.respondJson("Success Import NewAccessory", result, HttpStatus.OK);
		}
	}
	
	@RequestMapping(value="/oldAccessory",method=RequestMethod.POST)
	public ResponseEntity<Map<String, Object>> insertOldAccessoryImport(@RequestBody AccessoryOldImportForm importForm){
		boolean result = importAccessoryOldService.insertToAccessoryOldImportForm(importForm);
		if( result ){
			return Utils.respondJson("Unsuccess Import OldAccessory", result, HttpStatus.OK);
		}else{
			return Utils.respondJson("Success Import OldAccessory", result, HttpStatus.OK);
		}
	}
	
	@RequestMapping(value="/newCamera",method=RequestMethod.POST)
	public ResponseEntity<Map<String, Object>> insertNewCamareImport(@RequestBody CameraNewImportForm importForm){
		boolean result = importCameraService.insertCameraNewImportForm(importForm);
		if( result ){
			return Utils.respondJson("Success Import NewCamera", result, HttpStatus.OK);
		}else{
			return Utils.respondJson("Unsuccess Import NewCamera", result, HttpStatus.OK);
		}
	}
	
	@RequestMapping(value="/oldCamera",method=RequestMethod.POST)
	public ResponseEntity<Map<String, Object>> insertOldCamareImport(@RequestBody CameraOldImportForm importForm){
		boolean result = importCameraOldService.insertCameraOldImportForm(importForm);
		if( result ){
			return Utils.respondJson("Success Import OldCamera", result, HttpStatus.OK);
		}else{
			return Utils.respondJson("Unsuccess Import OldCamera", result, HttpStatus.OK);
		}
	}
}
