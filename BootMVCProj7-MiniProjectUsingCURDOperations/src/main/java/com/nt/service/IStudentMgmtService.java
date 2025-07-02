package com.nt.service;

import java.util.List;

import com.nt.entity.Student;

public interface IStudentMgmtService {
	public List<Student>getAllStudents();
	public String addStudent(Student student);
	public Student fetchStudentByNo(int no);
	public String editStudent(Student student);
}
