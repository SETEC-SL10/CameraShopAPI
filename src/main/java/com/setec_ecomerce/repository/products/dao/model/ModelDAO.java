package com.setec_ecomerce.repository.products.dao.model;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.mapping.StatementType;
import org.springframework.stereotype.Repository;

import com.setec_ecomerce.repository.products.dto.model.Model;

@Repository
public interface ModelDAO {

	String C_Model = "{ call \"insertToModel\"("
					+ "#{brand_id},"
					+ "#{model_name},"
					+ "#{description},"
					+ "#{model_camera},"
					+ "#{model_accessory},"
					+ "#{model_status})}";
	
	String U_Model = "{ call \"updateToModel\"("
			+ "#{model_id},"
			+ "#{brand_id},"
			+ "#{model_name},"
			+ "#{description},"
			+ "#{model_camera},"
			+ "#{model_accessory},"
			+ "#{model_status})}";
	
	String D_Model = "UPDATE table_model SET model_status = false WHERE model_id = #{id}";
	
	String F_Model = "SELECT model_id, model_name, description, model_camera, model_accessory, model_status, brand_id FROM table_model WHERE model_id = #{id} AND model_status = true";
	
	String F_A_Model = "SELECT model_id, model_name, description, model_camera, model_accessory, model_status, brand_id FROM table_model WHERE model_status = true";
	
	String F_ModelByCamera = "SELECT model_id, model_name, description, model_camera, model_accessory, model_status, brand_id FROM table_model WHERE model_camera = true AND model_status = true";

	String F_ModelByAccessory = "SELECT model_id, model_name, description, model_camera, model_accessory, model_status, brand_id FROM table_model WHERE model_accessory = true AND model_status = true";

	@Select(C_Model)
	@Options(statementType = StatementType.CALLABLE)
	@Results({
		@Result(property = "model_id", column = "model_ids"),
		@Result(property = "brand_id", column = "brand_id"),
		@Result(property = "model_name", column = "model_name"),
		@Result(property = "description", column = "description"),
		@Result(property = "model_camera", column = "model_camera"),
		@Result(property = "model_accessory", column = "model_accessory"),
		@Result(property = "model_status", column = "status")
	})
	Model insertModel(Model model);
	
	@Select(U_Model)
	@Options(statementType = StatementType.CALLABLE)
	@Results({
		@Result(property = "model_id", column = "model_ids"),
		@Result(property = "brand_id", column = "brand_id"),
		@Result(property = "model_name", column = "model_name"),
		@Result(property = "description", column = "description"),
		@Result(property = "model_camera", column = "model_camera"),
		@Result(property = "model_accessory", column = "model_accessory"),
		@Result(property = "model_status", column = "model_status")
	})
	Model updateModel(Model model);
	
	@Update(D_Model)
	boolean deleteModel(int id);
	
	@Select(F_Model)
	@Results({
		@Result(property = "model_id", column = "model_id"),
		@Result(property = "brand_id", column = "brand_id"),
		@Result(property = "model_name", column = "model_name"),
		@Result(property = "description", column = "description"),
		@Result(property = "model_camera", column = "model_camera"),
		@Result(property = "model_accessory", column = "model_accessory"),
		@Result(property = "model_status", column = "model_status")
	})
	Model findModel(int id);
	
	@Select(F_ModelByCamera)
	@Results({
		@Result(property = "model_id", column = "model_id"),
		@Result(property = "brand_id", column = "brand_id"),
		@Result(property = "model_name", column = "model_name"),
		@Result(property = "description", column = "description"),
		@Result(property = "model_camera", column = "model_camera"),
		@Result(property = "model_accessory", column = "model_accessory"),
		@Result(property = "model_status", column = "model_status")
	})
	ArrayList<Model> findModelByCamera(int cameraType);
	
	@Select(F_ModelByAccessory)
	@Results({
		@Result(property = "model_id", column = "model_id"),
		@Result(property = "brand_id", column = "brand_id"),
		@Result(property = "model_name", column = "model_name"),
		@Result(property = "description", column = "description"),
		@Result(property = "model_camera", column = "model_camera"),
		@Result(property = "model_accessory", column = "model_accessory"),
		@Result(property = "model_status", column = "model_status")
	})
	ArrayList<Model> findModelByAccessory(int accessoryType);
	
	@Select(F_A_Model)
	@Results({
		@Result(property = "model_id", column = "model_id"),
		@Result(property = "brand_id", column = "brand_id"),
		@Result(property = "model_name", column = "model_name"),
		@Result(property = "description", column = "description"),
		@Result(property = "model_camera", column = "model_camera"),
		@Result(property = "model_accessory", column = "model_accessory"),
		@Result(property = "model_status", column = "model_status")
	})
	ArrayList<Model> findAllModels();
}
