package com.setec_ecomerce.repository.products.dao;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.setec_ecomerce.repository.products.dto.PageForm;
import com.setec_ecomerce.repository.products.dto.products_form.ProductForm;
import com.setec_ecomerce.repository.products.dto.products_form.ProductImageForm;

@Repository
public interface ProductFormDAO {

	String F_ProductForm = "SELECT * FROM view_products_form LIMIT #{limit} OFFSET #{page} * #{limit}";
	String CountPage_F_ProductForm = "SELECT count(*) FROM view_products_form";
	
	String F_CameraNewForm = "SELECT * FROM view_camera_new_form LIMIT #{limit} OFFSET #{page} * #{limit}";
	String CountPage_F_CameraNewForm = "SELECT count(*) FROM view_camera_new_form";
	
	String F_CameraOldForm = "SELECT * FROM view_camera_old_form LIMIT #{limit} OFFSET #{page} * #{limit}";
	String CountPage_F_CameraOldForm = "SELECT count(*) FROM view_camera_old_form";
	
	String F_AccessoryOldForm = "SELECT * FROM view_accessory_old_form LIMIT #{limit} OFFSET #{page} * #{limit}";
	String CountPage_F_AccessoryOldForm = "SELECT count(*) FROM view_accessory_old_form";
	
	String F_AccessoryNewForm = "SELECT * FROM view_accessory_new_form LIMIT #{limit} OFFSET #{page} * #{limit}";
	String CountPage_F_AccessoryNewForm = "SELECT count(*) FROM view_accessory_new_form";
	
	String F_ProductForm_Name = "SELECT * FROM view_products_form WHERE LOWER(view_products_form.product_name) LIKE '%'|| LOWER(#{conditionValue}) ||'%' LIMIT #{limit} OFFSET #{limit} * #{page}";
	String CountPage_F_ProductForm_Name = "SELECT count(*) FROM view_products_form WHERE LOWER(view_products_form.product_name) LIKE '%'|| LOWER(#{conditionValue}) ||'%'";
	
	String F_ProductForm_Category = "SELECT * FROM view_products_form WHERE LOWER(view_products_form.category_name) LIKE '%'|| LOWER(#{conditionValue}) ||'%' LIMIT #{limit} OFFSET #{limit} * #{page}";
	String CountPage_F_ProductForm_Category = "SELECT count(*) FROM view_products_form WHERE LOWER(view_products_form.category_name) LIKE '%'|| LOWER(#{conditionValue}) ||'%'";
	
	String F_ProductForm_Brand = "SELECT * FROM view_products_form WHERE LOWER(view_products_form.brand_name) LIKE '%'|| LOWER(#{conditionValue}) ||'%' LIMIT #{limit} OFFSET #{limit} * #{page}";
	String CountPage_F_ProductForm_Brand = "SELECT count(*) FROM view_products_form WHERE LOWER(view_products_form.brand_name) LIKE '%'|| LOWER(#{conditionValue}) ||'%'";
	
	String F_ProductForm_Model = "SELECT * FROM view_products_form WHERE LOWER(view_products_form.model_name) LIKE '%'|| LOWER(#{conditionValue}) ||'%' LIMIT #{limit} OFFSET #{limit} * #{page}";
	String CountPage_F_ProductForm_Model = "SELECT count(*) FROM view_products_form WHERE LOWER(view_products_form.model_name) LIKE '%'|| LOWER(#{conditionValue}) ||'%'";
	
	String F_ProductForm_Color = "SELECT * FROM view_products_form WHERE LOWER(view_products_form.color_code) LIKE '%'|| LOWER(#{conditionValue}) ||'%' LIMIT #{limit} OFFSET #{limit} * #{page}";
	String CountPage_F_ProductForm_Color = "SELECT count(*) FROM view_products_form WHERE LOWER(view_products_form.color_code) LIKE '%'|| LOWER(#{conditionValue}) ||'%'";
	
	String F_CameraNewForm_Name = "SELECT * FROM view_camera_new_form WHERE LOWER(view_camera_new_form.product_name) LIKE '%'|| LOWER(#{conditionValue}) ||'%' LIMIT #{limit} OFFSET #{limit} * #{page}";
	String CountPage_F_CameraNewForm_Name = "SELECT count(*) FROM view_camera_new_form WHERE LOWER(view_camera_new_form.product_name) LIKE '%'|| LOWER(#{conditionValue}) ||'%'";
	
	String F_CameraNewForm_Category = "SELECT * FROM view_camera_new_form WHERE LOWER(view_camera_new_form.category_name) LIKE '%'|| LOWER(#{conditionValue}) ||'%' LIMIT #{limit} OFFSET #{limit} * #{page}";
	String CountPage_F_CameraNewForm_Category = "SELECT count(*) FROM view_camera_new_form WHERE LOWER(view_camera_new_form.category_name) LIKE '%'|| LOWER(#{conditionValue}) ||'%'";
	
	String F_CameraNewForm_Brand = "SELECT * FROM view_camera_new_form WHERE LOWER(view_camera_new_form.brand_name) LIKE '%'|| LOWER(#{conditionValue}) ||'%' LIMIT #{limit} OFFSET #{limit} * #{page}";
	String CountPage_F_CameraNewForm_Brand = "SELECT count(*) FROM view_camera_new_form WHERE LOWER(view_camera_new_form.brand_name) LIKE '%'|| LOWER(#{conditionValue}) ||'%'";
	
	String F_CameraNewForm_Model = "SELECT * FROM view_camera_new_form WHERE LOWER(view_camera_new_form.model_name) LIKE '%'|| LOWER(#{conditionValue}) ||'%' LIMIT #{limit} OFFSET #{limit} * #{page}";
	String CountPage_F_CameraNewForm_Model = "SELECT count(*) FROM view_camera_new_form WHERE LOWER(view_camera_new_form.model_name) LIKE '%'|| LOWER(#{conditionValue}) ||'%'";
	
	String F_CameraNewForm_Color = "SELECT * FROM view_camera_new_form WHERE LOWER(view_camera_new_form.color_code) LIKE '%'|| LOWER(#{conditionValue}) ||'%' LIMIT #{limit} OFFSET #{limit} * #{page}";
	String CountPage_F_CameraNewForm_Color = "SELECT count(*) FROM view_camera_new_form WHERE LOWER(view_camera_new_form.color_code) LIKE '%'|| LOWER(#{conditionValue}) ||'%'";
	
