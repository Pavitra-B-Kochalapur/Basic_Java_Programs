package com.pavitrabk.intermediate_java_programs;

import java.util.Scanner;

public class Cal_CGPA {

	public static void main(String[] args) {
		
		double math = 9.1, science = 9.2, social = 9.5 , english = 9.7, hindi = 9.8;
		double numofSubs = 5;
		
		double cgpa = (math + science + social + english + hindi) / numofSubs;
		double cgpaPer = 9.5 * cgpa;
		
		System.out.println("cgpa Percentage is :  "+ Math.round(cgpaPer));
		

	}

}
