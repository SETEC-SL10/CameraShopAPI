package com.setec_ecomerce.restcontroller;

import java.util.HashMap;
import java.util.Map;

import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
public class MainController {
	@RequestMapping(value="/h1",method=RequestMethod.GET)
	@ResponseBody
	public String getH1(){
		return "<h1> Hello this is H1 </h1>";
	}
	@RequestMapping(value="/json",method=RequestMethod.GET)
	@ResponseBody
	public String getJson(){
		Map< String, Object> json = new HashMap<>();
		json.put("id", 001);
		json.put("name", "Som Oun");
		json.put("age", 21);
		json.put("img", "DSC_0098.JPG");
		JSONObject jsonobj = new JSONObject(json);
		return jsonobj.toString();
	}
	
}
