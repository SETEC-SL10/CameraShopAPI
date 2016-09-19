package com.setec_ecomerce.repository.products.dao.new_camera;

import java.util.ArrayList;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.mapping.StatementType;
import org.springframework.stereotype.Repository;
import com.setec_ecomerce.repository.products.dao.color.ColorDAO;
import com.setec_ecomerce.repository.products.dto.color.Color;
import com.setec_ecomerce.repository.products.dto.new_camera.NewCameraImage;

@Repository
public interface NewCameraImageDAO {
	String C_Image = "{call \"insertToNewCameraImage\"("
			+ "#{new_camera_id},"
			+ "#{image_url},"
		    + "#{color.color_id },"
			+ "#{status})}";
	
	String U_Image = "{call \"updateToNewCameraImage\"("
			+ "#{new_camera_image_id},"
			+ "#{new_camera_id},"
			+ "#{image_url},"
		    + "#{color.color_id },"
			+ "#{status})}";
	
	String D_Image = "UPDATE table_new_camera_image SET status = false WHERE new_camera_image_id = #{id}";
	
	String F_Image = "SELECT new_camera_image_id, new_camera_id, image_url, status, color_id FROM table_new_camera_image WHERE new_camera_image_id = #{id} AND status = true";
	
	String F_C_Image = "SELECT new_camera_image_id, new_camera_id, image_url, status, color_id FROM table_new_camera_image WHERE new_camera_id = #{ProID} AND color_id = #{ColorID} AND status = true";
	
	String F_A_Image = "SELECT new_camera_image_id, new_camera_id, image_url, status, color_id FROM table_new_camera_image WHERE new_camera_id = #{pro_id} AND status = true";
	
	@Select(C_Image)
	@Options(statementType = StatementType.CALLABLE)
	@Results({
		@Result(property = "new_camera_image_id", column = "new_camera_image_ids"),
		@Result(property = "new_camera_id", column = "new_camera_id"),
		@Result(property = "image_url", column = "image_url"),
		@Result(property = "color", column = "color_id", one=@One(select = "findColor")),
		@Result(property = "status", column = "status")
	})
	NewCameraImage insertNewCameraImage(NewCameraImage newCameraImage);
	
	@Select(U_Image)
	@Options(statementType = StatementType.CALLABLE)
	@Results({ 
		@Result(property = "new_camera_image_id", column = "new_camera_image_ids"),
		@Result(property = "new_camera_id", column = "new_camera_id"),
		@Result(property = "image_url", column = "image_url"),
		@Result(property = "color", column = "color_id", one=@One(select = "findColor")),
		@Result(property = "status", column = "status")
	})
	NewCameraImage updateNewCameraImage(NewCameraImage newCameraImage);
	
	@Update(D_Image)
	boolean deleteNewCameraImage(int id);
	
	@Select(F_Image)
	@Results({ 
		@Result(property = "new_camera_image_id", column = "new_camera_image_id"),
		@Result(property = "new_camera_id", column = "new_camera_id"),
		@Result(property = "image_url", column = "image_url"),
		@Result(property = "color", column = "color_id", one=@One(select = "findColor")),
		@Result(property = "status", column = "status")
	})
	NewCameraImage findNewCameraImage(int id);
	
	@Select(F_A_Image)
	@Results({ 
		@Result(property = "new_camera_image_id", column = "new_camera_image_id"),
		@Result(property = "new_camera_id", column = "new_camera_id"),
		@Result(property = "image_url", column = "image_url"),
		@Result(property = "color", column = "color_id", one=@One(select = "findColor")),
		@Result(property = "status", column = "status")
	})
	ArrayList<NewCameraImage> getAllNewCameraImage(String pro_id);
	
	@Select(F_C_Image)
	@Results({ 
		@Result(property = "new_camera_image_id", column = "new_camera_image_id"),
		@Result(property = "new_camera_id", column = "new_camera_id"),
		@Result(property = "image_url", column = "image_url"),
		@Result(property = "color", column = "color_id", one=@One(select = "findColor")),
		@Result(property = "status", column = "status")
	})
	ArrayList<NewCameraImage> getAllNewCameraImageColor(@Param("ProID") String pro_id, @Param("ColorID") int color_id);
	
	@Select(ColorDAO.F_Color)
	@Options(statementType = StatementType.CALLABLE)
	@Results({
		@Result(property = "color_id", column = "color_id"),
		@Result(property = "color_name", column = "color_name"),
		@Result(property = "description", column = "description"),
		@Result(property = "color_code", column = "color_code"),
		@Result(property = "color_status", column = "color_status")
	})
	Color findColor(int id);

}
