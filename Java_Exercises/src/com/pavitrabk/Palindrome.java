package com.pavitrabk;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		System.out.println("Please Enter Name");
		Scanner in = new Scanner(System.in);
		String name = in.nextLine();
		
		if(isPalindrome(name))
		{
			System.out.println(name + " is a Palindrome String ");
		}
		else {
			System.out.println(name + " is not a Palindrome String ");
		}
		
		
	}
	
	public static boolean isPalindrome(String str)
	{
		int left = 0; int right = str.length() - 1;
		while(left < right) 
		{
		if(str.charAt(left) != str.charAt(right) ) 
		{
			return false;
		}
		left++;
		right--;
		}
		return true;
	}

}
