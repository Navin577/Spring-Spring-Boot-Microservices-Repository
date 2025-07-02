package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;

import com.nt.model.Employee;

public class EmployeeDAOImpl implements IEmployeeDAO {
	private static  final String GET_EMPS_QUERY="SELECT EMPNO,ENAME,JOB,SAL,DEPTNO FROM EMP WHERE JOB IN(?,?,?)ORDER BY JOB";
	@Autowired
	private DataSource ds;

	@Override
	public List<Employee> getEmployeesByDesgs(String desg1, String desg2, String desg3) throws Exception {
     List<Employee> list=null;
     try(Connection con=ds.getConnection();
    		 PreparedStatement ps=con.prepareStatement(GET_EMPS_QUERY);)
     {
    	 //set values to query params
    	 ps.setString(1, desg1);
    	 ps.setString(2, desg2);
    	 ps.setString(3, desg3);
    	 
    	 //execute sql query
    	 try(ResultSet rs=ps.executeQuery())
    	 {
    		 //copy of each record of thr ResultSet obj to Model class obj
    		 while(rs.next()) {
    			 Employee emp=new Employee();
    			 emp.setEno(rs.getInt(1));
    			 emp.setEname(rs.getString(2));
    			 emp.setDesg(rs.getString(3));
    			 emp.setSalary((double) rs.getFloat(4));
    			 emp.setDeptno(rs.getInt(5));
    			
    			//add each model class object to rs
    			 list.add(emp);
    		 }
    	 }//try2
     }//try1
     catch(SQLException se)
     {
    	 se.printStackTrace();
    	 throw se;
     }
     catch(Exception e)
     {
    	 e.printStackTrace();
    	 throw e;
     }
		
		return null;
	}

}
