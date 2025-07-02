package com.nt.ston;

import org.springframework.context.annotation.Scope;

@Scope("prototype")
public class Printer {
	private static Printer INSTANCE;
	
	//Private constructor
	private Printer() {
		System.out.println("Printer::0-param constructor");
	}
	
	//static factory method having singleton logic
	public static Printer getInstance() {
		if(INSTANCE==null)
			INSTANCE=new Printer();
		return INSTANCE;
	}
	
	//b.method
	public void printMessage(String msg) {
		System.out.println(msg);
	}
}
