package com.pavitrabk.intermediate_java_programs;

import java.util.Scanner;

public class cal_evenDaysinMonth {

	public static void main(String[] args) {

		int m ,days = 0, y = 0, even = 0;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Month");
		m = in.nextInt();
		System.out.println("Enter Year");
		y = in.nextInt();
		
		if(m <= 12 && m >=1)
		{
		if(m == 1 || m==3 || m==5|| m==7|| m==8|| m==10|| m==12)
		{
			days = 31;
			even = days / 2;
		}
		else if(m==4 || m==6 || m==9 || m==11)
		{
			days = 30;
			even = days / 2;
		}
		else if(m==2)
		{
			if((y % 4 == 0) && (y % 100 != 0) || (y % 400 == 0))
					{
				        days = 29;
				        even = days / 2;
					}
			else
			{
				days = 28;
				even = days / 2;
			}
			
		}

		System.out.println("Number of days in " + m + " month " + y + " year is : " + days+
				", even days in a  " + m + " month :  " + even);
		}
		else
			System.out.println("entered month number is not there in calender");
	}

}
