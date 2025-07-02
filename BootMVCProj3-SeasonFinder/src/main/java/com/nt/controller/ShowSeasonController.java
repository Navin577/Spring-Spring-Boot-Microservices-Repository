package com.nt.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.nt.service.ISeasonFinder;

@Controller
public class ShowSeasonController{
	@Autowired
	private ISeasonFinder service;
	
	//@RequestMapping( value="/mr",method=RequestMethod.GET)
	@GetMapping
	public String welcome()
	{
		System.out.println("ShowSeasonController.welcome()");
		return "welcome";
	}
	
	//@RequestMapping( value="/mr",method=RequestMethod.POST)
	@PostMapping
	public String season(Map<String,Object> map)
	{
		//keep service 
		String msg=service.findseason();
		//add attributes
		map.put("attr1", msg);
		//LVN name
		return "display";
	}	

}