	String F_CameraOldForm_Name = "SELECT * FROM view_camera_old_form WHERE LOWER(view_camera_old_form.product_name) LIKE '%'|| LOWER(#{conditionValue}) ||'%' LIMIT #{limit} OFFSET #{limit} * #{page}";
	String CountPage_F_CameraOldForm_Name = "SELECT count(*) FROM view_camera_old_form WHERE LOWER(view_camera_old_form.product_name) LIKE '%'|| LOWER(#{conditionValue}) ||'%'";
	
	String F_CameraOldForm_Category = "SELECT * FROM view_camera_old_form WHERE LOWER(view_camera_old_form.category_name) LIKE '%'|| LOWER(#{conditionValue}) ||'%' LIMIT #{limit} OFFSET #{limit} * #{page}";
	String CountPage_F_CameraOldForm_Category = "SELECT count(*) FROM view_camera_old_form WHERE LOWER(view_camera_old_form.category_name) LIKE '%'|| LOWER(#{conditionValue}) ||'%'";
	
	String F_CameraOldForm_Brand = "SELECT * FROM view_camera_old_form WHERE LOWER(view_camera_old_form.brand_name) LIKE '%'|| LOWER(#{conditionValue}) ||'%' LIMIT #{limit} OFFSET #{limit} * #{page}";
	String CountPage_F_CameraOldForm_Brand = "SELECT count(*) FROM view_camera_old_form WHERE LOWER(view_camera_old_form.brand_name) LIKE '%'|| LOWER(#{conditionValue}) ||'%'";
	
	String F_CameraOldForm_Model = "SELECT * FROM view_camera_old_form WHERE LOWER(view_camera_old_form.model_name) LIKE '%'|| LOWER(#{conditionValue}) ||'%' LIMIT #{limit} OFFSET #{limit} * #{page}";
	String CountPage_F_CameraOldForm_Model = "SELECT count(*) FROM view_camera_old_form WHERE LOWER(view_camera_old_form.model_name) LIKE '%'|| LOWER(#{conditionValue}) ||'%'";
	
	String F_CameraOldForm_Color = "SELECT * FROM view_camera_old_form WHERE LOWER(view_camera_old_form.color_code) LIKE '%'|| LOWER(#{conditionValue}) ||'%' LIMIT #{limit} OFFSET #{limit} * #{page}";
	String CountPage_F_CameraOldForm_Color = "SELECT count(*) FROM view_camera_old_form WHERE LOWER(view_camera_old_form.color_code) LIKE '%'|| LOWER(#{conditionValue}) ||'%'";
	
	String F_AccessoryNewForm_Name = "SELECT * FROM view_accessory_new_form WHERE LOWER(view_accessory_new_form.product_name) LIKE '%'|| LOWER(#{conditionValue}) ||'%' LIMIT #{limit} OFFSET #{limit} * #{page}";
	String CountPage_F_AccessoryNewForm_Name = "SELECT count(*) FROM view_accessory_new_form WHERE LOWER(view_accessory_new_form.product_name) LIKE '%'|| LOWER(#{conditionValue}) ||'%'";
	
	String F_AccessoryNewForm_Category = "SELECT * FROM view_accessory_new_form WHERE LOWER(view_accessory_new_form.category_name) LIKE '%'|| LOWER(#{conditionValue}) ||'%' LIMIT #{limit} OFFSET #{limit} * #{page}";
	String CountPage_F_AccessoryNewForm_Category = "SELECT count(*) FROM view_accessory_new_form WHERE LOWER(view_accessory_new_form.category_name) LIKE '%'|| LOWER(#{conditionValue}) ||'%'";
	
	String F_AccessoryNewForm_Brand = "SELECT * FROM view_accessory_new_form WHERE LOWER(view_accessory_new_form.brand_name) LIKE '%'|| LOWER(#{conditionValue}) ||'%' LIMIT #{limit} OFFSET #{limit} * #{page}";
	String CountPage_F_AccessoryNewForm_Brand = "SELECT count(*) FROM view_accessory_new_form WHERE LOWER(view_accessory_new_form.brand_name) LIKE '%'|| LOWER(#{conditionValue}) ||'%'";
	
	String F_AccessoryNewForm_Model = "SELECT * FROM view_accessory_new_form WHERE LOWER(view_accessory_new_form.model_name) LIKE '%'|| LOWER(#{conditionValue}) ||'%' LIMIT #{limit} OFFSET #{limit} * #{page}";
	String CountPage_F_AccessoryNewForm_Model = "SELECT count(*) FROM view_accessory_new_form WHERE LOWER(view_accessory_new_form.model_name) LIKE '%'|| LOWER(#{conditionValue}) ||'%'";
	
	String F_AccessoryNewForm_Color = "SELECT * FROM view_accessory_new_form WHERE LOWER(view_accessory_new_form.color_code) LIKE '%'|| LOWER(#{conditionValue}) ||'%' LIMIT #{limit} OFFSET #{limit} * #{page}";
	String CountPage_F_AccessoryNewForm_Color = "SELECT count(*) FROM view_accessory_new_form WHERE LOWER(view_accessory_new_form.color_code) LIKE '%'|| LOWER(#{conditionValue}) ||'%'";
	
	String F_AccessoryOldForm_Name = "SELECT * FROM view_accessory_old_form WHERE LOWER(view_accessory_old_form.product_name) LIKE '%'|| LOWER(#{conditionValue}) ||'%' LIMIT #{limit} OFFSET #{limit} * #{page}";
	String CountPage_F_AccessoryOldForm_Name = "SELECT count(*) FROM view_accessory_old_form WHERE LOWER(view_accessory_old_form.product_name) LIKE '%'|| LOWER(#{conditionValue}) ||'%'";
	
	String F_AccessoryOldForm_Category = "SELECT * FROM view_accessory_old_form WHERE LOWER(view_accessory_old_form.category_name) LIKE '%'|| LOWER(#{conditionValue}) ||'%' LIMIT #{limit} OFFSET #{limit} * #{page}";
	String CountPage_F_AccessoryOldForm_Category = "SELECT count(*) FROM view_accessory_old_form WHERE LOWER(view_accessory_old_form.category_name) LIKE '%'|| LOWER(#{conditionValue}) ||'%'";
	
