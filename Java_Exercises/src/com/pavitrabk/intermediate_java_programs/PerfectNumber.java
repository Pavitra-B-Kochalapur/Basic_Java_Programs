package com.pavitrabk.intermediate_java_programs;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		long num, sum = 0;
		Scanner in = new Scanner(System.in);
		System.out.println("Please Enter Number :  ");
		num = in.nextInt();
		
		int i = 1;
		while(i<=num/2)
		{
			if(num % i == 0)
			{
				sum = sum + i;
			}
			i++;
		}
		
		if(sum == num)
		{
			System.out.println(num+" is a Perfect Number");
		}
		else {
			System.out.println(num+" is not a Perfect Number");
		}

	}

}
