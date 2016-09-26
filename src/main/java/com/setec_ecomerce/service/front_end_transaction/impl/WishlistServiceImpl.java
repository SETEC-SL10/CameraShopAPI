package com.setec_ecomerce.service.front_end_transaction.impl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.setec_ecomerce.repository.front_end_transaction.dao.wishlist.WishlistDAO;
import com.setec_ecomerce.repository.front_end_transaction.dto.wishlist.Wishlist;
import com.setec_ecomerce.repository.products.dto.PageForm;
import com.setec_ecomerce.repository.users.dao.CustomerFrontEndDAO;
import com.setec_ecomerce.service.front_end_transaction.WishlistService;

@Service
public class WishlistServiceImpl implements WishlistService{

	@Autowired
	private WishlistDAO wishlistDao;
	
	@Autowired
	private CustomerFrontEndDAO customerDAO;
	
	@Override
	public ArrayList<Wishlist> getWishlists(PageForm page) {
		if(customerDAO.checkCustomerFrontEnd(Integer.valueOf(page.getConditionValue()))){
			return wishlistDao.getWishlists(page);
		}else{
			return null;
		}
	}
	
	@Override
	public int countPageWishlists(PageForm page) {
		return (int) Math.ceil(wishlistDao.countAllWishlists(page) / (double)page.getLimit());
	}
	
	@Override
	public int countWishlists(PageForm page) {
		if(customerDAO.checkCustomerFrontEnd(Integer.valueOf(page.getConditionValue()))){
			return wishlistDao.countAllWishlists(page);
		}else{
			return 0;
		}
	}

	@Override
	public boolean insertWishlist(Wishlist wishlist) {
		if(customerDAO.checkCustomerFrontEnd(wishlist.getCustomer_id())){
			if(wishlistDao.checkWishlist(wishlist)){
				return true;
			}else{
				return wishlistDao.insertWishlist(wishlist);
			}
		}else{
			return false;
		}
		
	}

	@Override
	public boolean deleteWishlist(int wishlist_id) {
		return wishlistDao.deleteWishlist(wishlist_id);
	}

}
