package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.sbeans.Cricketer;

@SpringBootApplication
public class BootProj3StrategyDpApplication {

	public static void main(String[] args) {
	//get Access to IOC container	
	ApplicationContext ctx=SpringApplication.run(BootProj3StrategyDpApplication.class, args);
	//get Target spring bean class obj ref
	Cricketer cktr=ctx.getBean("cktr",Cricketer.class);
	//invoke the b.method
	String msg=cktr.batting();
	System.out.println(msg);
	
	((ConfigurableApplicationContext)ctx).close();
	}

}
