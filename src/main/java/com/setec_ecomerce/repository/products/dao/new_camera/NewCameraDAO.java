package com.setec_ecomerce.repository.products.dao.new_camera;

import java.util.ArrayList;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.One;
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
import com.setec_ecomerce.repository.products.dto.new_camera.NewCamera;

@Repository
public interface NewCameraDAO {

	String C_NewCamera = "{ call \"insertToNewCamera\"( "
			//+ "#{new_camera_id, mode=OUT, jdbcType=VARCHAR}"
			+ "#{new_camera_code}"
			+ ",#{new_camera_name}"
			+ ",#{warranty}"
			+ ",#{province_ship_price}"
			+ ",#{local_ship_price}"
			+ ",#{type_id}"
			+ ",#{category.category_id}"
			+ ",#{brand.brand_id}"
			+ ",#{model.model_id}"
			+ ",#{description}"
			+ ",#{detail}"
			+ ",#{img_url}"
			+ ",#{status})}";
	
	String U_NewCamera = "{ call \"updateToNewCamera\"("
			+ "#{new_camera_id}"
			+ ",#{new_camera_code}"
			+ ",#{new_camera_name}"
			+ ",#{qty_in_stock}"
			+ ",#{available_stock}"
			+ ",#{warranty}"
			+ ",#{province_ship_price}"
			+ ",#{local_ship_price}"
			+ ",#{type_id}"
			+ ",#{category.category_id}"
			+ ",#{brand.brand_id}"
			+ ",#{model.model_id}"
			+ ",#{description}"
			+ ",#{detail}"
			+ ",#{img_url}"
			+ ",#{status})}";
	
	String D_NewCamera = "UPDATE table_new_camera SET status = 'f' WHERE new_camera_id = #{id}";
	
	String S_NewCamera = "SELECT * FROM view_camera_new LIMIT #{limit} OFFSET #{limit} * #{page}";
	String Count_S_NewCamera = "SELECT ceil( count(*)::NUMERIC / #{limit} )  FROM view_camera_new";
	
	String S_NewCamera_Name = "SELECT * FROM view_camera_new WHERE LOWER(view_camera_new.new_camera_name) LIKE '%'|| LOWER(#{conditionValue}) ||'%' LIMIT #{limit} OFFSET #{limit} * #{page}";
	String Count_S_NewCamera_Name = "SELECT ceil( count(*)::NUMERIC / #{limit} ) FROM view_camera_new WHERE LOWER(view_camera_new.new_camera_name) LIKE '%'|| LOWER(#{conditionValue}) ||'%' ";
	
	String S_NewCamera_Code = "SELECT * FROM view_camera_new WHERE LOWER(view_camera_new.new_camera_code) LIKE '%'|| LOWER(#{conditionValue}) ||'%' LIMIT #{limit} OFFSET #{limit} * #{page}";
	String Count_S_NewCamera_Code = "SELECT ceil( count(*)::NUMERIC / #{limit} ) FROM view_camera_new WHERE LOWER(view_camera_new.new_camera_code) LIKE '%'|| LOWER(#{conditionValue}) ||'%' ";
	
	String S_NewCamera_Category = "SELECT * FROM view_camera_new WHERE LOWER(view_camera_new.category_name) LIKE '%'|| LOWER(#{conditionValue}) ||'%' LIMIT #{limit} OFFSET #{limit} * #{page}";
	String Count_S_NewCamera_Category = "SELECT ceil( count(*)::NUMERIC / #{limit} ) FROM view_camera_new WHERE LOWER(view_camera_new.category_name) LIKE '%'|| LOWER(#{conditionValue}) ||'%' ";
	
	String S_NewCamera_Brand = "SELECT * FROM view_camera_new WHERE LOWER(view_camera_new.brand_name) LIKE '%'|| LOWER(#{conditionValue}) ||'%' LIMIT #{limit} OFFSET #{limit} * #{page}";
	String Count_S_NewCamera_Brand = "SELECT ceil( count(*)::NUMERIC / #{limit} ) FROM view_camera_new WHERE LOWER(view_camera_new.brand_name) LIKE '%'|| LOWER(#{conditionValue}) ||'%' ";
	
