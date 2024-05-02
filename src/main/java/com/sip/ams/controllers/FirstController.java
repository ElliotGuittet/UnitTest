package com.sip.ams.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FirstController {
	
	
	@GetMapping("/infourl")
	//@ResponseBody
	public String information()
	{
		return "first/info";
	}
	
	@GetMapping("/details")
	//@ResponseBody
	public String detailsFormation()
	{
		return "first/details";
	}

}
