package com.nt.controller;

import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/wish-api")
public class ShowEureka {
	
	@Value("${spring.application.instance-id}")
	private String instanceid;
	@GetMapping("/show")
	public ResponseEntity<String> showMessage()
	{
		
		LocalTime time=LocalTime.now();
		int hour=time.getHour();
		String msg=null;
		if(hour<12)
		   msg="GoodMorning";
		else if(hour<15)
			msg="GoodAfterNoon";
		else if(hour<20)
			msg="GoodEvening";
		else   
			msg="GoodNight";
		
		
		return new ResponseEntity<String>(msg+"  InstanceId::"+instanceid, HttpStatus.OK);
	}

}
