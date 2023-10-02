package com.pavitrabk.intermediate_java_programs;

import java.util.Scanner;

public class AverageofNnums {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Please Enter Value of N ");
		int nums = in.nextInt();
		int count = 1;
		float n ,avg ,sum = 0;
		
		
		while((count <= nums))
		{
			System.out.println("Enter the " + count + " number");
			n = in.nextInt();
			sum = sum + n;
			count++;
			
		}
		
		avg = sum / count;
		
		System.out.println(count);
		System.out.println(sum);
		System.out.println(avg);

	}

}
