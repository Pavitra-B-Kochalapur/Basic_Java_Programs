package com.pavitrabk.conditionalLoops;

import java.util.Scanner;

public class LargestNum {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int nums = 0;
		int large =0;
		
		System.out.println("Please Enter Series of Values (0 to quit) : ");
		while((nums = in.nextInt()) != 0)
		{
			if(nums > large)
			{
				large = nums;
			}
			
		}
		
		System.out.println("Largest Number is : " + large);
			

	}

}