	String F_AccessoryOldForm_Brand = "SELECT * FROM view_accessory_old_form WHERE LOWER(view_accessory_old_form.brand_name) LIKE '%'|| LOWER(#{conditionValue}) ||'%' LIMIT #{limit} OFFSET #{limit} * #{page}";
	String CountPage_F_AccessoryOldForm_Brand = "SELECT count(*) FROM view_accessory_old_form WHERE LOWER(view_accessory_old_form.brand_name) LIKE '%'|| LOWER(#{conditionValue}) ||'%'";
	
	String F_AccessoryOldForm_Model = "SELECT * FROM view_accessory_old_form WHERE LOWER(view_accessory_old_form.model_name) LIKE '%'|| LOWER(#{conditionValue}) ||'%' LIMIT #{limit} OFFSET #{limit} * #{page}";
	String CountPage_F_AccessoryOldForm_Model = "SELECT count(*) FROM view_accessory_old_form WHERE LOWER(view_accessory_old_form.model_name) LIKE '%'|| LOWER(#{conditionValue}) ||'%'";
	
	String F_AccessoryOldForm_Color = "SELECT * FROM view_accessory_old_form WHERE LOWER(view_accessory_old_form.color_code) LIKE '%'|| LOWER(#{conditionValue}) ||'%' LIMIT #{limit} OFFSET #{limit} * #{page}";
	String CountPage_F_AccessoryOldForm_Color = "SELECT count(*) FROM view_accessory_old_form WHERE LOWER(view_accessory_old_form.color_code) LIKE '%'|| LOWER(#{conditionValue}) ||'%'";
	
	String F_ProductNewFormRelated = "SELECT * FROM view_products_form WHERE (category_id = #{category.category_id} AND brand_id = #{brand.brand_id}) AND NOT (product_id = #{product_id} AND coalesce(serial,'') = coalesce(#{serial},'')) LIMIT 10"; //AND NOT (product_id = #{product_id} AND coalesce(serial,'') = coalesce(#{serial},''))
	String F_ProductOldFormRelated = "SELECT * FROM view_products_form WHERE product_id = #{product_id} AND NOT coalesce(serial,'') = coalesce(#{serial},'')";
	String F_ProductNewForm = "SELECT * FROM view_products_form WHERE product_id = #{product_id}"; 
	String F_ProductOldForm = "SELECT * FROM view_products_form WHERE product_id = #{product_id} AND color_id = #{color.color_id} AND coalesce(serial,'') = coalesce(#{serial},'')";
	
	String F_A_Product_Image = "SELECT * FROM view_products_image_form WHERE product_id = #{ProID} AND color_id = #{ColorID} AND coalesce(serial,'') = coalesce(#{Serial},'') AND status = true";
	String F_A_CameraNew_Image = "SELECT * FROM view_camera_new_image_form WHERE product_id = #{ProID} AND color_id = #{ColorID} AND coalesce(serial,'') = coalesce(#{Serial},'') AND status = true";
	String F_A_CameraOld_Image = "SELECT * FROM view_camera_old_image_form WHERE product_id = #{ProID} AND color_id = #{ColorID} AND coalesce(serial,'') = coalesce(#{Serial},'') AND status = true";
	String F_A_AccessoryOld_Image = "SELECT * FROM view_accessory_old_image_form WHERE product_id = #{ProID} AND color_id = #{ColorID} AND coalesce(serial,'') = coalesce(#{Serial},'') AND status = true";
	String F_A_AccessoryNew_Image = "SELECT * FROM view_accessory_new_image_form WHERE product_id = #{ProID} AND color_id = #{ColorID} AND coalesce(serial,'') = coalesce(#{Serial},'') AND status = true";


	@Select(F_ProductForm)
	@Results({
		@Result(property = "product_id", column = "product_id"),
		@Result(property = "product_name", column = "product_name"),
		@Result(property = "color.color_id", column = "color_id"),
		@Result(property = "color.color_name", column = "color_name"),
		@Result(property = "color.color_code", column = "color_code"),
		@Result(property = "serial", column = "serial"),
		@Result(property = "qty", column = "qty"),
		@Result(property = "sell_price", column = "sell_price"),
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
		@Result(property = "detail", column = "detail"),
		@Result(property = "images", column = "{ProID = product_id, ColorID = color_id, Serial = serial}", many = @Many(select = "getAllProductImage")),
		@Result(property = "status", column = "status")
	})
	ArrayList<ProductForm> getAllProductForm(PageForm page);
	
	@Select(F_ProductNewForm)
	@Results({
		@Result(property = "product_id", column = "product_id"),
		@Result(property = "product_name", column = "product_name"),
		@Result(property = "color.color_id", column = "color_id"),
		@Result(property = "color.color_name", column = "color_name"),
		@Result(property = "color.color_code", column = "color_code"),
		@Result(property = "serial", column = "serial"),
		@Result(property = "qty", column = "qty"),
		@Result(property = "sell_price", column = "sell_price"),
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
		@Result(property = "detail", column = "detail"),
		@Result(property = "images", column = "{ProID = product_id, ColorID = color_id, Serial = serial}", many = @Many(select = "getAllProductImage")),
		@Result(property = "status", column = "status")
	})
	ArrayList<ProductForm> getAllProductNewForm(ProductForm product);
	
	@Select(F_ProductNewFormRelated)
	@Results({
		@Result(property = "product_id", column = "product_id"),
		@Result(property = "product_name", column = "product_name"),
		@Result(property = "color.color_id", column = "color_id"),
		@Result(property = "color.color_name", column = "color_name"),
		@Result(property = "color.color_code", column = "color_code"),
		@Result(property = "serial", column = "serial"),
		@Result(property = "qty", column = "qty"),
		@Result(property = "sell_price", column = "sell_price"),
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
		@Result(property = "detail", column = "detail"),
		@Result(property = "images", column = "{ProID = product_id, ColorID = color_id, Serial = serial}", many = @Many(select = "getAllProductImage")),
		@Result(property = "status", column = "status")
	})
	ArrayList<ProductForm> getAllProductNewFormRelated(ProductForm product);
	
