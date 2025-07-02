package com.nt.main.cbeas;

import org.springframework.stereotype.Component;

@Component("dEngine")
public class DisealEngine implements IEngine{
	public DisealEngine() {
		System.out.println("DisealEngine::0-param constructor");
	}
	
	@Override
	public void start() {
		System.out.println("Disealengine.start()::Engine started");
	}
	@Override
	public void stop() {
		System.out.println("DisealEngine.stop()::Engine stopped");
	}
}
