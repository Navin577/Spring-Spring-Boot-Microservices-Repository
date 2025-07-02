package com.nt.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Student;
import com.nt.repository.IStudentRepository;
@Service("studService")
public class StudentMgmtImplClass implements IStudentMgmtService {
	@Autowired
	private IStudentRepository studRepo;
	
	@Override
	public List<Student> getAllStudents(){
		return studRepo.findAll();
	}

	@Override
	public String addStudent(Student student) {
		//set windows username as the created by username
		student.setCreatedBy(System.getProperty("user.name"));
		//save the object
		int idVal=studRepo.save(student).getSno();
		return "Student is saved with id value:"+idVal;
	}

	@Override
	public Student fetchStudentByNo(int no) {
		return studRepo.findById(no).orElseThrow(()->new IllegalArgumentException("Invalid no"));
	}

	@Override
	public String editStudent(Student student) {
     
		Optional<Student> opt=studRepo.findById(student.getSno());
		if(opt.isPresent())
		{
			studRepo.save(student);
			return student.getSno()+"Student Data  is Modified";
		}
		return student.getSno()+"Student is not found";
	}

	
}
