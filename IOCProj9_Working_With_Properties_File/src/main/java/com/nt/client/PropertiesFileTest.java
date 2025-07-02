package com.nt.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.AppConfig;
import com.nt.sbeans.PersonInfo;

public class PropertiesFileTest {

	public static void main(String[] args) {
		//craete the IOC container
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
       //get Spring bean class obj ref
		PersonInfo info=ctx.getBean("pInfo",PersonInfo.class);
		System.out.println(info);
		
	}

}
