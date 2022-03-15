package com.data.structure.algorithms.sorting;

public class SelectionSort {
    public static void main(String args[]) {
        int arr[] = { 64, 34, 25, 12, 22, 11, 90 };
//        int arr[] = { 90,80,70,60,50 };
//        int[] arr = {10, 20, 30, 40, 50, 60};
        int n = arr.length;
        selectionSort(arr, n);
        System.out.println("Sorted array: ");
        printArray(arr, n);
    }

    private static void selectionSort(int[] arr, int n) {
            for(int i=0;i<n;i++){
                int min_idx=i;
                for(int j=i+1;j<n;j++){
                    if(arr[j]<arr[min_idx]){
                        min_idx=j;
                    }
                }
                if(min_idx != i){
                    int temp = arr[min_idx];
                    arr[min_idx] = arr[i];
                    arr[i] = temp;
                }
            }
    }

    static void printArray(int[] arr, int size) {
        for (int i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}
