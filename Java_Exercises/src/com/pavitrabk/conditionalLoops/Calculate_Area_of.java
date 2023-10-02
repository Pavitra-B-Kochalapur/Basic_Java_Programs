package com.pavitrabk.conditionalLoops;

import java.util.Scanner;

public class Calculate_Area_of {

	public static void main(String[] args) {
		System.out.println("Calculate Area of ...");
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter any of (c,t,r,p) The Char to Check Area ");
		char find = in.next().charAt(0);
		
		if(find == 'c')
		{
			System.out.println("Area of Circle");
			System.out.println("Please Enter Radius");
			int r = in.nextInt();
			final double  pi = 3.27;
			double areaC = (pi * r * r);
			System.out.println("Area of Circle is : " + areaC);
		}
		else if(find == 't')
		{
			System.out.println("Area of Triangle");
			System.out.println("Please Enter Base");
			int  b = in.nextInt();
			System.out.println("Please Enter height");
			int h = in.nextInt();
			double areaT = ( b * h) / 2;
			System.out.println("Area of Triangle is : " + areaT);
		}
		else if(find == 'r')
		{
			System.out.println("Area of Rectangle");
			System.out.println("Please Enter Length");
			int  w = in.nextInt();
			System.out.println("Please Enter Width");
			int  l= in.nextInt();
			double areaR =( w*l);
			System.out.println("Area of Rectangle is : " + areaR);
		}
		else if(find == 'p')
		{
			System.out.println("Area of Parallelogram");
			System.out.println("Please Enter Base");
			int  b = in.nextInt();
			System.out.println("Please Enter Height");
			int  h = in.nextInt();
			double areaP =( b*h);
			System.out.println("Area of Parallelogram is : " + areaP);
		}
		
	}

}
