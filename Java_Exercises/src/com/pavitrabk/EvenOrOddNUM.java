package com.pavitrabk;

import java.util.Scanner;

public class EvenOrOddNUM {
	public static void main(String[] args) {
		
		System.out.println("Enter Number : ");
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		
		if(num % 2 == 0)
		{
			System.out.println("Given Number is Even");
		}
		else {
			System.out.println("Number is Odd");
		}
		
	}
	
	

	
}

