package com.data.structure.algorithms.sorting;

public class SortDriver {
    public static final int QUICK_SORT = 1;
    public static final int BUBBLE_SORT = 2;
    public static final int HEAP_SORT = 3;
    public static final int COUNTING_SORT = 4;
    public static final int MERGE_SORT = 5;
    public static final int RADIX_SORT = 6;


    public static void main(String[] args) {
        SortDriver sd = new SortDriver();
        int[] arr1 = new int[]{10, 1, 23, 15, 2, 17, 19, 16};
        int[] arr2 = new int[]{1, 2, 35, 46, 57, 69};
        int[] arr3 = new int[]{79, 69, 56, 45, 32, 22, 11};
        int[][] array = new int[3][];
        array[0] = arr1;
        array[1] = arr2;
        array[2] = arr3;

        sd.sortArray(array, RADIX_SORT);

    }

    public void sortArray(int[][] arrayOfArray, int sortValue) {
        ArraySort sort;
        for (int[] arr : arrayOfArray) {
            switch (sortValue) {
                case QUICK_SORT:
                    sort = new QuickSort();
                    sort.sort(arr, arr.length - 1);
                    break;
                case COUNTING_SORT:
                    sort = new CountingSort();
                    sort.sort(arr, arr.length);
                    break;
                case HEAP_SORT:
                    sort = new HeapSort();
                    sort.sort(arr, arr.length);
                    break;
                case MERGE_SORT:
                    sort = new MergeSort();
                    sort.sort(arr, arr.length);
                    break;
                case BUBBLE_SORT:
                    sort = new BubbleSort();
                    sort.sort(arr, arr.length);
                    break;
                case RADIX_SORT:
                    sort = new RadixSort();
                    sort.sort(arr, arr.length);
                    break;
            }
            printArray(arr);

        }


    }

    private void printArray(int[] arr) {
        for (int a : arr) {
            System.out.print(" " + a);
        }
        System.out.println();
    }
}
