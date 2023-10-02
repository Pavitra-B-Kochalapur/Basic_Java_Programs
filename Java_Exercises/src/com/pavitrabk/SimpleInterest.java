package com.pavitrabk;

import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		
		System.out.println("Enter here...");
		Scanner in = new Scanner(System.in);
		int p = in.nextInt();
		int t = in.nextInt();
		int r = in.nextInt();
		int si = 0;
		
		si =(( p * t * r) / (100 ));
		
		System.out.println("Simple Interest = " + si);
	}

}
