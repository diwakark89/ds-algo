package com.problemsolving.leetcode.comptetive;

public class MaximumTopTest {
    public static void main(String[] args) {
//        int[] nums = {5, 2, 2, 4, 0, 6};
//        int k = 4;

//        int[] nums ={68,76,53,73,85,87,58,24,48,59,38,80,38,65,90,38,45,22,3,28,11};
//        int k = 1;
        int[] nums = {5, 6, 2, 4, 0, 6};
        int k = 2;
//        int[] nums = {5, 6, 2, 4, 0, 6};
//        int k = 3;
//        int[] nums = {5, 6, 7};
//        int k = 2;
//
//        int[] nums = {99,95,68,24,18};
//        int k = 60;
        MaximumTopTest top = new MaximumTopTest();
        System.out.println(top.maximumTop(nums, k));
    }

    public int maximumTop(int[] nums, int k) {
        if (1 == nums.length ) {
            return -1;
        }
        if(k<=1 && nums.length>1){
            return nums[1];
        }

        int max = nums[0];
        int i = 1;
        for (; i < nums.length-1; ++i) {
            if (max < nums[i]) {
                max = nums[i];
            }
        }
        return Math.max(nums[i], max);
    }
}
