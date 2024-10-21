package com.app.fruit;

public class Apple extends Fruit{
	
	
	public Apple(String name, double weight, String color) {
		super(name, weight, color,true);

	}


	@Override
	public String taste() {
		return color;
		
	}
	

}
