package com.setec_ecomerce.repository.products.dao.brand;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.mapping.StatementType;
import org.springframework.stereotype.Repository;

import com.setec_ecomerce.repository.products.dto.brand.Brand;

@Repository
public interface BrandDAO {
	String C_Brand = "{ call \"insertToBrand\"("
			+ "#{brand_name},"
			+ "#{description},"
			+ "#{brand_camera},"
			+ "#{brand_accessory},"
			+ "#{brand_status})}";
	
	String U_Brand = "{ call \"updateToBrand\"("
			+ "#{brand_id},"
			+ "#{brand_name},"
			+ "#{description},"
			+ "#{brand_camera},"
			+ "#{brand_accessory},"
			+ "#{brand_status})}";
	
	String D_Brand = "UPDATE table_brand SET brand_status = false WHERE brand_id = #{id};";
	
	String SELECT_BY_Brand_ID = "SELECT * FROM table_brand WHERE brand_id = #{id} AND brand_status = true";
	String SELECT_BY_Brand_ID_AND_TYPE_CAMERA = "SELECT * FROM table_brand WHERE brand_camera = #{brand_camera} AND brand_status = true";
	String SELECT_BY_Brand_ID_AND_TYPE_ACCESSORY = "SELECT * FROM table_brand WHERE brand_accessory = #{brand_accessory} AND brand_status = true";
	String SELECT_A_Brand = "SELECT * FROM table_brand WHERE brand_status = true";

	
	
	@Select(C_Brand)
	@Options(statementType = StatementType.CALLABLE)
	@Results({
		@Result(property = "brand_id" , column = "brand_ids"),
		@Result(property = "brand_name" , column = "brand_name"),
		@Result(property = "description" , column = "description"),
		@Result(property = "brand_camera" , column = "brand_camera"),
		@Result(property = "brand_accessory" , column = "brand_accessory"),
		@Result(property = "brand_status" , column = "status"),
	})
	Brand insertBrand(Brand brand);
	
	@Select(U_Brand)
	@Options(statementType = StatementType.CALLABLE)
	@Results({
		@Result(property = "brand_id" , column = "brand_ids"),
		@Result(property = "brand_name" , column = "brand_names"),
		@Result(property = "description" , column = "descriptions"),
		@Result(property = "brand_camera" , column = "brand_cameras"),
		@Result(property = "brand_accessory" , column = "brand_accessorys"),
		@Result(property = "brand_status" , column = "brand_statuss"),
	})
	Brand updateBrand(Brand brand);
	
	
	@Update(D_Brand)
	boolean deleteBrand(int id);
	
	
	@Select(SELECT_BY_Brand_ID)
	@Results({
		@Result(property = "brand_id" , column = "brand_id"),
		@Result(property = "brand_name" , column = "brand_name"),
		@Result(property = "description" , column = "description"),
		@Result(property = "brand_camera" , column = "brand_camera"),
		@Result(property = "brand_accessory" , column = "brand_accessory"),
		@Result(property = "brand_status" , column = "brand_status"),
	})
	Brand findBrand(int id);
	
	@Select(SELECT_BY_Brand_ID_AND_TYPE_CAMERA)
	@Results({
		@Result(property = "brand_id" , column = "brand_id"),
		@Result(property = "brand_name" , column = "brand_name"),
		@Result(property = "description" , column = "description"),
		@Result(property = "brand_camera" , column = "brand_camera"),
		@Result(property = "brand_accessory" , column = "brand_accessory"),
		@Result(property = "brand_status" , column = "brand_status"),
	})
	ArrayList<Brand> findByBrandCamera(boolean brand_camera);
	
	@Select(SELECT_BY_Brand_ID_AND_TYPE_ACCESSORY)
	@Results({
		@Result(property = "brand_id" , column = "brand_id"),
		@Result(property = "brand_name" , column = "brand_name"),
		@Result(property = "description" , column = "description"),
		@Result(property = "brand_camera" , column = "brand_camera"),
		@Result(property = "brand_accessory" , column = "brand_accessory"),
		@Result(property = "brand_status" , column = "brand_status"),
	})
	ArrayList<Brand> findBrandByAccessory(boolean brand_accessory);
	
	@Select(SELECT_A_Brand)
	@Results({
		@Result(property = "brand_id" , column = "brand_id"),
		@Result(property = "brand_name" , column = "brand_name"),
		@Result(property = "description" , column = "description"),
		@Result(property = "brand_camera" , column = "brand_camera"),
		@Result(property = "brand_accessory" , column = "brand_accessory"),
		@Result(property = "brand_status" , column = "brand_status"),
	})
	ArrayList<Brand> findAllBrands();

}
