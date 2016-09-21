package com.setec_ecomerce.service.front_end_transaction;

import java.util.ArrayList;

import com.setec_ecomerce.repository.front_end_transaction.dto.wishlist.Wishlist;
import com.setec_ecomerce.repository.products.dto.PageForm;

public interface WishlistService {
	ArrayList<Wishlist> getWishlists(PageForm page);
	boolean insertWishlist(Wishlist wishlist);
	boolean deleteWishlist(int wishlist_id);
	public int countPageWishlists(PageForm page);
	public int countWishlists(PageForm page);
}
