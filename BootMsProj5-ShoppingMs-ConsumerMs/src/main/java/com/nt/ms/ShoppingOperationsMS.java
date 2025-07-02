package com.nt.ms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.client.IFetchBillingMs;


@RestController
@RequestMapping("/shopping-api")
public class ShoppingOperationsMS {
	@Autowired
	private IFetchBillingMs client;
	@GetMapping("/purchase")
	public ResponseEntity<String> doShopping(){
		System.out.println("Shoppingcontroller::client comp class name::"+client.getClass());
		return new ResponseEntity<String>(client.fetchBillings(),HttpStatus.OK);
	}
}
