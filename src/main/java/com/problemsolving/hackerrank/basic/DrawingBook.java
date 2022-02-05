package com.problemsolving.hackerrank.basic;

public class DrawingBook {

    public static void main(String [] args){
        System.out.println(pageCount(9,3));
        System.out.println(pageCount(5,4));
        System.out.println(pageCount(6,2));
        System.out.println(pageCount(6,1));
    }
    public static int pageCount(int n, int p) {
        return Math.min(p/2,n/2-p/2);
    }

}
