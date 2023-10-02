package com.pavitrabk.intermediate_java_programs;

import java.util.Scanner;

public class DiscountofProduct {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Please Enter Marked-Price");
		double markedPrice = in.nextInt();
		System.out.println("Enter Discount here");
		double dis = in.nextInt();
		double s = 100 - dis ;
		double amount = (s * markedPrice) / 100;
		
		System.out.println("amount after discount : " + amount );
		

	}

}
