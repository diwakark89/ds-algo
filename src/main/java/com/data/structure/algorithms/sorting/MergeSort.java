package com.data.structure.algorithms.sorting;

import com.data.structure.Print;

public class MergeSort {
    public static void main(String args[]) {
//        int arr[] = { 64, 34, 25, 12, 22, 11, 90 };
        int arr[] = {90, 80, 70, 60, 50};
//        int[] arr = {10, 20, 30, 40, 50, 60};
        int n = arr.length;
        mergeSort(arr, 0, n-1);
        System.out.println("Sorted array: ");
        Print.printArray(arr, n);
    }

    private static void mergeSort(int[] arr, int l, int r) {
        if (l < r) {
            int mid = l + (r - l) / 2;
            mergeSort(arr, l, mid);
            mergeSort(arr, mid + 1, r);
            merge(arr, l, mid, r);
        }

    }

    private static void merge(int[] arr, int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];

        for (int j=0; j < n2; ++j)
            R[j] = arr[m + 1 + j];

        int i=0,j=0,k=l;

        while (i < n1 && j < n2) {
            if (L[i] < R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k++] = L[i++];
        }
        while (j < n2) {
            arr[k++] = R[j++];
        }
    }
}
