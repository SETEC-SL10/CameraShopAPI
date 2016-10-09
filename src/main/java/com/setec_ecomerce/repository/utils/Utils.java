package com.setec_ecomerce.repository.utils;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.core.io.ClassPathResource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

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
