package com.setec_ecomerce.repository.products.dao.color;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.mapping.StatementType;
import org.springframework.stereotype.Repository;

import com.setec_ecomerce.repository.products.dto.color.Color;

@Repository
public interface ColorDAO {
	String C_Color = "{ call \"insertToColor\"("
					//+ "OUT color_ids integer,"
					+ "#{color_name},"
					+ "#{description},"
					+ "#{color_code},"
					+ "#{color_status})}";
	
	String U_Color = "{ call \"updateToColor\"("
			+ "#{color_id},"
			+ "#{color_name},"
			+ "#{description},"
			+ "#{color_code},"
			+ "#{color_status})}";
	
	String D_Color = "UPDATE table_color SET color_status = false WHERE color_id = #{id}";
	
	String F_Color = "SELECT color_id, color_name, description, color_status, color_code, created_date FROM table_color WHERE color_id = #{id} AND color_status = true";
	
	String F_A_Color = "SELECT color_id, color_name, description, color_status, color_code, created_date FROM table_color WHERE color_status = true";
	
	@Select(C_Color)
	@Options(statementType = StatementType.CALLABLE)
	@Results({
		@Result(property = "color_id", column = "color_ids"),
		@Result(property = "color_name", column = "color_name"),
		@Result(property = "description", column = "description"),
		@Result(property = "color_code", column = "color_code"),
		@Result(property = "color_status", column = "status")
	})
	Color insertColor(Color color);
	
	
	@Select(U_Color)
	@Options(statementType = StatementType.CALLABLE)
	@Results({
		@Result(property = "color_id", column = "color_ids"),
		@Result(property = "color_name", column = "color_name"),
		@Result(property = "description", column = "description"),
		@Result(property = "color_code", column = "color_code"),
		@Result(property = "color_status", column = "status")
	})
	Color updateColor(Color color);
	
	@Update(D_Color)
	boolean deletColor(int id);
	
	@Select(F_Color)
	@Options(statementType = StatementType.CALLABLE)
	@Results({
		@Result(property = "color_id", column = "color_id"),
		@Result(property = "color_name", column = "color_name"),
		@Result(property = "description", column = "description"),
		@Result(property = "color_code", column = "color_code"),
		@Result(property = "color_status", column = "color_status")
	})
	Color findColor(int id);
	
	@Select(F_A_Color)
	@Options(statementType = StatementType.CALLABLE)
	@Results({
		@Result(property = "color_id", column = "color_id"),
		@Result(property = "color_name", column = "color_name"),
		@Result(property = "description", column = "description"),
		@Result(property = "color_code", column = "color_code"),
		@Result(property = "color_status", column = "color_status")
	})
	ArrayList<Color> findColors();

}
