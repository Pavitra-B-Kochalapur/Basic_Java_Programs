package com.pavitrabk.intermediate_java_programs;

public class PalindromeNumber {

	public static void main(String[] args) {
		
		int num = 121;
		int rem = 0;
		int sum = 0;
		int temp = num;
		
		while(num>0)
		{
			rem = num % 10;
			sum = (sum * 10) + rem;
			num = num / 10;
			
			
		}
		if(sum == temp) {
			System.out.println("palidrome number :  " + sum);
		}
		else
		{
			System.out.println("not a palindrome number");
		}

	}

}
