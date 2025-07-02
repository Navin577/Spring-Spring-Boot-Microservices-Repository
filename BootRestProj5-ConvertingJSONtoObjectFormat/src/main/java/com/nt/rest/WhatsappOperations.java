package com.nt.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nt.model.Whatsapp;

@RequestMapping("/whatsapp-api")
public class WhatsappOperations {
	
	@PostMapping("/show")
	public ResponseEntity<String> WhatsappDetails(){
		Whatsapp wtapp=new Whatsapp();
		System.out.println("WhatsappOperations.WhatsappDetails()::"+wtapp);
		
		return new ResponseEntity<String>(wtapp.toString(), HttpStatus.OK);
	}

}
