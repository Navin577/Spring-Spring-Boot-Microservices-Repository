package com.nt.main.cbeas;

import org.springframework.stereotype.Component;

@Component("pEngine")
public class PetrolEngine implements IEngine {
	public PetrolEngine() {
		System.out.println("PetrolEngine::0-param constructor");
	}
	
	@Override
	public void start() {
		System.out.println("PetrolEngine.start()::Engine.started");
	}
	@Override
	public void stop() {
		System.out.println("PetrolEninge.stop()::Engine.stopped");
	}

}
