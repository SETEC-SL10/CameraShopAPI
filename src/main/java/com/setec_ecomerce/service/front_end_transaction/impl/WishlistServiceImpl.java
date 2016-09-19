package com.setec_ecomerce.service.front_end_transaction.impl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.setec_ecomerce.repository.front_end_transaction.dao.wishlist.WishlistDAO;
import com.setec_ecomerce.repository.front_end_transaction.dto.wishlist.Wishlist;
import com.setec_ecomerce.service.front_end_transaction.WishlistService;

@Service
public class WishlistServiceImpl implements WishlistService{

	@Autowired
	private WishlistDAO wishlistDao;
	
	@Override
	public ArrayList<Wishlist> getWishlists(int customer_id) {
		// TODO Auto-generated method stub
		return wishlistDao.getWishlists(customer_id);
	}

	@Override
	public boolean insertWishlist(Wishlist wishlist) {
		// TODO Auto-generated method stub
		if(wishlistDao.checkWishlist(wishlist)){
			return true;
		}else{
			return wishlistDao.insertWishlist(wishlist);
		}
	}

	@Override
	public boolean deleteWishlist(int wishlist_id) {
		// TODO Auto-generated method stub
		return wishlistDao.deleteWishlist(wishlist_id);
	}

}
