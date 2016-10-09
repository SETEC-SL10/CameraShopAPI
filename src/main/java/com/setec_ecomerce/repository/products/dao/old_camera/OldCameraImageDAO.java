package com.setec_ecomerce.repository.products.dao.old_camera;

import java.util.ArrayList;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.mapping.StatementType;
import org.springframework.stereotype.Repository;
import com.setec_ecomerce.repository.products.dao.color.ColorDAO;
import com.setec_ecomerce.repository.products.dto.color.Color;
import com.setec_ecomerce.repository.products.dto.old_camera.OldCameraImage;

@Repository
public interface OldCameraImageDAO {
	String C_Image = "{ call \"insertToOldCameraImage\"("
					//OUT old_camera_image_ids integer,
					+ "#{old_camera_id},"
					+ "#{old_camera_serial},"
					+ "#{image_url},"
				    + "#{color.color_id },"
					+ "#{status})}";
	
	String U_Image = "{ call \"updateToOldCameraImage\"("
					+ "#{old_camera_image_id},"
					+ "#{old_camera_id},"
					+ "#{old_camera_serial},"
					+ "#{image_url},"
				    + "#{color.color_id },"
					+ "#{status})}";
	
	String D_Image = "UPDATE table_old_camera_image SET status = false WHERE old_camera_image_id = #{id}";
	
	String F_Image = "SELECT old_camera_image_id, old_camera_id, old_camera_serial, image_url, status, color_id FROM table_old_camera_image​​ WHERE old_camera_image_id = #{id} AND status = true";
	
	//SELECT old_camera_image_id, old_camera_id, old_camera_serial, image_url, status, color_id FROM table_old_camera_image WHERE old_camera_serial = #{old_camera_serial} AND status = true;
	String F_A_Image = "SELECT old_camera_image_id, old_camera_id, old_camera_serial, image_url, status, color_id FROM table_old_camera_image WHERE old_camera_serial = #{old_camera_serial} AND status = true";
	
	@Select(C_Image)
	@Options(statementType = StatementType.CALLABLE)
	@Results({
		@Result(property = "old_camera_image_id", column = "old_camera_image_ids"),
		@Result(property = "old_camera_id", column = "old_camera_id"),
		@Result(property = "old_camera_serial", column = "old_camera_serial"),
		@Result(property = "color", column = "color_id", one=@One(select = "findColor")),
		@Result(property = "image_url", column = "image_url"),
		@Result(property = "status", column = "status")
	})
	OldCameraImage insertOldCameraImage(OldCameraImage oldCameraImage);
	
	@Select(C_Image)
	@Options(statementType = StatementType.CALLABLE)
	@Results({
		@Result(property = "old_camera_image_id", column = "old_camera_image_ids"),
		@Result(property = "old_camera_id", column = "old_camera_id"),
		@Result(property = "old_camera_serial", column = "old_camera_serial"),
		@Result(property = "color", column = "color_id", one=@One(select = "findColor")),
		@Result(property = "image_url", column = "image_url"),
		@Result(property = "status", column = "status")
	})
	OldCameraImage updateOldCameraImage(OldCameraImage oldCameraImage);
	
	@Update(U_Image)
	boolean deleteOldCameraImage(int id);
	
	
	@Select(F_Image)
	@Results({
		@Result(property = "old_camera_image_id", column = "old_camera_image_id"),
		@Result(property = "old_camera_id", column = "old_camera_id"),
		@Result(property = "old_camera_serial", column = "old_camera_serial"),
		@Result(property = "color", column = "color_id", one=@One(select = "findColor")),
		@Result(property = "image_url", column = "image_url"),
		@Result(property = "status", column = "status")
	})
	OldCameraImage findOldCameraImage(int id);
	
	@Select(F_A_Image)
	@Results({
		@Result(property = "old_camera_image_id", column = "old_camera_image_id"),
		@Result(property = "old_camera_id", column = "old_camera_id"),
		@Result(property = "old_camera_serial", column = "old_camera_serial"),
		@Result(property = "color", column = "color_id", one=@One(select = "findColor")),
		@Result(property = "image_url", column = "image_url"),
		@Result(property = "status", column = "status")
	})
	ArrayList<OldCameraImage> getAllOldCameraImage(String old_camera_serial);
	
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
