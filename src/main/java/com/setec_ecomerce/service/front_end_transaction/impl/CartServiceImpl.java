package com.setec_ecomerce.service.front_end_transaction.impl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.setec_ecomerce.repository.front_end_transaction.dao.cart.CartDAO;
import com.setec_ecomerce.repository.front_end_transaction.dto.cart.Cart;
import com.setec_ecomerce.repository.users.dao.CustomerFrontEndDAO;
import com.setec_ecomerce.service.front_end_transaction.CartService;

@Service
public class CartServiceImpl implements CartService{

	@Autowired
	private CartDAO cartDao;
	
	@Autowired
	private CustomerFrontEndDAO customerDAO;
	
	@Override
	public boolean insertCart(Cart cart) {
		if(customerDAO.checkCustomerFrontEnd(cart.getCustomer_id())){
			if(cartDao.checkCart(cart)){
				return updateCartIncrease(cart);
			}
			return cartDao.insertCart(cart);
		}else{
			return false;
		}
		
	}

	@Override
	public boolean deletetCart(int cart_id) {
		return cartDao.deletetCart(cart_id);
	}

	
	@Override
	public boolean updateCart(Cart cart) {
		if(customerDAO.checkCustomerFrontEnd(cart.getCustomer_id())){
			if( cart.getProduct().getProduct_id().substring(1, 2).equals("N")){
				if(cart.getProduct_qty() > cartDao.checkProductQty(cart.getCart_id())){
					return false;
				}else{
					return cartDao.updateCart(cart.getCart_id(), cart.getProduct_qty());
				}
			}else{
				return false;
			}
		}else{
			return false;
		}
	}
	
	public boolean updateCartIncrease(Cart cart) {
		if(customerDAO.checkCustomerFrontEnd(cart.getCustomer_id())){
			if( cart.getProduct().getProduct_id().substring(1, 2).equals("N")){
				cart.setCart_id(cartDao.getCartID(cart));
				boolean b = cartDao.updateCartIncrease(cart.getCart_id(), cart.getProduct_qty());
				return b;
			}else{
				return false;
			}
		}else{
			return false;
		}
		
	}

	@Override
	public ArrayList<Cart> getCart(int customer_id) {
		if(customerDAO.checkCustomerFrontEnd(customer_id)){
			return cartDao.getCart(customer_id);
		}else{
			return null;
		}
		
	}

}
