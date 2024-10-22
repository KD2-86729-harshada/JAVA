package com.sunbeam.Q2;

public class ProgramQ2 {

	public static void main(String[] args) {
		String s = "Harshada";
		String reverse = "";
		for(int i = s.length()-1; i > -1; i--)
		{
			reverse = reverse + s.charAt(i);
		}	
		System.out.println("reverse string = "+reverse);
	}

}
