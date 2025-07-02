package com.nt.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.net.ssl.SSLSessionContext;

import org.apache.catalina.util.SessionConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.support.BindingAwareModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.fasterxml.jackson.databind.cfg.MapperBuilder;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@Controller
public class ShowHomePage {
	/*@RequestMapping("/show")
	public String process(Map<String,Object>map) {
		System.out.println("ShowHomePage.process()::ShowHomePage Object ClassName::"+map.getClass());
		map.put("attr1", "val1");
		map.put("sysDt",LocalDateTime.now());
		
		return "Show_Process"; // LVN
		} 
		*/
	/*
	 * @RequestMapping("/show") public String process(Model model) {
	 * System.out.println("ShowHomePage.process()::ShowHomePage object ClassName::"
	 * +model.getClass()); model.addAttribute("attr1","val1");
	 * model.addAttribute("sysDt",LocalDateTime.now());
	 * 
	 * return "Show_Process"; }
	 */
	/*
	 * @RequestMapping("/show") public String process(ModelMap map) {
	 * System.out.println("ShowHomePage.process()::ShowHomePage Object ClassName::"
	 * +map.getClass()); map.addAttribute("attr1","val1");
	 * map.addAttribute("sysDt",LocalDateTime.now());
	 * 
	 * 
	 * //return lvn return "Show_Process"; }
	 */
	
	/*
	 * @RequestMapping("/process") public Model process() { //create shared memory
	 * manually Model model=new BindingAwareModelMap();
	 * System.out.println("ShowHomePage.process()::ShowHomePage Oobject ClassName::"
	 * +model.getClass()); model.addAttribute("attr1","val1");
	 * model.addAttribute("sysDt",LocalDateTime.now());
	 * 
	 * //return LVN return model; }
	 */
	/*
	 * @RequestMapping("/processs") public Map<String,Object> process() { //creates
	 * Shared memory Map<String,Object> map=new HashMap(); map.put("attr1","val3");
	 * map.put("sysDt",LocalDateTime.now());
	 * 
	 * //return LVN return map; }
	 */
	
	/*
	 * @RequestMapping("/processs") public ModelAndView process() {
	 * System.out.println("ShowHomePage.process()::ShowHomePage Object classname::"
	 * ); //create Shared Memory ModelAndView mav= new ModelAndView();
	 * mav.addObject("attr1", "av"); mav.addObject("sysDt", LocalDateTime.now());
	 * //place LVN to MAV Object mav.setViewName("Show_Process");
	 * 
	 * return mav; }
	 */
	
	/*
	 * @RequestMapping("/processs") public void process(Map<String,Object>map) {
	 * System.out.
	 * println("ShowHomePage.process()::ShowHomePage Object className()::"+map.
	 * getClass()); map.put("attr1", "naveen the time is"); map.put("sysDt",
	 * LocalDateTime.now());
	 * 
	 * }
	 */
	
	/*@RequestMapping("/processs")
	public String process(Map<String,Object>map) {
		System.out.println("ShowHomePage.process()::ShowHomePage Object className()::"+map.getClass());
		map.put("attr1", "Lavanya the time is :");
		map.put("sysDt", LocalDateTime.now());
		return null;*/
	
	
	/*
	 * @RequestMapping("/processs") public String process() { System.out.
	 * println("ShowHomePage.process()::ShowHomePage object ClassName()::"); return
	 * "forward:report"; }
	 * 
	 * @RequestMapping("/report") public String report() {
	 * System.out.println("ShowHomePage.report()::ShowHomePage Object classname()::"
	 * ); return "Show_Process"; }
	 */
	
	/*
	 * @RequestMapping("/processs") public String process(HttpServletRequest req) {
	 * System.out.println("ShowHomePage.process():"+req.hashCode());
	 * req.setAttribute("attr1", "i love you"); return "redirect:report"; }
	 * 
	 * @RequestMapping("/report") public String report(HttpServletRequest req) {
	 * System.out.println("ShowHomePage.report()");
	 * System.out.println("req Attribute::"+req.getAttribute("attr1")); return
	 * "Show_Process"; }
	 */
	
	/*
	 * @RequestMapping("/map") public String process(HttpServletRequest
	 * req,HttpServletResponse res) {
	 * System.out.println("ShowHomePage.process()"+req.hashCode());
	 * req.setAttribute("attr1", new Date()); return "http"; }
	 */
	
	/*
	 * @RequestMapping("/req") public String process(HttpSession ses) {
	 * System.out.println("ShowHomePage.process():"+ses.hashCode());
	 * ses.setAttribute("attr1",LocalDateTime.now()); return "http"; }
	 */
	/*
	 * @Autowired private ServletConfig sg;
	 * 
	 * @Autowired private ServletContext sc;
	 * 
	 * @RequestMapping("/rm") public String process(Map<String, Object>map) {
	 * System.out.println("ShowHomePage.process()"+sg.getServletName());
	 * System.out.println("ShowHomePage.process()"+sc.getContextPath());
	 * 
	 * map.put("attr1","Naveen"); sc.setAttribute("attr2", "I Love You"); return
	 * "http"; }
	 */
	@RequestMapping("/mp")
	public void process(HttpServletResponse res) throws IOException
	{
		//get printwriter object
		PrintWriter pw=res.getWriter();
		//make Downloadble file 
		res.setHeader("Content-Disposition","attachment;fileName=abc.txt");
		//print msg directly to browser
		pw.println("<b>Hello Naveen</b>");
	}
	
	
}



