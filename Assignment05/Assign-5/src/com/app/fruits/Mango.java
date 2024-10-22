package com.app.fruits;

public class Mango extends Fruit{

	public Mango() {
	}
	
	
	public Mango(String color, double weight, String name, boolean isFresh) {
		super(color, weight, name, true);
	}

	@Override
	public String taste() {
		
		return "sweet";
	}

}
