package com.nt.cfgs;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ComponentScan(basePackages="com.nt.sbeans")
@ImportResource("com/nt/cfgs/applicationContext.xml")
public class AppConfig {

}
