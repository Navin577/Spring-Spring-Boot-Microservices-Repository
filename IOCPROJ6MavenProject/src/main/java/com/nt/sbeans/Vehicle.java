package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("veh")
public final class Vehicle {
      //HAS-A property
	@Autowired
	@Qualifier("dEngine")
	private IEngine engine;
	
	//b.method
	public String travel()
}
