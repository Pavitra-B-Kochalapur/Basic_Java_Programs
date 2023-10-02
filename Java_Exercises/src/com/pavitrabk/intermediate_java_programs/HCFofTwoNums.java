package com.pavitrabk.intermediate_java_programs;

import java.util.Scanner;

public class HCFofTwoNums {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int a , b ,i, hcf = 0;
		
		System.out.println("Enter First Number a : ");
		a = in.nextInt();
		System.out.println("Enter Second Number b : ");
		b = in.nextInt();
		
		for(i =1 ; i<=a || i<=b; i++)
		{
			if(a%i == 0 && b%i == 0)
			{
				hcf = i;
			}
		}
		System.out.println("HCF OF a  and b is : " + hcf);

	}

}
