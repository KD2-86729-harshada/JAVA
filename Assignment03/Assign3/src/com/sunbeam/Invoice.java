package com.sunbeam;

import java.util.Scanner;

public class Invoice {

	String partNumber;
	String partDesc;
	int quant;
	double pricePerItem;
	
	public Invoice() {
		
		partNumber = "";
		partDesc = "";
		quant = 0;
		pricePerItem = 0;	
	}
	
	public Invoice(String partNumber, String partDesc, int quant, double pricePerItem) {
		
		this.partNumber = partNumber;
		this.partDesc = partDesc;
		this.quant = quant;
		this.pricePerItem = pricePerItem;	
	}

	public String getPartNumber() {
		return partNumber;
	}

	public void setPartNumber(String partNumber) {
		
		
		this.partNumber = partNumber;
	}

	public String getPartDesc() {
		return partDesc;
	}

	public void setPartDesc(String partDesc) {
		this.partDesc = partDesc;
	}

	public int getQuant() {
		return quant;
	}

	public void setQuant(int quant) {
		this.quant = quant;
	}

	public double getPricePerItem() {
		return pricePerItem;
	}

	public void setPricePerItem(double pricePerItem) {
		this.pricePerItem = pricePerItem;
	}
	
	
	public void accept()
	{
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter part no. : ");
		setPartNumber(sc.next());
		
		
		System.out.print("Enter part Description. : ");
		setPartDesc(sc.next());
		
		System.out.print("Enter part quantity. : ");
		setQuant(sc.nextInt());
		
		System.out.print("Enter part price. : ");
		
		double p1 = sc.nextDouble();
		if(p1<0)
		{
			System.out.println("Enter the Positive number ");
		}
		else
		{
			setPricePerItem(p1);
		}	
		
	}
	
	public void display()
	{
		System.out.println(getPartNumber()+ "                 "+ getPartDesc()+ "                  "+getQuant()+"            "+getPricePerItem());
	
	}
	
	
	public double TotalPrice()
	{
		double amount = getPricePerItem() *  getQuant();
		return amount;
	}
	
	
   
   
	
	
	
	
}
