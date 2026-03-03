package com.problemsolving.hackerrank.basic;

import java.util.ArrayList;
import java.util.List;

public class CircularArrayRotation {
    public static void main(String[] args) {

        System.out.println(circularArrayRotation(List.of(3,4,5),2,List.of(1,2)));
    }

    public static List<Integer> circularArrayRotation(
            List<Integer> a, int k, List<Integer> queries) {

        int n = a.size();
        k = k % n;

        List<Integer> result = new ArrayList<>();

        for (int q : queries) {
            int originalIndex = (q - k + n) % n;
            result.add(a.get(originalIndex));
        }

        return result;
    }

}
