package com.code.dsa.algorithms.sorting;

public class QuickSort {

	public static void sort(int[] arr, int iStart, int iEnd) {
		if(iStart < iEnd) {
			int iParIdx = partitionIndex(iStart, iEnd, arr);
			sort(arr, iStart, iParIdx - 1);
			sort(arr, iParIdx + 1, iEnd);
		}
	}
	private static int partitionIndex(int iStart, int iEnd, int[] array) {
		int iPivot = array[iEnd];
		int iPivotIndex = iStart;
		for(int i = iStart; i <= iEnd-1 ; i++){
			if(array[i] <= iPivot){
				swap(array, i, iPivotIndex);
				iPivotIndex++;
			}
		}
		swap(array, iPivotIndex, iEnd);
		return iPivotIndex;
	}
	private static void swap(int[] array, int idx, int iPivotIdx){
		int iTemp = array[idx];
		array[idx] = array[iPivotIdx];
		array[iPivotIdx] = iTemp;
	}
}
