import java.util.Scanner;

public class q1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the Number : ");
		int number = sc.nextInt();
		
		String val_binary = Integer.toBinaryString(number);
		System.out.println("number in binary is "+ val_binary);
		
		String val_octal = Integer.toOctalString(number);
		System.out.println("Number in octal is "+ val_octal);
		
		String val_hexadecimial = Integer.toHexString(number);
		System.out.println("Number in hexdecimal is "+ val_hexadecimial);
		
	}

}
