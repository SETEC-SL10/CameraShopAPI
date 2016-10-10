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
import com.setec_ecomerce.repository.products.dao.brand.BrandDAO;
import com.setec_ecomerce.repository.products.dao.category.CategoryDAO;
import com.setec_ecomerce.repository.products.dao.model.ModelDAO;
import com.setec_ecomerce.repository.products.dto.PageForm;
import com.setec_ecomerce.repository.products.dto.brand.Brand;
import com.setec_ecomerce.repository.products.dto.category.Category;
import com.setec_ecomerce.repository.products.dto.model.Model;
import com.setec_ecomerce.repository.products.dto.new_accessory.NewAccessory;

@Repository
public interface NewAccessoryDAO {
	String C_newAccesory = "{ call \"insertToNewAccessory\"("
							//+ "OUT accessory_id character varying,"
							+ "#{new_accessory_code},"
							+ "#{new_accessory_name},"
							+ "#{province_ship_price},"
							+ "#{local_ship_price},"
							+ "#{type_id},"
							+ "#{category.category_id},"
							+ "#{brand.brand_id},"
							+ "#{model.model_id},"
							+ "#{description},"
							+ "#{detail},"
							+ "#{img_url},"
							+ "#{status})}";
	
	String U_newAccesory = "{ call \"updateToNewAccessory\"("
							+ "#{new_accessory_id},"
							+ "#{new_accessory_code},"
							+ "#{new_accessory_name},"
							+ "#{qty_in_stock},"
							+ "#{available_stock},"
							+ "#{province_ship_price},"
							+ "#{local_ship_price},"
							+ "#{type_id},"
							+ "#{category.category_id},"
							+ "#{brand.brand_id},"
							+ "#{model.model_id},"
							+ "#{description},"
							+ "#{detail},"
							+ "#{img_url},"
							+ "#{status})}";
	
	String D_newAccesory = "UPDATE table_new_accessory SET status = false WHERE new_accessory_id = #{id}";
	
	String F_newAccesory = " SELECT * FROM table_new_accessory WHERE new_accessory_id = #{id} AND status = true";
	
	String S_NewAccesory = "SELECT * FROM view_accessory_new LIMIT #{limit} OFFSET #{limit} * #{page}";
	String Count_S_NewAccesory = "SELECT ceil( count(*)::NUMERIC / #{limit} )  FROM view_accessory_new";
	
	String S_NewAccesory_Name = "SELECT * FROM view_accessory_new WHERE LOWER(view_accessory_new.new_accessory_name) LIKE '%'|| LOWER(#{conditionValue}) ||'%' LIMIT #{limit} OFFSET #{limit} * #{page}";
	String Count_S_NewAccesory_Name = "SELECT ceil( count(*)::NUMERIC / #{limit} ) FROM view_accessory_new WHERE LOWER(view_accessory_new.new_accessory_name) LIKE '%'|| LOWER(#{conditionValue}) ||'%' ";

	String S_NewAccesory_Code = "SELECT * FROM view_accessory_new WHERE LOWER(view_accessory_new.new_accessory_code) LIKE '%'|| LOWER(#{conditionValue}) ||'%' LIMIT #{limit} OFFSET #{limit} * #{page}";
	String Count_S_NewAccesory_Code = "SELECT ceil( count(*)::NUMERIC / #{limit} ) FROM view_accessory_new WHERE LOWER(view_accessory_new.new_accessory_code) LIKE '%'|| LOWER(#{conditionValue}) ||'%' ";

	String S_NewAccesory_Category = "SELECT * FROM view_accessory_new WHERE LOWER(view_accessory_new.category_name) LIKE '%'|| LOWER(#{conditionValue}) ||'%' LIMIT #{limit} OFFSET #{limit} * #{page}";
	String Count_S_NewAccesory_Category = "SELECT ceil( count(*)::NUMERIC / #{limit} ) FROM view_accessory_new WHERE LOWER(view_accessory_new.category_name) LIKE '%'|| LOWER(#{conditionValue}) ||'%' ";

	String S_NewAccesory_Brand = "SELECT * FROM view_accessory_new WHERE LOWER(view_accessory_new.brand_name) LIKE '%'|| LOWER(#{conditionValue}) ||'%' LIMIT #{limit} OFFSET #{limit} * #{page}";
	String Count_S_NewAccesory_Brand = "SELECT ceil( count(*)::NUMERIC / #{limit} ) FROM view_accessory_new WHERE LOWER(view_accessory_new.brand_name) LIKE '%'|| LOWER(#{conditionValue}) ||'%' ";
	
