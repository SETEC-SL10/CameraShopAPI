package com.setec_ecomerce.repository.front_end_transaction.dao.wishlist;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import com.setec_ecomerce.repository.front_end_transaction.dto.wishlist.Wishlist;
import com.setec_ecomerce.repository.products.dto.PageForm;
import com.setec_ecomerce.repository.products.dto.products_form.ProductImageForm;
@Repository
public interface WishlistDAO {
	
	String C_Wishlist = "INSERT INTO table_wishlist(customer_id, product_id, color_id, serial) VALUES (#{customer_id}, #{product.product_id}, #{product.color.color_id}, #{product.serial})";
	
	//String F_Wishlist = "SELECT wishlist_id, customer_id FROM table_wishlist WHERE customer_id = #{customer_id}";
	
	String D_Wishlist = "DELETE FROM table_wishlist WHERE wishlist_id = #{wishlist_id}";
	
	String F_Product = "SELECT * FROM view_wishlist_products_form  WHERE customer_id =  #{conditionValue}:: Integer LIMIT #{limit} OFFSET #{limit} * #{page}";
	String F_Product_Page = "SELECT count(*) FROM view_wishlist_products_form  WHERE customer_id =  #{conditionValue}:: Integer";
	
	String F_A_Image = "SELECT image_id, product_id, color_id, serial, image_url, status FROM view_products_image_form WHERE product_id = #{ProID} AND color_id = #{ColorID} AND COALESCE(serial, ''::character varying)::text = COALESCE(#{Serial}, ''::character varying)::text";
	
	String Check_Wishlist = "select exists(select wishlist_id from table_wishlist where table_wishlist.customer_id = #{customer_id} AND table_wishlist.product_id = #{product.product_id} AND table_wishlist.color_id = #{product.color.color_id} AND COALESCE(table_wishlist.serial, ''::character varying)::text = COALESCE(#{product.serial}, ''::character varying)::text)";
	
	@Select(F_Product)
	@Results({
		@Result(property = "wishlist_id", column = "wishlist_id"),
		@Result(property = "customer_id", column = "customer_id"),
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
		@Result(property = "product.status", column = "status")
	})
	ArrayList<Wishlist> getWishlists(PageForm page);
	
	@Select(F_A_Image)
	@Results({
		@Result(property = "image_id", column = "image_id"),
		@Result(property = "product_id", column = "product_id"),
		@Result(property = "color_id", column = "color_id"),
		@Result(property = "serial", column = "serial"),
		@Result(property = "image_url", column = "image_url"),
		@Result(property = "status", column = "status")
	})
	ArrayList<ProductImageForm> getAllProductImage(@Param("ProID") String pro_id, @Param("ColorID") int color_id, @Param("Serial") String serial);
	
	@Select(F_Product_Page)
	int countAllWishlists(PageForm page);
	
	@Insert(C_Wishlist)
	boolean insertWishlist(Wishlist wishlist);
	
	@Delete(D_Wishlist)
	boolean deleteWishlist(int wishlist_id);
	
	@Select(Check_Wishlist)
	boolean checkWishlist(Wishlist wishlist);
//	String C_Wishlist = "INSERT INTO table_wishlist(customer_id, product_id, color_id, serial) VALUES (#{customer_id}, #{product.product_id}, #{product.color_id}, #{product.serial})";
//	
//	String F_Wishlist = "SELECT wishlist_id, customer_id FROM table_wishlist WHERE customer_id = #{customer_id}";
//	
//	String F_Product = "SELECT product_id, product_name, color_id, color_name, color_code, serial, qty, sell_price, category_id, brand_id, model_id, description, detail, status FROM view_wishlist_products_form WHERE wishlist_id = #{wishlist_id}";
//	
//	String F_A_Image = "SELECT image_id, product_id, color_id, serial, image_url, status FROM view_products_image_form WHERE product_id = #{ProID} AND color_id = #{ColorID} AND COALESCE(serial, ''::character varying)::text = COALESCE(#{Serial}, ''::character varying)::text";
//	
//	@Select(F_Wishlist)
//	@Results({
//		@Result(property = "wishlist_id", column = "wishlist_id"),
//		@Result(property = "customer_id", column = "customer_id"),
//		@Result(property = "product", column = "wishlist_id", one = @One(select = "getAllProductForm"))
//	})
//	ArrayList<Wishlist> getWishlists(int customer_id);
//	
//	@Select(F_Product)
//	@Results({
//		@Result(property = "product_id", column = "product_id"),
//		@Result(property = "product_name", column = "product_name"),
//		@Result(property = "color_id", column = "color_id"),
//		@Result(property = "color_name", column = "color_name"),
//		@Result(property = "color_code", column = "color_code"),
//		@Result(property = "serial", column = "serial"),
//		@Result(property = "qty", column = "qty"),
//		@Result(property = "sell_price", column = "sell_price"),
//		@Result(property = "category_id", column = "category_id"),
//		@Result(property = "brand_id", column = "brand_id"),
//		@Result(property = "model_id", column = "model_id"),
//		@Result(property = "description", column = "description"),
//		@Result(property = "detail", column = "detail"),
//		@Result(property = "images", column = "{ProID = product_id, ColorID = color_id, Serial = serial}", many = @Many(select = "getAllProductImage")),
//		@Result(property = "status", column = "status")
//	})
//	ArrayList<ProductForm> getAllProductForm(int wishlist_id);
//	
//	@Select(F_A_Image)
//	@Results({
//		@Result(property = "image_id", column = "image_id"),
//		@Result(property = "product_id", column = "product_id"),
//		@Result(property = "color_id", column = "color_id"),
//		@Result(property = "serial", column = "serial"),
//		@Result(property = "image_url", column = "image_url"),
//		@Result(property = "status", column = "status")
//	})
//	ArrayList<ProductImageForm> getAllProductImage(@Param("ProID") String pro_id, @Param("ColorID") int color_id, @Param("Serial") String serial);
//	
//	@Insert(C_Wishlist)
//	boolean insertWishlist(Wishlist wishlist);
}
