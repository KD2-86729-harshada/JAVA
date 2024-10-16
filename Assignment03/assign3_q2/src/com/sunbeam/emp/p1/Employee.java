package com.sunbeam.emp.p1;

import java.util.Scanner;

public class Employee {

	String fname = "";
	String lname = "";
	double salary = 0.0;
	
	
	public Employee()
	{
		fname = "Harshada";
		lname = "Patil";
		salary = 5000.0;
	}
	
	public Employee(String fname, String lname, Double salary) 
	{
		this.fname = fname;
		this.lname = lname;
		this.salary = salary;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	
	public void accept()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the first name : ");
		setFname (sc.next());
		
		System.out.print("Enter the LAst name : ");
		setLname (sc.next());
		
		System.out.print("ENter the salary : ");

		double s1 =sc.nextDouble();
		if (s1 < 0)
		{
			System.out.println("Salary cannot be negative");
		}
		else
		{
			setSalary(s1);
		}
		System.out.println("****************************************************");
		
	}
	
	
	public void display()
	{
		System.out.println("First Name of Employee : "+getFname());
		System.out.println("Last name of Employee : "+getLname());
		double yearlySalry = getSalary() * 12;
		System.out.println("Yearly salary is "+ yearlySalry);
		double salRise = yearlySalry * 0.10;
		System.out.println("Employee's 10% rise is "+salRise);
		System.out.println("****************************************************");
	}
	
	
	
	
			
}
