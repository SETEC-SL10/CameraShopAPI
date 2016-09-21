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
import com.setec_ecomerce.repository.front_end_transaction.dto.wishlist.Wishlist;
import com.setec_ecomerce.repository.products.dto.PageForm;
import com.setec_ecomerce.repository.utils.Utils;
import com.setec_ecomerce.service.front_end_transaction.WishlistService;

@RestController
@RequestMapping("api/front_end/wishlist")
public class WishlistController {

	@Autowired
	private WishlistService wishlistService;
	
	@RequestMapping(value="/all",method=RequestMethod.POST)
	public ResponseEntity<Map<String, Object>> getWishlistByCustomer(@RequestBody PageForm page){
		ArrayList<Wishlist> wishlist = wishlistService.getWishlists(page);
		if( wishlist == null ){
			return Utils.respondJson("Record not found", null, HttpStatus.OK);
		}else{
			if(wishlist.size() > 0){
				return Utils.respondJson("Record found", wishlist, HttpStatus.OK);
			}else{
				return Utils.respondJson("Record not found", null, HttpStatus.OK);
			}
		}
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public ResponseEntity<Map<String, Object>> insertWishlist(@RequestBody Wishlist wishlist){
		boolean result = wishlistService.insertWishlist(wishlist);
		if( result ){
			return Utils.respondJson("Success Insert Wishlist", result, HttpStatus.OK);
		}else{
			return Utils.respondJson("Unsuccess Insert Wishlist", null, HttpStatus.OK);
		}
	}
	
	@RequestMapping(value="/page",method=RequestMethod.POST)
	public int countPageWishlist(@RequestBody PageForm page){
		return wishlistService.countPageWishlists(page);
	} 
	
	@RequestMapping(value="/count",method=RequestMethod.POST)
	public int countWishlists(@RequestBody PageForm page){
		return wishlistService.countWishlists(page);
	} 
	
	@RequestMapping(value="/{wishlist_id}", method=RequestMethod.DELETE)
	public ResponseEntity<Map<String, Object>> deleteWishlist(@PathVariable int wishlist_id){
		boolean result = wishlistService.deleteWishlist(wishlist_id);
		if( result ){
			return Utils.respondJson("Success Delete Wishlist", result, HttpStatus.OK);
		}else{
			return Utils.respondJson("Unsuccess Delete Wishlist", null, HttpStatus.OK);
		}
	}
}
