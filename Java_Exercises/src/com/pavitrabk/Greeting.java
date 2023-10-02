package com.pavitrabk;

import java.util.Scanner;

public class Greeting {

	public static void main(String[] args) {
		System.out.println("Enter Name");
		Scanner in = new Scanner(System.in);
		String name = in.next();
		
		System.out.println("Hii " + name + ", WelCome To Java World");
	}

}
