package com.nt.ms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.client.BillingMsClientComp;

import ch.qos.logback.core.net.server.Client;

@RestController
@RequestMapping("/shopping-api")
public class ShoppingOperationsMS {
	@Autowired
	private BillingMsClientComp client;
	@GetMapping("/purchase")
	public ResponseEntity<String> doShopping(){
		//use client cpmopnent
		ResponseEntity<String> resultMsg=client.invokeDoBilling();
		try {
			Thread.sleep(2000);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return new ResponseEntity<String> ("Shopping the items(shirt,trouser):::"+resultMsg,HttpStatus.OK);
	}
}
