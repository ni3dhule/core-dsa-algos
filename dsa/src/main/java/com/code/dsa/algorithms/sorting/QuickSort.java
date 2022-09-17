package com.code.dsa.algorithms.sorting;

public class QuickSort {

	public static void sort(int[] arr, int iStart, int iEnd) {
	
		if(iStart < iEnd) {
			int iParIdx = partitionIdex(iStart, iEnd, arr);
			sort(arr, iStart, iParIdx-1);
			sort(arr, iParIdx+1, iEnd);
		}
		
	}
	
	private static int partitionIdex(int iStart, int iEnd, int[] array) {
		
		int iPartitionIndex = 0;
		
		return 0;
	}
}
