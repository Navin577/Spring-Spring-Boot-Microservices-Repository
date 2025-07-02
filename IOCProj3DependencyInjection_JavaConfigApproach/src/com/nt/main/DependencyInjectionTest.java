package com.nt.main;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Arrays;

/*import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.AppConfig;
import com.nt.sbeans.WishMessageGenerator;*/

public class DependencyInjectionTest {

	public static void main(String[] args)throws Exception {
		Class c1=Class.forName("java.util.Date");
		
		LocalDate ld=LocalDate.now();
		Class c2=ld.getClass();
				
		Class c3=LocalTime.class;
		
		System.out.println("class name::"+c1.getName());
		System.out.println("super class name::"+c1.getSuperclass());
		System.out.println("methods info::"+Arrays.toString(c1.getDeclaredMethods()));
		System.out.println("constructors info::"+Arrays.toString(c1.getConstructors()));
		System.out.println("implemented interfaces info::"+Arrays.toString(c1.getInterfaces()));
		System.out.println("-----------");
		
		
		System.out.println("class name::"+c2.getName());
		System.out.println("super class name::"+c2.getSuperclass());
		System.out.println("methods info::"+Arrays.toString(c2.getDeclaredMethods()));
		System.out.println("constructors info::"+Arrays.toString(c2.getConstructors()));
		System.out.println("implemented interfaces info::"+Arrays.toString(c2.getInterfaces()));
		System.out.println("-----------");
		
		System.out.println("class name::"+c3.getName());
		System.out.println("super class name::"+c3.getSuperclass());
		System.out.println("methods info::"+Arrays.toString(c3.getDeclaredMethods()));
		System.out.println("constructors info::"+Arrays.toString(c3.getConstructors()));
		System.out.println("implemented interfaces info::"+Arrays.toString(c3.getInterfaces()));
		System.out.println("-----------");
		
		
		
		
		
		
		
  /* //create IOC container
		AnnotationConfigApplicationContext ctx=
				new AnnotationConfigApplicationContext(AppConfig.class);
	//get Target spring bean class obj ref
		WishMessageGenerator generator=(WishMessageGenerator) ctx.getBean("wmg");
	//invoke the b.method
		String msg=generator.generateWishMessage("naveen");
		System.out.println(msg);
	//close IOC container
		ctx.close();*/


	}

}
