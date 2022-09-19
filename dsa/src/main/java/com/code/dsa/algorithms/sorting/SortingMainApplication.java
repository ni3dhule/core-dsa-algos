package com.code.dsa.algorithms.sorting;

import java.util.Arrays;

public class SortingMainApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int arr[] = {64,25,12,22,11};
		int arr[] = { 64, 34, 25, 12, 22, 11, 90 };
		System.out.println("========================================================================================");
		System.out.println("Array before Selection Sort : "+Arrays.toString(arr));
		SelectionSort.sort(arr);

		System.out.println("========================================================================================");
		//int arrQuickSort[] = { 64, 34, 25, 12, 22, 11, 90 };
		int arrQuickSort[] = {100, 12, 100, 1, 1, 12, 100, 1, 12, 100, 1, 1};
		System.out.println("Array before Quick sort : "+ Arrays.toString(arrQuickSort));
		QuickSort.sort(arrQuickSort, 0, arrQuickSort.length - 1);
		System.out.println("Array after Quick sort : "+ Arrays.toString(arrQuickSort));
		System.out.println("========================================================================================");
		int arrMergeSort[] = { 9, 3, 1, 5, 13, 12 };
		System.out.println("Array before Merge sort : "+ Arrays.toString(arrMergeSort));
		MergeSort.sort(arrMergeSort, 0, arrMergeSort.length - 1);
		System.out.println("Array after Merge sort : "+ Arrays.toString(arrMergeSort));
		System.out.println("========================================================================================");
	}
}