	String S_NewAccesory_Model = "SELECT * FROM view_accessory_new WHERE LOWER(view_accessory_new.model_name) LIKE '%'|| LOWER(#{conditionValue}) ||'%' LIMIT #{limit} OFFSET #{limit} * #{page}";
	String Count_S_NewAccesory_Model = "SELECT * FROM view_accessory_new WHERE LOWER(view_accessory_new.model_name) LIKE '%'|| LOWER(#{conditionValue}) ||'%' LIMIT #{limit} OFFSET #{limit} * #{page}";

	@Select(C_newAccesory)
	@Options(statementType = StatementType.CALLABLE)
	@Results({
		@Result(property = "new_accessory_id", column = "accessory_id"),
		@Result(property = "new_accessory_code", column = "new_accessory_code"),
		@Result(property = "new_accessory_name", column = "new_accessory_name"),
		@Result(property = "qty_in_stock", column = "qty_in_stock"),
		@Result(property = "available_stock", column = "available_stock"),
		@Result(property = "province_ship_price", column = "province_ship_price"),
		@Result(property = "local_ship_price", column = "local_ship_price"),
		@Result(property = "type_id", column = "type_id"),
		@Result(property = "category", column = "category_id", one=@One(select = "findCategory")),
		@Result(property = "brand", column = "brand_id", one=@One(select = "findBrand")),
		@Result(property = "model", column = "model_id", one=@One(select = "findModel")),
		@Result(property = "description", column = "description"),
		@Result(property = "detail", column = "detail"),
		@Result(property = "img_url", column = "img_url"),
		@Result(property = "status", column = "status"),
	})
	NewAccessory createNewAccessory(NewAccessory newAccessory);
	
	@Select(U_newAccesory)
	@Options(statementType = StatementType.CALLABLE)
	@Results({
		@Result(property = "new_accessory_id", column = "accessory_id"),
		@Result(property = "new_accessory_code", column = "new_accessory_code"),
		@Result(property = "new_accessory_name", column = "new_accessory_name"),
		@Result(property = "qty_in_stock", column = "qty_in_stock"),
		@Result(property = "available_stock", column = "available_stock"),
		@Result(property = "province_ship_price", column = "province_ship_price"),
		@Result(property = "local_ship_price", column = "local_ship_price"),
		@Result(property = "type_id", column = "type_id"),
		@Result(property = "category", column = "category_id", one=@One(select = "findCategory")),
		@Result(property = "brand", column = "brand_id", one=@One(select = "findBrand")),
		@Result(property = "model", column = "model_id", one=@One(select = "findModel")),
		@Result(property = "description", column = "description"),
		@Result(property = "detail", column = "detail"),
		@Result(property = "img_url", column = "img_url"),
		@Result(property = "status", column = "status"),
	})
	NewAccessory updateNewAccessory(NewAccessory newAccessory);
	
	@Update(D_newAccesory)
	boolean deleteNewAccessory(String id);
	
	@Select(F_newAccesory)
	@Results({
		@Result(property = "new_accessory_id", column = "new_accessory_id"),
		@Result(property = "new_accessory_code", column = "new_accessory_code"),
		@Result(property = "new_accessory_name", column = "new_accessory_name"),
		@Result(property = "qty_in_stock", column = "qty_in_stock"),
		@Result(property = "available_stock", column = "available_stock"),
		@Result(property = "province_ship_price", column = "province_ship_price"),
		@Result(property = "local_ship_price", column = "local_ship_price"),
		@Result(property = "type_id", column = "type_id"),
		@Result(property = "category", column = "category_id", one=@One(select = "findCategory")),
		@Result(property = "brand", column = "brand_id", one=@One(select = "findBrand")),
		@Result(property = "model", column = "model_id", one=@One(select = "findModel")),
		@Result(property = "description", column = "description"),
		@Result(property = "detail", column = "detail"),
		@Result(property = "img_url", column = "img_url"),
		@Result(property = "status", column = "status"),
	})
	NewAccessory findNewAccessory(String id);
	
