package com.setec_ecomerce.service.products.product_impl.old_camera;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.setec_ecomerce.repository.products.dao.old_camera.OldCameraImageDAO;
import com.setec_ecomerce.repository.products.dto.old_accessory.OldAccessoryImage;
import com.setec_ecomerce.repository.products.dto.old_camera.OldCameraImage;
import com.setec_ecomerce.repository.utils.Utils;
import com.setec_ecomerce.service.products.OldCameraImageService;

@Service
public class OldCameraImageServiceImpl implements OldCameraImageService{

	
	@Autowired
	private OldCameraImageDAO imageDao;
	
	@Override
	public OldCameraImage insertOldCameraImage(OldCameraImage oldCameraImage, MultipartFile[] file) {
		OldCameraImage tmp = null ;
		String path = null;
		for (int i = 0; i < file.length; i++) {
			path = doUploadFile(file[i]);
			if(path == null){
				return null;
			}else{
				oldCameraImage.setImage_url(path);
				//System.out.println(newCameraImage.getNew_camera_id());
				tmp = imageDao.insertOldCameraImage(oldCameraImage);
			}
		}
		return tmp;
/*		String path = doUploadFile(file);
		if(path == null){
			return null;
		}else{
			oldCameraImage.setImage_url(path);
			return imageDao.insertOldCameraImage(oldCameraImage);
		}*/
	}

	@Override
	public OldCameraImage updateOldCameraImage(OldCameraImage oldCameraImage, MultipartFile file) {
		if(file == null){
			return imageDao.updateOldCameraImage(oldCameraImage);
		}else{
			String path = doUploadFile(file);
			oldCameraImage.setImage_url(path);
			return imageDao.updateOldCameraImage(oldCameraImage);
		}
	}

	@Override
	public boolean deleteOldCameraImage(int id) {
		// TODO Auto-generated method stub
		return imageDao.deleteOldCameraImage(id);
	}

	@Override
	public OldCameraImage findOldCameraImage(int id) {
		// TODO Auto-generated method stub
		return imageDao.findOldCameraImage(id);
	}

	@Override
	public ArrayList<OldCameraImage> getAllOldCameraImage(String old_camera_serial) {
		// TODO Auto-generated method stub
		return imageDao.getAllOldCameraImage(old_camera_serial);
	}
	
	private String doUploadFile(MultipartFile file){
		String path = null;
		if(file != null){
			try {
				String location = Utils.getProjectLocation().getPath() + "\\old_camera\\" + file.getOriginalFilename();
				Files.copy(file.getInputStream(), new File(location).toPath());
				path = "product_image/old_camera/" + file.getOriginalFilename();
			} catch (IllegalStateException | IOException e) {
				e.printStackTrace();
			}
		}
		return path;
	}

}
