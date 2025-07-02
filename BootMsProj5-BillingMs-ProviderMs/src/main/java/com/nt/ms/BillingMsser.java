package com.nt.ms;

import java.util.Random;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/billing-api")
public class BillingMsser {
	@Value("${spring.application.instance-id}")
	private String instance_id;
	@Value("${server.port}")
	private String port;
	@GetMapping("/bill")
	public ResponseEntity<String> doBilling()
	{
		long billamt=new Random().nextLong(10000);
		String msg="Shirt....Pant";
		return new ResponseEntity<String>("BillAmount::"+msg+billamt+"......"+instance_id+"portnumber::"+port,HttpStatus.OK);
	}
}
