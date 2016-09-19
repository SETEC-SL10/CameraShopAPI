package com.setec_ecomerce.service.front_end_transaction.impl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.setec_ecomerce.repository.front_end_transaction.dao.cart.CartDAO;
import com.setec_ecomerce.repository.front_end_transaction.dto.cart.Cart;
import com.setec_ecomerce.service.front_end_transaction.CartService;

@Service
public class CartServiceImpl implements CartService{

	@Autowired
	private CartDAO cartDao;
	
	@Override
	public boolean insertCart(Cart cart) {
		if(cartDao.checkCart(cart)){
			return updateCartIncrease(cart);
		}
		return cartDao.insertCart(cart);
	}

	@Override
	public boolean deletetCart(int cart_id) {
		return cartDao.deletetCart(cart_id);
	}

	
	@Override
	public boolean updateCart(Cart cart) {
		if( cart.getProduct().getProduct_id().substring(1, 2).equals("N")){
			if(cart.getProduct_qty() > cartDao.checkProductQty(cart.getCart_id())){
				return false;
			}else{
				return cartDao.updateCart(cart.getCart_id(), cart.getProduct_qty());
			}
		}else{
			return false;
		}
	}
	
	public boolean updateCartIncrease(Cart cart) {
		if( cart.getProduct().getProduct_id().substring(1, 2).equals("N")){
			return cartDao.updateCartIncrease(cart.getCart_id(), cart.getProduct_qty());
		}else{
			return false;
		}
	}

	@Override
	public ArrayList<Cart> getCart(int customer_id) {
		return cartDao.getCart(customer_id);
	}

}
