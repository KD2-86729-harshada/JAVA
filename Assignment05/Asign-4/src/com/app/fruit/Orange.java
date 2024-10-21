package com.app.fruit;

public class Orange extends Fruit {

	public Orange(String name, double weight, String color) {
		super(name, weight, color, false);
	
	}

	@Override
	public String taste() {
		return color;

		
	}
	
	

	 
}
