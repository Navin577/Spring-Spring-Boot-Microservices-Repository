package com.nt;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.nt.controller.PayrollOperationsController;
import com.nt.model.Employee;

@SpringBootApplication
public class BootProj4LayeredAppApplication {

	public static void main(String[] args) {
		//get IOC container
		ApplicationContext ctx= SpringApplication.run(BootProj4LayeredAppApplication.class, args);
		//get Controller class obj ref
		PayrollOperationsController controller=ctx.getBean("payroll",PayrollOperationsController.class);
		//invoke the b.method
		try {
			List<Employee> list=controller.showAllEmployeesByDesgs("CLERK","MANAGER","SALESMAN");
			//Process the results
			list.forEach(emp->{
				System.out.println(emp);
			});
		}//try
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("internal problem---try again");
			
		}
		
	}

}
