package com.pavitrabk;

import java.util.Scanner;

public class LargestNum {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter First Number ");
		int num1 = in.nextInt();
		System.out.println("Enetr Second Number ");
		int num2 = in.nextInt();
		
		if(num1 > num2 )
		{
			System.out.println("Num1 is Larger : " + num1);
		}
		else {
			System.out.println("Num2 is Larger :  " + num2);
		}
	}

}
