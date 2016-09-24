package com.setec_ecomerce.repository.products.dao;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.setec_ecomerce.repository.products.dao.specification.SpecificationDAO;
import com.setec_ecomerce.repository.products.dto.ProductFormDetail;
import com.setec_ecomerce.repository.products.dto.products_form.ProductForm;
import com.setec_ecomerce.repository.products.dto.products_form.ProductImageForm;
import com.setec_ecomerce.repository.products.dto.specification.Specification;

@Repository
public interface ProductFormDetailDAO {
	String F_ProductForm = "SELECT * FROM view_products_form WHERE product_id = #{product_id} AND coalesce(serial,'') = coalesce(#{serial},'')";
	
	@Select(F_ProductForm)
	@Results({
		@Result(property = "product.product_id", column = "product_id"),
		@Result(property = "product.product_name", column = "product_name"),
		@Result(property = "product.color.color_id", column = "color_id"),
		@Result(property = "product.color.color_name", column = "color_name"),
		@Result(property = "product.color.color_code", column = "color_code"),
		@Result(property = "product.serial", column = "serial"),
		@Result(property = "product.qty", column = "qty"),
		@Result(property = "product.sell_price", column = "sell_price"),
		@Result(property = "product.category.category_id", column = "category_id"),
		@Result(property = "product.category.category_name", column = "category_name"),
		@Result(property = "product.category.description", column = "category_description"),
		@Result(property = "product.category.category_camera", column = "category_camera"),
		@Result(property = "product.category.category_accessory", column = "category_accessory"),
		@Result(property = "product.category.status", column = "category_status"),
		@Result(property = "product.brand.brand_id", column = "brand_id"),
		@Result(property = "product.brand.brand_name", column = "brand_name"),
		@Result(property = "product.brand.description", column = "brand_description"),
		@Result(property = "product.brand.brand_camera", column = "brand_camera"),
		@Result(property = "product.brand.brand_accessory", column = "brand_accessory"),
		@Result(property = "product.brand.brand_status", column = "brand_status"),
		@Result(property = "product.model.model_id", column = "model_id"),
		@Result(property = "product.model.model_name", column = "model_name"),
		@Result(property = "product.model.description", column = "model_description"),
		@Result(property = "product.model.model_camera", column = "model_camera"),
		@Result(property = "product.model.model_accessory", column = "model_accessory"),
		@Result(property = "product.model.model_status", column = "model_status"),
		@Result(property = "product.model.brand_id", column = "brand_id"),
		@Result(property = "product.description", column = "description"),
		@Result(property = "product.detail", column = "detail"),
		@Result(property = "product.images", column = "{ProID = product_id, ColorID = color_id, Serial = serial}", many = @Many(select = "getAllProductImage")),
		@Result(property = "product.status", column = "status"),
		@Result(property = "specifications", column = "product_id", many = @Many(select = "getSpecificationByProduct"))
	})
	ArrayList<ProductFormDetail> getAllProductFormDetail(ProductForm product);
	
	@Select(SpecificationDAO.F_A_Spec)
	@Results({
		@Result(property = "specification_id", column = "specification_id"),
		@Result(property = "product_id", column = "product_id"),
		@Result(property = "specification_name", column = "specification_name"),
		@Result(property = "description", column = "description"),
		@Result(property = "status", column = "status")
	})
	ArrayList<Specification> getSpecificationByProduct( String pro_id);
	
	@Select(ProductFormDAO.F_A_Product_Image)
	@Results({
		@Result(property = "image_id", column = "image_id"),
		@Result(property = "product_id", column = "product_id"),
		@Result(property = "color_id", column = "color_id"),
		@Result(property = "serial", column = "serial"),
		@Result(property = "image_url", column = "image_url"),
		@Result(property = "status", column = "status")
	})
	ArrayList<ProductImageForm> getAllProductImage(@Param("ProID") String pro_id, @Param("ColorID") int color_id, @Param("Serial") int serial);

}
