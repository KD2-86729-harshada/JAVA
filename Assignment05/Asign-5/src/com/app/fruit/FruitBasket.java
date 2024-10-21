package com.app.fruit;

import java.util.Scanner;

public class FruitBasket {

	public static int menu(Scanner sc)
	{
		System.out.println("__________________________________________________________");
		System.out.println("0.Exit");
		System.out.println("1.Add Mango ");
		System.out.println("2.Add Orange ");
		System.out.println("3.Add Apple ");
		System.out.println("4.Display Names for all the fruits in basket");
		System.out.println("5.Display Name, color, weigth, taste of all fresh fruits");
		System.out.println("6.Display tastes of all stale fruits");
		System.out.println("7.Mark a fruit as stale");
		System.out.println("8.Marks all sour fruits stale");
		System.out.println("_________________________Welcome__________________________");
		
		System.out.println("Enter your choice: ");
		return sc.nextInt();
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your size: ");
		int size = sc.nextInt();
		
		//Array of references where we can store the objects subclass 
		Fruit[] basket = new Fruit[size];
		int counter = 0;
		
		
		int choice;
		while((choice = menu(sc))!=0)
		{
			switch (choice) {
			case 0:
				System.exit(0);
				break;
			case 1:
				if(counter < size)
				{
					System.out.println("Enter the name: "); 
					String name = sc.next();
					
					System.out.println("Enter the Color: "); 
					String color = sc.next();
					
					System.out.println("Enter the Weight: "); 
					double weight = sc.nextDouble();
					
					basket[counter] = new Mango(name ,weight,color);
					counter++;
					
//					if(counter < size)
//					{
//						basket[counter] = new Mango();
//						basket[counter].accept();
//						counter++;
//					}
				}
				break;
				
			case 2:
				if(counter < size)
				{
					System.out.println("Enter the name: "); 
					String name = sc.next();
					
					System.out.println("Enter the Color: "); 
					String color = sc.next();
					
					System.out.println("Enter the Weight: "); 
					double weight = sc.nextDouble();
					
					basket[counter] = new Orange(name ,weight,color);
					counter++;
				}
				break;
				
			case 3:
				if(counter < size)
				{
					System.out.println("Enter the name: "); 
					String name = sc.next();
					
					System.out.println("Enter the Color: "); 
					String color = sc.next();
					
					System.out.println("Enter the Weight: "); 
					double weight = sc.nextDouble();
					
					basket[counter] = new Apple(name ,weight,color);
					counter++;
				}
				break;
				
			case 4:
					for(Fruit fruit : basket)
						if(fruit != null)
							System.out.println(fruit.getName());
//					System.out.println("Array Fulled");
				break;
				
			case 5:
					for(Fruit fruit : basket)
						if(fruit != null)
							System.out.println(fruit.toString());
				break;

			case 6:
				System.out.print("Taste of all stale Fruits : ");
				for(Fruit fruit : basket)  //take indivisual value and assign it to fruit
					if(fruit != null && !fruit.getFresh(false))
						System.out.println(fruit.getName()+";"+fruit.taste());
				
				break;
				
			case 7:
				System.out.println("Enter the index : ");
				int index = sc.nextInt();
				
				if(index >= 0 && index<counter && basket[index] != null)//this is for -> index chyavr object nsel tr
				{
					basket[index].setFresh(false);
					System.out.println("Marked fruit as stale");
				}
				else
				{
					System.out.println("Marked fruit as fresh");
				}
				break;
						
			case 8:
				for(Fruit fruit : basket)	
					if(fruit != null && fruit.taste().equals("sour"))//fruit.taste kadun yeanri taste sour aahe ka check kelay
						fruit.setFresh(false);
				break;
				
			default:
				System.out.println("Inavlid choice :(");
				break;
			}
			
		}
	}

}
