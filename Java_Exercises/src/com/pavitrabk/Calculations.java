package com.pavitrabk;

import java.util.Scanner;

public class Calculations {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter First Number ");
		
		int num1 = in.nextInt();
		System.out.println("Enter any of the (+,-,*,/) Operators ");
		char operator = in.next().charAt(0);
		
		System.out.println("Enter Second Number ");
		int num2 = in.nextInt();
		double sum = num1 + num2;
		double  sub = num1 - num2;
		double mul = num1 * num2;
		double divide = num1 / num2;
		
		if(operator == '+')
		{
			System.out.println("Sum is : " + sum);
		}
		else if(operator == '-')
		{
			System.out.println("Sub is : " + sub);
		}
		else if(operator == '*')
		{
			System.out.println("Mul is : " + mul);
		}
		else if(operator == '/')
		{
			System.out.println("Divide is : " + divide);
		}
			
	}

}
