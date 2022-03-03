package com.data.structure.algorithms.sorting;

public class BubbleSort {

    // Driver program
    public static void main(String args[])
    {
//        int arr[] = { 64, 34, 25, 12, 22, 11, 90 };
//        int arr[] = { 90,80,70,60,50 };
        int arr[] = { 10,20,30,40,50,60 };
        int n = arr.length;
        bubbleSort(arr, n);
        System.out.println("Sorted array: ");
        printArray(arr, n);
    }

    private static void bubbleSort(int[] arr, int n) {
        boolean swap = false;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                    swap = true;
                }
            }
            if (!swap) {
                break;
            }
        }

    }
    static void printArray(int arr[], int size)
    {
        int i;
        for (i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}
