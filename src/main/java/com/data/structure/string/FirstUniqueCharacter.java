package com.data.structure.string;


/*
*
* Problem Statement

Given a string s, find the index of the first non-repeating character.
If none exists, return -1.

Examples
Example 1
Input:  "leetcode"
Output: 0
Example 2
Input:  "loveleetcode"
Output: 2   // 'v'
Example 3
Input:  "aabb"
Output: -1
* */
public class FirstUniqueCharacter {

    public static void main(String[] args) {
        System.out.println(firstUniqChar("leetcode"));
        System.out.println(firstUniqChar("loveleetcode"));
        System.out.println(firstUniqChar("aabb"));
    }


    public static int firstUniqChar(String s) {
        int[] freq = new int[26]; // constant space

        // count frequency
        for (int i = 0; i < s.length(); i++) {
            char c = Character.toLowerCase(s.charAt(i));
            freq[c - 'a']++;
        }

        // find first unique
        for (int i = 0; i < s.length(); i++) {
            char c = Character.toLowerCase(s.charAt(i));
            if (freq[c - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }
}
