package com.setec_ecomerce.service.products.product_impl.old_accessory;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.setec_ecomerce.repository.products.dao.old_accessory.OldAccessoryImageDAO;
import com.setec_ecomerce.repository.products.dto.new_accessory.NewAccessoryImage;
import com.setec_ecomerce.repository.products.dto.old_accessory.OldAccessoryImage;
import com.setec_ecomerce.repository.utils.Utils;
import com.setec_ecomerce.service.products.OldAccessoryImageService;

@Service
public class OldAccessoryImageServiceImpl implements OldAccessoryImageService{

	@Autowired
	private OldAccessoryImageDAO imageDao;
	
	@Override
	public OldAccessoryImage insertOldAccessoryImage(OldAccessoryImage oldAccessoryImage, MultipartFile[] file) {
		OldAccessoryImage tmp = null ;
		String path = null;
		for (int i = 0; i < file.length; i++) {
			path = doUploadFile(file[i]);
			if(path == null){
				return null;
			}else{
				oldAccessoryImage.setImage_url(path);
				//System.out.println(newCameraImage.getNew_camera_id());
				tmp = imageDao.insertOldAccessoryImage(oldAccessoryImage);
			}
		}
		return tmp;
/*		String path = doUploadFile(file);
		if(path == null){
			return null;
		}else{
			oldAccessoryImage.setImage_url(path);
			return imageDao.insertOldAccessoryImage(oldAccessoryImage);
		}*/
	}

	@Override
	public OldAccessoryImage updateOldAccessoryImage(OldAccessoryImage oldAccessoryImage, MultipartFile file) {
		if(file == null){
			return imageDao.updateOldAccessoryImage(oldAccessoryImage);
		}else{
			String path = doUploadFile(file);
			oldAccessoryImage.setImage_url(path);
			return imageDao.updateOldAccessoryImage(oldAccessoryImage);
		}
	}

	@Override
	public boolean deleteOldAccessoryImage(int id) {
		// TODO Auto-generated method stub
		return imageDao.deleteOldAccessoryImage(id);
	}

	@Override
	public OldAccessoryImage findOldAccessoryImage(int id) {
		// TODO Auto-generated method stub
		return imageDao.findOldAccessoryImage(id);
	}

	@Override
	public ArrayList<OldAccessoryImage> getAllOldAccessoryImage(String code_no) {
		// TODO Auto-generated method stub
		return imageDao.getAllOldAccessoryImage(code_no);
	}
	
	private String doUploadFile(MultipartFile file){
		String path = null;
		if(file != null){
			try {
				String location = Utils.getProjectLocation().getPath() + "\\old_accessory\\" + file.getOriginalFilename();
				Files.copy(file.getInputStream(), new File(location).toPath());
				path = "product_image/old_accessory/" + file.getOriginalFilename();
			} catch (IllegalStateException | IOException e) {
				e.printStackTrace();
			}
		}
		return path;
	}

}
