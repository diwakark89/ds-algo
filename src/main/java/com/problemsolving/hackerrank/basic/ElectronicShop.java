package com.problemsolving.hackerrank.basic;

import java.util.Arrays;

public class ElectronicShop {
    public static void main(String [] args){
        int[] keyboards = {40,50,60};
        int[] drives = {5,8,12};
        int budget=60;
        System.out.println(getMoneySpent(keyboards,drives,budget));
    }
    static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        int sum=0;
        Arrays.sort(keyboards);
        Arrays.sort(drives);
        for (int i=0;i<keyboards.length;i++){
            for (int j=0;j<drives.length;j++){
                int currSum=keyboards[i]+drives[j];
                if(currSum<=b && currSum>sum ){
                    sum=currSum;
                }
            }
        }
        return sum==0?-1:sum;
    }
}
