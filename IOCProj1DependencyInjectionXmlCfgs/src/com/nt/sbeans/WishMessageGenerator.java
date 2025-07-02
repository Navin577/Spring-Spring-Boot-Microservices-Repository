package com.nt.sbeans;
import java.time.LocalTime;
import java.time.LocalDate;
public class WishMessageGenerator {
	private LocalTime lt;//HAS-A property
	@SuppressWarnings("unused")
	private LocalDate ld;//HAS-A property
	/*public WishMessageGenerator() {
		System.out.println("WishMessageGenerator::0-param constructor");
	}*/
	//Setter method for setter Injection (alt+shift+s,r)
	public void setLt(LocalTime lt) {
		System.out.println("WishMessageGenerator.setLt()");
		this.lt = lt;
	}
	public void setLd(LocalDate ld)
	{
		System.out.println("WishMessageGenerator.setLd()");
		this.ld=ld;
	}
  //for constructor Injection
public WishMessageGenerator(LocalTime lt,LocalDate ld)
 {
	 this.lt=lt;
	 this.ld=ld;
	 System.out.println("WishMessageGenerator::2-param constructor");
 }
	//b.method
	public String generateWishMessage(String user)
	{
		System.out.println("WishMessageGenerator.generateWishMessage()::"+lt+"..."+ld);
		//get current hour of the day 
		int hour=lt.getHour();//In 24 hrs format
		if(hour<12)
			return "Good Morning:"+user;
		else if(hour<16)
			return "Good AfterNoon:"+user;
		else if(hour<20)
			return "Good Evening:"+user;
		else 
			return "Good Night:"+user;
	}
}
