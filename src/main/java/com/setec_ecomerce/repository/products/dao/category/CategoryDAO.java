package com.setec_ecomerce.repository.products.dao.category;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.mapping.StatementType;
import org.springframework.stereotype.Repository;

import com.setec_ecomerce.repository.products.dto.category.Category;

@Repository
public interface CategoryDAO {
	String C_Category = "{call \"insertToCategory\"("
			+ "#{category_name},"
			+ "#{description},"
			+ "#{category_camera},"
			+ "#{category_accessory},"
			+ "#{status})}";
	
	String U_Category = "{call \"updateToCategory\"("
			+ "#{category_id},"
			+ "#{category_name},"
			+ "#{description},"
			+ "#{category_camera},"
			+ "#{category_accessory},"
			+ "#{status})}";
	
	String D_Category = "UPDATE table_category SET status = false WHERE category_id = #{id}";
	
	String FindByID = "SELECT category_id, "
						+ "category_name, "
						+ "description, "
						+ "type_id, "
						+ "category_camera, "
						+ "category_accessory, "
						+ "status "
						+ "FROM table_category "
						+ "WHERE category_id = #{id} AND status = true";
	
	String FindAll = "SELECT category_id, "
			+ "category_name, "
			+ "description, "
			+ "type_id, "
			+ "category_camera, "
			+ "category_accessory, "
			+ "status "
			+ "FROM table_category "
			+ "WHERE status = true";
	
	String FindByCamera = "SELECT category_id, "
			+ "category_name, "
			+ "description, "
			+ "type_id, "
			+ "category_camera, "
			+ "category_accessory, "
			+ "status "
			+ "FROM table_category "
			+ "WHERE category_camera = true AND status = true";
	
	String FindByAccessory = "SELECT category_id, "
			+ "category_name, "
			+ "description, "
			+ "type_id, "
			+ "category_camera, "
			+ "category_accessory, "
			+ "status "
			+ "FROM table_category "
			+ "WHERE category_accessory = true AND status = true";
	
	
	@Select(C_Category)
	@Options(statementType = StatementType.CALLABLE)
	@Results({
		@Result(property = "category_id", column = "category_ids"),
		@Result(property = "category_name", column = "category_name"),
		@Result(property = "description", column = "description"),
		@Result(property = "category_camera", column = "category_camera"),
		@Result(property = "category_accessory", column = "category_accessory"),
		@Result(property = "status", column = "status"),
	})
	Category insertCategory(Category category);
	
	
	@Select(U_Category)
	@Options(statementType = StatementType.CALLABLE)
	@Results({
		@Result(property = "category_id", column = "category_ids"),
		@Result(property = "category_name", column = "category_name"),
		@Result(property = "description", column = "description"),
		@Result(property = "category_camera", column = "category_camera"),
		@Result(property = "category_accessory", column = "category_accessory"),
		@Result(property = "status", column = "status"),
	})
	Category updateCategory(Category category);
	
	@Update(D_Category)
	boolean deleteCategory(int id);
	
	@Select(FindByID)
	@Results({
		@Result(property = "category_id", column = "category_id"),
		@Result(property = "category_name", column = "category_name"),
		@Result(property = "description", column = "description"),
		@Result(property = "category_camera", column = "category_camera"),
		@Result(property = "category_accessory", column = "category_accessory"),
		@Result(property = "status", column = "status"),
	})
	Category findCategory(int id);
	
	
	@Select(FindByCamera)
	@Results({
		@Result(property = "category_id", column = "category_id"),
		@Result(property = "category_name", column = "category_name"),
		@Result(property = "description", column = "description"),
		@Result(property = "category_camera", column = "category_camera"),
		@Result(property = "category_accessory", column = "category_accessory"),
		@Result(property = "status", column = "status"),
	})
	ArrayList<Category> findCategoryByCamera(int typeCamera);
	
	
	@Select(FindByAccessory)
	@Results({
		@Result(property = "category_id", column = "category_id"),
		@Result(property = "category_name", column = "category_name"),
		@Result(property = "description", column = "description"),
		@Result(property = "category_camera", column = "category_camera"),
		@Result(property = "category_accessory", column = "category_accessory"),
		@Result(property = "status", column = "status"),
	})
	ArrayList<Category> findCategoryByAccessory(int typeAccessory);
	
	@Select(FindAll)
	@Results({
		@Result(property = "category_id", column = "category_id"),
		@Result(property = "category_name", column = "category_name"),
		@Result(property = "description", column = "description"),
		@Result(property = "category_camera", column = "category_camera"),
		@Result(property = "category_accessory", column = "category_accessory"),
		@Result(property = "status", column = "status"),
	})
	ArrayList<Category> findAllCategorys();

}
