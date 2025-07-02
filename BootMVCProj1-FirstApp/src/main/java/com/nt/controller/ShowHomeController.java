package com.nt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ShowHomeController {
	/*@RequestMapping("/home")
	public String ShowHome()
	{
		System.out.println("ShowHomeController.ShowHome()");
		//LVN Name
		return "welcome";
	}*/
	@RequestMapping("/")
	public String ShowHome() {
		//LVN Name
		return "welcome";
	}
}
