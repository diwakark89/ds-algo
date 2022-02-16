package com.example;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class TestRunClass {
    //n=10, arr={1,2,3,4,5,6,7,8,10}
    // Task remove -ve
    // SQUare of remaining numbers
    //
    public static void main(String [] args){
        List<Integer> integerList= Arrays.asList(-1,2,3,-4,-5);
        
    }
    public void solve(List<Integer> integerList){
        List<Double> newList= integerList.stream().
                filter(i-> i>0).map(i->Math.sqrt(i)).collect(Collectors.toList());
        Collections.sort(newList);
    }
}
