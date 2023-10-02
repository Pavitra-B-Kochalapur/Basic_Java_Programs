package com.pavitrabk.intermediate_java_programs;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Word ");
		String name = in.next();
		char ch;
		String reverse = "";
		
		for(int i =0; i < name.length(); i++)
		{
			ch = name.charAt(i);
			reverse = ch + reverse;
		}
		System.out.println("Reverse String is :  " + reverse);
	}

}
