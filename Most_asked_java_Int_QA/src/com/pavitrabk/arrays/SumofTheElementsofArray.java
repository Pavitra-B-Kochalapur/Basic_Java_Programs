package com.pavitrabk.arrays;

import java.util.stream.IntStream;

public class SumofTheElementsofArray {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6};
		int sum = IntStream.of(arr).sum();
//		int sum = 0;
//		
//		for(int i=0; i<arr.length; i++)
//		{
//			sum += arr[i];
//		}

		System.out.println(sum);
	}

}
