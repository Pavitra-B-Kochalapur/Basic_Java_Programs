package com.pavitrabk.intermediate_java_programs;

import java.util.Scanner;

public class SumofNaturalNums {

	public static void main(String[] args) {
		
		int i, num, sum = 0;
		Scanner in = new Scanner(System.in);
		System.out.println("Sum From : ");
		i = in.nextInt();
		System.out.println("Sum up to");
		num = in.nextInt();
		
		while(i <= num)
		{
		sum = sum + i;
		i++;
		
		}
		System.out.println("Sum of Natural Numbers :  " + sum);
		
	}

}
