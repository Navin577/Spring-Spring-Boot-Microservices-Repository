package com.nt.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.sbeans.WishMessageGenerator;

@SuppressWarnings("unused")
public class DependencyInjectionTest {
	public static void main(String[] args) 
	{
      //create IOC container
		ClassPathXmlApplicationContext ctx=
				new ClassPathXmlApplicationContext("com/nt/config/applicationContext.xml");
	  //get Target spring Bean class object from the IOCcontainer
		Object obj=ctx.getBean("wmg");
	  //type casting
		WishMessageGenerator generator=(WishMessageGenerator)obj;
		System.out.println("Gathering target spring bean class obj ref");
		//invoke the b.method
		String result=generator.generateWishMessage("naveen");
		System.out.println(result);
		//close the IOC container
		ctx.close();
		System.out.println("DependencyInjectionTest.main()(end)");
	}//end of loop

}