	@Select(S_NewAccesory)
	@Results({
		@Result(property = "new_accessory_id", column = "new_accessory_id"),
		@Result(property = "new_accessory_code", column = "new_accessory_code"),
		@Result(property = "new_accessory_name", column = "new_accessory_name"),
		@Result(property = "qty_in_stock", column = "qty_in_stock"),
		@Result(property = "available_stock", column = "available_stock"),
		@Result(property = "province_ship_price", column = "province_ship_price"),
		@Result(property = "local_ship_price", column = "local_ship_price"),
		@Result(property = "type_id", column = "type_id"),
		@Result(property = "category.category_id", column = "category_id"),
		@Result(property = "category.category_name", column = "category_name"),
		@Result(property = "category.description", column = "category_description"),
		@Result(property = "category.category_camera", column = "category_camera"),
		@Result(property = "category.category_accessory", column = "category_accessory"),
		@Result(property = "category.status", column = "category_status"),
		@Result(property = "brand.brand_id", column = "brand_id"),
		@Result(property = "brand.brand_name", column = "brand_name"),
		@Result(property = "brand.description", column = "brand_description"),
		@Result(property = "brand.brand_camera", column = "brand_camera"),
		@Result(property = "brand.brand_accessory", column = "brand_accessory"),
		@Result(property = "brand.brand_status", column = "brand_status"),
		@Result(property = "model.model_id", column = "model_id"),
		@Result(property = "model.model_name", column = "model_name"),
		@Result(property = "model.description", column = "model_description"),
		@Result(property = "model.model_camera", column = "model_camera"),
		@Result(property = "model.model_accessory", column = "model_accessory"),
		@Result(property = "model.model_status", column = "model_status"),
		@Result(property = "model.brand_id", column = "brand_id"),
		@Result(property = "description", column = "description"),
		@Result(property = "img_url", column = "img_url"),
		@Result(property = "detail", column = "detail"),
		@Result(property = "status", column = "status")
	})
	ArrayList<NewAccessory> getAllNewAccessory(PageForm page);
	
	@Select(Count_S_NewAccesory)
	int countPageAllNewAccessory(PageForm page);
	
	@Select(S_NewAccesory_Name)
	@Results({
		@Result(property = "new_accessory_id", column = "new_accessory_id"),
		@Result(property = "new_accessory_code", column = "new_accessory_code"),
		@Result(property = "new_accessory_name", column = "new_accessory_name"),
		@Result(property = "qty_in_stock", column = "qty_in_stock"),
		@Result(property = "available_stock", column = "available_stock"),
		@Result(property = "province_ship_price", column = "province_ship_price"),
		@Result(property = "local_ship_price", column = "local_ship_price"),
		@Result(property = "type_id", column = "type_id"),
		@Result(property = "category.category_id", column = "category_id"),
		@Result(property = "category.category_name", column = "category_name"),
		@Result(property = "category.description", column = "category_description"),
		@Result(property = "category.category_camera", column = "category_camera"),
		@Result(property = "category.category_accessory", column = "category_accessory"),
		@Result(property = "category.status", column = "category_status"),
		@Result(property = "brand.brand_id", column = "brand_id"),
		@Result(property = "brand.brand_name", column = "brand_name"),
		@Result(property = "brand.description", column = "brand_description"),
		@Result(property = "brand.brand_camera", column = "brand_camera"),
		@Result(property = "brand.brand_accessory", column = "brand_accessory"),
		@Result(property = "brand.brand_status", column = "brand_status"),
		@Result(property = "model.model_id", column = "model_id"),
		@Result(property = "model.model_name", column = "model_name"),
		@Result(property = "model.description", column = "model_description"),
		@Result(property = "model.model_camera", column = "model_camera"),
		@Result(property = "model.model_accessory", column = "model_accessory"),
		@Result(property = "model.model_status", column = "model_status"),
		@Result(property = "model.brand_id", column = "brand_id"),
		@Result(property = "description", column = "description"),
		@Result(property = "img_url", column = "img_url"),
		@Result(property = "detail", column = "detail"),
		@Result(property = "status", column = "status")
	})
	ArrayList<NewAccessory> getAllNewAccessoryName(PageForm page);
	
	@Select(Count_S_NewAccesory_Name)
	int countPageAllNewAccessoryName(PageForm page);
	
