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
		String msg="shirt,Trouser items are purchased";
		//invoke TargetMs  endpointing thrugh clientcomp
		ResponseEntity<String> resp=client.invokeDoBilling();
		//generate the final result
		String result=msg+"..."+resp.getBody();
		//return ResponseEntity Object
		return new ResponseEntity<String>(msg+result,HttpStatus.OK);
	}
}
