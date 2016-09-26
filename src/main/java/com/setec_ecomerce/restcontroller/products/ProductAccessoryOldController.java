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
import com.setec_ecomerce.repository.products.dto.old_accessory.OldAccessory;
import com.setec_ecomerce.repository.products.dto.old_accessory.OldAccessoryImage;
import com.setec_ecomerce.repository.utils.Utils;
import com.setec_ecomerce.service.products.OldAccessoryImageService;
import com.setec_ecomerce.service.products.OldAccessoryService;

@RestController
@RequestMapping("api/products")
public class ProductAccessoryOldController {
	@Autowired
	private OldAccessoryService oldAccessoryService;
	
	@Autowired
	private OldAccessoryImageService imageService;
	
	@RequestMapping(value="/oldAccessory/{id}",method=RequestMethod.GET)
	public ResponseEntity<Map<String, Object>> findOldAccessoryByID(@PathVariable String id){
		OldAccessory accessory = oldAccessoryService.findOldAccessory(id);
		if( accessory == null ){
			return Utils.respondJson("Record not found", null, HttpStatus.OK);
		}else{
			return Utils.respondJson("Record found", accessory, HttpStatus.OK);
		}
	}
	
	@RequestMapping(value="/oldAccessory/all",method=RequestMethod.POST)
	public ResponseEntity<Map<String, Object>> findAllOldAccessory(@RequestBody PageForm page){
		ArrayList<OldAccessory> accessorys = oldAccessoryService.getAllOldAccessory(page);
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
	
	@RequestMapping(value="/oldAccessory/page",method=RequestMethod.POST)
	public int countPageAllOldAccessory(@RequestBody PageForm page){
		return oldAccessoryService.countPageAllOldAccessory(page);
	}
	
	@RequestMapping(value="/oldAccessory",method=RequestMethod.POST)
	public ResponseEntity<Map<String, Object>> insertOldAccessory(@RequestBody OldAccessory accessory){
		accessory = oldAccessoryService.createOldAccessory(accessory);
		if( accessory == null ){
			return Utils.respondJson("Unsuccess Insert NewAccessory", null, HttpStatus.OK);
		}else{
			return Utils.respondJson("Success Insert NewAccessory", accessory, HttpStatus.OK);
		}
	}
	
	@RequestMapping(value="/oldAccessory",method=RequestMethod.PUT)
	public ResponseEntity<Map<String, Object>> updateOldAccessory(@RequestBody OldAccessory accessory){
		accessory = oldAccessoryService.updateOldAccessory(accessory);
		if( accessory == null ){
			return Utils.respondJson("Unsuccess Insert NewAccessory", null, HttpStatus.OK);
		}else{
			return Utils.respondJson("Success Insert NewAccessory", accessory, HttpStatus.OK);
		}
	}
	
	@RequestMapping(value="/oldAccessory/{id}",method=RequestMethod.DELETE)
	public ResponseEntity<Map<String, Object>> deleteOldAccessory(@PathVariable String id){
		boolean result = oldAccessoryService.deleteOldAccessory(id);
		if(result){
			return Utils.respondJson("Success delete NewAccessory", result, HttpStatus.OK);
		}else{
			return Utils.respondJson("Unsuccess delete NewAccessory", result, HttpStatus.OK);
		}
	}
	
	@RequestMapping(value="/oldAccessory/oldAccessoryImage",method=RequestMethod.POST)
	public ResponseEntity<Map<String, Object>> insertOldAccessoryImage(
			@RequestParam(value = "file", required=true) MultipartFile file,
			@RequestParam(value = "data") String data){
	
		Gson json = new Gson();
		OldAccessoryImage image = json.fromJson(data, OldAccessoryImage.class);
		image = imageService.insertOldAccessoryImage(image, file);
		if(image == null){
			return Utils.respondJson("Unsuccess Insert Old Accessory Image", null, HttpStatus.OK);
		}else{
			return Utils.respondJson("Success Insert Old Accessory Image", image, HttpStatus.OK);
		}
	}
	
	@RequestMapping(value="/oldAccessory/oldAccessoryImage",method=RequestMethod.PUT)
	public ResponseEntity<Map<String, Object>> updateOldAccessoryImage(
			@RequestParam(value = "file", required=true) MultipartFile file,
			@RequestParam(value = "data") String data){
	
		Gson json = new Gson();
		OldAccessoryImage image = json.fromJson(data, OldAccessoryImage.class);
		image = imageService.updateOldAccessoryImage(image, file);
		if(image == null){
			return Utils.respondJson("Unsuccess Update Old Accessory Image", null, HttpStatus.OK);
		}else{
			return Utils.respondJson("Success Update Old Accessory Image", image, HttpStatus.OK);
		}
	}
	
	@RequestMapping(value="/oldAccessory/oldAccessoryImage/{id}",method=RequestMethod.GET)
	public ResponseEntity<Map<String, Object>> findOldAccessoryImageByID(@PathVariable int id){
		OldAccessoryImage image = imageService.findOldAccessoryImage(id);
		if( image == null ){
			return Utils.respondJson("Record not found", null, HttpStatus.OK);
		}else{
			return Utils.respondJson("Record found", image, HttpStatus.OK);
		}
	}
	
	@RequestMapping(value="/oldAccessory/oldAccessoryImage/Accessory/{id}",method=RequestMethod.GET)
	public ResponseEntity<Map<String, Object>> findOldAccessoryImageByCode(@PathVariable String code_no){
		ArrayList<OldAccessoryImage> image = imageService.getAllOldAccessoryImage(code_no);
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
	
	@RequestMapping(value="/oldAccessory/oldAccessoryImage/{id}",method=RequestMethod.DELETE)
	public ResponseEntity<Map<String, Object>> deleteOldAccessoryImage(@PathVariable int id){
		boolean result = imageService.deleteOldAccessoryImage(id);
		if(result){
			return Utils.respondJson("Success delete Old Accessory Image", result, HttpStatus.OK);
		}else{
			return Utils.respondJson("Unsuccess delete Old Accessory Image", false, HttpStatus.OK);
		}
	}
}
