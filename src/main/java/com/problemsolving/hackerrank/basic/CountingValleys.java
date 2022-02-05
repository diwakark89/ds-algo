package com.problemsolving.hackerrank.basic;

public class CountingValleys {
    public static void main(String [] args){
        System.out.println(countingValleys(8,"UDDDUDUU"));
        System.out.println(countingValleys(6,"UDDDUU"));
        System.out.println(countingValleys(10,"DDUDDUUDUU"));
//        System.out.println(countingValleys(6,""));
    }

    public static int countingValleys(int steps, String path) {
        char[] actionArr=path.toCharArray();
        int count=0;
        int lvl=0;

        if(steps == 0 || steps ==1){
            return count;
        }
        for (int i=0;i<actionArr.length;i++){
            char ch=actionArr[i];
            if(ch=='U'){
                ++lvl;
            }
            if(ch=='D'){
                --lvl;
            }
            if(lvl==0 && ch=='U'){
                ++count;
            }
        }
        return count;
    }
}
