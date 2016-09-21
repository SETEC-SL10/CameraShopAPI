package com.setec_ecomerce.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class AdminController {
	
	@RequestMapping(value={"/admin/dashboard","/admin/"},method=RequestMethod.GET)
	public String findAll(){
		return "admin/dashboard";
	}
	@RequestMapping(value="/admin/slide",method=RequestMethod.GET)
	public String slide(){
		return "admin/slide";
	}
	
	@RequestMapping(value="/admin/user",method=RequestMethod.GET)
	public String user(){
		return "admin/user";
	}
	
	@RequestMapping(value="/admin/comment",method=RequestMethod.GET)
	public String comment(){
		return "admin/comment";
	}
	
	@RequestMapping(value="/admin/savelist",method=RequestMethod.GET)
	public String savelist(){
		return "admin/savelist";
	}
	
	
	@RequestMapping(value="/admin/feedback",method=RequestMethod.GET)
	public String feedback(){
		return "admin/feedback";
	}
	
	@RequestMapping(value="/admin/main-category",method=RequestMethod.GET)
	public String mainCategory(){
		return "admin/main-category";
	}
	
	@RequestMapping(value="/admin/sub-category",method=RequestMethod.GET)
	public String subCategory(){
		return "admin/sub-category";
	}
	
	@RequestMapping(value="/admin/report",method=RequestMethod.GET)
	public String report(){
		return "admin/report";
	}

	
}
