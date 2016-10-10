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
import com.setec_ecomerce.repository.products.dao.brand.BrandDAO;
import com.setec_ecomerce.repository.products.dao.category.CategoryDAO;
import com.setec_ecomerce.repository.products.dao.model.ModelDAO;
import com.setec_ecomerce.repository.products.dto.PageForm;
import com.setec_ecomerce.repository.products.dto.brand.Brand;
import com.setec_ecomerce.repository.products.dto.category.Category;
import com.setec_ecomerce.repository.products.dto.model.Model;
import com.setec_ecomerce.repository.products.dto.old_camera.OldCamera;

@Repository
public interface OldCameraDAO {
	String C_OldCamer = "{ call \"insertToOldCamera\"( "
			+ "#{old_camera_code}"
			+ ",#{old_camera_name}"
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
	
	String U_OldCamera = "{ call \"updateToOldCamera\"("
			+ "#{old_camera_id}"
			+ ",#{old_camera_code}"
			+ ",#{old_camera_name}"
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
	
	String D_OldCamera = "UPDATE table_old_camera SET status = 'f' WHERE old_camera_id = #{id}";
	
	String F_OldCamera = "SELECT * FROM table_old_camera WHERE old_camera_id = #{id} AND status = true";
	String S_OldCamera = "SELECT * FROM view_camera_old LIMIT #{limit} OFFSET #{limit} * #{page}";
	String Count_S_OldCamera = "SELECT ceil( count(*)::NUMERIC / #{limit} )  FROM view_camera_old";
	
	String S_OldCamera_Name = "SELECT * FROM view_camera_old WHERE LOWER(view_camera_old.old_camera_name) LIKE '%'|| LOWER(#{conditionValue}) ||'%' LIMIT #{limit} OFFSET #{limit} * #{page}";
	String Count_S_OldCamera_Name = "SELECT ceil( count(*)::NUMERIC / #{limit} ) FROM view_camera_old WHERE LOWER(view_camera_old.old_camera_name) LIKE '%'|| LOWER(#{conditionValue}) ||'%' ";
	
	String S_OldCamera_Code = "SELECT * FROM view_camera_old WHERE LOWER(view_camera_old.old_camera_code) LIKE '%'|| LOWER(#{conditionValue}) ||'%' LIMIT #{limit} OFFSET #{limit} * #{page}";
	String Count_S_OldCamera_Code = "SELECT ceil( count(*)::NUMERIC / #{limit} ) FROM view_camera_old WHERE LOWER(view_camera_old.old_camera_code) LIKE '%'|| LOWER(#{conditionValue}) ||'%' ";
	
	String S_OldCamera_Category = "SELECT * FROM view_camera_old WHERE LOWER(view_camera_old.category_name) LIKE '%'|| LOWER(#{conditionValue}) ||'%' LIMIT #{limit} OFFSET #{limit} * #{page}";
	String Count_S_OldCamera_Category = "SELECT ceil( count(*)::NUMERIC / #{limit} ) FROM view_camera_old WHERE LOWER(view_camera_old.category_name) LIKE '%'|| LOWER(#{conditionValue}) ||'%' ";
	
	String S_OldCamera_Brand = "SELECT * FROM view_camera_old WHERE LOWER(view_camera_old.brand_name) LIKE '%'|| LOWER(#{conditionValue}) ||'%' LIMIT #{limit} OFFSET #{limit} * #{page}";
	String Count_S_OldCamera_Brand = "SELECT ceil( count(*)::NUMERIC / #{limit} ) FROM view_camera_old WHERE LOWER(view_camera_old.brand_name) LIKE '%'|| LOWER(#{conditionValue}) ||'%' ";
	
	String S_OldCamera_Model = "SELECT * FROM view_camera_old WHERE LOWER(view_camera_old.model_name) LIKE '%'|| LOWER(#{conditionValue}) ||'%' LIMIT #{limit} OFFSET #{limit} * #{page}";
	String Count_S_OldCamera_Model = "SELECT ceil( count(*)::NUMERIC / #{limit} ) FROM view_camera_old WHERE LOWER(view_camera_old.model_name) LIKE '%'|| LOWER(#{conditionValue}) ||'%' ";

