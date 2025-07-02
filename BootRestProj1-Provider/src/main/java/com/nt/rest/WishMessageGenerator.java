package com.nt.rest;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Boot-Rest")
public class WishMessageGenerator {
	@GetMapping("/rest")
	public ResponseEntity<String>ShowMessage(){
		//Get current date and time
		LocalDateTime ldt=LocalDateTime.now();
		//Get Current Hour
		int hour=ldt.getHour();
		String msg=null;
		
		if(hour<12)
			msg="Good Morning";
		else if(hour<16)
			msg="Good AfterNoon";
		else if(hour<18)
			msg="Good Evening";
		else
			msg="Good Night";
		
		//ResponseEntity
		ResponseEntity<String> res=new ResponseEntity<String>(msg, HttpStatus.OK);
		
		//Return Statement
		return res;
		
		
		
	}

}
