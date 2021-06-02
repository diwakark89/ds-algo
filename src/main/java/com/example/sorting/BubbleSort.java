package com.example.sorting;

public class BubbleSort {

    public void sort(int arr[]){

        boolean swap=true;
        int itr=1;
        for(int i=arr.length-1;i>=0&&swap;i-- ){
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
