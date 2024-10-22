package com.sunbeam.entity;

import java.util.Scanner;

import com.sunbeam.exception.ExceptionLineTooLong;

public class Entity {
	
	String name;
	
	public Entity() {
		
	}
	
	public Entity(String name) {
		super();
		this.name = name;
	}

	public void accept(Scanner sc) throws ExceptionLineTooLong 
	{
		System.out.println("Enter the name:");
		String name = sc.next();
		if(name.length()>80)
			throw new ExceptionLineTooLong ("length of String should be less than 80");
		
	}

	
	
	
	
	
}
