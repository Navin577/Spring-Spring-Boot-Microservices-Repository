package com.nt.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.nt.model.Employee;

@Controller
public class EmployeeHandlerClass {
		
	@GetMapping("/")
	public String home()
	{
		System.out.println("EmployeeHandlerClass.home()");
		//LVN
		return "welcome";
	}
	
	@GetMapping("/register")
	public String register()
	{
		System.out.println("EmployeeHandlerClass.register()");
		//LVN
		return "register_page";
	}
	
	@PostMapping("/register")
	public String reuslt(Map<String,Object> map,@ModelAttribute("Emp")Employee em)
	{
		System.out.println("EmployeeHandlerClass.reuslt():"+em);
		//Object for MOdel Class Attributes
		 String result=null;
		 if(em.getEctc()<=400000)
			 result="you are not eligible for this position...";
		 else 
			 result="You are eligiblr for this position...";
		 //add Model Attributes
		 map.put("ResultMsg", result);
		 //LVN
		 return "result_emp";
	}
}
