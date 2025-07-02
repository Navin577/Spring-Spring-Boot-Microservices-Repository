package com.nt.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/instagram-api")
public class Instagram {
	
	/*
	 * @GetMapping("/show") public ResponseEntity<String>
	 * ShowData(@RequestParam("id") Integer id,@RequestParam("uname") String name) {
	 * System.out.println("RequestParams: "+id+"..."+name); return new
	 * ResponseEntity<String>("RequestParams: "+id+"..."+name, HttpStatus.OK); }
	 */
	
	/*
	 * @GetMapping("/show") public ResponseEntity<String> ShowData(@RequestParam int
	 * id,@RequestParam String name) {
	 * System.out.println("RequestParams: "+id+"..."+name); return new
	 * ResponseEntity<String>("RequestParams: "+id+"..."+name, HttpStatus.OK); }
	 */
	
	@GetMapping("/show")
	public ResponseEntity<String> ShowData(@RequestParam("aid") Integer id,@RequestParam(required=false ) String name)
	{
		System.out.println("RequestParams: "+id+"..."+name);
		return new ResponseEntity<String>("RequestParams: "+id+"..."+name, HttpStatus.OK);
	}

}
