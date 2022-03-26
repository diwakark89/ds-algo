package com.data.structure.algorithms.sorting;

import java.util.Arrays;

public class RadixSort implements ArraySort {

    @Override
    public void sort(int[] arr, int n) {
        int max = findMax(arr);
        for (int exp = 1; max / exp > 0; exp *= 10) {
            radixSort(arr, n, exp);
        }
    }

    private void radixSort(int[] arr, int n, int exp) {
        int[] count = new int[10];
        int[] output = new int[n];
        int i;
        Arrays.fill(count, 0);

        for ( i = 0; i < n; i++) {
            count[(arr[i] / exp) % 10]++;
        }
        for ( i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }

        for ( i = n - 1; i >= 0; --i) {
            output[count[(arr[i] / exp) % 10] - 1] = arr[i];
            count[(arr[i] / exp) % 10]--;
        }
//        System.arraycopy(output, 0, arr, 0, n);
        for (i = 0; i < n; i++)
            arr[i] = output[i];
    }

    private int findMax(int[] arr) {
        return Arrays.stream(arr).max().getAsInt();
    }
}
