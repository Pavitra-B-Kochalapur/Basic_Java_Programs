package com.pavitrabk.numbers;

public class SumOfDigitsOfGivenNumber {

	public static void main(String[] args) {
		int num = 102;
		int sum = 0;
		
		while(num>0)
		{
			sum = sum + num%10;
			num = num/10;
		}
		
		System.out.println(sum);

	}

}