	String S_NewCamera_Model = "SELECT * FROM view_camera_new WHERE LOWER(view_camera_new.model_name) LIKE '%'|| LOWER(#{conditionValue}) ||'%' LIMIT #{limit} OFFSET #{limit} * #{page}";
	String Count_S_NewCamera_Model = "SELECT ceil( count(*)::NUMERIC / #{limit} ) FROM view_camera_new WHERE LOWER(view_camera_new.model_name) LIKE '%'|| LOWER(#{conditionValue}) ||'%' ";
	
	String F_NewCamera = "SELECT * FROM table_new_camera WHERE new_camera_id = #{id} AND status = true";
	
	@Select(C_NewCamera)
	@Options(statementType = StatementType.CALLABLE)
	@Results({
		@Result(property = "new_camera_id", column = "camera_id"),
		@Result(property = "new_camera_code", column = "new_camera_code"),
		@Result(property = "new_camera_name", column = "new_camera_name"),
		@Result(property = "warranty", column = "warranty"),
		@Result(property = "province_ship_price", column = "province_ship_price"),
		@Result(property = "local_ship_price", column = "local_ship_price"),
		@Result(property = "type_id", column = "type_id"),
		@Result(property = "category", column = "category_id", one=@One(select = "findCategory")),
		@Result(property = "brand", column = "brand_id", one=@One(select = "findBrand")),
		@Result(property = "model", column = "model_id", one=@One(select = "findModel")),
		@Result(property = "description", column = "description"),
		@Result(property = "img_url", column = "img_url"),
		@Result(property = "detail", column = "detail"),
		@Result(property = "status", column = "status")
	})
	NewCamera createNewCamera(NewCamera newCamera);
	
	
	
	@Select(U_NewCamera)
	@Options(statementType = StatementType.CALLABLE)
	@Results({
		@Result(property = "new_camera_id", column = "new_camera_ids"),
		@Result(property = "new_camera_code", column = "new_camera_codes"),
		@Result(property = "new_camera_name", column = "new_camera_names"),
		@Result(property = "qty_in_stock", column = "qty_in_stocks"),
		@Result(property = "available_stock", column = "available_stocks"),
		@Result(property = "warranty", column = "warrantys"),
		@Result(property = "province_ship_price", column = "province_ship_prices"),
		@Result(property = "local_ship_price", column = "local_ship_prices"),
		@Result(property = "type_id", column = "type_ids"),
		@Result(property = "category", column = "category_id", one=@One(select = "findCategory")),
		@Result(property = "brand", column = "brand_id", one=@One(select = "findBrand")),
		@Result(property = "model", column = "model_id", one=@One(select = "findModel")),
		@Result(property = "description", column = "descriptions"),
		@Result(property = "img_url", column = "img_urls"),
		@Result(property = "detail", column = "details"),
		@Result(property = "status", column = "statuss")
	})
	NewCamera updateNewCamera(NewCamera newCamera);
	
	@Update(D_NewCamera)
	boolean deleteNewCamera(String id);
	
