package com.setec_ecomerce.repository.utils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.springframework.core.io.ClassPathResource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;

public class Utils {
	
	private static File projectLocation;
	
	public static File getProjectLocation() {
		
		if(projectLocation == null){
			try {
				projectLocation = new ClassPathResource("product_image").getFile();
				System.out.println(projectLocation.getPath());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return projectLocation;
	}
	
	public static String doUploadFile(MultipartFile file,String folder){
		String path = null;
		if(file != null){
			try {
				String fileName = file.getOriginalFilename();
				fileName = UUID.randomUUID().toString() + "." + fileName.substring(fileName.lastIndexOf(".") + 1);
				
				String location = Utils.getProjectLocation().getPath() + folder + fileName;
				Files.copy(file.getInputStream(), new File(location).toPath());
				path = "product_image"+folder+ fileName;
				System.out.println(path);
			} catch (IllegalStateException | IOException e) {
				e.printStackTrace();
			}
		}
		return path;
	}

	public static void setProjectLocation(File projectLocation) {
		Utils.projectLocation = projectLocation;
	}

	public static ResponseEntity<Map<String, Object>> respondJson(String message,Object objJson, HttpStatus status){
		Map<String, Object> mapJson = new HashMap<>();
		mapJson.put("Message", message);
		mapJson.put("DATA", objJson);
		mapJson.put("Status", status);
		return new ResponseEntity<Map<String, Object>>(mapJson, status);
	}

	public static ResponseEntity<Map<String, Object>> preparedRespondJson(String message,Object objJson, HttpStatus status){
		return null;
	}
}
