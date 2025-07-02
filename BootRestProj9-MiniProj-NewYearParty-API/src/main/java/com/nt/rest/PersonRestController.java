package com.nt.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.service.IPersonMgmtService;
import com.nt.vo.PersonVO;

@RestController
@RequestMapping("/person-api")
public class PersonRestController {
	@Autowired
	private IPersonMgmtService personService;
	
	@PostMapping("/register")
	public  ResponseEntity<String> registerPerson(@RequestBody PersonVO vo)
	{
		try {
			String msg=personService.insertPerson(vo);
			
			return new ResponseEntity<String>(msg, HttpStatus.CREATED);
		}catch(Exception e)
		{
			return new ResponseEntity<String>("Problem is registration:"+e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
