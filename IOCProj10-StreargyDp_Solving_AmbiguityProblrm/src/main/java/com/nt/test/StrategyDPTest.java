package com.nt.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.cfgs.AppConfig;
import com.nt.sbeans.Flipkart;

public class StrategyDPTest {

	public static void main(String[] args) {
    //create IOC container
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
	//get Target spring bean class obj
		Flipkart fpkt=ctx.getBean("fpkt",Flipkart.class);
	//invoke the b.methods
		String resultMsg=fpkt.shopping(new String[] {"shirt","trouser"},new double[] {60000.0f,70000.0f});
		System.out.println(resultMsg);
	}

}
