package com.problemsolving.hackerrank.basic;

import java.util.Arrays;
import java.util.List;

public class HurdleRace {
    public static void main(String[] args) {

        var list = Arrays.asList(1, 1, 2, 2, 4, 4, 5, 5, 5);
        System.out.println(hurdleRace(4, list));
    }


    public static int hurdleRace(int k, List<Integer> height) {
        int doses = 0;
        for (int a : height) {
            int jump = a - k;
            if (jump > 0 && jump > doses) {
                doses = jump;
            }
        }
        return doses;

    }
}
