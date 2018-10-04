package com.java;

public class car {
	public String carname;
	private engine engine;
	public String getCarname() {
		return carname;
	}
	public void setCarname(String carname) {
		this.carname = carname;
	}
	public engine getEngine() {
		return engine;
	}
	public void setEngine(engine engine) {
		this.engine = engine;
	}
	public void display() {
		// TODO Auto-generated method stub
		System.out.println(carname);
		engine.show();
	}

}
