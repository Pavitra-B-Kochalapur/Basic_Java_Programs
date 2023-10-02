package com.pavitrabk.intermediate_java_programs;

import java.util.Scanner;

public class LCMofTwoNums {

	public static void main(String[] args) {
		
		int n1, n2,hcf= 0 , lcm = 0;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter First Number ");
		n1 = in.nextInt();
		System.out.println("Enter Sceond Number ");
		n2 = in.nextInt();
		
		for(int i = 1; i<=n1 && i<=n2;i++)
		{
			
			if(n1%i == 0 && n2%i == 0 )
			{
				hcf = i;
			}
			
			lcm = (n1 * n2) / hcf;
			
		}
		System.out.println("Lcm of n1 and n2 is : " + lcm);
		

	}

}
