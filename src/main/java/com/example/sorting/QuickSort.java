package com.example.sorting;

public class QuickSort {
    private int partition(int arr[], int l, int h) {
        int pivot = arr[h];
        int i = l - 1;
        for (int j = l; j < h; j++) {
            if (pivot > arr[j]) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, h);
        return i + 1;
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }

    public void sort(int[] arr, int l, int h) {
        if (l < h) {
            int pivot = partition(arr, l, h);
            sort(arr, l, pivot - 1);
            sort(arr, pivot + 1, h);
        }
    }
}
