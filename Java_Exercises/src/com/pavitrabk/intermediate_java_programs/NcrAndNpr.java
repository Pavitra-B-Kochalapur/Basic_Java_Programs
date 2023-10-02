package com.pavitrabk.intermediate_java_programs;

import java.util.Scanner;

public class NcrAndNpr {
	
	double fact(int n)
	{
		double fact = 1;
		for(int i =1; i <= n ; i++)
		{
			 fact = fact * i;
		}
		return fact;
	}

	public static void main(String[] args) {
		
		NcrAndNpr p = new NcrAndNpr();
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Value of n ");
		int n = in.nextInt();
		System.out.println("Enter Value of r ");
		int r = in.nextInt();
		
		if(n>=r)
		{
			double per = p.fact(n) / p.fact (n-r);
			double com = p.fact(n) / p.fact(n-r) * p.fact(r);	
			System.out.println("The value of permutation is :  " + per);
			System.out.println("The value of permutation is :  " + com);
		}
		else {
			System.out.println("n should be n>=r");
		}

	}

}
