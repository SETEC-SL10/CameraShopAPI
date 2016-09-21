package com.setec_ecomerce.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class ViewController {
	
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String index(){
		return "index";
	}
	
	@RequestMapping(value="/checkout",method=RequestMethod.GET)
	public String checkout(){
		return "user/checkout";
	}
	
	@RequestMapping(value="/contact",method=RequestMethod.GET)
	public String contact(){
		return "user/contact";
	}
	
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public String login(){
		return "login";
	}
	
	@RequestMapping(value="/register",method=RequestMethod.GET)
	public String register(){
		return "user/register";
	}
	
	@RequestMapping(value="/product",method=RequestMethod.GET)
	public String product(){
		return "user/product";
	}
	
	@RequestMapping(value="/detail",method=RequestMethod.GET)
	public String detail(){
		return "user/detail";
	}
	
	@RequestMapping(value="/wishlist",method=RequestMethod.GET)
	public String wishlist(){
		return "user/wishlist";
	}
	
	@RequestMapping(value="/cart",method=RequestMethod.GET)
	public String cart(){
		return "user/cart";
	}
	
	@RequestMapping(value="/account",method=RequestMethod.GET)
	public String account(){
		return "user/account";
	}
	
	@RequestMapping(value="/warranty",method=RequestMethod.GET)
	public String warranty(){
		return "user/warranty";
	}
	
	@RequestMapping(value="/promotion",method=RequestMethod.GET)
	public String promotion(){
		return "user/promotion";
	}
	
	@RequestMapping(value="/about",method=RequestMethod.GET)
	public String about(){
		return "user/about";
	}
	
	
	
}

