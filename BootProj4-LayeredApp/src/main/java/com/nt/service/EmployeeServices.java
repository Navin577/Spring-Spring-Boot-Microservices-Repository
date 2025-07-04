package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.dao.IEmployeeDAO;
import com.nt.model.Employee;
@Service("empService")
public class EmployeeServices implements IEmployeeMgmtService {
	@Autowired
	private IEmployeeDAO dao;

	@Override
	public List<Employee> fetchAllEmployeesByDesgs(String desg1, String desg2, String desg3) throws Exception {
		List<Employee> list=dao.getEmployeesByDesgs(desg1, desg2, desg3);
		
		
		return list;
	}

}
