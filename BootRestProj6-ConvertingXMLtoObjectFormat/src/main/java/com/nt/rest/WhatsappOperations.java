package com.nt.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.model.Whatsapp;

@RequestMapping("/whatsapp-api")
@RestController
public class WhatsappOperations {
	
	@GetMapping("/show")
	public ResponseEntity<String> WhatsappDetails(){
		Whatsapp wtapp=new Whatsapp();
		System.out.println("WhatsappOperations.WhatsappDetails()::"+wtapp);
		
		return new ResponseEntity<String>(wtapp.toString(), HttpStatus.OK);
	}

}
