package com.setec_ecomerce.repository.products.dao.type;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.setec_ecomerce.repository.products.dto.type.Type;

@Repository
public interface TypeDAO {
	
	String R_Type = "SELECT type_id, type_name, description, type_status FROM table_type WHERE type_id = #{type_id};";
	
	String R_A_Type = "SELECT type_id, type_name, description, type_status FROM table_type ;";
	
	@Select(R_Type)
	@Results({
		@Result(property = "type_id", column = "type_id"),
		@Result(property = "type_name", column = "type_name"),
		@Result(property = "description", column = "description"),
		@Result(property = "type_status", column = "type_status")
	})
	Type findType(int id);
	
	@Select(R_A_Type)
	@Results({
		@Result(property = "type_id", column = "type_id"),
		@Result(property = "type_name", column = "type_name"),
		@Result(property = "description", column = "description"),
		@Result(property = "type_status", column = "type_status")
	})
	ArrayList<Type> getAllType();
}
