package com.data.structure.arrays;

/*
*
* You are given two integer vectors in compressed (run-length encoded) form:

[(value, count), (value, count), ...]

Each pair means the value repeats count times in the original vector.

Your task: compute the dot product efficiently
👉 without decompressing the vectors

Examples (like a real interview)
Example 1
v1 = [(1, 3), (2, 2)]        → [1,1,1,2,2]
v2 = [(2, 2), (3, 3)]        → [2,2,3,3,3]

Dot product =
1*2 + 1*2 + 1*3 + 2*3 + 2*3 = 19
* ----------------------------------
Example 2
v1 = [(5, 1)]
v2 = [(10, 1)]

Output: 50
*
* -----------------------------------
Example 3
v1 = [(1, 1000000)]
v2 = [(2, 1000000)]

Output: 2000000

(Shows why decompression is impossible)
*
🧠 Algorithm

Initialize pointers i, j

While both lists have elements:

Take min(count1, count2)

Add value1 * value2 * minCount

Reduce both counts

Move pointer if count hits zero

✏️ Step-by-Step Example
*
* v1: (1,3)   v2: (2,2)
min = 2 → result += 1*2*2 = 4

v1: (1,1)   v2: (3,3)
min = 1 → result += 1*3*1 = 3

v1: (2,2)   v2: (3,2)
min = 2 → result += 2*3*2 = 12

Total = 19

Total = 19
* */
public class DotProduct {
    public static void main(String[] args) {
        int[][]v1={{1,3},{2,2}};
        int[][]v2={{2,2},{3,3}};
        System.out.println(dotProduct(v1,v2));

    }

    public static long dotProduct(int[][]v1, int [][]v2){
        int i=0,j=0;
        long result=0;

        int c1=0,c2=0;

        while(i<v1.length && j< v2.length){
            if(c1==0){
                c1=v1[i][1];
            }
            if(c2==0){
                c2=v2[j][1];
            }
            int min=Math.min(c1,c2);
            result+=(long)v1[i][0]*v2[j][0]*min;
            c1-=min;
            c2-=min;
            if(c1<=0){
                i++;
            }
            if(c2<=0){
                j++;
            }
        }

        return result;
    }
}
