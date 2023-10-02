package com.pavitrabk.intermediate_java_programs;

import java.util.Scanner;

public class Cal_Electricity_Bill {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Please Enter Electricity Bill in units");
		int units = in.nextInt();
		double billtoPay = 0;
		
		if(units < 100)
		{
			billtoPay = units * 1.20;
		}
		else if(units < 300)
		{
			billtoPay = 100 * 1.20 + (units - 100) * 2;
		}
		else if(units > 300)
		{
			billtoPay = 100 * 1.20 + 200 * 2 + (units - 300) * 3;
		}
		System.out.println("The Electricity Bill for " + units + " units is: " + billtoPay);

	}

}
