package com.app.fruits;

import java.util.Scanner;

public abstract class Fruit {

	 String color;
	 double weight;  
	 String name;
	 boolean isFresh;
	 
	 public Fruit(){
		 
	 }

	public Fruit(String color, double weight, String name, boolean isFresh) {
		super();
		this.color = color;
		this.weight = weight;
		this.name = name;
		this.isFresh = isFresh;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isFresh() {
		return isFresh;
	}

	public void setFresh(boolean isFresh) {
		this.isFresh = isFresh;
	}
	
	public boolean getFresh(boolean isFresh) {
		return isFresh;
	}

	@Override
	public String toString() {
		return "Fruit [color=" + color + ", weight=" + weight + ", name=" + name + ", isFresh=" + isFresh + "]";
	}
	 
	 public abstract String taste();

	 
	 public void acceptFruit(Scanner sc)
		{
			System.out.println("Enter Fruit Color-");
			color = sc.next();
			
			System.out.println("Enter Fruit Weigth-");
			weight = sc.nextDouble();
			
			System.out.println("Enter Fruit Name -");
			name = sc.next();
		}
}
