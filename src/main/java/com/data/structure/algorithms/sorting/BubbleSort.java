package com.data.structure.algorithms.sorting;

public class BubbleSort implements ArraySort {

    public void sort(int arr[],int n){

        boolean swap=true;
        int itr=1;
        for(int i=n-1;i>=0&&swap;i-- ){
            swap=false;
            for (int j=0;j<i;j++){
                if(arr[j]>arr[j+1]){
                    swap=true;
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
                itr++;
            }

        }
        System.out.println(""+itr);
    }
}
