package com.pavitrabk.intermediate_java_programs;

public class Compound_Interest {

	public static void main(String[] args) {
		
		double ci = 0;
		double p = 1200;
		double r = 5.4;
		int    t =  2;
		
		ci = p * Math.pow((1 + r/100) , t);
		System.out.println("Compound Interest is : " + ci);

	}

}