	@Select(F_ProductOldFormRelated)
	@Results({
		@Result(property = "product_id", column = "product_id"),
		@Result(property = "product_name", column = "product_name"),
		@Result(property = "color.color_id", column = "color_id"),
		@Result(property = "color.color_name", column = "color_name"),
		@Result(property = "color.color_code", column = "color_code"),
		@Result(property = "serial", column = "serial"),
		@Result(property = "qty", column = "qty"),
		@Result(property = "sell_price", column = "sell_price"),
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
		@Result(property = "detail", column = "detail"),
		@Result(property = "images", column = "{ProID = product_id, ColorID = color_id, Serial = serial}", many = @Many(select = "getAllProductImage")),
		@Result(property = "status", column = "status")
	})
	ArrayList<ProductForm> getAllProductOldFormRelated(ProductForm product);
	
	@Select(F_ProductOldForm)
	@Results({
		@Result(property = "product_id", column = "product_id"),
		@Result(property = "product_name", column = "product_name"),
		@Result(property = "color.color_id", column = "color_id"),
		@Result(property = "color.color_name", column = "color_name"),
		@Result(property = "color.color_code", column = "color_code"),
		@Result(property = "serial", column = "serial"),
		@Result(property = "qty", column = "qty"),
		@Result(property = "sell_price", column = "sell_price"),
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
		@Result(property = "detail", column = "detail"),
		@Result(property = "images", column = "{ProID = product_id, ColorID = color_id, Serial = serial}", many = @Many(select = "getAllProductImage")),
		@Result(property = "status", column = "status")
	})
	ArrayList<ProductForm> getAllProductOldForm(ProductForm product);
	
	@Select(CountPage_F_ProductForm)
	int countAllProductForm(PageForm page);
	
	@Select(F_ProductForm_Name)
	@Results({
		@Result(property = "product_id", column = "product_id"),
		@Result(property = "product_name", column = "product_name"),
		@Result(property = "color.color_id", column = "color_id"),
		@Result(property = "color.color_name", column = "color_name"),
		@Result(property = "color.color_code", column = "color_code"),
		@Result(property = "serial", column = "serial"),
		@Result(property = "qty", column = "qty"),
		@Result(property = "sell_price", column = "sell_price"),
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
		@Result(property = "detail", column = "detail"),
		@Result(property = "images", column = "{ProID = product_id, ColorID = color_id, Serial = serial}", many = @Many(select = "getAllProductImage")),
		@Result(property = "status", column = "status")
	})
	ArrayList<ProductForm> getAllProductFormName(PageForm page);
	
	@Select(CountPage_F_ProductForm_Name)
	int countAllProductFormName(PageForm page);
	
	@Select(F_ProductForm_Category)
	@Results({
		@Result(property = "product_id", column = "product_id"),
		@Result(property = "product_name", column = "product_name"),
		@Result(property = "color.color_id", column = "color_id"),
		@Result(property = "color.color_name", column = "color_name"),
		@Result(property = "color.color_code", column = "color_code"),
		@Result(property = "serial", column = "serial"),
		@Result(property = "qty", column = "qty"),
		@Result(property = "sell_price", column = "sell_price"),
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
		@Result(property = "detail", column = "detail"),
		@Result(property = "images", column = "{ProID = product_id, ColorID = color_id, Serial = serial}", many = @Many(select = "getAllProductImage")),
		@Result(property = "status", column = "status")
	})
	ArrayList<ProductForm> getAllProductFormCategory(PageForm page);
	
	@Select(CountPage_F_ProductForm_Category)
	int countAllProductFormCategory(PageForm page);
	
	@Select(F_ProductForm_Brand)
	@Results({
		@Result(property = "product_id", column = "product_id"),
		@Result(property = "product_name", column = "product_name"),
		@Result(property = "color.color_id", column = "color_id"),
		@Result(property = "color.color_name", column = "color_name"),
		@Result(property = "color.color_code", column = "color_code"),
		@Result(property = "serial", column = "serial"),
		@Result(property = "qty", column = "qty"),
		@Result(property = "sell_price", column = "sell_price"),
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
		@Result(property = "detail", column = "detail"),
		@Result(property = "images", column = "{ProID = product_id, ColorID = color_id, Serial = serial}", many = @Many(select = "getAllProductImage")),
		@Result(property = "status", column = "status")
	})
	ArrayList<ProductForm> getAllProductFormBrand(PageForm page);
	
	@Select(CountPage_F_ProductForm_Brand)
	int countAllProductFormBrand(PageForm page);
	
	@Select(F_ProductForm_Model)
	@Results({
		@Result(property = "product_id", column = "product_id"),
		@Result(property = "product_name", column = "product_name"),
		@Result(property = "color.color_id", column = "color_id"),
		@Result(property = "color.color_name", column = "color_name"),
		@Result(property = "color.color_code", column = "color_code"),
		@Result(property = "serial", column = "serial"),
		@Result(property = "qty", column = "qty"),
		@Result(property = "sell_price", column = "sell_price"),
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
		@Result(property = "detail", column = "detail"),
		@Result(property = "images", column = "{ProID = product_id, ColorID = color_id, Serial = serial}", many = @Many(select = "getAllProductImage")),
		@Result(property = "status", column = "status")
	})
	ArrayList<ProductForm> getAllProductFormModel(PageForm page);
	
	@Select(CountPage_F_ProductForm_Model)
	int countAllProductFormModel(PageForm page);
	
	@Select(F_ProductForm_Color)
	@Results({
		@Result(property = "product_id", column = "product_id"),
		@Result(property = "product_name", column = "product_name"),
		@Result(property = "color.color_id", column = "color_id"),
		@Result(property = "color.color_name", column = "color_name"),
		@Result(property = "color.color_code", column = "color_code"),
		@Result(property = "serial", column = "serial"),
		@Result(property = "qty", column = "qty"),
		@Result(property = "sell_price", column = "sell_price"),
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
		@Result(property = "detail", column = "detail"),
		@Result(property = "images", column = "{ProID = product_id, ColorID = color_id, Serial = serial}", many = @Many(select = "getAllProductImage")),
		@Result(property = "status", column = "status")
	})
	ArrayList<ProductForm> getAllProductFormColor(PageForm page);
	
	@Select(CountPage_F_ProductForm_Color)
	int countAllProductFormColor(PageForm page);
	
