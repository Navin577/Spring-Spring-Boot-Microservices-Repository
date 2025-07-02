package com.nt.client;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;


@Component
public class BillingMsClientComp {
	@Autowired
	private DiscoveryClient client;
	
	
	public ResponseEntity<String> invokeDoBilling(){
		//get target Ms service instance frm the eureka server
		List<ServiceInstance> listSI=client.getInstances("BillingMs");
		
		//get endpointing details
		URI url=listSI.get(0).getUri();//gives http://localhost:7071
		
		//complete the URL
		String urlInfo=url+"/billing-api/bill";
		
		//create resttemplate class object
		RestTemplate template=new RestTemplate();
		ResponseEntity<String> resp=template.exchange(urlInfo,HttpMethod.GET, null,String.class);
		return resp;
	}
}
