package com.problemsolving.company.zalando;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class TestClass1 {
    public static void main(String[]args){
        TestClass1 ts1=new TestClass1();
//        int[] A ={1,2,3,5,6,7,8,9};
//        int[] A ={1,2,3,10,11,15};
//        int[] A ={5,-3,-2,-1,0,1,5,6,7};
//        int[] A ={3,5,7,10,15};
        int[] A ={3,5,6,3,3,5};
        System.out.println(ts1.solution(A));
    }

    private Integer solution(int[] A) {
        AtomicInteger ans = new AtomicInteger();
        Map<Integer, Integer> pairMap = new HashMap<>();
        for (int j : A) {
            if (pairMap.containsKey(j)) {
                pairMap.computeIfPresent(j, (k, v) -> v + 1);
            } else {
                pairMap.put(j, 1);
            }
        }
        pairMap.forEach((key, value) -> {
            int count = value;
            ans.addAndGet((count * (count - 1)) / 2);
        });

        return ans.get();
    }

}
