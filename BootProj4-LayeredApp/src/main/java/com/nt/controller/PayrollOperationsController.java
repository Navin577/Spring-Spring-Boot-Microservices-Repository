package com.nt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.nt.model.Employee;
import com.nt.service.IEmployeeMgmtService;
@Controller("payroll")
public class PayrollOperationsController {
	@Autowired
	private IEmployeeMgmtService service;
	public List<Employee> showAllEmployeesByDesgs(String desg1,
												  String desg2,
												  String desg3)throws Exception{
		//use service
		List<Employee> list=service.fetchAllEmployeesByDesgs(desg1, desg2, desg3);
		return list;
	}

}
