package com.app.fruits;

import java.applet.Applet;
import java.util.Scanner;

public class FruitBasket {
	
	public static int menu(Scanner sc) {
		
		System.out.println("________________________________________________________________________");
		System.out.println("0. Exit");
		System.out.println("1. Add mango ");
		System.out.println("2. Add Orange");
		System.out.println("3. Add Apple");
		System.out.println("4. Display name of all Fruits in basket ");
		System.out.println("5. Display tastes of all stale(not fresh) fruits in the basket");
		System.out.println("6. Display tastes of all stale(not fresh) fruits in the basket. ");
		System.out.println("7. Mark a fruit as stale ");
		System.out.println("8.  Mark all sour fruits stale");
		System.out.println("________________________________________________________________________");
		System.out.println("Enter choice : ");
		return sc.nextInt();	
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner( System.in);

		System.out.println("Enter size-");
		int size = sc.nextInt();
		 
		Fruit[] basket = new Fruit[size];// Array of references
		
		
		int count = 0;
		int choice;
		
		while((choice = menu(sc))!=0)
		{
			switch (choice) {
			case 0:
				System.out.println("Thank you :) ");
				System.exit(0);
				
			case 1:
//				System.out.println("Enter the name : ");
//				String name = sc.next();
//				
//				System.out.println("Enter the Color : ");
//				String color = sc.next();
//				
//				System.out.println("Enter the Weight : ");
//				double weight = sc.nextDouble();
//				count ++;
				
				basket[count] = new Mango();
				basket[count].acceptFruit(sc);
				count++;
				
				break;
				
			case 2:
				basket[count] = new Orange();
				basket[count].acceptFruit(sc);
				count++;
				break;

			case 3:
				basket [count] = new Apple();
				basket[count].acceptFruit(sc);
				count++;
				break;
				
			case 4:
				for(Fruit fruit:basket)
					if(fruit != null)
						System.out.println(fruit.getName());
				break;
				
			case 5:
				for(Fruit fruit:basket)
					if(fruit != null)
						System.out.println(fruit.toString());
				break;
			case 6:
				System.out.println("Taste of all stale fruit");
				for(Fruit fruit:basket)
					if(fruit != null && fruit.getFresh(true))
						System.out.println(fruit.getName() + " : "+ fruit.taste());
				break;
				
			case 7:
					System.out.println("Enter the index : ");
					int index = sc.nextInt();
					
					if(index >= 0 && index < count && basket[index]!=null)
						basket[index].setFresh(false);
					System.out.println("mark it stale");
					
				break;
				
			case 8:
				
				for(Fruit fruit : basket)
					if(fruit !=null && fruit.taste().equals("Sour")) {
						fruit.setFresh(false);
						System.out.println("Marked fruit as sour");
					}
			
				System.out.println("sweet");
				
				break;
				
			default:
				System.out.println("Inavlid choice :( " );
				break;
			}
		}
	}
}
