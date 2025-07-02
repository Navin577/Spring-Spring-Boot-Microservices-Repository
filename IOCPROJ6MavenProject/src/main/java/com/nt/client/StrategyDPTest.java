package com.nt.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.AppConfig;

public class StrategyDPTest {

	public static void main(String[] args) {
    //create IOc container
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
	//get target spring bean class obj
		Vehicle vehicle=ctx.getBean("vehicle",Vehicle.class);
		//invoke the b.method
		vehicle.journey("hyd","goa");
		//close the container
		ctx.close();
	}

}
