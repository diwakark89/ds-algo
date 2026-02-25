package com.data.structure.string;


import java.util.Arrays;

/*
* Given a character array, compress it in-place so that consecutive repeated characters are replaced by:

character + count

Return the new length of the compressed array.
*
*
* Example 1
Input:  ['A','A','A','A','B','B']
Output: ['A','4','B','2']
Return: 4
Example 2
Input: ['A']
Output: ['A']
Return: 1
Example 3
Input: ['A','B','B','B','C','C','D']
Output: ['A','B','3','C','2','D']
Return: 6
* */
public class CharCompress {

    public static void main(String[] args) {

        char[] chars = {'A', 'A', 'A', 'A', 'B', 'B'};
        System.out.println(compressString(chars));
        System.out.println(Arrays.toString(chars));


        chars = new char[]{'A'};
        System.out.println(compressString(chars));
        System.out.println(Arrays.toString(chars));

        chars = new char[]{'A', 'B', 'B', 'B', 'C', 'C', 'D'};
        System.out.println(compressString(chars));
        System.out.println(Arrays.toString(chars));

        chars = new char[]{'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'B', 'B'};
        System.out.println(compressString(chars));
        System.out.println(Arrays.toString(chars));
    }

    public static int compressString(char[] chars) {

        int read = 0, write = 0;
        while (read < chars.length) {
            char current = chars[read];
            int count = 0;
            while (read < chars.length && chars[read] == current) {
                read++;
                count++;
            }
            chars[write++] = current;
            if (count > 1) {
                for (char c : String.valueOf(count).toCharArray()) {
                    chars[write++] = c;
                }
            }
        }
        return write;

    }
}
