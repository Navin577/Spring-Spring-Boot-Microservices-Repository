package com.nt.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/coustmer-api")
public class CoustmerDetails {
	@GetMapping("/show")
	public ResponseEntity<String> ShowCustomer(){
		System.out.println("CoustmerDetails.ShowCustomer()");
		return new ResponseEntity<String>("ShowCoustmer",HttpStatus.OK);
	}
	
	@PostMapping("/register")
	public ResponseEntity<String> RegisterCustomer()
	{
		System.out.println("CoustmerDetails.RegisterCustomer()");
		return new ResponseEntity<String>("RegisterCoustmer",HttpStatus.CREATED);
	}
	
	@PutMapping("/update")
	public ResponseEntity<String> UpdateCoustmer(){
		System.out.println("CoustmerDetails.UpdateCoustmer()");
		return new ResponseEntity<String>("UpdateCoustmer", HttpStatus.OK);
	}
	
	@PatchMapping("/emailUpdate")
	public ResponseEntity<String> UpdateEmail(){
		System.out.println("CoustmerDetails.UpdateEmail()");
		return new ResponseEntity<String>("CoustmerDetails", HttpStatus.OK);
	}
	
	@DeleteMapping("/delete")
	public ResponseEntity<String> DeleteCoustmer(){
		System.out.println("CoustmerDetails.DeleteCoustmer()");
		return new ResponseEntity<String>("DeleteCoustmer", HttpStatus.OK);
	}
	
	@GetMapping("/all")
	public ResponseEntity<String> ShowAllCoustmer(){
		System.out.println("CoustmerDetails.ShowAllCoustmer()");
		return new ResponseEntity<String>("ShowAllCoustmer", HttpStatus.OK);
	}

}
