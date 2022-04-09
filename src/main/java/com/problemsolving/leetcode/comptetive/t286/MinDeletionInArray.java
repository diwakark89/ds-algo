package com.problemsolving.leetcode.comptetive.t286;

import java.util.*;

public class MinDeletionInArray {

    public int minDeletion(int[] nums) {

        List<Integer> integerList = new ArrayList<>();
        for (int i : nums) {
            integerList.add(i);
        }
        int i = 0, delCount = 0;

        boolean flag = true;
        while (flag) {
            flag = false;
            i = 0;
            Iterator<Integer> itr = integerList.iterator();
            while (i < integerList.size() - 1) {
                itr.next();
                if (i % 2 == 0 && Objects.equals(integerList.get(i), integerList.get(i + 1))) {
                    delCount++;
                    itr.remove();
                }
                ++i;
            }
            if (integerList.size() % 2 != 0) {
                flag = true;
                itr.remove();
            }

        }
        return delCount;
    }
}
