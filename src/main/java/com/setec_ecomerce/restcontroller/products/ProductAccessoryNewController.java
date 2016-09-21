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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import com.google.gson.Gson;
import com.setec_ecomerce.repository.products.dto.PageForm;
import com.setec_ecomerce.repository.products.dto.new_accessory.NewAccessory;
import com.setec_ecomerce.repository.products.dto.new_accessory.NewAccessoryImage;
import com.setec_ecomerce.repository.products.dto.products_form.ProductForm;
import com.setec_ecomerce.repository.utils.Utils;
import com.setec_ecomerce.service.products.NewAccessoryImageService;
import com.setec_ecomerce.service.products.NewAccessoryService;

@RestController
@RequestMapping("api/products")
public class ProductAccessoryNewController {
	
	@Autowired
	private NewAccessoryService newAccessoryService;
	
	@Autowired
	private NewAccessoryImageService imageService;
	
	
	@RequestMapping(value="/newAccessory/{id}",method=RequestMethod.GET)//
	public ResponseEntity<Map<String, Object>> findNewAccessoryByID(@PathVariable String id){
		NewAccessory accessory = newAccessoryService.findNewAccessory(id);
		if( accessory == null ){
			return Utils.respondJson("Record not found", null, HttpStatus.OK);
		}else{
			return Utils.respondJson("Record found", accessory, HttpStatus.OK);
		}
	}
	
	@RequestMapping(value="/newAccessory/all",method=RequestMethod.POST)//
	public ResponseEntity<Map<String, Object>> findAllNewAccessory(@RequestBody PageForm page){
		ArrayList<NewAccessory> accessorys = newAccessoryService.getAllNewAccessory(page);
		if( accessorys == null ){
			return Utils.respondJson("Record not found", null, HttpStatus.OK);
		}else{
			if(accessorys.size() > 0){
				return Utils.respondJson("Record found", accessorys, HttpStatus.OK);
			}else{
				return Utils.respondJson("Record not found", null, HttpStatus.OK);
			}
		}
	}
	
	@RequestMapping(value="/newAccessory",method=RequestMethod.POST)//
	public ResponseEntity<Map<String, Object>> insertNewAccessory(@RequestBody NewAccessory accessory){
		accessory = newAccessoryService.createNewAccessory(accessory);
		if( accessory == null ){
			return Utils.respondJson("Unsuccess Insert NewAccessory", null, HttpStatus.OK);
		}else{
			return Utils.respondJson("Success Insert NewAccessory", accessory, HttpStatus.OK);
		}
	}
	
	@RequestMapping(value="/newAccessory",method=RequestMethod.PUT)
	public ResponseEntity<Map<String, Object>> updateNewAccessory(@RequestBody NewAccessory accessory){
		accessory = newAccessoryService.updateNewAccessory(accessory);
		if( accessory == null ){
			return Utils.respondJson("Unsuccess Insert NewAccessory", null, HttpStatus.OK);
		}else{
			return Utils.respondJson("Success Insert NewAccessory", accessory, HttpStatus.OK);
		}
	}
	
	@RequestMapping(value="/newAccessory/{id}",method=RequestMethod.DELETE)
	public ResponseEntity<Map<String, Object>> deleteNewAccessory(@PathVariable String id){
		boolean result = newAccessoryService.deleteNewAccessory(id);
		if(result){
			return Utils.respondJson("Success delete NewAccessory", result, HttpStatus.OK);
		}else{
			return Utils.respondJson("Unsuccess delete NewAccessory", result, HttpStatus.OK);
		}
	}
	
	@RequestMapping(value="/newAccessory/newAccessoryImage",method=RequestMethod.POST)
	public ResponseEntity<Map<String, Object>> insertNewAccessoryImage(
			@RequestParam(value = "file", required=true) MultipartFile file,
			@RequestParam(value = "data") String data){
	
		Gson json = new Gson();
		NewAccessoryImage image = json.fromJson(data, NewAccessoryImage.class);
		image = imageService.insertNewAccessoryImage(image, file);
		if(image == null){
			return Utils.respondJson("Unsuccess Insert New Accessory Image", null, HttpStatus.OK);
		}else{
			return Utils.respondJson("Success Insert New Accessory Image", image, HttpStatus.OK);
		}
	}
	
	@RequestMapping(value="/newAccessory/newAccessoryImage",method=RequestMethod.PUT)
	public ResponseEntity<Map<String, Object>> updateNewAccessoryImage(
			@RequestParam(value = "file", required=true) MultipartFile file,
			@RequestParam(value = "data") String data){
	
		Gson json = new Gson();
		NewAccessoryImage image = json.fromJson(data, NewAccessoryImage.class);
		image = imageService.updateNewAccessoryImage(image, file);
		if(image == null){
			return Utils.respondJson("Unsuccess Update New Accessory Image", null, HttpStatus.OK);
		}else{
			return Utils.respondJson("Success Update New Accessory Image", image, HttpStatus.OK);
		}
	}
	
	@RequestMapping(value="/newAccessory/newAccessoryImage/{id}",method=RequestMethod.GET)
	public ResponseEntity<Map<String, Object>> findNewAccessoryImageByID(@PathVariable int id){
		NewAccessoryImage image = imageService.findNewAccessoryImage(id);
		if( image == null ){
			return Utils.respondJson("Record not found", null, HttpStatus.OK);
		}else{
			return Utils.respondJson("Record found", image, HttpStatus.OK);
		}
	}
	
	@RequestMapping(value="/newAccessory/newAccessoryImage/Accessory/{id}",method=RequestMethod.GET)
	public ResponseEntity<Map<String, Object>> findNewAccessoryImageByAccessoryID(@PathVariable String pro_id){
		ArrayList<NewAccessoryImage> image = imageService.getAllNewAccessoryImage(pro_id);
		if( image == null ){
			return Utils.respondJson("Record not found", null, HttpStatus.OK);
		}else{
			if(image.size() > 0){
				return Utils.respondJson("Record found", image, HttpStatus.OK);
			}else{
				return Utils.respondJson("Record not found", null, HttpStatus.OK);
			}
		}
	}
	
	@RequestMapping(value="/newAccessory/newAccessoryImage/{id}",method=RequestMethod.DELETE)
	public ResponseEntity<Map<String, Object>> deleteNewAccessoryImage(@PathVariable int id){
		boolean result = imageService.deleteNewAccessoryImage(id);
		if(result){
			return Utils.respondJson("Success delete New Accessory Image", result, HttpStatus.OK);
		}else{
			return Utils.respondJson("Unsuccess delete New Accessory Image", false, HttpStatus.OK);
		}
	}
	
	@RequestMapping(value="/newAccessory/newAccessoryForm",method=RequestMethod.POST)
	public ResponseEntity<Map<String, Object>> findAllNewAccessoryForm(@RequestBody PageForm page){
		ArrayList<ProductForm> accessorys = newAccessoryService.getAllNewAccessoryForm(page);
		if( accessorys == null ){
			return Utils.respondJson("Record not found", null, HttpStatus.OK);
		}else{
			if(accessorys.size() > 0){
				return Utils.respondJson("Record found", accessorys, HttpStatus.OK);
			}else{
				return Utils.respondJson("Record not found", null, HttpStatus.OK);
			}
		}
	}

}