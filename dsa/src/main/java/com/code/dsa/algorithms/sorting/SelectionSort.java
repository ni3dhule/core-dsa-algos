package com.code.dsa.algorithms.sorting;

import java.util.Arrays;

public class SelectionSort {

	public static void sort(int[] arr) {

		int length = arr.length;
		for(int i=0; i<length; i++) {
			int iMinIndex = i;
			for(int j=i+1; j<length; j++) {
				if(arr[j] < arr[iMinIndex]) {
					iMinIndex = j;
				}
			}
			int tmp = arr[iMinIndex];
			arr[iMinIndex] = arr[i];
			arr[i] = tmp;
		}
		
		System.out.println("Sorted Array is : "+Arrays.toString(arr));
		
	}
}
