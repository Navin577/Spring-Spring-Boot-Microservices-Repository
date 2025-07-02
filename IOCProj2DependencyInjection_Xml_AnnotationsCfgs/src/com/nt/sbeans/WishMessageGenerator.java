package com.nt.sbeans;

import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wmg")
public class WishMessageGenerator {
	@Autowired //field Injection
	private LocalTime lt;//HAS Property
	@Autowired //field Injection
	private LocalDate ld;//HAS Property
	
	//b.method
	public String generateWishMessage(String user)
	{
		System.out.println("WishMessageGenerator.generateWishMessage()::"+lt+"..."+ld);
		//get current hour of the day
		int hour=lt.getHour();//In 24 hrs format
		if(hour<12)
			return "Good Morning:"+user;
		else if(hour<16)
			return "Good After:"+user;
		else if(hour<20)
			return "Good Evening:"+user;
		else
			return "Good Night:"+user;
	}

}
