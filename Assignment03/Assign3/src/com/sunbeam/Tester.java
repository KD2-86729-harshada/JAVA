package com.sunbeam;

public class Tester {

	public static void main(String[] args) {
		double totBill =0;
		
		Invoice I1 = new Invoice();
		I1.accept();
		
		Invoice I2 = new Invoice();
        I2.accept();
		
		Invoice I3 = new Invoice();
		I3.accept();
		
		System.out.println("************************************************************");
		System.out.println("                      Details");
		System.out.println("************************************************************");
		System.out.println("Part_Number"+ "      "+ "Part_Desc"+ "      "+"Quantity"+"      "+"pricePerItem");
		I1.display();
		I2.display();
		I3.display();
		
		
		totBill += I1.TotalPrice();
		totBill += I2.TotalPrice();	
		totBill += I3.TotalPrice();
		
		System.out.println("TotalBill = "+totBill);
	}
}

