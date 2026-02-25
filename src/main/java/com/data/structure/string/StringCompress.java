package com.data.structure.string;

/*
* Description

Given a character array, compress it in-place so that consecutive repeated characters are replaced by:

character + count

Return the new length of the compressed array.

Examples (as in interview)
Example 1
Input:  AAAABB
Output: A4B2
Return: 4
* -------------
Example 2
Input: A
Output: A
Return: 1
* * -------------
Example 3
Input: ABBBCCD
Output: AB3C2D
Return: 6
* * -------------
* */

public class StringCompress {

    public static void main(String[] args) {
        System.out.println(compress("AAAABB"));
        System.out.println(compress("A"));
        System.out.println(compress("ABBBCCD"));
    }

    public static String compress(String str){
        if(str==null || str.isEmpty()){
            return str;
        }
        StringBuilder sb=new StringBuilder();

        int read=0;

        while(read<str.length()){
            char current =str.charAt(read);
            int count=0;
            while(read<str.length() && str.charAt(read)==current){
                read++;
                count++;
            }
            sb.append(current);
            if(count>1){
                sb.append(count);
            }
        }
        return sb.toString();
    }
}
