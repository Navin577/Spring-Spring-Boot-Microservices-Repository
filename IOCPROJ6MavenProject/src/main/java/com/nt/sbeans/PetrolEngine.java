package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("pEngine")
public class PetrolEngine implements IEngine {
	@Override
	public void startEngine() {
		System.out.println("PetrolEngine::Petrol Engine started");
		
	}
	@Override
	public void stopEngine() {
		System.out.println("PetroEngine::Petrol Engine Stoppped");
	}

}
