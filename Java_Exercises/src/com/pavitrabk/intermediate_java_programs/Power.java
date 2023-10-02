package com.pavitrabk.intermediate_java_programs;

import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Base a");
		 double a = in.nextInt();
		 System.out.println("Enter Sqr b");
		 double b = in.nextInt();
		 
		 double p = Math.pow(a, b);
		 System.out.println("Power of given Number :  " + p);

	}

}
