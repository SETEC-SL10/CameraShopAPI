package com.setec_ecomerce.service.products.product_impl.new_accessory;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.setec_ecomerce.repository.products.dao.new_accessory.NewAccessoryImageDAO;
import com.setec_ecomerce.repository.products.dto.new_accessory.NewAccessoryImage;
import com.setec_ecomerce.repository.products.dto.new_camera.NewCameraImage;
import com.setec_ecomerce.repository.utils.Utils;
import com.setec_ecomerce.service.products.NewAccessoryImageService;

@Service
public class NewAccessoryImageServiceImpl implements NewAccessoryImageService{

	@Autowired
	private NewAccessoryImageDAO imageDao;
	
	@Override
	public NewAccessoryImage insertNewAccessoryImage(NewAccessoryImage newAccessoryImage, MultipartFile[] file) {
		NewAccessoryImage tmp = null ;
		String path = null;
		for (int i = 0; i < file.length; i++) {
			path = doUploadFile(file[i]);
			if(path == null){
				return null;
			}else{
				newAccessoryImage.setImage_url(path);
				//System.out.println(newCameraImage.getNew_camera_id());
				tmp = imageDao.insertNewAccessoryImage(newAccessoryImage);
			}
		}
		return tmp;
/*		String path = doUploadFile(file);
		if(path == null){
			return null;
		}else{
			newAccessoryImage.setImage_url(path);
			return imageDao.insertNewAccessoryImage(newAccessoryImage);
		}*/
	}

	@Override
	public NewAccessoryImage updateNewAccessoryImage(NewAccessoryImage newAccessoryImage, MultipartFile file) {
		if(file == null){
			return imageDao.updateNewAccessoryImage(newAccessoryImage);
		}else{
			String path = doUploadFile(file);
			newAccessoryImage.setImage_url(path);
			return imageDao.updateNewAccessoryImage(newAccessoryImage);
		}
	}

	@Override
	public boolean deleteNewAccessoryImage(int id) {
		return imageDao.deleteNewAccessoryImage(id);
	}

	@Override
	public NewAccessoryImage findNewAccessoryImage(int id) {
		return imageDao.findNewAccessoryImage(id);
	}

	@Override
	public ArrayList<NewAccessoryImage> getAllNewAccessoryImage(String pro_id) {
		return imageDao.getAllNewAccessoryImage(pro_id);
	}
	
	private String doUploadFile(MultipartFile file){
		String path = null;
		if(file != null){
			try {
				String location = Utils.getProjectLocation().getPath() + "\\new_accessory\\" + file.getOriginalFilename();
				Files.copy(file.getInputStream(), new File(location).toPath());
				path = "product_image/new_accessory/" + file.getOriginalFilename();
			} catch (IllegalStateException | IOException e) {
				e.printStackTrace();
			}
		}
		return path;
	}

}
