package com.pavitrabk.conditionalLoops;

import java.util.Scanner;

public class FactorsofNum {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Please Enter Number");
		int num = in.nextInt();
		int r = 0;
		int res = num;
	
		while(res>0)
		{
			r = res % 10;
			res = res / 10;
			System.out.print("factors of the Number : " );
			System.out.println(r);
			
		}
		

	}

}
