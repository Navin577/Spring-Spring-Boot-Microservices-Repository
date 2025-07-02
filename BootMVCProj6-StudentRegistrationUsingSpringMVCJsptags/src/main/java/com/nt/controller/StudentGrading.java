package com.nt.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.nt.model.Student;
@Controller
public class StudentGrading {
	
	@GetMapping("/")
	public String home()
	{
		System.out.println("StudentGrading.home()");
		//return lvn
		return "welcome";
	}
	
	@GetMapping("/register")
	public String register(@ModelAttribute("stud")Student st)
	{
		
		System.out.println("StudentGrading.register()");
		System.out.println("Model Attibutr class object()::"+st);
		//return LVN
		return "student";
	}

}
