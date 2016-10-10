package com.setec_ecomerce.service.products.product_impl.new_camera;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.setec_ecomerce.repository.products.dao.new_camera.NewCameraImageDAO;
import com.setec_ecomerce.repository.products.dto.new_camera.NewCameraImage;
import com.setec_ecomerce.repository.utils.Utils;
import com.setec_ecomerce.service.products.NewCameraImageService;

@Service
public class NewCameraImageServiceImpl implements NewCameraImageService{

	@Autowired
	private NewCameraImageDAO imageDao;
	
	@Override
	public NewCameraImage insertNewCameraImage(NewCameraImage newCameraImage, MultipartFile[] file) {
		NewCameraImage tmp = null ;
		for (int i = 0; i < file.length; i++) {
			String path = doUploadFile(file[i]);
			if(path == null){
				return null;
			}else{
				newCameraImage.setImage_url(path);
				//System.out.println(newCameraImage.getNew_camera_id());
				tmp = imageDao.insertNewCameraImage(newCameraImage);
			}
		}
		return tmp;
	}

	@Override
	public NewCameraImage updateNewCameraImage(NewCameraImage newCameraImage, MultipartFile file) {
		if(file == null){
			return imageDao.updateNewCameraImage(newCameraImage);
		}else{
			String path = doUploadFile(file);
			newCameraImage.setImage_url(path);
			return imageDao.updateNewCameraImage(newCameraImage);
		}
	}

	@Override
	public boolean deleteNewCameraImage(int id) {
		// TODO Auto-generated method stub
		return imageDao.deleteNewCameraImage(id);
	}

	@Override
	public NewCameraImage findNewCameraImage(int id) {
		// TODO Auto-generated method stub
		return imageDao.findNewCameraImage(id);
	}

	@Override
	public ArrayList<NewCameraImage> getAllNewCameraImage(String pro_id) {
		// TODO Auto-generated method stub
		return imageDao.getAllNewCameraImage(pro_id);
	}

	private String doUploadFile(MultipartFile file){
		String path = null;
		if(file != null){
			try {
				String location = Utils.getProjectLocation().getPath() + "\\new_camera\\" + file.getOriginalFilename();
				Files.copy(file.getInputStream(), new File(location).toPath());
				path = "product_image/new_camera/" + file.getOriginalFilename();
				System.out.println(path);
			} catch (IllegalStateException | IOException e) {
				e.printStackTrace();
			}
		}
		return path;
	}

}
