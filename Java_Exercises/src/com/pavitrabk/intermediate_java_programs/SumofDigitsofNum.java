package com.pavitrabk.intermediate_java_programs;

import java.util.Scanner;

public class SumofDigitsofNum {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Number");
		int n = in.nextInt();
		int r = 0;
		int sum = 0;
		
		while(n != 0)
		{
			r = n % 10;
			sum = sum + r;
			n = n / 10;
		}
		
		System.out.println("Sum of Digits of Number :  " + sum );

	}

}
