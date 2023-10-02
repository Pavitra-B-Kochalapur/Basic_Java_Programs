package com.pavitrabk;

import java.util.Scanner;

public class RupeesUSDconversions {

	public static void main(String[] args) {
		
		
		Scanner in = new Scanner(System.in);
		System.out.println("Please Eneter Rupees ");
		float rupees = in.nextLong();
		
		float dollars = rupees / 64 ;
		System.out.println(dollars + " Dollars");
		
		

	}

}
