package com.problemsolving.hackerrank.basic;

import java.util.Arrays;
import java.util.List;

public class PickingNumbers {
    public static void main(String [] args){

        var list= Arrays.asList(1,1,2,2,4,4,5,5,5);
        System.out.println(pickingNumbers(list));
    }
    public static int pickingNumbers(List<Integer> a) {
        int count=0;
        for(int i=0;i<a.size()-1;i++){
            for (int j=1;j<a.size();j++){
                if(Math.abs(a.get(i)-a.get(j))<=1){
                    ++count;
                }
            }
        }
        return count;
    }
}
