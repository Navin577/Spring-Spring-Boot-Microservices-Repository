package com.nt.main.cbeas;

import org.springframework.stereotype.Component;

@Component("cEngine")
public class CNGEngine implements IEngine{
	public CNGEngine() {
		System.out.println("CNGEngine::0-param constructor");
	}
	@Override
	public void start()
	{
		System.out.println("CNGEngine.start()::Engine started");
	}
	@Override
	public void stop() {
		System.out.println("CNGEngine.stop()::Engine stoppes");
	}

}
