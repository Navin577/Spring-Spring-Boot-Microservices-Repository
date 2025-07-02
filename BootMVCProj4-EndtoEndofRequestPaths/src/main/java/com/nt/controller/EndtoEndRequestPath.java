package com.nt.controller;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/*import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
*/
@Controller
public class EndtoEndRequestPath {
	 
	
	/*
	 * @RequestMapping("/reports") public String process() {
	 * System.out.println("EndtoEndRequestPath.process()"); return "show_process"; }
	 * 
	 * @RequestMapping("/REPORTS") public String process1() {
	 * System.out.println("EndtoEndRequestPath.process()"); return "show_process_1";
	 * }
	 */
	 
	/*
	 * @RequestMapping({"/p","/p1","/p2"}) public String process() {
	 * System.out.println("EndtoEndRequestPath.process()"); return "show_process"; }
	 */
	/*
	 * @RequestMapping("/") public String process() { //LVN return "show_process"; }
	 */
	/*
	 * @RequestMapping public String process() { //LVN return "show_process_1"; }
	 */
	
	/*
	 * @RequestMapping("/") public String process() { return "show_process"; }
	 * 
	 * @RequestMapping public String process1() { return "show_process"; }
	 */
	
	/*
	 * @RequestMapping(value="/",method=RequestMethod.GET) public String welcome() {
	 * return "show_process"; }
	 * 
	 * @RequestMapping(value="/rm",method=RequestMethod.POST) public String from() {
	 * return "show_process"; }
	 */
	
	/*
	 * @GetMapping("/gm") public String process(Map<String,Object>map) {
	 * System.out.println("EndtoEndRequestPath.process()"); //add Attributes
	 * map.put("Name", "Naveen"); map.put("age", 30); //LVN Name return
	 * "show_process"; }
	 */
	@GetMapping("/gm")
	public String process(Map<String,Object>map)
	{
		System.out.println("EndtoEndRequestPath.process()");
		//add arrays , collection attributes
		map.put("favColors",new String[] {"red","green","yellow"});
		map.put("nickNames",List.of("naveen","sonu","bablu"));
		map.put("phoneNumbers",Set.of(9999999L,888888L,7777777L));
		map.put("idValues", Map.of("aadarNo",54738500,"VoterId",5603));
		//return LVN
		return "show_process";
	}
}