	@Select(S_NewAccesory_Code)
	@Results({
		@Result(property = "new_accessory_id", column = "new_accessory_id"),
		@Result(property = "new_accessory_code", column = "new_accessory_code"),
		@Result(property = "new_accessory_name", column = "new_accessory_name"),
		@Result(property = "qty_in_stock", column = "qty_in_stock"),
		@Result(property = "available_stock", column = "available_stock"),
		@Result(property = "province_ship_price", column = "province_ship_price"),
		@Result(property = "local_ship_price", column = "local_ship_price"),
		@Result(property = "type_id", column = "type_id"),
		@Result(property = "category.category_id", column = "category_id"),
		@Result(property = "category.category_name", column = "category_name"),
		@Result(property = "category.description", column = "category_description"),
		@Result(property = "category.category_camera", column = "category_camera"),
		@Result(property = "category.category_accessory", column = "category_accessory"),
		@Result(property = "category.status", column = "category_status"),
		@Result(property = "brand.brand_id", column = "brand_id"),
		@Result(property = "brand.brand_name", column = "brand_name"),
		@Result(property = "brand.description", column = "brand_description"),
		@Result(property = "brand.brand_camera", column = "brand_camera"),
		@Result(property = "brand.brand_accessory", column = "brand_accessory"),
		@Result(property = "brand.brand_status", column = "brand_status"),
		@Result(property = "model.model_id", column = "model_id"),
		@Result(property = "model.model_name", column = "model_name"),
		@Result(property = "model.description", column = "model_description"),
		@Result(property = "model.model_camera", column = "model_camera"),
		@Result(property = "model.model_accessory", column = "model_accessory"),
		@Result(property = "model.model_status", column = "model_status"),
		@Result(property = "model.brand_id", column = "brand_id"),
		@Result(property = "description", column = "description"),
		@Result(property = "img_url", column = "img_url"),
		@Result(property = "detail", column = "detail"),
		@Result(property = "status", column = "status")
	})
	ArrayList<NewAccessory> getAllNewAccessoryCode(PageForm page);
	
	@Select(Count_S_NewAccesory_Code)
	int countPageAllNewAccessoryCode(PageForm page);
	
	@Select(S_NewAccesory_Category)
	@Results({
		@Result(property = "new_accessory_id", column = "new_accessory_id"),
		@Result(property = "new_accessory_code", column = "new_accessory_code"),
		@Result(property = "new_accessory_name", column = "new_accessory_name"),
		@Result(property = "qty_in_stock", column = "qty_in_stock"),
		@Result(property = "available_stock", column = "available_stock"),
		@Result(property = "province_ship_price", column = "province_ship_price"),
		@Result(property = "local_ship_price", column = "local_ship_price"),
		@Result(property = "type_id", column = "type_id"),
		@Result(property = "category.category_id", column = "category_id"),
		@Result(property = "category.category_name", column = "category_name"),
		@Result(property = "category.description", column = "category_description"),
		@Result(property = "category.category_camera", column = "category_camera"),
		@Result(property = "category.category_accessory", column = "category_accessory"),
		@Result(property = "category.status", column = "category_status"),
		@Result(property = "brand.brand_id", column = "brand_id"),
		@Result(property = "brand.brand_name", column = "brand_name"),
		@Result(property = "brand.description", column = "brand_description"),
		@Result(property = "brand.brand_camera", column = "brand_camera"),
		@Result(property = "brand.brand_accessory", column = "brand_accessory"),
		@Result(property = "brand.brand_status", column = "brand_status"),
		@Result(property = "model.model_id", column = "model_id"),
		@Result(property = "model.model_name", column = "model_name"),
		@Result(property = "model.description", column = "model_description"),
		@Result(property = "model.model_camera", column = "model_camera"),
		@Result(property = "model.model_accessory", column = "model_accessory"),
		@Result(property = "model.model_status", column = "model_status"),
		@Result(property = "model.brand_id", column = "brand_id"),
		@Result(property = "description", column = "description"),
		@Result(property = "img_url", column = "img_url"),
		@Result(property = "detail", column = "detail"),
		@Result(property = "status", column = "status")
	})
	ArrayList<NewAccessory> getAllNewAccessoryCategory(PageForm page);
	
	@Select(Count_S_NewAccesory_Category)
	int countPageAllNewAccessoryCategory(PageForm page);
	
