package com.pavitrabk.intermediate_java_programs;

import java.util.Scanner;

public class Cal_FutureInvestment_Value {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		double fv = 0;
		System.out.println("Please Enter Value of pv : ");
		double pv = in.nextInt();
		System.out.println("Please Enter Value of i: ");
		double i = in.nextInt();
		System.out.println("Please Enter Value of n: ");
		int n = in.nextInt();
		
		fv = pv * Math.pow((1+i) , n);
		System.out.println("Future Investment Value is :  " + fv);
				

	}

}
