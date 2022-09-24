package com.code.dsa.algorithms.sorting;

public class InsertionSort {

    public static void sort(int[] array) {
        int iLength = array.length;

        for (int i = 1; i < iLength; i++) {
            int item = array[i];
            int j = i - 1;
            while ((j > -1) && array[j] > item) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = item;
        }

    }

}
