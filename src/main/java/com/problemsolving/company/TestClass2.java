package com.problemsolving.company;

public class TestClass2 {
    public static void main(String[] args) {
        TestClass2 ts1 = new TestClass2();
//       int []a=ts1.solution(7,16);
//        int []a=ts1.solution(1,4);
        int []a=ts1.solution(1,2);
        System.out.println(a[0]);
        System.out.println(a[1]);
    }

    public int[] solution(int X, int Y) {
        int i, j = 0;
        int[] a = {-1, -1};
        i = 1;
        if (Y < 2) {
            return a;
        }
        int mt=2;
        int bt=4;

        i=1;
        while (i<X && i*mt<Y) {
            i++;
        }
        if ((Y - (i * mt)) > 0 && i<X) {
            j=1;
            while (Y-(i*mt)>=0) {
                j++;
                i--;
            }
        }
        a[0]=i;
        a[1]=j;
        return a;
    }
}
