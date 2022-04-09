package com.problemsolving.leetcode.comptetive.t285;

import java.util.*;

public class Kdistant {
    public static void main(String []args){
//        int [] nums={3,4,9,1,3,9,5};
//        int key=9;
//        int k=1;
        int [] nums={ 2,2,2,2,2};
        int key=2;
        int k=2;
        Kdistant kdistant=new Kdistant();
        System.out.println(kdistant.findKDistantIndices(nums,key,k));

    }

    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        Set<Integer> keyMap=new HashSet<>();
        Set<Integer> outputSet=new LinkedHashSet<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]==key){
                keyMap.add(i);
            }
        }
        for (int i=0;i<nums.length;i++){
            for(int j: keyMap){
                    if(Math.abs(i-j)<=k){
                        outputSet.add(i);
                    }

            }
        }
        return new ArrayList<>(outputSet);
    }

    public List<Integer> findKDistantIndices_Best(int[] nums, int key, int k) {
        List<Integer> ret = new ArrayList<>();
        for(int i = 0;i < nums.length;i++){
            for(int j = 0;j < nums.length;j++){
                if(Math.abs(i-j) <= k && nums[j] == key){
                    ret.add(i);
                    break;
                }
            }
        }
        return ret;
    }
}
