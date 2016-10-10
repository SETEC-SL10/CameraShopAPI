package com.setec_ecomerce.service.products;

import java.util.ArrayList;

import org.springframework.web.multipart.MultipartFile;

import com.setec_ecomerce.repository.products.dto.old_camera.OldCameraImage;

public interface OldCameraImageService {
	OldCameraImage insertOldCameraImage(OldCameraImage oldCameraImage, MultipartFile[] file);
	OldCameraImage updateOldCameraImage(OldCameraImage oldCameraImage, MultipartFile file);
	boolean deleteOldCameraImage(int id);
	OldCameraImage findOldCameraImage(int id);
	ArrayList<OldCameraImage> getAllOldCameraImage(String old_camera_serial);
}
