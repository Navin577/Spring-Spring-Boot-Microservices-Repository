package com.nt.runners;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import com.nt.entity.Employee_Date_Time;
import com.nt.service.IEmployeeMgmtService;

public class DateTimeTestRunner implements CommandLineRunner {
	@Autowired
	private IEmployeeMgmtService service;

	@Override
	public void run(String... args) throws Exception {
		try {
			//save the object
			Employee_Date_Time emp=new Employee_Date_Time("naveen","clerk",LocalDateTime.of(1990, 10,20,11,34),LocalTime.of(17, 45),LocalDate.of(2020, 10, 30));
			
			String result=service.saveEmployee(emp);
			System.out.println(result);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	}


