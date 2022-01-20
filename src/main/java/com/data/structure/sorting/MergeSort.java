package com.data.structure.sorting;

public class MergeSort implements ArraySort{


    public void merge(int[] arr, int l, int r ){
        if(r>l){
            int m=l+(r-l)/2;
            merge(arr,l,m);
            merge(arr,m+1,r);
            mergeSort(arr,l,m,r);
        }
    }

    private void mergeSort(int[] arr, int l, int m, int r) {
        int n1=m-l+1;
        int n2=r-m;

        int []L=new int[n1];
        int []R=new int[n2];


        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];

        int i = 0, j = 0;
        int k = l;

        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }


        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        /* Copy remaining elements of R[] if any */
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    public void sort(int[] arr,int n) {
        merge(arr,0,arr.length-1 );
    }
}
