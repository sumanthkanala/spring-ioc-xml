package com.ty;

public class Bus {
	Engine engine;

	Bus(Engine engine) {
		this.engine = engine;
	}

	void move() {
		engine.start();
		System.out.println("bus is working");
	}
}
