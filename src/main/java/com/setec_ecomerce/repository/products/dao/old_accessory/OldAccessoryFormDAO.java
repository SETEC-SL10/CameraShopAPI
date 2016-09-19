package com.setec_ecomerce.repository.products.dao.old_accessory;
import java.util.ArrayList;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import com.setec_ecomerce.repository.products.dto.PageForm;
import com.setec_ecomerce.repository.products.dto.products_form.ProductForm;
import com.setec_ecomerce.repository.products.dto.products_form.ProductImageForm;

@Repository
public interface OldAccessoryFormDAO {
	
	String F_ProductForm = "SELECT * FROM view_accessory_old_form LIMIT #{limit} OFFSET #{page} * #{limit}";
	
	String F_A_Image = "SELECT * FROM view_accessory_old_image_form WHERE serial = #{serial} AND status = true";


	@Select(F_ProductForm)
	@Results({
		@Result(property = "product_id", column = "product_id"),
		@Result(property = "product_name", column = "product_name"),
		@Result(property = "color_id", column = "color_id"),
		@Result(property = "color_name", column = "color_name"),
		@Result(property = "color_code", column = "color_code"),
		@Result(property = "serial", column = "serial"),
		@Result(property = "qty", column = "qty"),
		@Result(property = "sell_price", column = "sell_price"),
		@Result(property = "category_id", column = "category_id"),
		@Result(property = "brand_id", column = "brand_id"),
		@Result(property = "model_id", column = "model_id"),
		@Result(property = "description", column = "description"),
		@Result(property = "detail", column = "detail"),
		@Result(property = "images", column = "serial", many = @Many(select = "getAllProductImage")),
		@Result(property = "status", column = "status")
	})
	ArrayList<ProductForm> getAllProductForm(PageForm page);
	
	@Select(F_A_Image)
	@Results({
		@Result(property = "image_id", column = "image_id"),
		@Result(property = "product_id", column = "product_id"),
		@Result(property = "color_id", column = "color_id"),
		@Result(property = "serial", column = "serial"),
		@Result(property = "image_url", column = "image_url"),
		@Result(property = "status", column = "status")
	})
	ArrayList<ProductImageForm> getAllProductImage(String serial);
}
