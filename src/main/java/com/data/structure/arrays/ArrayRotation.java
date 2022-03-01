package com.data.structure.arrays;

public class ArrayRotation {
    public static void main(String []args){
        ArrayRotation ar = new ArrayRotation();
        System.out.println(ar.gcd(2, 7));
    }
    int gcd(int a, int b)
    {
        if (b == 0)
            return a;
        else
            return gcd(b, a % b);
    }
}
