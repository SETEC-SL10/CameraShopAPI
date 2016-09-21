package com.setec_ecomerce.repository.front_end_transaction.dao.cart;

import java.util.ArrayList;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.mapping.StatementType;
import org.springframework.stereotype.Repository;
import com.setec_ecomerce.repository.front_end_transaction.dto.cart.Cart;
import com.setec_ecomerce.repository.products.dto.products_form.ProductImageForm;

@Repository
public interface CartDAO {

	String C_Cart = "INSERT INTO table_cart(customer_id, product_id, color_id, serial, product_qty) VALUES (#{customer_id}, #{product.product_id}, #{product.color.color_id}, #{product.serial}, #{product_qty})";
	
	String D_Cart = "DELETE FROM table_cart WHERE cart_id = #{cart_id}";
	
	String U_Cart = "UPDATE table_cart SET product_qty = #{product_qty} WHERE cart_id = #{cart_id}";
	
	String U_Cart_Increase = "{call \"updateToCart\"(#{cart_id}, #{product_qty})}";
	
	String F_Cart = "SELECT * FROM view_cart_products_form WHERE customer_id = #{customer_id}";
	
	String F_A_Image = "SELECT image_id, product_id, color_id, serial, image_url, status FROM view_products_image_form WHERE product_id = #{ProID} AND color_id = #{ColorID} AND COALESCE(serial, ''::character varying)::text = COALESCE(#{Serial}, ''::character varying)::text";
	
	String Check_Cart = "select exists(select cart_id from table_cart where table_cart.customer_id = #{customer_id} AND table_cart.product_id = #{product.product_id} AND table_cart.color_id = #{product.color.color_id} AND COALESCE(table_cart.serial, ''::character varying)::text = COALESCE(#{product.serial}, ''::character varying)::text)";

	String F_Cart_ID = "select cart_id from table_cart where table_cart.customer_id = #{customer_id} AND table_cart.product_id = #{product.product_id} AND table_cart.color_id = #{product.color.color_id} AND COALESCE(table_cart.serial, ''::character varying)::text = COALESCE(#{product.serial}, ''::character varying)::text";
	
	String F_Product_Qty = "SELECT qty FROM view_cart_products_form WHERE cart_id = #{cart_id}";

	@Insert(C_Cart)
	boolean insertCart(Cart cart);
	
	@Delete(D_Cart)
	boolean deletetCart(int cart_id);
	
	@Update(U_Cart)
	boolean updateCart(@Param("cart_id") int cart_id, @Param("product_qty") int product_qty);
	
	@Select(U_Cart_Increase)
	@Options(statementType = StatementType.CALLABLE)
	boolean updateCartIncrease(@Param("cart_id") int cart_id, @Param("product_qty") int product_qty);
	
	@Select(F_Product_Qty)
	int checkProductQty(int cart_id);
	
	@Select(Check_Cart)
	boolean checkCart(Cart cart);
	
	@Select(F_Cart_ID)
	int getCartID(Cart cart);
	
	@Select(F_Cart)
	@Results({
		@Result(property = "cart_id", column = "cart_id"),
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
		@Result(property = "product.status", column = "status"),
		@Result(property = "product_qty", column = "product_qty")
	})
	ArrayList<Cart> getCart(int customer_id);
	
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
}
