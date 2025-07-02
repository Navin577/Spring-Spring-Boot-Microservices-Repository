package com.nt.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import com.nt.service.IOToMAssociationMgmtService;

public class OToMAssociationMappingRunner implements CommandLineRunner {
	@Autowired
	private IOToMAssociationMgmtService service;
	@Override
	public void run(String... args) throws Exception {
		//service.saveDataUsingParent();
		//service.saveDataUsingChild();
		service.loadDataUsingParent();
	}

}
