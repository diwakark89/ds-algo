package com.problemsolving.leetcode.comptetive.t286;

import java.util.*;
import java.util.stream.Collectors;

public class FindArrayDifference {

    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Map<Integer,Integer> diffNum=new HashMap<>();
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> list1;

        Set<Integer> list2=new HashSet<>();

        for (int i:nums1){
            diffNum.put(i,1);
        }
        for (int i:nums2){
            if(diffNum.containsKey(i)){
                diffNum.put(i,-2);
            }else {
                list2.add(i);
            }
        }
        list1= diffNum.entrySet()
                .stream()
                .filter(entry-> entry.getValue() >0)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
        result.add(list1);
        result.add(new ArrayList<>(list2));
        return result;
    }
}
