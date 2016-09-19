package com.setec_ecomerce.repository.products.dao.old_accessory;

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
import com.setec_ecomerce.repository.products.dto.old_accessory.OldAccessoryImage;

@Repository
public interface OldAccessoryImageDAO {
	
	String C_Image = "{ call \"insertToOldAccessoryImage\"("
					    //OUT old_accessory_image_ids integer,
					    + "#{old_accessory_id},"
					    + "#{color.color_id },"
					    + "#{code_no},"
					    + "#{image_url},"
					    + "#{status})}";
	
	String U_Image = "{ call \"updateToOldAccessoryImage\"("
						+ "#{old_accessory_image_id},"
					    + "#{old_accessory_id},"
					    + "#{color.color_id },"
					    + "#{code_no},"
					    + "#{image_url},"
					    + "#{status})}";
	String D_Image = "UPDATE table_old_accessory_image SET status = false WHERE old_accessory_image_id = #{id}";
	
	String F_Image = "SELECT old_accessory_image_id, old_accessory_id, image_url, code_no, status, color_id FROM table_old_accessory_image WHERE old_accessory_image_id = #{id} AND status = true";
	
	String F_A_Image = "SELECT old_accessory_image_id, old_accessory_id, image_url, code_no, status, color_id FROM table_old_accessory_image WHERE code_no = #{code_no} AND status = true";

	@Select(C_Image)
	@Options(statementType = StatementType.CALLABLE)
	@Results({
		@Result(property = "old_accessory_image_id", column = "old_accessory_image_ids"),
		@Result(property = "old_accessory_id", column = "old_accessory_id"),
		@Result(property = "color", column = "color_id", one=@One(select = "findColor")),
		@Result(property = "code_no", column = "code_no"),
		@Result(property = "image_url", column = "image_url"),
		@Result(property = "status", column = "status")
	})
	OldAccessoryImage insertOldAccessoryImage(OldAccessoryImage oldAccessoryImage);
	
	@Select(U_Image)
	@Options(statementType = StatementType.CALLABLE)
	@Results({
		@Result(property = "old_accessory_image_id", column = "old_accessory_image_ids"),
		@Result(property = "old_accessory_id", column = "old_accessory_id"),
		@Result(property = "color", column = "color_id", one=@One(select = "findColor")),
		@Result(property = "code_no", column = "code_no"),
		@Result(property = "image_url", column = "image_url"),
		@Result(property = "status", column = "status")
	})
	OldAccessoryImage updateOldAccessoryImage(OldAccessoryImage oldAccessoryImage);
	
	@Update(D_Image)
	boolean deleteOldAccessoryImage(int id);
	
	@Select(F_Image)
	@Results({
		@Result(property = "old_accessory_image_id", column = "old_accessory_image_id"),
		@Result(property = "old_accessory_id", column = "old_accessory_id"),
		@Result(property = "color", column = "color_id", one=@One(select = "findColor")),
		@Result(property = "code_no", column = "code_no"),
		@Result(property = "image_url", column = "image_url"),
		@Result(property = "status", column = "status")
	})
	OldAccessoryImage findOldAccessoryImage(int id);
	
	@Select(F_A_Image)
	@Results({
		@Result(property = "old_accessory_image_id", column = "old_accessory_image_id"),
		@Result(property = "old_accessory_id", column = "old_accessory_id"),
		@Result(property = "color", column = "color_id", one=@One(select = "findColor")),
		@Result(property = "code_no", column = "code_no"),
		@Result(property = "image_url", column = "image_url"),
		@Result(property = "status", column = "status")
	})
	ArrayList<OldAccessoryImage> getAllOldAccessoryImage(String code_no);
	
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
