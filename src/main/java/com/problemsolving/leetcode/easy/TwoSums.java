package com.problemsolving.leetcode.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSums {
    public static void main(String []args){
//
//        System.out.println(Arrays.toString(twoSums(new int[]{2, 7, 11, 15}, 9)));
//        System.out.println(Arrays.toString(twoSums(new int[]{2,5,5,11}, 10)));

        System.out.println(Arrays.toString(twoSumFast(new int[]{2, 7, 11, 15}, 9)));
        System.out.println(Arrays.toString(twoSumFast(new int[]{2,5,5,11}, 16)));


    }

    public static int [] twoSums(int [] nums, int target){
        int [] result=new int[2];
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    result[0]=i;
                    result[1]=j;
                }
            }
        }
        return result;
    }

    public static int[] twoSumFast(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++) {
            Integer val = map.get(target-nums[i]);
            if(val==null) {
                map.putIfAbsent(nums[i],i);
            } else {
                return new int[]{val,i};
            }
        }
        return null;
    }
}
