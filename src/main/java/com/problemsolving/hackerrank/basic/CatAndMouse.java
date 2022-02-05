package com.problemsolving.hackerrank.basic;

public class CatAndMouse {
    public static void main(String [] args){

        System.out.println(catAndMouse(2,5,4));
        System.out.println(catAndMouse(1,2,3));
        System.out.println(catAndMouse(1,3,2));
    }

    static String catAndMouse(int x, int y, int z) {
            if(Math.abs(x-z)<Math.abs(y-z)){
                return "Cat A";
            }
            else if(Math.abs(x-z)>Math.abs(y-z)){
                return "Cat B";
            }else {
                return "Mouse C";
            }

    }

}
