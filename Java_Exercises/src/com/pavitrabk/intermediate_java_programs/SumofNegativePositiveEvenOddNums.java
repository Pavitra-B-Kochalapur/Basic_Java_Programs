package com.pavitrabk.intermediate_java_programs;

import java.util.Scanner;

public class SumofNegativePositiveEvenOddNums {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int negNum = 0, posEven = 0, posOdd = 0, num = 0;
		
		System.out.println("Enter Series of Numbers (end = 0)");
	
		while((num = in.nextInt())!= 0 )
		{
		if(num<0)
		{
		negNum = negNum + num;
		
		}
		else if(num > 0 && num % 2 == 0)
		{
		posEven = posEven + num;
		
		}
		else
		{
		posOdd = posOdd + num;
		
		}
	}
	System.out.println("sum of negNum :  " + negNum);
	System.out.println("Sum of posEven :  " + posEven);
	System.out.println("sum od posOdd :  " + posOdd);
	
	}

}
