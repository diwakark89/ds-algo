package com.data.structure.arrays;

public class WaveArray {
    public static void main(String []args){

//        int []arr=  {1, 2,3,4,5,6,7};
//        int []arr=  {1, 2,3,4,5};
        int []arr=  {1, 2,3,4,5,6};
        printWaveArray(arr);
    }

    private static void printWaveArray(int[] arr) {
        for(int i=0;i+1<arr.length;i=i+2 ){
            int temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
        }
        for(int j: arr){
            System.out.print(" "+j);
        }
    }

}
