package com.app.geometry;

import java.util.Scanner;

import java.lang.Math;

class Point2D
{
	int x_cord ;
	int y_cord;
	
	int x1;
	int  y1;
	
	public Point2D(int x_cord, int y_cord) 
	{
		this.x_cord = x_cord;
		this.y_cord = y_cord;
	}

	 public String getDetails(Point2D d)
	 {
		 return "("+ x_cord+","+y_cord+")";
//		 return "("+this.x_cord+","+this.y_cord+")" ;

	 }
	 
	 public void accept()
	 {
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.print("Enter the x-cord : ");
		 x1 = sc.nextInt();
		 
		 System.out.print("Enter the y-cord : ");
		 y1 = sc.nextInt();
		 
	 }
	 
	 
	 public boolean isEqual(Point2D p)  //here this is pointing to p1 internally and p2 is a variable of object 
	 {
			 return this.x_cord == p.x1 && this.y_cord == p.y1;
	 }
	 
	 public void calculateDistance(Point2D p)
	 {
//		 double a = Math.pow(((p.x_cord) - (this.x_cord)), 2); //p.x_cord -> p2
//		 double b = Math.pow(((p.y_cord) - (this.y_cord)) , 2); //this.x_cord ->p1
		 
		 double a = Math.pow(((p.x1) - (this.x_cord)), 2); //p.x_cord -> p2
		 double b = Math.pow(((p.y1) - (this.y_cord)) , 2); //this.x_cord ->p1
		 
		 System.out.println(Math.sqrt(a+b));
		 
	 }
	 
	 
	 public void display()
	 {
		 System.out.println("Point details : "+ "("+ "p1 -> "+this.x_cord+","+this.y_cord+")" + "\n            p2->" + "("+this.x1+","+this.y1+")"); 
	 }
	 
	 
	 
	
}
