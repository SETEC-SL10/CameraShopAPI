package com.setec_ecomerce.service.products;

import java.util.ArrayList;

import org.springframework.web.multipart.MultipartFile;

import com.setec_ecomerce.repository.products.dto.old_accessory.OldAccessoryImage;

public interface OldAccessoryImageService {

	OldAccessoryImage insertOldAccessoryImage(OldAccessoryImage oldAccessoryImage, MultipartFile[] file);
	OldAccessoryImage updateOldAccessoryImage(OldAccessoryImage oldAccessoryImage, MultipartFile file);
	boolean deleteOldAccessoryImage(int id);
	OldAccessoryImage findOldAccessoryImage(int id);
	ArrayList<OldAccessoryImage> getAllOldAccessoryImage(String code_no);
	
}
