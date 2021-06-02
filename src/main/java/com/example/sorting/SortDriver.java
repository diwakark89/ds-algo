package com.example.sorting;

public class SortDriver {


    public static void main(String [] args){
        SortDriver sd=new SortDriver();
        int[] arr1 =new int[]{10,1,23,15,2,17,19,16};
        int[] arr2 =new int[]{1,2,35,46,57,69};
        int[] arr3 =new int[]{79,69,56,45,32,22,11};
//        runBubbleSort(sd,arr1,arr2,arr3);
//        runMergeSort(sd,arr1,arr2,arr3);
        runQuickSort(sd,arr1,arr2,arr3);

    }

    private static void runQuickSort(SortDriver sd, int[] arr1, int[] arr2, int[] arr3) {
        QuickSort sort=new QuickSort();
        sort.sort(arr1,0, arr1.length-1);
        sd.printArray(arr1);
        sort.sort(arr2,0, arr2.length-1);
        sd.printArray(arr2);
        sort.sort(arr3,0, arr3.length-1);
        sd.printArray(arr3);
    }

    private static void runMergeSort(SortDriver sd, int[] arr1, int[] arr2, int[] arr3) {
        MergeSort sort=new MergeSort();
        sort.sort(arr1);
        sd.printArray(arr1);
        sort.sort(arr2);
        sd.printArray(arr2);
        sort.sort(arr3);
        sd.printArray(arr3);
    }

    private static void runBubbleSort(SortDriver sd, int[] arr1, int[] arr2, int[] arr3){
        BubbleSort sort=new BubbleSort();
        sort.sort(arr1);
        sd.printArray(arr1);
        sort.sort(arr2);
        sd.printArray(arr2);
        sort.sort(arr3);
        sd.printArray(arr3);
    }
    private void printArray(int[] arr){
        for(int a: arr){
            System.out.print(" "+a);
        }
        System.out.println();
    }
}
