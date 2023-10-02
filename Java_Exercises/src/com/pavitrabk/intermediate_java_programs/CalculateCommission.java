package com.pavitrabk.intermediate_java_programs;

import java.util.Scanner;

public class CalculateCommission {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Please Enter Amount");
		double amount = in.nextInt();
		System.out.println("Enter CommissionPercentage");
		double commissionPercentage = in.nextInt();
		
		double commission = ((commissionPercentage/100) * amount);
		System.out.println("commission :  "+ commission);

	}

}