	@Select(F_CameraNewForm)
	@Results({
		@Result(property = "product_id", column = "product_id"),
		@Result(property = "product_name", column = "product_name"),
		@Result(property = "color.color_id", column = "color_id"),
		@Result(property = "color.color_name", column = "color_name"),
		@Result(property = "color.color_code", column = "color_code"),
		@Result(property = "serial", column = "serial"),
		@Result(property = "qty", column = "qty"),
		@Result(property = "sell_price", column = "sell_price"),
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
		@Result(property = "detail", column = "detail"),
		@Result(property = "images", column = "{ProID = product_id, ColorID = color_id, Serial = serial}", many = @Many(select = "getAllCameraNewImage")),
		@Result(property = "status", column = "status")
	})
	ArrayList<ProductForm> getAllCameraNewForm(PageForm page);
	
	@Select(CountPage_F_CameraNewForm)
	int countAllCameraNewForm(PageForm page);
	
	@Select(F_CameraNewForm_Name)
	@Results({
		@Result(property = "product_id", column = "product_id"),
		@Result(property = "product_name", column = "product_name"),
		@Result(property = "color.color_id", column = "color_id"),
		@Result(property = "color.color_name", column = "color_name"),
		@Result(property = "color.color_code", column = "color_code"),
		@Result(property = "serial", column = "serial"),
		@Result(property = "qty", column = "qty"),
		@Result(property = "sell_price", column = "sell_price"),
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
		@Result(property = "detail", column = "detail"),
		@Result(property = "images", column = "{ProID = product_id, ColorID = color_id, Serial = serial}", many = @Many(select = "getAllCameraNewImage")),
		@Result(property = "status", column = "status")
	})
	ArrayList<ProductForm> getAllCameraNewFormName(PageForm page);
	
	@Select(CountPage_F_CameraNewForm_Name)
	int countAllCameraNewFormName(PageForm page);
	
	@Select(F_CameraNewForm_Category)
	@Results({
		@Result(property = "product_id", column = "product_id"),
		@Result(property = "product_name", column = "product_name"),
		@Result(property = "color.color_id", column = "color_id"),
		@Result(property = "color.color_name", column = "color_name"),
		@Result(property = "color.color_code", column = "color_code"),
		@Result(property = "serial", column = "serial"),
		@Result(property = "qty", column = "qty"),
		@Result(property = "sell_price", column = "sell_price"),
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
		@Result(property = "detail", column = "detail"),
		@Result(property = "images", column = "{ProID = product_id, ColorID = color_id, Serial = serial}", many = @Many(select = "getAllCameraNewImage")),
		@Result(property = "status", column = "status")
	})
	ArrayList<ProductForm> getAllCameraNewFormCategory(PageForm page);
	
	@Select(CountPage_F_CameraNewForm_Category)
	int countAllCameraNewFormCategory(PageForm page);
	
	@Select(F_CameraNewForm_Brand)
	@Results({
		@Result(property = "product_id", column = "product_id"),
		@Result(property = "product_name", column = "product_name"),
		@Result(property = "color.color_id", column = "color_id"),
		@Result(property = "color.color_name", column = "color_name"),
		@Result(property = "color.color_code", column = "color_code"),
		@Result(property = "serial", column = "serial"),
		@Result(property = "qty", column = "qty"),
		@Result(property = "sell_price", column = "sell_price"),
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
		@Result(property = "detail", column = "detail"),
		@Result(property = "images", column = "{ProID = product_id, ColorID = color_id, Serial = serial}", many = @Many(select = "getAllCameraNewImage")),
		@Result(property = "status", column = "status")
	})
	ArrayList<ProductForm> getAllCameraNewFormBrand(PageForm page);
	
	@Select(CountPage_F_CameraNewForm_Brand)
	int countAllCameraNewFormBrand(PageForm page);
	
	@Select(F_CameraNewForm_Model)
	@Results({
		@Result(property = "product_id", column = "product_id"),
		@Result(property = "product_name", column = "product_name"),
		@Result(property = "color.color_id", column = "color_id"),
		@Result(property = "color.color_name", column = "color_name"),
		@Result(property = "color.color_code", column = "color_code"),
		@Result(property = "serial", column = "serial"),
		@Result(property = "qty", column = "qty"),
		@Result(property = "sell_price", column = "sell_price"),
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
		@Result(property = "detail", column = "detail"),
		@Result(property = "images", column = "{ProID = product_id, ColorID = color_id, Serial = serial}", many = @Many(select = "getAllCameraNewImage")),
		@Result(property = "status", column = "status")
	})
	ArrayList<ProductForm> getAllCameraNewFormModel(PageForm page);
	
	@Select(CountPage_F_CameraNewForm_Model)
	int countAllCameraNewFormModel(PageForm page);
	
	@Select(F_CameraNewForm_Color)
	@Results({
		@Result(property = "product_id", column = "product_id"),
		@Result(property = "product_name", column = "product_name"),
		@Result(property = "color.color_id", column = "color_id"),
		@Result(property = "color.color_name", column = "color_name"),
		@Result(property = "color.color_code", column = "color_code"),
		@Result(property = "serial", column = "serial"),
		@Result(property = "qty", column = "qty"),
		@Result(property = "sell_price", column = "sell_price"),
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
		@Result(property = "detail", column = "detail"),
		@Result(property = "images", column = "{ProID = product_id, ColorID = color_id, Serial = serial}", many = @Many(select = "getAllCameraNewImage")),
		@Result(property = "status", column = "status")
	})
	ArrayList<ProductForm> getAllCameraNewFormColor(PageForm page);
	
	@Select(CountPage_F_CameraNewForm_Color)
	int countAllCameraNewFormColor(PageForm page);
	
	@Select(F_CameraOldForm)
	@Results({
		@Result(property = "product_id", column = "product_id"),
		@Result(property = "product_name", column = "product_name"),
		@Result(property = "color.color_id", column = "color_id"),
		@Result(property = "color.color_name", column = "color_name"),
		@Result(property = "color.color_code", column = "color_code"),
		@Result(property = "serial", column = "serial"),
		@Result(property = "qty", column = "qty"),
		@Result(property = "sell_price", column = "sell_price"),
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
		@Result(property = "detail", column = "detail"),
		@Result(property = "images", column = "{ProID = product_id, ColorID = color_id, Serial = serial}", many = @Many(select = "getAllCameraOldImage")),
		@Result(property = "status", column = "status")
	})
	ArrayList<ProductForm> getAllCameraOldForm(PageForm page);
	
	@Select(CountPage_F_CameraOldForm)
	int countAllCameraOldForm(PageForm page);
	
