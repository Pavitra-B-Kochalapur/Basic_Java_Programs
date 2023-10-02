package com.pavitrabk.conditionalLoops;

import java.util.Scanner;

public class SumofAllNums {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Please Enter Inputs (0 = end ) ");
		
		int nums = 0;
		int sum = 0;
		
		while((nums = in.nextInt()) != 0) 
		{
			sum += nums;
		}
		System.out.println("sum of nums: " + sum);
		
			
	}

}
