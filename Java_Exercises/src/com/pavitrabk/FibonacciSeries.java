package com.pavitrabk;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int a = 0;
		int b = 1;
		System.out.println(a +"  " + b + "  ");
		
		int num = in.nextInt() ;
		int nextTerm;
		
		for(int i = 2; i < num; i++)
		{
			nextTerm = a + b;
			a = b;
			b = nextTerm;
			System.out.print(nextTerm + " , " );
		}
		

		
	}

}
