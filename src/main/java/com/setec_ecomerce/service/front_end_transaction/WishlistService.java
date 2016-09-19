package com.setec_ecomerce.service.front_end_transaction;

import java.util.ArrayList;

import com.setec_ecomerce.repository.front_end_transaction.dto.wishlist.Wishlist;

public interface WishlistService {
	ArrayList<Wishlist> getWishlists(int customer_id);
	boolean insertWishlist(Wishlist wishlist);
	boolean deleteWishlist(int wishlist_id);
}
