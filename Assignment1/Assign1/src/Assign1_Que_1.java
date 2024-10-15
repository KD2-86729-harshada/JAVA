import java.util.Scanner;

public class Que_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
        System.out.print("Enter the first number : ");
     

//		double num2 = sc.nextDouble();
		
        double num1 = 0;
		if (sc.hasNextDouble())
		{
			if(sc.hasNextInt())
			{
				System.out.print("Enter the double type of value");
			}
			else 
			{
				num1 = sc.nextDouble();
				System.out.println("First number is "+ num1);
			}	
		}
		
		
		System.out.print("Enter the second number : ");
		double num2 =0;
		if (sc.hasNextDouble())
		{
			if(sc.hasNextInt())
			{
				System.out.print("Enter the double type of value");
			}
			else 
			{
				num2 = sc.nextDouble();
				System.out.println("First number is "+ num2);
			}
		}
		
		//average
		if (num1 != 0 && num2 != 0)
		{
			double avg;
			avg = (num1 + num2)/2 ;
			System.out.print("Average of two nuumbers is "+avg);
		}
	}

}
