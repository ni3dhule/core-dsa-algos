package com.code.dsa.algorithms.sorting;

public class MergeSort {

    public static void sort(int[] array, int iStart, int iEnd){
        int iMidleIdx = (iStart+iEnd)/2;

        if(iStart < iEnd){
            sort(array, iStart, iMidleIdx);
            sort(array, iMidleIdx+1, iEnd);
            merge(array, iStart, iMidleIdx, iEnd);
        }
    }

    public static void merge(int[] arr, int iStart, int iMiddle, int iEnd){
        int iLeftArrayLength = iMiddle - iStart + 1;
        int iRightArrayLength = iEnd - iMiddle;

        int leftArray[] = new int[iLeftArrayLength];
        int rightArray[] = new int[iRightArrayLength];

        for (int i=0 ; i<iLeftArrayLength; i++){
            leftArray[i] = arr[iStart + i];
        }

        for(int j = 0; j< iRightArrayLength; j++){
            rightArray[j] = arr[iMiddle + j + 1];
        }

        int i = 0;
        int j = 0;
        int k = iStart;

        while (i<iLeftArrayLength && j<iRightArrayLength){
            if(leftArray[i] <= rightArray[j]){
                arr[k] = leftArray[i];
                i++;
            }else {
                arr[k] = rightArray[j];
                j++;
            }
            k++;
        }
        while (i < iLeftArrayLength){
            arr[k] = leftArray[i];
            i++;
            k++;
        }
        while(j < iRightArrayLength){
            arr[k]=rightArray[j];
            j++;
            k++;
        }
    }
}
