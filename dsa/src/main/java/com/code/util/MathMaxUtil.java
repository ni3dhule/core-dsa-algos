package com.code.util;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MathMaxUtil {

	public static int findMax(int iFirst, int iSecond) {
		return Math.max(iFirst, iSecond);
	}
	
	public static int findMin(int iFirst, int iSecond) {
		return Math.min(iFirst, iSecond);
	}
	
	public static int avg(int[] avgs) {
		
		System.out.println("Input arrays : "+Arrays.toString(avgs));
		// 	Brute force Approach 
		// 	int average = 0;
		// 	int iTotal = 0;
		// 	for (int item : avgs) {
		//		iTotal+=item;
		// 	}
		// average = Math.round(iTotal/avgs.length);
		
		//using java 8 stream API
		int average = 0;
	 	int sum = Arrays.stream(avgs).sum();
		average = Math.round(sum/avgs.length);
		return average;
		
	}
}