	@Select(F_CameraOldForm_Name)
	@Results({
		@Result(property = "product_id", column = "product_id"),
		@Result(property = "product_name", column = "product_name"),
		@Result(property = "color.color_id", column = "color_id"),
		@Result(property = "color.color_name", column = "color_name"),
		@Result(property = "color.color_code", column = "color_code"),
		@Result(property = "serial", column = "serial"),
		@Result(property = "qty", column = "qty"),
		@Result(property = "sell_price", column = "sell_price"),
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
		@Result(property = "detail", column = "detail"),
		@Result(property = "images", column = "{ProID = product_id, ColorID = color_id, Serial = serial}", many = @Many(select = "getAllCameraOldImage")),
		@Result(property = "status", column = "status")
	})
	ArrayList<ProductForm> getAllCameraOldFormName(PageForm page);
	
	@Select(CountPage_F_CameraOldForm_Name)
	int countAllCameraOldFormName(PageForm page);
	
	@Select(F_CameraOldForm_Category)
	@Results({
		@Result(property = "product_id", column = "product_id"),
		@Result(property = "product_name", column = "product_name"),
		@Result(property = "color.color_id", column = "color_id"),
		@Result(property = "color.color_name", column = "color_name"),
		@Result(property = "color.color_code", column = "color_code"),
		@Result(property = "serial", column = "serial"),
		@Result(property = "qty", column = "qty"),
		@Result(property = "sell_price", column = "sell_price"),
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
		@Result(property = "detail", column = "detail"),
		@Result(property = "images", column = "{ProID = product_id, ColorID = color_id, Serial = serial}", many = @Many(select = "getAllCameraOldImage")),
		@Result(property = "status", column = "status")
	})
	ArrayList<ProductForm> getAllCameraOldFormCategory(PageForm page);
	
	@Select(CountPage_F_CameraOldForm_Category)
	int countAllCameraOldFormCategory(PageForm page);
	
	@Select(F_CameraOldForm_Brand)
	@Results({
		@Result(property = "product_id", column = "product_id"),
		@Result(property = "product_name", column = "product_name"),
		@Result(property = "color.color_id", column = "color_id"),
		@Result(property = "color.color_name", column = "color_name"),
		@Result(property = "color.color_code", column = "color_code"),
		@Result(property = "serial", column = "serial"),
		@Result(property = "qty", column = "qty"),
		@Result(property = "sell_price", column = "sell_price"),
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
		@Result(property = "detail", column = "detail"),
		@Result(property = "images", column = "{ProID = product_id, ColorID = color_id, Serial = serial}", many = @Many(select = "getAllCameraOldImage")),
		@Result(property = "status", column = "status")
	})
	ArrayList<ProductForm> getAllCameraOldFormBrand(PageForm page);
	
	@Select(CountPage_F_CameraOldForm_Brand)
	int countAllCameraOldFormBrand(PageForm page);
	
	@Select(F_CameraOldForm_Model)
	@Results({
		@Result(property = "product_id", column = "product_id"),
		@Result(property = "product_name", column = "product_name"),
		@Result(property = "color.color_id", column = "color_id"),
		@Result(property = "color.color_name", column = "color_name"),
		@Result(property = "color.color_code", column = "color_code"),
		@Result(property = "serial", column = "serial"),
		@Result(property = "qty", column = "qty"),
		@Result(property = "sell_price", column = "sell_price"),
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
		@Result(property = "detail", column = "detail"),
		@Result(property = "images", column = "{ProID = product_id, ColorID = color_id, Serial = serial}", many = @Many(select = "getAllCameraOldImage")),
		@Result(property = "status", column = "status")
	})
	ArrayList<ProductForm> getAllCameraOldFormModel(PageForm page);
	
	@Select(CountPage_F_CameraOldForm_Model)
	int countAllCameraOldFormModel(PageForm page);
	
	@Select(F_CameraOldForm_Color)
	@Results({
		@Result(property = "product_id", column = "product_id"),
		@Result(property = "product_name", column = "product_name"),
		@Result(property = "color.color_id", column = "color_id"),
		@Result(property = "color.color_name", column = "color_name"),
		@Result(property = "color.color_code", column = "color_code"),
		@Result(property = "serial", column = "serial"),
		@Result(property = "qty", column = "qty"),
		@Result(property = "sell_price", column = "sell_price"),
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
		@Result(property = "detail", column = "detail"),
		@Result(property = "images", column = "{ProID = product_id, ColorID = color_id, Serial = serial}", many = @Many(select = "getAllCameraOldImage")),
		@Result(property = "status", column = "status")
	})
	ArrayList<ProductForm> getAllCameraOldFormColor(PageForm page);
	
	@Select(CountPage_F_CameraOldForm_Color)
	int countAllCameraOldFormColor(PageForm page);
	
	@Select(F_AccessoryOldForm)
	@Results({
		@Result(property = "product_id", column = "product_id"),
		@Result(property = "product_name", column = "product_name"),
		@Result(property = "color.color_id", column = "color_id"),
		@Result(property = "color.color_name", column = "color_name"),
		@Result(property = "color.color_code", column = "color_code"),
		@Result(property = "serial", column = "serial"),
		@Result(property = "qty", column = "qty"),
		@Result(property = "sell_price", column = "sell_price"),
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
		@Result(property = "detail", column = "detail"),
		@Result(property = "images", column = "{ProID = product_id, ColorID = color_id, Serial = serial}", many = @Many(select = "getAllAccessoryOldImage")),
		@Result(property = "status", column = "status")
	})
	ArrayList<ProductForm> getAllAccessoryOldForm(PageForm page);
	
	@Select(CountPage_F_AccessoryOldForm)
	int countAllAccessoryOldForm(PageForm page);
	
	
	@Select(F_AccessoryOldForm_Name)
	@Results({
		@Result(property = "product_id", column = "product_id"),
		@Result(property = "product_name", column = "product_name"),
		@Result(property = "color.color_id", column = "color_id"),
		@Result(property = "color.color_name", column = "color_name"),
		@Result(property = "color.color_code", column = "color_code"),
		@Result(property = "serial", column = "serial"),
		@Result(property = "qty", column = "qty"),
		@Result(property = "sell_price", column = "sell_price"),
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
		@Result(property = "detail", column = "detail"),
		@Result(property = "images", column = "{ProID = product_id, ColorID = color_id, Serial = serial}", many = @Many(select = "getAllAccessoryOldImage")),
		@Result(property = "status", column = "status")
	})
	ArrayList<ProductForm> getAllAccessoryOldFormName(PageForm page);
	
