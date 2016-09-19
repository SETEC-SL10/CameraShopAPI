package com.setec_ecomerce.restcontroller.front_end_transaction;

import java.util.ArrayList;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.setec_ecomerce.repository.front_end_transaction.dto.cart.Cart;
import com.setec_ecomerce.repository.utils.Utils;
import com.setec_ecomerce.service.front_end_transaction.CartService;

@RestController
@RequestMapping("api/front_end/cart")
public class CartController {

	@Autowired
	private CartService cartService;
	
	@RequestMapping(value="/{customer_id}",method=RequestMethod.GET)
	public ResponseEntity<Map<String, Object>> getCartByCustomer(@PathVariable int customer_id){
		ArrayList<Cart> carts = cartService.getCart(customer_id);
		if( carts == null ){
			return Utils.respondJson("Record not found", null, HttpStatus.OK);
		}else{
			if(carts.size() > 0){
				return Utils.respondJson("Record found", carts, HttpStatus.OK);
			}else{
				return Utils.respondJson("Record not found", null, HttpStatus.OK);
			}
		}
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public ResponseEntity<Map<String, Object>> insertCart(@RequestBody Cart cart){
		boolean result = cartService.insertCart(cart);
		if( result ){
			return Utils.respondJson("Success Insert Cart", result, HttpStatus.OK);
		}else{
			return Utils.respondJson("Unsuccess Insert Cart", result, HttpStatus.OK);
		}
	}
	
	@RequestMapping(method=RequestMethod.PUT)
	public ResponseEntity<Map<String, Object>> updateCart(@RequestBody Cart cart){
		boolean result = cartService.updateCart(cart);
		if( result ){
			return Utils.respondJson("Success Update Cart", result, HttpStatus.OK);
		}else{
			return Utils.respondJson("Unsuccess Update Cart", result, HttpStatus.OK);
		}
	}
	
	@RequestMapping(value="/{cart_id}", method=RequestMethod.DELETE)
	public ResponseEntity<Map<String, Object>> deleteCart(@PathVariable int cart_id){
		boolean result = cartService.deletetCart(cart_id);
		if( result ){
			return Utils.respondJson("Success Delete Cart", result, HttpStatus.OK);
		}else{
			return Utils.respondJson("Unsuccess Delete Cart", result, HttpStatus.OK);
		}
	}
}
