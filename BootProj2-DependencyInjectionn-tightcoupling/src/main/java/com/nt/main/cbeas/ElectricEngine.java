package com.nt.main.cbeas;

import org.springframework.stereotype.Component;

@Component("eEngine")
public class ElectricEngine implements IEngine {
	
	public ElectricEngine() {
		System.out.println("ElectricEngine::0-param constructor");
	}
	@Override
	public void start() {
		System.out.println("ElectricEngine.start()::Engine started");
	}
	@Override
	public void stop() {
		System.out.println("ElectricEngine.stop()::Engine stopped");
	}

}
