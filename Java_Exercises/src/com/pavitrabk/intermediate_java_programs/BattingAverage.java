package com.pavitrabk.intermediate_java_programs;

import java.util.Scanner;

public class BattingAverage {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Please Enter runs ");
		int runs = in.nextInt();
		System.out.println("Enter matches");
		int matches = in.nextInt();
		System.out.println("Enter notOut");
		int notOut = in.nextInt();
		
		try {
			int dismissals = matches - notOut ;
			int avg = runs / dismissals;
			System.out.println("Average of Batting :  " + avg);
			
		} catch (java.lang.ArithmeticException  ex) {
			System.out.println("Should avoid divide by 0 : " + ex);
		} 		

	}

}
