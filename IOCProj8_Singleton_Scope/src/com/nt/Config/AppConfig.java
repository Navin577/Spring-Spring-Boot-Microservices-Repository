package com.nt.Config;


import java.time.LocalDateTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages="com.nt.sbeans")
public class AppConfig {
	public AppConfig() {
		System.out.println("AppConfig::0-param constructor");
	}
	@Bean(name="dt")
	@Scope("prototype")
	public LocalDateTime createLDT() {
		System.out.println("AppConfig.craeteLDT()");
		return LocalDateTime.now();	
	}
	
	public LocalDateTime createLDT1() {
		System.out.println("AppConfig.createLDt1()");
		return LocalDateTime.now();
	}
}
