package com.data.structure.algorithms.sorting;

public class CountingSort implements ArraySort{

    @Override
    public void sort(int[] arr, int n) {
        int [] count=new int [256];
        int [] output=new int [n];
        for(int i=0; i<256;i++){
            count[i]=0;
        }

        for(int i=0;i<n;i++){
            ++count[arr[i]];
        }

        for(int i=1;i<256;i++){
            count[i]+=count[i-1];
        }

        for(int i=n-1;i>=0;i--){
            output[count[arr[i]]-1]=arr[i];
            --count[arr[i]];
        }
        for(int i=0;i<n;i++){
            arr[i]=output[i];
        }
    }
}