	@Select(S_NewAccesory_Brand)
	@Results({
		@Result(property = "new_accessory_id", column = "new_accessory_id"),
		@Result(property = "new_accessory_code", column = "new_accessory_code"),
		@Result(property = "new_accessory_name", column = "new_accessory_name"),
		@Result(property = "qty_in_stock", column = "qty_in_stock"),
		@Result(property = "available_stock", column = "available_stock"),
		@Result(property = "province_ship_price", column = "province_ship_price"),
		@Result(property = "local_ship_price", column = "local_ship_price"),
		@Result(property = "type_id", column = "type_id"),
		@Result(property = "category.category_id", column = "category_id"),
		@Result(property = "category.category_name", column = "category_name"),
		@Result(property = "category.description", column = "category_description"),
		@Result(property = "category.category_camera", column = "category_camera"),
		@Result(property = "category.category_accessory", column = "category_accessory"),
		@Result(property = "category.status", column = "category_status"),
		@Result(property = "brand.brand_id", column = "brand_id"),
		@Result(property = "brand.brand_name", column = "brand_name"),
		@Result(property = "brand.description", column = "brand_description"),
		@Result(property = "brand.brand_camera", column = "brand_camera"),
		@Result(property = "brand.brand_accessory", column = "brand_accessory"),
		@Result(property = "brand.brand_status", column = "brand_status"),
		@Result(property = "model.model_id", column = "model_id"),
		@Result(property = "model.model_name", column = "model_name"),
		@Result(property = "model.description", column = "model_description"),
		@Result(property = "model.model_camera", column = "model_camera"),
		@Result(property = "model.model_accessory", column = "model_accessory"),
		@Result(property = "model.model_status", column = "model_status"),
		@Result(property = "model.brand_id", column = "brand_id"),
		@Result(property = "description", column = "description"),
		@Result(property = "img_url", column = "img_url"),
		@Result(property = "detail", column = "detail"),
		@Result(property = "status", column = "status")
	})
	ArrayList<NewAccessory> getAllNewAccessoryBrand(PageForm page);
	
	@Select(Count_S_NewAccesory_Brand)
	int countPageAllNewAccessoryBrand(PageForm page);
	
	@Select(S_NewAccesory_Model)
	@Results({
		@Result(property = "new_accessory_id", column = "new_accessory_id"),
		@Result(property = "new_accessory_code", column = "new_accessory_code"),
		@Result(property = "new_accessory_name", column = "new_accessory_name"),
		@Result(property = "qty_in_stock", column = "qty_in_stock"),
		@Result(property = "available_stock", column = "available_stock"),
		@Result(property = "province_ship_price", column = "province_ship_price"),
		@Result(property = "local_ship_price", column = "local_ship_price"),
		@Result(property = "type_id", column = "type_id"),
		@Result(property = "category.category_id", column = "category_id"),
		@Result(property = "category.category_name", column = "category_name"),
		@Result(property = "category.description", column = "category_description"),
		@Result(property = "category.category_camera", column = "category_camera"),
		@Result(property = "category.category_accessory", column = "category_accessory"),
		@Result(property = "category.status", column = "category_status"),
		@Result(property = "brand.brand_id", column = "brand_id"),
		@Result(property = "brand.brand_name", column = "brand_name"),
		@Result(property = "brand.description", column = "brand_description"),
		@Result(property = "brand.brand_camera", column = "brand_camera"),
		@Result(property = "brand.brand_accessory", column = "brand_accessory"),
		@Result(property = "brand.brand_status", column = "brand_status"),
		@Result(property = "model.model_id", column = "model_id"),
		@Result(property = "model.model_name", column = "model_name"),
		@Result(property = "model.description", column = "model_description"),
		@Result(property = "model.model_camera", column = "model_camera"),
		@Result(property = "model.model_accessory", column = "model_accessory"),
		@Result(property = "model.model_status", column = "model_status"),
		@Result(property = "model.brand_id", column = "brand_id"),
		@Result(property = "description", column = "description"),
		@Result(property = "img_url", column = "img_url"),
		@Result(property = "detail", column = "detail"),
		@Result(property = "status", column = "status")
	})
	ArrayList<NewAccessory> getAllNewAccessoryModel(PageForm page);
	
	@Select(Count_S_NewAccesory_Model)
	int countPageAllNewAccessoryModel(PageForm page);
	
	@Select(CategoryDAO.FindByID)
	@Results({
		@Result(property = "category_id", column = "category_id"),
		@Result(property = "category_name", column = "category_name"),
		@Result(property = "description", column = "description"),
		@Result(property = "category_camera", column = "category_camera"),
		@Result(property = "category_accessory", column = "category_accessory"),
		@Result(property = "status", column = "status"),
	})
	Category findCategory(int id);
	
	@Select(BrandDAO.SELECT_BY_Brand_ID)
	@Results({
		@Result(property = "brand_id" , column = "brand_id"),
		@Result(property = "brand_name" , column = "brand_name"),
		@Result(property = "description" , column = "description"),
		@Result(property = "brand_camera" , column = "brand_camera"),
		@Result(property = "brand_accessory" , column = "brand_accessory"),
		@Result(property = "brand_status" , column = "brand_status"),
	})
	Brand findBrand(int id);
	
	@Select(ModelDAO.F_Model)
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

}
