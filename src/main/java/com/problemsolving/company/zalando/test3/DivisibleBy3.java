package com.problemsolving.company.zalando.test3;

import static org.assertj.core.api.Assertions.assertThat;

public class DivisibleBy3 {
    public static void main(String[]args){
        DivisibleBy3 ts3=new DivisibleBy3();
        int val;

        val=ts3.solution("23");
        assertThat(val).isEqualTo(7);

        val=ts3.solution("0081");
        assertThat(val).isEqualTo(11);

        val=ts3.solution("022");
        assertThat(val).isEqualTo(9);
    }

    public int solution(String S){
        int digitSum =0, totalFound=0;
        for (int i = 0; i < S.length(); ++i) {
            digitSum += S.charAt(i) - 48;
        }

        if (digitSum % 3 == 0){
            totalFound++;
        }

        for (int i = 0; i < S.length(); ++i) {
            int newSum = digitSum - (S.charAt(i) - 48);
            for (int j = 0; j <= 9; ++j) {
                if (((newSum + j) % 3 == 0) && (j != S.charAt(i) - 48)) {
                    ++totalFound;
                }
            }
        }
        return totalFound;
    }
}
