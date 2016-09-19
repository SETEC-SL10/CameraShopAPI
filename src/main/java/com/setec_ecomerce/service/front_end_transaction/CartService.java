package com.setec_ecomerce.service.front_end_transaction;

import java.util.ArrayList;

import com.setec_ecomerce.repository.front_end_transaction.dto.cart.Cart;

public interface CartService {

	boolean insertCart(Cart cart);
	
	boolean deletetCart(int cart_id);
	
	boolean updateCart(Cart cart);
	
	ArrayList<Cart> getCart(int customer_id);
}
