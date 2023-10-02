package com.pavitrabk.intermediate_java_programs;

import java.util.Scanner;

public class DepreciationofValue {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter value v = ");
		float v = in.nextInt();
		System.out.println("Enter rate of Depreciation r = ");
		float r = in.nextInt();
		System.out.println("Enter Time in Years t = ");
		float t = in.nextInt();
		
		float d = (float) (v * Math.pow((1 - r/100), t));
		System.out.println("Depreciation of value is :  " + Math.round(d));

	}

}
