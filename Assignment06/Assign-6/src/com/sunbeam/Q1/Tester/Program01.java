package com.sunbeam.Tester;

import java.util.Scanner;

import com.sunbeam.entity.Entity;
import com.sunbeam.exception.ExceptionLineTooLong;

public class Program01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the name :");
//		String name = sc.next();
		
		Entity ex = new Entity();
		
		try {
			ex.accept(sc);
		}
		catch(Exception e){
			e.printStackTrace();
		}
		

	}

}
