package com.pavitrabk.intermediate_java_programs;

import java.util.Scanner;

public class CalculateDistancebtwTwoPoints {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter x1");
		double x1 = in.nextInt();
		System.out.println("Enter x2");
		double x2 = in.nextInt();
		System.out.println("Enter y1");
		double y1 = in.nextInt();
		System.out.println("Enter y2");
		double y2 = in.nextInt();
		
		double distance = Math.round(Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1)));
		System.out.println("Distance of Two points :  " + distance);

	}

}
