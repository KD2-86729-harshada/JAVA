package com.sunbeam.Assignment;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class StudNameComparatorAsc implements Comparator<Student>
{
	@Override
	public int compare(Student o1, Student o2) {
		return o1.getName().compareTo(o2.getName());
	}
}

class StudCityComparatorAsc implements Comparator<Student>
{
	@Override
	public int compare(Student o1, Student o2) {
		return o1.getCity().compareTo(o2.getCity());
	}	
}

class StudMarksComparatorDesc implements Comparator<Student>
{
	@Override
	public int compare(Student o1, Student o2) {
		return Double.compare(o2.getMarks(), o1.getMarks());
	}
}

public class Program01 {
	
	public static int menu(Scanner sc)
	{
		System.out.println("0.exit");
		System.out.println("1.sort on their city (asc)");
		System.out.println("2.sort on their on marks (desc) ");
		System.out.println("3.sort on their on name (asc) ");
		System.out.println("4.sort on the rollno");
		System.out.println("_________________________________________________________");
		System.out.print("Enter your choice : ");
		return sc.nextInt();	
	}
	
	public static void displayArray(Student[] arr) {
		System.out.println("___________________________________________________________");
		for(Student stud :arr)
			System.out.println(stud.getRoll()+" "+stud.getName()+"     "+stud.getCity()+"      "+stud.getMarks());
		System.out.println("___________________________________________________________");
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//		arr[0] = new Student(1,"Harshada", "Kolhapur", 90.5);
//		arr[1] = new Student(9,"Pari", "Pune", 88.25);
//		arr[2] = new Student(4,"Shreya", "Sangli", 88.25);
//		arr[3] = new Student(3,"Srushti", "Mumbai", 89.2);
//		arr[4] = new Student(4,"Trisha", "Delhi", 77.45);
		
		Student[] arr = new Student[5];
		Comparator<Student> comparator;
		
		arr[0] = new Student();
		arr[0].setRoll(9);
		arr[0].setName("Harshada");
		arr[0].setCity("Kolhapur");
		arr[0].setMarks(90.5);
		
		arr[1] = new Student();
		arr[1].setRoll(2);
		arr[1].setName("Pari");
		arr[1].setCity("Pune");
		arr[1].setMarks(88.25);
		
		arr[2] = new Student();
		arr[2].setRoll(8);
		arr[2].setName("Shreya");
		arr[2].setCity("Sangli");
		arr[2].setMarks(86.5);
		
		arr[3] = new Student();
		arr[3].setRoll(4);
		arr[3].setName("Srushti");
		arr[3].setCity("Mumbai");
		arr[3].setMarks(92.1);
		
		arr[4] = new Student();
		arr[4].setRoll(1);
		arr[4].setName("Trisha");
		arr[4].setCity("Delhi");
		arr[4].setMarks(66.23);
		
		int choice;
		while((choice = menu(sc))!=0)
		{
			switch (choice) {
			case 0:
				System.out.println("Thank you :) ");
				System.exit(0);
				break;
				
			case 1:
				System.out.println("Sorting based on city : ");
				comparator = new StudCityComparatorAsc();
				Arrays.sort(arr,comparator);
				displayArray(arr);
				break;
				
			case 2:
				System.out.println("Sorting based on Marks in descending order : ");
				comparator = new StudMarksComparatorDesc();
				Arrays.sort(arr, comparator);
				displayArray(arr);
				break;
				
			case 3:
				System.out.println("sorting based on Name : ");
				comparator = new StudNameComparatorAsc();
				Arrays.sort(arr, comparator);
				displayArray(arr);
				break;
				
			case 4:
				System.out.println("Sorting on rollno : ");
				Arrays.sort(arr);
				displayArray(arr);
				break;

			default:
				System.out.println("Invalid choice :(");
				break;
			}
		}
	}

}

