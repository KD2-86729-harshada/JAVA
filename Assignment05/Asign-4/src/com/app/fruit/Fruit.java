package com.app.fruit;

import java.util.Scanner;

public abstract class Fruit {
	 String name;
	 String  color;
	 double weight;
	 public boolean isFresh;
	 
	 
//	CONSTRUCTOR
	public Fruit(String name, double weight, String color, boolean isfresh) {
		super();
		this.name = name;
		this.weight = weight;
		this.color = color;
	}
	
// TASE
	public abstract String taste();

	
//SETTERS 
	public void setName(String name) {
		this.name = name;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public void setFresh(boolean isFresh)
	{
		this.isFresh = isFresh;
	}
	
//	GETTERS
	public String getName() {
		return name;
	}
	public String getColor() {
		return color;
	}
	public double getWeight() {
		return weight;
	}
	
	public boolean getFresh(boolean isFresh)
	{
		return isFresh;
	}
	
//	ISFRESH 
	public boolean isFresh() {
		 return isFresh();
	 }
	
//	TOSTRING
	@Override
	public String toString() {
		return "Fruit [color=" + color + ", weight=" + weight + ", name=" + name + "]";
	} 
	
//	public void aceept(Scanner sc)
//	{
//		System.out.println("Accept the Fruit name : ");
//		name = sc.next();
//		
//		System.out.println("Accpet the Fruit Weight : ");
//		weight = sc.nextDouble();
//		
//		System.out.println("Accept the Fruit color: ");
//		color = sc.next();
//	}
}




