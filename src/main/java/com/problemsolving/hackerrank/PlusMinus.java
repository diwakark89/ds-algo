package com.problemsolving.hackerrank;

import java.util.Arrays;
import java.util.List;

public class PlusMinus {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(-4, 5, 3, 0, -2, -2, 1, 0, 5, 3, 0, -2, -2, 1, 0, 5, 3, 0, -2, -2, 1, 0);
        plusMinus(arr);

    }

    public static void plusMinus(List<Integer> arr) {
        float positiveCount = 0;
        float negativeCount = 0;
        float zeroCount = 0;

        for (int i : arr) {
            if (i > 0) {
                ++positiveCount;
            } else if (i < 0) {
                ++negativeCount;
            } else {
                ++zeroCount;
            }
        }

        System.out.printf("%.6f\n", positiveCount / arr.size());
        System.out.printf("%.6f\n", negativeCount / arr.size());
        System.out.printf("%.6f", zeroCount / arr.size());


    }
}
