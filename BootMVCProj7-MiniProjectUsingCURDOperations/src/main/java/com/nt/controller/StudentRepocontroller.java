package com.nt.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.nt.entity.Student;
import com.nt.service.IStudentMgmtService;

import jakarta.servlet.http.HttpSession;

@Controller
public class StudentRepocontroller {
	@Autowired	
	private IStudentMgmtService studService;
	
	@GetMapping("/")
	public String home()
	{
	 System.out.println("StudentRepocontroller.home()");
	 //LVn
	 return "welcome";
	}
	
	@GetMapping("/report") //(G)
	public String studreport(Map<String,Object>map)
	{
		System.out.println("StudentRepocontroller.studreport()");
		//Service method
		List<Student> list=studService.getAllStudents();
		//System.out.println(list.toString());
		//add model Attribute
		map.put("listStudents", list);
		//return LVN
		return "Show_Report";
	}
	
	@GetMapping("/register") //To launch Form page submission
	public String studentregistration(@ModelAttribute("student") Student student)
	{
		System.out.println("StudentRepocontroller.studentregistration()");
		//return LVN
		return "Add_Student";
	}
	
	/*
	 * @PostMapping("/register") public String //Probelm Code
	 * addStudent(@ModelAttribute("student")Student student,Map<String,Object>map) {
	 * //use service String msg=studService.addStudent(student); List<Student>
	 * list=studService.getAllStudents(); //keep the result in model Attribute
	 * map.put("resultMsg", msg); map.put("listStudents", list); //return LVN return
	 * "Show_Report"; }
	 */
	
	/*
	 * @PostMapping("/register") //Solution-1:Implementing PRG pattern (P) public
	 * String addStudent(@ModelAttribute("student")Student
	 * student,Map<String,Object>map) {
	 * System.out.println("StudentRepocontroller.addStudent()"); //use service
	 * String msg=studService.addStudent(student); //keep the result in model
	 * Attribute map.put("resultMsg", msg); //return LVN return "redirect:report";
	 * //(R) //return "forward:report"; }
	 */
	
	/*
	 * @PostMapping("/register") //Solution-2:Implementing PRG pattern (P) public
	 * String addStudent(@ModelAttribute("student")Student
	 * student,RedirectAttributes attrs) {
	 * System.out.println("StudentRepocontroller.addStudent()"); //use service
	 * String msg=studService.addStudent(student); //keep the result in model
	 * Attribute attrs.addFlashAttribute("resultMsg", msg); //return LVN return
	 * "redirect:report"; //(R) //return "forward:report"; }
	 */
	@PostMapping("/register") //Solution-3:Implementing PRG pattern  (P)
	public String addStudent(@ModelAttribute("student")Student student,HttpSession sess)
	{
		System.out.println("StudentRepocontroller.addStudent()");
		//use service
		String msg=studService.addStudent(student);
		//keep the result in model Attribute
		sess.setAttribute("resultMsg", msg);
		//return LVN
		return "redirect:report";  //(R)
		//return "forward:report";
	}
	
	
	@GetMapping("/edit")
	public String editstudentFormpage(@ModelAttribute("student") Student student,@RequestParam("no")  int no)
	{
		//service method
		Student student1=studService.fetchStudentByNo(no);
		//copy student1 obj to student 
		BeanUtils.copyProperties(student1, student);
		//return lvn
		return "edit_student";
	}
	@PostMapping("/edit")
	public String editstudent(@ModelAttribute("student") Student student,
			  RedirectAttributes attrs)
	{
		//use service
		String msg=studService.editStudent(student);
		//keep the results in flash attribues
		attrs.addFlashAttribute("resultMsg", msg);
		//redirect the request
		return "redirect:report";
	}
	 
}