	@Select(S_NewCamera)
	@Results({
		@Result(property = "new_camera_id", column = "new_camera_id"),
		@Result(property = "new_camera_code", column = "new_camera_code"),
		@Result(property = "new_camera_name", column = "new_camera_name"),
		@Result(property = "qty_in_stock", column = "qty_in_stock"),
		@Result(property = "available_stock", column = "available_stock"),
		@Result(property = "warranty", column = "warranty"),
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
	ArrayList<NewCamera> getAllNewCamera(PageForm page);
	
	@Select(Count_S_NewCamera)
	int countPageAllNewCamera(PageForm page);
	
	@Select(S_NewCamera_Name)
	@Results({
		@Result(property = "new_camera_id", column = "new_camera_id"),
		@Result(property = "new_camera_code", column = "new_camera_code"),
		@Result(property = "new_camera_name", column = "new_camera_name"),
		@Result(property = "qty_in_stock", column = "qty_in_stock"),
		@Result(property = "available_stock", column = "available_stock"),
		@Result(property = "warranty", column = "warranty"),
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
	ArrayList<NewCamera> getAllNewCameraName(PageForm page);
	
	@Select(Count_S_NewCamera_Name)
	int countPageAllNewCameraName(PageForm page);
	
	@Select(S_NewCamera_Code)
	@Results({
		@Result(property = "new_camera_id", column = "new_camera_id"),
		@Result(property = "new_camera_code", column = "new_camera_code"),
		@Result(property = "new_camera_name", column = "new_camera_name"),
		@Result(property = "qty_in_stock", column = "qty_in_stock"),
		@Result(property = "available_stock", column = "available_stock"),
		@Result(property = "warranty", column = "warranty"),
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
	ArrayList<NewCamera> getAllNewCameraCode(PageForm page);
	
	@Select(Count_S_NewCamera_Code)
	int countPageAllNewCameraCode(PageForm page);
	
	@Select(S_NewCamera_Category)
	@Results({
		@Result(property = "new_camera_id", column = "new_camera_id"),
		@Result(property = "new_camera_code", column = "new_camera_code"),
		@Result(property = "new_camera_name", column = "new_camera_name"),
		@Result(property = "qty_in_stock", column = "qty_in_stock"),
		@Result(property = "available_stock", column = "available_stock"),
		@Result(property = "warranty", column = "warranty"),
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
	ArrayList<NewCamera> getAllNewCameraCategory(PageForm page);
	
	@Select(Count_S_NewCamera_Category)
	int countPageAllNewCameraCategory(PageForm page);
	
	@Select(S_NewCamera_Brand)
	@Results({
		@Result(property = "new_camera_id", column = "new_camera_id"),
		@Result(property = "new_camera_code", column = "new_camera_code"),
		@Result(property = "new_camera_name", column = "new_camera_name"),
		@Result(property = "qty_in_stock", column = "qty_in_stock"),
		@Result(property = "available_stock", column = "available_stock"),
		@Result(property = "warranty", column = "warranty"),
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
	ArrayList<NewCamera> getAllNewCameraBrand(PageForm page);
	
	@Select(Count_S_NewCamera_Brand)
	int countPageAllNewCameraBrand(PageForm page);
	
	@Select(S_NewCamera_Model)
	@Results({
		@Result(property = "new_camera_id", column = "new_camera_id"),
		@Result(property = "new_camera_code", column = "new_camera_code"),
		@Result(property = "new_camera_name", column = "new_camera_name"),
		@Result(property = "qty_in_stock", column = "qty_in_stock"),
		@Result(property = "available_stock", column = "available_stock"),
		@Result(property = "warranty", column = "warranty"),
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
	ArrayList<NewCamera> getAllNewCameraModel(PageForm page);
	
	@Select(Count_S_NewCamera_Model)
	int countPageAllNewCameraModel(PageForm page);
	
	@Select(F_NewCamera)
	@Results({
		@Result(property = "new_camera_id", column = "new_camera_id"),
		@Result(property = "new_camera_code", column = "new_camera_code"),
		@Result(property = "new_camera_name", column = "new_camera_name"),
		@Result(property = "qty_in_stock", column = "qty_in_stock"),
		@Result(property = "available_stock", column = "available_stock"),
		@Result(property = "warranty", column = "warranty"),
		@Result(property = "province_ship_price", column = "province_ship_price"),
		@Result(property = "local_ship_price", column = "local_ship_price"),
		@Result(property = "type_id", column = "type_id"),
		@Result(property = "category", column = "category_id", one=@One(select = "findCategory")),
		@Result(property = "brand", column = "brand_id", one=@One(select = "findBrand")),
		@Result(property = "model", column = "model_id", one=@One(select = "findModel")),
		@Result(property = "description", column = "description"),
		@Result(property = "img_url", column = "img_url"),
		@Result(property = "detail", column = "detail"),
		@Result(property = "status", column = "status")
	})
	NewCamera findNewCameraService(String id);
	
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
