package com.problemsolving.geeksforgeeks;

import java.util.Stack;

/**
 * Given an array, print the Next Greater Element (NGE) for every element. The Next greater Element for an element x is the first greater element on the right side of x in the array. Elements for which no greater element exist, consider the next greater element as -1.
 *
 * Examples:
 *
 * For an array, the rightmost element always has the next greater element as -1.
 * For an array that is sorted in decreasing order, all elements have the next greater element as -1.
 * For the input array [4, 5, 2, 25], the next greater elements for each element are as follows.
 * Element       NGE
 *    4      -->   5
 *    5      -->   25
 *    2      -->   25
 *    25     -->   -1
 * d) For the input array [13, 7, 6, 12}, the next greater elements for each element are as follows.
 *
 *   Element        NGE
 *    13      -->    -1
 *    7       -->     12
 *    6       -->     12
 *    12      -->     -1
 * */
public class NextGreaterElement {
    public void printNGE(int [] arr)
    {
        Stack<Integer> s = new Stack<>();
        int nge[] = new int[arr.length];

        // iterate for rest of the elements
        for (int i = arr.length - 1; i >= 0; i--)
        {
            /* if stack is not empty, then
            pop an element from stack.
            If the popped element is smaller
            than next, then
            a) print the pair
            b) keep popping while elements are
            smaller and stack is not empty */
            if (!s.empty())
            {
                while (!s.empty()
                        && s.peek() <= arr[i])
                {
                    s.pop();
                }
            }
            nge[i] = s.empty() ? -1 : s.peek();
            s.push(arr[i]);
        }
        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i] +
                    " --> " + nge[i]);
    }
}
