package com.nt.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.main.cbeas.Vehicle;

@SpringBootApplication
public class BootProj2DependencyInjectionnApplication {

	public static void main(String[] args) {
		//get IOC container
		ApplicationContext ctx= SpringApplication.run(BootProj2DependencyInjectionnApplication.class, args);
		//get Access to target spring bean class object
		Vehicle vehicle=ctx.getBean("vehicle",Vehicle.class);
		//invoke the b.method
		vehicle.journey("Hyd","Delhi");
		//close the container
		((ConfigurableApplicationContext)ctx).close();
		
	}

}
