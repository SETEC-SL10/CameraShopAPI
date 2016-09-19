package com.setec_ecomerce.repository.products.dao.new_accessory;

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
import com.setec_ecomerce.repository.products.dto.new_accessory.NewAccessoryImage;

@Repository
public interface NewAccessoryImageDAO {

	String C_Image = "{ call \"insertToNewAccessoryImage\"("
				    + "#{new_accessory_id},"
				    + "#{color.color_id },"
				    + "#{image_url},"
				    + "#{status})}";
	
	String U_Image = "{ call \"updateToNewAccessoryImage\"("
					+ "#{new_accessory_image_id},"
				    + "#{new_accessory_id},"
				    + "#{color.color_id },"
				    + "#{image_url},"
				    + "#{status})}";
	
	
	String D_Image = "UPDATE table_new_accessory_image SET status = false WHERE new_accessory_image_id = #{id}";
	
	String F_Image = "SELECT new_accessory_image_id, new_accessory_id, image_url, status, color_id FROM table_new_accessory_image WHERE new_accessory_image_id = #{id} AND status = true";
	
	String F_A_Image = "SELECT new_accessory_image_id, new_accessory_id, image_url, status, color_id FROM table_new_accessory_image WHERE new_accessory_id = #{pro_id} AND status = true";
	
	
	@Select(C_Image)
	@Options(statementType = StatementType.CALLABLE)
	@Results({
		@Result(property = "new_accessory_image_id", column = "new_accessory_image_ids"),
		@Result(property = "new_accessory_id", column = "new_accessory_id"),
		@Result(property = "color", column = "color_id", one=@One(select = "findColor")),
		@Result(property = "image_url", column = "image_url"),
		@Result(property = "status", column = "status")
	})
	NewAccessoryImage insertNewAccessoryImage(NewAccessoryImage newAccessoryImage);
	
	@Select(U_Image)
	@Options(statementType = StatementType.CALLABLE)
	@Results({
		@Result(property = "new_accessory_image_id", column = "new_accessory_image_ids"),
		@Result(property = "new_accessory_id", column = "new_accessory_id"),
		@Result(property = "color", column = "color_id", one=@One(select = "findColor")),
		@Result(property = "image_url", column = "image_url"),
		@Result(property = "status", column = "status")
	})
	NewAccessoryImage updateNewAccessoryImage(NewAccessoryImage newAccessoryImage);
	
	@Update(D_Image)
	boolean deleteNewAccessoryImage(int id);
	
	@Select(F_Image)
	@Results({
		@Result(property = "new_accessory_image_id", column = "new_accessory_image_id"),
		@Result(property = "new_accessory_id", column = "new_accessory_id"),
		@Result(property = "color", column = "color_id", one=@One(select = "findColor")),
		@Result(property = "image_url", column = "image_url"),
		@Result(property = "status", column = "status")
	})
	NewAccessoryImage findNewAccessoryImage(int id);
	
	@Select(F_A_Image)
	@Results({
		@Result(property = "new_accessory_image_id", column = "new_accessory_image_id"),
		@Result(property = "new_accessory_id", column = "new_accessory_id"),
		@Result(property = "color", column = "color_id", one=@One(select = "findColor")),
		@Result(property = "image_url", column = "image_url"),
		@Result(property = "status", column = "status")
	})
	ArrayList<NewAccessoryImage> getAllNewAccessoryImage(String pro_id);
	
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
