//package com.nt.runners;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//
//import com.nt.entity.CallerTuneInfo;
//import com.nt.service.ICallerTuneInfoService;
//@Component
//public class VersioningAndTimeStampingTest implements CommandLineRunner {
//	@Autowired
//	private ICallerTuneInfoService service;
//	
//	@Override
//	public void run(String... args) throws Exception {
//			try {
//				CallerTuneInfo info=new CallerTuneInfo("00 anatava mama","puspha");
//				System.out.println(service.saveCallerTuneInfo(info));
//				
//			}catch(Exception e)
//			{
//				e.printStackTrace();
//			}
//	}
//
//}
package com.nt.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.CallerTuneInfo;
import com.nt.service.ICallerTuneInfoService;

@Component
public class VersioningAndTimeStampingTest implements CommandLineRunner {
    @Autowired
    private ICallerTuneInfoService service;

    @Override
    public void run(String... args) throws Exception {
		/*
		 * try { CallerTuneInfo info = new CallerTuneInfo("00 anatava mama", "puspha");
		 * System.out.println("Attempting to save CallerTune: " + info);
		 * 
		 * String result = service.saveCallerTuneInfo(info); System.out.println(result);
		 * 
		 * } catch (Exception e) { System.err.println("Error during data insertion:");
		 * e.printStackTrace(); }
		 */
    	
    	try {
    		System.out.println(service.updateTuneInfoById(402, "hcjd jnjf", "rrr"));
    		System.out.println(service.showCallerTuneDetailsById(402));
    		
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
    }
}

