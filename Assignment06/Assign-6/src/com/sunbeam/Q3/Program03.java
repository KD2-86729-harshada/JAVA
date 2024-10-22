package com.sunbeam.Q3;

public class Program03 {

	public static void main(String[] args) {
		String name1 = "MOM";
		String name2 = "";
		for (int i = name1.length()-1 ; i > -1; i--)
		{
			name2 = name2 + name1.charAt(i);
		}
		System.out.println("Name2 = "+name2);
		
		System.out.println("String Palindrom : "+(name1.equals(name2)));
		
		
		

	}

}
