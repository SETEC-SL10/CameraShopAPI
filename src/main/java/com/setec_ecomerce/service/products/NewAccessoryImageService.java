package com.setec_ecomerce.service.products;

import java.util.ArrayList;

import org.springframework.web.multipart.MultipartFile;

import com.setec_ecomerce.repository.products.dto.new_accessory.NewAccessoryImage;


public interface NewAccessoryImageService {
	NewAccessoryImage insertNewAccessoryImage(NewAccessoryImage newAccessoryImage, MultipartFile[] file);
	NewAccessoryImage updateNewAccessoryImage(NewAccessoryImage newAccessoryImage, MultipartFile file);
	boolean deleteNewAccessoryImage(int id);
	NewAccessoryImage findNewAccessoryImage(int id);
	ArrayList<NewAccessoryImage> getAllNewAccessoryImage(String pro_id);
}
