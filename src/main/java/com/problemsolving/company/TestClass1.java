package com.problemsolving.company;

public class TestClass1 {
    public static void main(String[]args){
        TestClass1 ts1=new TestClass1();
//        int[] A ={1,2,3,5,6,7,8,9};
//        int[] A ={1,2,3,10,11,15};
//        int[] A ={5,-3,-2,-1,0,1,5,6,7};
        int[] A ={3,5,7,10,15};
        System.out.println(ts1.solution(A));
    }
    public int solution(int []A ){
        int maxIncr=1;
        int maxDecr=1;
        int inc=1;
        int decr=1;
        for(int i=0;i<A.length-1;i++){
            if(A[i]+1==A[i+1]){
                inc++;
            }else{
                inc=1;
            }
            if(A[i]-1==A[i+1]){
                decr++;
            }else{
                decr=1;
            }
            if(inc>maxIncr){
                maxIncr=inc;
            }
            if(decr>maxDecr){
                maxDecr=decr;
            }
        }
        return Math.max(maxDecr, maxIncr);
    }
}
