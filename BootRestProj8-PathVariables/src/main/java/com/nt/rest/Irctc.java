package com.nt.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/report")
public class Irctc {
	
	@GetMapping("/show/{id}/{name}/{addrs}")
	public ResponseEntity<String> showDetails(@PathVariable("iId") int id,
			                                  @PathVariable("iUname") String name,
			                                  @PathVariable String addrs)
	{
		System.out.println("pathVariables::"+id+"..."+name+"...."+addrs);
		return new ResponseEntity<String>("pathVariables::"+id+"..."+name+"...."+addrs, HttpStatus.OK);
	}

}