	@Select(CountPage_F_AccessoryOldForm_Name)
	int countAllAccessoryOldFormName(PageForm page);
	
	@Select(F_AccessoryOldForm_Category)
	@Results({
		@Result(property = "product_id", column = "product_id"),
		@Result(property = "product_name", column = "product_name"),
		@Result(property = "color.color_id", column = "color_id"),
		@Result(property = "color.color_name", column = "color_name"),
		@Result(property = "color.color_code", column = "color_code"),
		@Result(property = "serial", column = "serial"),
		@Result(property = "qty", column = "qty"),
		@Result(property = "sell_price", column = "sell_price"),
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
		@Result(property = "detail", column = "detail"),
		@Result(property = "images", column = "{ProID = product_id, ColorID = color_id, Serial = serial}", many = @Many(select = "getAllAccessoryOldImage")),
		@Result(property = "status", column = "status")
	})
	ArrayList<ProductForm> getAllAccessoryOldFormCategory(PageForm page);
	
	@Select(CountPage_F_AccessoryOldForm_Category)
	int countAllAccessoryOldFormCategory(PageForm page);
	
	@Select(F_AccessoryOldForm_Brand)
	@Results({
		@Result(property = "product_id", column = "product_id"),
		@Result(property = "product_name", column = "product_name"),
		@Result(property = "color.color_id", column = "color_id"),
		@Result(property = "color.color_name", column = "color_name"),
		@Result(property = "color.color_code", column = "color_code"),
		@Result(property = "serial", column = "serial"),
		@Result(property = "qty", column = "qty"),
		@Result(property = "sell_price", column = "sell_price"),
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
		@Result(property = "detail", column = "detail"),
		@Result(property = "images", column = "{ProID = product_id, ColorID = color_id, Serial = serial}", many = @Many(select = "getAllAccessoryOldImage")),
		@Result(property = "status", column = "status")
	})
	ArrayList<ProductForm> getAllAccessoryOldFormBrand(PageForm page);
	
	@Select(CountPage_F_AccessoryOldForm_Brand)
	int countAllAccessoryOldFormBrand(PageForm page);
	
	@Select(F_AccessoryOldForm_Model)
	@Results({
		@Result(property = "product_id", column = "product_id"),
		@Result(property = "product_name", column = "product_name"),
		@Result(property = "color.color_id", column = "color_id"),
		@Result(property = "color.color_name", column = "color_name"),
		@Result(property = "color.color_code", column = "color_code"),
		@Result(property = "serial", column = "serial"),
		@Result(property = "qty", column = "qty"),
		@Result(property = "sell_price", column = "sell_price"),
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
		@Result(property = "detail", column = "detail"),
		@Result(property = "images", column = "{ProID = product_id, ColorID = color_id, Serial = serial}", many = @Many(select = "getAllAccessoryOldImage")),
		@Result(property = "status", column = "status")
	})
	ArrayList<ProductForm> getAllAccessoryOldFormModel(PageForm page);
	
	@Select(CountPage_F_AccessoryOldForm_Model)
	int countAllAccessoryOldFormModel(PageForm page);
	
	@Select(F_AccessoryOldForm_Color)
	@Results({
		@Result(property = "product_id", column = "product_id"),
		@Result(property = "product_name", column = "product_name"),
		@Result(property = "color.color_id", column = "color_id"),
		@Result(property = "color.color_name", column = "color_name"),
		@Result(property = "color.color_code", column = "color_code"),
		@Result(property = "serial", column = "serial"),
		@Result(property = "qty", column = "qty"),
		@Result(property = "sell_price", column = "sell_price"),
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
		@Result(property = "detail", column = "detail"),
		@Result(property = "images", column = "{ProID = product_id, ColorID = color_id, Serial = serial}", many = @Many(select = "getAllAccessoryOldImage")),
		@Result(property = "status", column = "status")
	})
	ArrayList<ProductForm> getAllAccessoryOldFormColor(PageForm page);
	
	@Select(CountPage_F_AccessoryOldForm_Color)
	int countAllAccessoryOldFormColor(PageForm page);
	
	@Select(F_AccessoryNewForm)
	@Results({
		@Result(property = "product_id", column = "product_id"),
		@Result(property = "product_name", column = "product_name"),
		@Result(property = "color.color_id", column = "color_id"),
		@Result(property = "color.color_name", column = "color_name"),
		@Result(property = "color.color_code", column = "color_code"),
		@Result(property = "serial", column = "serial"),
		@Result(property = "qty", column = "qty"),
		@Result(property = "sell_price", column = "sell_price"),
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
		@Result(property = "detail", column = "detail"),
		@Result(property = "images", column = "{ProID = product_id, ColorID = color_id, Serial = serial}", many = @Many(select = "getAllAccessoryNewImage")),
		@Result(property = "status", column = "status")
	})
	ArrayList<ProductForm> getAllAccessoryNewForm(PageForm page);
	
	@Select(CountPage_F_AccessoryNewForm)
	int countAllAccessoryNewForm(PageForm page);
	
	@Select(F_AccessoryNewForm_Name)
	@Results({
		@Result(property = "product_id", column = "product_id"),
		@Result(property = "product_name", column = "product_name"),
		@Result(property = "color.color_id", column = "color_id"),
		@Result(property = "color.color_name", column = "color_name"),
		@Result(property = "color.color_code", column = "color_code"),
		@Result(property = "serial", column = "serial"),
		@Result(property = "qty", column = "qty"),
		@Result(property = "sell_price", column = "sell_price"),
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
		@Result(property = "detail", column = "detail"),
		@Result(property = "images", column = "{ProID = product_id, ColorID = color_id, Serial = serial}", many = @Many(select = "getAllAccessoryNewImage")),
		@Result(property = "status", column = "status")
	})
	ArrayList<ProductForm> getAllAccessoryNewFormName(PageForm page);
	
	@Select(CountPage_F_AccessoryNewForm_Name)
	int countAllAccessoryNewFormName(PageForm page);
	
