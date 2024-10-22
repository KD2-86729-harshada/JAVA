package com.app.fruits;

public class Orange extends Fruit{

	public Orange() {
	}
	
	public Orange(String color, double weight, String name, boolean isFresh) {
		super(color, weight, name, false);
	}

	@Override
	public String taste() {

		return "sour";
	}
	
}
