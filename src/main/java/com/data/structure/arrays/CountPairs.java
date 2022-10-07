package com.data.structure.arrays;

import java.util.HashMap;
import java.util.Map;

public class CountPairs {
    public static void main(String []args){
        CountPairs cp=new CountPairs();
        int []arr=  {1, 5, 7, -1, 5};
        System.out.println(cp.getPairsCount(arr,6));
    }
    public int getPairsCount(int []arr,int sum){
        Map<Integer,Integer> countMap=new HashMap<>();
        int count=0;

        for (int j : arr) {
            if (countMap.containsKey(sum-j)) {
               count+=countMap.get(sum-j);
            }if (countMap.containsKey(j)){
                countMap.put(j, countMap.get(j) + 1);
            }
            else {
                countMap.put(j, 1);
            }
        }

        return count;
    }

}