	@Select(F_AccessoryNewForm_Category)
	@Results({
		@Result(property = "product_id", column = "product_id"),
		@Result(property = "product_name", column = "product_name"),
		@Result(property = "color.color_id", column = "color_id"),
		@Result(property = "color.color_name", column = "color_name"),
		@Result(property = "color.color_code", column = "color_code"),
		@Result(property = "serial", column = "serial"),
		@Result(property = "qty", column = "qty"),
		@Result(property = "sell_price", column = "sell_price"),
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
		@Result(property = "detail", column = "detail"),
		@Result(property = "images", column = "{ProID = product_id, ColorID = color_id, Serial = serial}", many = @Many(select = "getAllAccessoryNewImage")),
		@Result(property = "status", column = "status")
	})
	ArrayList<ProductForm> getAllAccessoryNewFormCategory(PageForm page);
	
	@Select(CountPage_F_AccessoryNewForm_Category)
	int countAllAccessoryNewFormCategory(PageForm page);
	
	@Select(F_AccessoryNewForm_Brand)
	@Results({
		@Result(property = "product_id", column = "product_id"),
		@Result(property = "product_name", column = "product_name"),
		@Result(property = "color.color_id", column = "color_id"),
		@Result(property = "color.color_name", column = "color_name"),
		@Result(property = "color.color_code", column = "color_code"),
		@Result(property = "serial", column = "serial"),
		@Result(property = "qty", column = "qty"),
		@Result(property = "sell_price", column = "sell_price"),
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
		@Result(property = "detail", column = "detail"),
		@Result(property = "images", column = "{ProID = product_id, ColorID = color_id, Serial = serial}", many = @Many(select = "getAllAccessoryNewImage")),
		@Result(property = "status", column = "status")
	})
	ArrayList<ProductForm> getAllAccessoryNewFormBrand(PageForm page);
	
	@Select(CountPage_F_AccessoryNewForm_Brand)
	int countAllAccessoryNewFormBrand(PageForm page);
	
	@Select(F_AccessoryNewForm_Model)
	@Results({
		@Result(property = "product_id", column = "product_id"),
		@Result(property = "product_name", column = "product_name"),
		@Result(property = "color.color_id", column = "color_id"),
		@Result(property = "color.color_name", column = "color_name"),
		@Result(property = "color.color_code", column = "color_code"),
		@Result(property = "serial", column = "serial"),
		@Result(property = "qty", column = "qty"),
		@Result(property = "sell_price", column = "sell_price"),
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
		@Result(property = "detail", column = "detail"),
		@Result(property = "images", column = "{ProID = product_id, ColorID = color_id, Serial = serial}", many = @Many(select = "getAllAccessoryNewImage")),
		@Result(property = "status", column = "status")
	})
	ArrayList<ProductForm> getAllAccessoryNewFormModel(PageForm page);
	
	@Select(CountPage_F_AccessoryNewForm_Model)
	int countAllAccessoryNewFormModel(PageForm page);
	
	@Select(F_AccessoryNewForm_Color)
	@Results({
		@Result(property = "product_id", column = "product_id"),
		@Result(property = "product_name", column = "product_name"),
		@Result(property = "color.color_id", column = "color_id"),
		@Result(property = "color.color_name", column = "color_name"),
		@Result(property = "color.color_code", column = "color_code"),
		@Result(property = "serial", column = "serial"),
		@Result(property = "qty", column = "qty"),
		@Result(property = "sell_price", column = "sell_price"),
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
		@Result(property = "detail", column = "detail"),
		@Result(property = "images", column = "{ProID = product_id, ColorID = color_id, Serial = serial}", many = @Many(select = "getAllAccessoryNewImage")),
		@Result(property = "status", column = "status")
	})
	ArrayList<ProductForm> getAllAccessoryNewFormColor(PageForm page);
	
	@Select(CountPage_F_AccessoryNewForm_Color)
	int countAllAccessoryNewFormColor(PageForm page);
	
	@Select(F_A_Product_Image)
	@Results({
		@Result(property = "image_id", column = "image_id"),
		@Result(property = "product_id", column = "product_id"),
		@Result(property = "color_id", column = "color_id"),
		@Result(property = "serial", column = "serial"),
		@Result(property = "image_url", column = "image_url"),
		@Result(property = "status", column = "status")
	})
	ArrayList<ProductImageForm> getAllProductImage(@Param("ProID") String pro_id, @Param("ColorID") int color_id, @Param("Serial") int serial);
	
	@Select(F_A_CameraNew_Image)
	@Results({
		@Result(property = "image_id", column = "image_id"),
		@Result(property = "product_id", column = "product_id"),
		@Result(property = "color_id", column = "color_id"),
		@Result(property = "serial", column = "serial"),
		@Result(property = "image_url", column = "image_url"),
		@Result(property = "status", column = "status")
	})
	ArrayList<ProductImageForm> getAllCameraNewImage(@Param("ProID") String pro_id, @Param("ColorID") int color_id, @Param("Serial") int serial);
	
	@Select(F_A_CameraOld_Image)
	@Results({
		@Result(property = "image_id", column = "image_id"),
		@Result(property = "product_id", column = "product_id"),
		@Result(property = "color_id", column = "color_id"),
		@Result(property = "serial", column = "serial"),
		@Result(property = "image_url", column = "image_url"),
		@Result(property = "status", column = "status")
	})
	ArrayList<ProductImageForm> getAllCameraOldImage(@Param("ProID") String pro_id, @Param("ColorID") int color_id, @Param("Serial") int serial);
	
	@Select(F_A_AccessoryOld_Image)
	@Results({
		@Result(property = "image_id", column = "image_id"),
		@Result(property = "product_id", column = "product_id"),
		@Result(property = "color_id", column = "color_id"),
		@Result(property = "serial", column = "serial"),
		@Result(property = "image_url", column = "image_url"),
		@Result(property = "status", column = "status")
	})
	ArrayList<ProductImageForm> getAllAccessoryOldImage(@Param("ProID") String pro_id, @Param("ColorID") int color_id, @Param("Serial") int serial);
	
	@Select(F_A_AccessoryNew_Image)
	@Results({
		@Result(property = "image_id", column = "image_id"),
		@Result(property = "product_id", column = "product_id"),
		@Result(property = "color_id", column = "color_id"),
		@Result(property = "serial", column = "serial"),
		@Result(property = "image_url", column = "image_url"),
		@Result(property = "status", column = "status")
	})
	ArrayList<ProductImageForm> getAllAccessoryNewImage(@Param("ProID") String pro_id, @Param("ColorID") int color_id, @Param("Serial") int serial);
	
}
