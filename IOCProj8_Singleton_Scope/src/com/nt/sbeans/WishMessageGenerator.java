package com.nt.sbeans;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Component("wmg")
@Scope("prototype")
public class WishMessageGenerator {
	@Autowired
	@Qualifier("dt")
	//HAS-A Property
	private LocalDateTime ldt;
	
	public WishMessageGenerator() {
		System.out.println("WishMessaageGenerator::o-param constructor");
	}
}