	@Select(C_OldCamer)
	@Options(statementType = StatementType.CALLABLE)
	@Results({
		@Result(property = "old_camera_id", column = "camera_id"),
		@Result(property = "old_camera_code", column = "old_camera_code"),
		@Result(property = "old_camera_name", column = "old_camera_name"),
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
	OldCamera insertOldCameraService(OldCamera oldCamera);
	
	
	
	@Select(U_OldCamera)
	@Options(statementType = StatementType.CALLABLE)
	@Results({
		@Result(property = "old_camera_id", column = "old_camera_ids"),
		@Result(property = "old_camera_code", column = "old_camera_codes"),
		@Result(property = "old_camera_name", column = "old_camera_names"),
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
	OldCamera updateOldCameraService(OldCamera oldCamera);
	
	@Update(D_OldCamera)
	boolean deletedOldCameraService(String id);
	
	@Select(F_OldCamera)
	@Results({
		@Result(property = "old_camera_id", column = "old_camera_id"),
		@Result(property = "old_camera_code", column = "old_camera_code"),
		@Result(property = "old_camera_name", column = "old_camera_name"),
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
	OldCamera findOldCameraService(String id);
	
	@Select(S_OldCamera)
	@Results({
		@Result(property = "old_camera_id", column = "old_camera_id"),
		@Result(property = "old_camera_code", column = "old_camera_code"),
		@Result(property = "old_camera_name", column = "old_camera_name"),
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
	ArrayList<OldCamera> getAllOldCamera(PageForm page);
	
	@Select(Count_S_OldCamera)
	int countPageAllOldCamera(PageForm page);
	
	@Select(S_OldCamera_Name)
	@Results({
		@Result(property = "old_camera_id", column = "old_camera_id"),
		@Result(property = "old_camera_code", column = "old_camera_code"),
		@Result(property = "old_camera_name", column = "old_camera_name"),
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
	ArrayList<OldCamera> getAllOldCameraName(PageForm page);
	
	@Select(Count_S_OldCamera_Name)
	int countPageAllOldCameraName(PageForm page);
	
	@Select(S_OldCamera_Code)
	@Results({
		@Result(property = "old_camera_id", column = "old_camera_id"),
		@Result(property = "old_camera_code", column = "old_camera_code"),
		@Result(property = "old_camera_name", column = "old_camera_name"),
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
	ArrayList<OldCamera> getAllOldCameraCode(PageForm page);
	
	@Select(Count_S_OldCamera_Code)
	int countPageAllOldCameraCode(PageForm page);
	
	@Select(S_OldCamera_Category)
	@Results({
		@Result(property = "old_camera_id", column = "old_camera_id"),
		@Result(property = "old_camera_code", column = "old_camera_code"),
		@Result(property = "old_camera_name", column = "old_camera_name"),
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
	ArrayList<OldCamera> getAllOldCameraCategory(PageForm page);
	
	@Select(Count_S_OldCamera_Category)
	int countPageAllOldCameraCategory(PageForm page);
	
	@Select(S_OldCamera_Brand)
	@Results({
		@Result(property = "old_camera_id", column = "old_camera_id"),
		@Result(property = "old_camera_code", column = "old_camera_code"),
		@Result(property = "old_camera_name", column = "old_camera_name"),
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
	ArrayList<OldCamera> getAllOldCameraBrand(PageForm page);
	
	@Select(Count_S_OldCamera_Brand)
	int countPageAllOldCameraBrand(PageForm page);
	
	@Select(S_OldCamera_Model)
	@Results({
		@Result(property = "old_camera_id", column = "old_camera_id"),
		@Result(property = "old_camera_code", column = "old_camera_code"),
		@Result(property = "old_camera_name", column = "old_camera_name"),
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
	ArrayList<OldCamera> getAllOldCameraModel(PageForm page);
	
	@Select(Count_S_OldCamera_Model)
	int countPageAllOldCameraModel(PageForm page);
	
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
