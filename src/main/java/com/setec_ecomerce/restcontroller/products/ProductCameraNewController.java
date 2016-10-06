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
import com.setec_ecomerce.repository.products.dto.new_camera.NewCamera;
import com.setec_ecomerce.repository.products.dto.new_camera.NewCameraImage;
import com.setec_ecomerce.repository.products.dto.products_form.ProductForm;
import com.setec_ecomerce.repository.utils.Utils;
import com.setec_ecomerce.service.products.NewCameraImageService;
import com.setec_ecomerce.service.products.NewCameraService;

@RestController
@RequestMapping("api/products")
public class ProductCameraNewController {

	@Autowired
	private NewCameraService newCameraService;
	
	@Autowired
	private NewCameraImageService imageService;
	
	@RequestMapping(value="/newCamera/{id}",method=RequestMethod.GET)
	public ResponseEntity<Map<String, Object>> findNewCameraByID(@PathVariable String id){
		NewCamera camera = newCameraService.findNewCameraService(id);
		if( camera == null ){
			return Utils.respondJson("Record not found", null, HttpStatus.OK);
		}else{
			return Utils.respondJson("Record found", camera, HttpStatus.OK);
		}
	}
	
	@RequestMapping(value="/newCamera/all",method=RequestMethod.POST)
	public ResponseEntity<Map<String, Object>> findAllNewCamera(@RequestBody PageForm page){
		
		ArrayList<NewCamera> cameras = newCameraService.getAllNewCamera(page);
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
	
	@RequestMapping(value="/newCamera/page",method=RequestMethod.POST)
	public int countPageAllNewCamera(@RequestBody PageForm page){
		return newCameraService.countPageAllNewCamera(page);
	}
	
	@RequestMapping(value="/newCamera",method=RequestMethod.POST)
	public ResponseEntity<Map<String, Object>> insertNewCamera(@RequestBody NewCamera cameras){
		cameras = newCameraService.insertNewCameraService(cameras);
		if( cameras == null ){
			return Utils.respondJson("UNSUCCESS", null, HttpStatus.OK);
		}else{
			return Utils.respondJson("SUCCESS", cameras, HttpStatus.OK);
		}
	}
	
	@RequestMapping(value="/newCamera",method=RequestMethod.PUT)
	public ResponseEntity<Map<String, Object>> updateNewCamera(@RequestBody NewCamera cameras){
		cameras = newCameraService.updateNewCameraService(cameras);
		if( cameras == null ){
			return Utils.respondJson("UNSUCCESS", null, HttpStatus.OK);
		}else{
			return Utils.respondJson("SUCCESS", cameras, HttpStatus.OK);
		}
	}
	
	@RequestMapping(value="/newCamera/{id}",method=RequestMethod.DELETE)
	public ResponseEntity<Map<String, Object>> deleteNewCamera(@PathVariable String id){
		boolean result = newCameraService.deletedNewCameraService(id);
		if(result){
			return Utils.respondJson("SUCCESS", result, HttpStatus.OK);
		}else{
			return Utils.respondJson("UNSUCCESS", null, HttpStatus.OK);
		}
	}
	
	@RequestMapping(value="/newCamera/newCameraImage",method=RequestMethod.POST)
	public ResponseEntity<Map<String, Object>> insertNewCameraImage(
			@RequestParam(value = "file", required=true) MultipartFile file,
			@RequestParam(value = "data") String data){
	
		Gson json = new Gson();
		NewCameraImage image = json.fromJson(data, NewCameraImage.class);
		image = imageService.insertNewCameraImage(image, file);
		if(image == null){
			return Utils.respondJson("UNSUCCESS", null, HttpStatus.OK);
		}else{
			return Utils.respondJson("SUCCESS", image, HttpStatus.OK);
		}
	}
	
	@RequestMapping(value="/newCamera/newCameraImage",method=RequestMethod.PUT)
	public ResponseEntity<Map<String, Object>> updateNewCameraImage(
			@RequestParam(value = "file", required=true) MultipartFile file,
			@RequestParam(value = "data") String data){
		Gson json = new Gson();
		NewCameraImage image = json.fromJson(data, NewCameraImage.class);
		image = imageService.updateNewCameraImage(image, file);
		if(image == null){
			return Utils.respondJson("UNSUCCESS", null, HttpStatus.OK);
		}else{
			return Utils.respondJson("SUCCESS", image, HttpStatus.OK);
		}
	}
	
	@RequestMapping(value="/newCamera/newCameraImage/{id}",method=RequestMethod.GET)
	public ResponseEntity<Map<String, Object>> findNewCameraImageByID(@PathVariable int id){
		NewCameraImage image = imageService.findNewCameraImage(id);
		if( image == null ){
			return Utils.respondJson("Record not found", null, HttpStatus.OK);
		}else{
			return Utils.respondJson("Record found", image, HttpStatus.OK);
		}
	}
	
	@RequestMapping(value="/newCamera/newCameraImage/Camera/{id}",method=RequestMethod.GET)
	public ResponseEntity<Map<String, Object>> findNewCameraImageByCameraID(@PathVariable String pro_id){
		ArrayList<NewCameraImage> image = imageService.getAllNewCameraImage(pro_id);
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
	
	@RequestMapping(value="/newCamera/newCameraImage/{id}",method=RequestMethod.DELETE)
	public ResponseEntity<Map<String, Object>> deleteNewCameraImage(@PathVariable int id){
		boolean result = imageService.deleteNewCameraImage(id);
		if(result){
			return Utils.respondJson("SUCCESS", result, HttpStatus.OK);
		}else{
			return Utils.respondJson("UNSUCCESS", false, HttpStatus.OK);
		}
	}
	
}
