package com.nt.rest;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.model.IrctcDetails;
import com.nt.model.Person;

@RestController
@RequestMapping("json-api")
public class JsonController {
	@GetMapping("/irctc")
	public ResponseEntity<IrctcDetails> irctcDetails(){
		IrctcDetails irctc=new IrctcDetails(577,"Naveen","Hyd",1750.4);
		return new ResponseEntity<IrctcDetails>(irctc, HttpStatus.OK);
	}
	
	@GetMapping("/person")
	public ResponseEntity<Person> personDetails(){
		Person person=new Person(5603,"Lavanya","Hyd",50000.500,new String[] {"green","black"},
				List.of("Naveen", "Bablu"),Set.of(999999999L,88888888L),Map.of("adaar",547385,"Pan",577),
				new IrctcDetails(534,"Lavanya","KDM",15000.4));
		return new ResponseEntity<Person>(person, HttpStatus.OK);
	}
	@GetMapping("/irctc-list")
	public ResponseEntity<List<IrctcDetails>> irctcdetails1(){
	    IrctcDetails irctc1 = new IrctcDetails(1001, "Sonu", "PPm", 5000.0);
	    IrctcDetails irctc2 = new IrctcDetails(1002, "Santu", "Gorinta", 6000.0);
	    IrctcDetails irctc3 = new IrctcDetails(1003, "Sai", "Polaki", 7000.0);
	    IrctcDetails irctc4 = new IrctcDetails(1004, "Srinivas", "Npeta", 8000.0);
	    
	    List<IrctcDetails> list = List.of(irctc1, irctc2, irctc3, irctc4);
	    return new ResponseEntity<>(list, HttpStatus.OK);
	}

}
