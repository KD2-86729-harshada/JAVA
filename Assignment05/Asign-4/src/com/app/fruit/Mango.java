package com.app.fruit;

public class Mango extends Fruit {

	public Mango(String name, double weight, String color) {
		super(name ,weight,color, true);
		
	}

	@Override
	public String taste() {
		return color;
		
		
	}
	
	
	 
}
