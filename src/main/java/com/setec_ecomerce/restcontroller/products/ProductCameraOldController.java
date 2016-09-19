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
import com.setec_ecomerce.repository.products.dto.old_camera.OldCamera;
import com.setec_ecomerce.repository.products.dto.old_camera.OldCameraImage;
import com.setec_ecomerce.repository.products.dto.products_form.ProductForm;
import com.setec_ecomerce.repository.utils.Utils;
import com.setec_ecomerce.service.products.OldCameraImageService;
import com.setec_ecomerce.service.products.OldCameraService;

@RestController
@RequestMapping("api/products")
public class ProductCameraOldController {

	@Autowired
	private OldCameraService oldCameraService;
	
	@Autowired
	private OldCameraImageService imageService;
	
//	@Autowired
//	private OldCameraFormDAO oldCameraFormDao;
	
	@RequestMapping(value="/oldCamera/{id}",method=RequestMethod.GET)//
	public ResponseEntity<Map<String, Object>> findNewCameraByID(@PathVariable String id){
		OldCamera camera = oldCameraService.findOldCameraService(id);
		if( camera == null ){
			return Utils.respondJson("Record not found", null, HttpStatus.OK);
		}else{
			return Utils.respondJson("Record found", camera, HttpStatus.OK);
		}
	}
	
	@RequestMapping(value="/oldCamera/all",method=RequestMethod.POST)//
	public ResponseEntity<Map<String, Object>> findAllNewCamera(@RequestBody PageForm page){
		ArrayList<OldCamera> cameras = oldCameraService.getAllOldCamera(page);
		if( cameras == null ){
			return Utils.respondJson("Record not found", null, HttpStatus.OK);
		}else{
			if(cameras.size() > 0){
				return Utils.respondJson("Record found", cameras, HttpStatus.OK);
			}else{
				return Utils.respondJson("Record not found", null, HttpStatus.OK);
			}
		}
	}
	
	@RequestMapping(value="/oldCamera",method=RequestMethod.POST)//
	public ResponseEntity<Map<String, Object>> insertOldCamera(@RequestBody OldCamera cameras){
		cameras = oldCameraService.insertOldCameraService(cameras);
		if( cameras == null ){
			return Utils.respondJson("Unsuccess Insert Old Camera", null, HttpStatus.OK);
		}else{
			return Utils.respondJson("Success Insert Old Camera", cameras, HttpStatus.OK);
		}
	}
	
	@RequestMapping(value="/oldCamera",method=RequestMethod.PUT)
	public ResponseEntity<Map<String, Object>> updateOldCamera(@RequestBody OldCamera cameras){
		cameras = oldCameraService.updateOldCameraService(cameras);
		if( cameras == null ){
			return Utils.respondJson("Unsuccess Insert Old Camera", null, HttpStatus.OK);
		}else{
			return Utils.respondJson("Success Insert Old Camera", cameras, HttpStatus.OK);
		}
	}
	
	@RequestMapping(value="/oldCamera/{id}",method=RequestMethod.DELETE)
	public ResponseEntity<Map<String, Object>> deleteOldCamera(@PathVariable String id){
		boolean result = oldCameraService.deletedOldCameraService(id);
		if(result){
			return Utils.respondJson("Success delete Old Camera", result, HttpStatus.OK);
		}else{
			return Utils.respondJson("Unsuccess delete Old Camera", result, HttpStatus.OK);
		}
	}
	
	@RequestMapping(value="/oldCamera/oldCameraImage",method=RequestMethod.POST)
	public ResponseEntity<Map<String, Object>> insertOldCameraImage(
			@RequestParam(value = "file", required=true) MultipartFile file,
			@RequestParam(value = "data") String data){
	
		Gson json = new Gson();
		OldCameraImage image = json.fromJson(data, OldCameraImage.class);
		image = imageService.insertOldCameraImage(image, file);
		if(image == null){
			return Utils.respondJson("Unsuccess Insert Old Camera Image", null, HttpStatus.OK);
		}else{
			return Utils.respondJson("Success Insert Old Camera Image", image, HttpStatus.OK);
		}
	}
	
	@RequestMapping(value="/oldCamera/oldCameraImage",method=RequestMethod.PUT)
	public ResponseEntity<Map<String, Object>> updateOldCameraImage(
			@RequestParam(value = "file", required=true) MultipartFile file,
			@RequestParam(value = "data") String data){
	
		Gson json = new Gson();
		OldCameraImage image = json.fromJson(data, OldCameraImage.class);
		image = imageService.updateOldCameraImage(image, file);
		if(image == null){
			return Utils.respondJson("Unsuccess Update Old Camera Image", null, HttpStatus.OK);
		}else{
			return Utils.respondJson("Success Update Old Camera Image", image, HttpStatus.OK);
		}
	}
	
	@RequestMapping(value="/oldCamera/oldCameraImage/{id}",method=RequestMethod.GET)
	public ResponseEntity<Map<String, Object>> findOldCameraImageByID(@PathVariable int id){
		OldCameraImage image = imageService.findOldCameraImage(id);
		if( image == null ){
			return Utils.respondJson("Record not found", null, HttpStatus.OK);
		}else{
			return Utils.respondJson("Record found", image, HttpStatus.OK);
		}
	}

	@RequestMapping(value="/oldCamera/oldCameraImage/Camera/{id}",method=RequestMethod.GET)
	public ResponseEntity<Map<String, Object>> findOldCameraImageBySerial(@PathVariable String serial){
		ArrayList<OldCameraImage> image = imageService.getAllOldCameraImage(serial);
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
	
	@RequestMapping(value="/oldCamera/oldCameraImage/{id}",method=RequestMethod.DELETE)
	public ResponseEntity<Map<String, Object>> deleteOldCameraImage(@PathVariable int id){
		boolean result = imageService.deleteOldCameraImage(id);
		if(result){
			return Utils.respondJson("Success delete Old Camera Image", result, HttpStatus.OK);
		}else{
			return Utils.respondJson("Unsuccess delete Old Camera Image", false, HttpStatus.OK);
		}
	}
	
	@RequestMapping(value="/oldCamera/oldCameraForm",method=RequestMethod.POST)
	public ResponseEntity<Map<String, Object>> findAllNewCameraForm(@RequestBody PageForm page){
		ArrayList<ProductForm> cameras = oldCameraService.getAllOldCameraForm(page);
		if( cameras == null ){
			return Utils.respondJson("Record not found", null, HttpStatus.OK);
		}else{
			if(cameras.size() > 0){
				return Utils.respondJson("Record found", cameras, HttpStatus.OK);
			}else{
				return Utils.respondJson("Record not found", null, HttpStatus.OK);
			}
		}
	}
}
