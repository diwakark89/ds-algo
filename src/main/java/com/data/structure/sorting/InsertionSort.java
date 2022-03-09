package com.data.structure.sorting;

public class InsertionSort {
    public static void main(String args[]) {
//        int arr[] = { 64, 34, 25, 12, 22, 11, 90 };
        int arr[] = { 90,80,70,60,50 };
//        int[] arr = {10, 20, 30, 40, 50, 60};
        int n = arr.length;
        insertionSort(arr, n);
        System.out.println("Sorted array: ");
        printArray(arr, n);
    }

    static void printArray(int arr[], int size) {
        for (int i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    private static void insertionSort(int[] arr, int n) {
        for(int i=1;i<n;i++){
            int k=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>k){
                arr[j+1]=arr[j];
                --j;
            }
            arr[j+1]=k;
        }
    }
}
