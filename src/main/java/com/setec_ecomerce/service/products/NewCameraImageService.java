package com.setec_ecomerce.service.products;

import java.util.ArrayList;

import org.springframework.web.multipart.MultipartFile;

import com.setec_ecomerce.repository.products.dto.new_camera.NewCameraImage;

public interface NewCameraImageService {
	NewCameraImage insertNewCameraImage(NewCameraImage newCameraImage, MultipartFile[] file);
	NewCameraImage updateNewCameraImage(NewCameraImage newCameraImage, MultipartFile file);
	boolean deleteNewCameraImage(int id);
	NewCameraImage findNewCameraImage(int id);
	ArrayList<NewCameraImage> getAllNewCameraImage(String pro_id);
}
