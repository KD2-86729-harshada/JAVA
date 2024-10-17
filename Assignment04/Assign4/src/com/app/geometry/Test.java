package com.app.geometry;

public class Test {

	public static void main(String[] args ) {
		Point2D p1 = new Point2D(10,20);
		Point2D p2 = new Point2D(30, 20);
		
		String points =p1.getDetails(p2);

		System.out.println("String conact"+points);
		//we can also call it 
		System.out.println(p1.getDetails(p2));
		
		p1.accept();
		
		
		if(p1.isEqual(p1))
		{
			System.out.println("Equal");
		}
		else
		{
//			System.out.println("not equal");
//			System.out.println(p1.getDetails()); 
//			System.out.println(p2.getDetails()); 
			
			p1.calculateDistance(p1);
		}
		
		p1.display();
		
		
	}
}
