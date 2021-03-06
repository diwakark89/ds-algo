package com.data.structure.algorithms.sorting;

public class HeapSort implements ArraySort {

    public void sort(int[] arr, int n) {

        for (int i = (n / 2) - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        for (int i = n - 1; i > 0; i--) {
            swap(arr, i, 0);
            heapify(arr, i, 0);
        }
    }

    private void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    private void heapify(int[] arr, int n, int i) {

        int l = i * 2 + 1;
        int r = i * 2 + 2;
        int max = i;

        if (l < n && arr[l] > arr[max])
            max = l;
        if (r < n && arr[r] > arr[max])
            max = r;
        if (max != i) {
            swap(arr, max, i);
            heapify(arr, n, max);
        }

    }
}
