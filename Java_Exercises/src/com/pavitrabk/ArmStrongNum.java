package com.pavitrabk;

import java.util.Scanner;

public class ArmStrongNum {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter First Number");
		int num1 = in.nextInt();
		System.out.println("Enter Second Number");
		int num2 = in.nextInt();
		
		for(int i = num1; i < num2; i++)
		{
			int check, rem , sum = 0;
			check = i;
			while(check != 0)
			{
			rem = check % 10;
			sum = sum + (rem * rem * rem);
			check = check / 10;
			}
			
			if(sum == i)
			{
			
			System.out.println(""+i+"is an ArmStrong Number");
			}
			
		}
		
	}

}
