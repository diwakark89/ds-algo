package com.example.searching;

public class SortDriver {
    public static void main(String [] args){
        SortDriver sd=new SortDriver();
        int[] arr1 =new int[]{10,1,23,15,2,17,19,16};
        int[] arr2 =new int[]{1,2,35,46,57,69};
        int[] arr3 =new int[]{79,69,56,45,32,22,11};
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
