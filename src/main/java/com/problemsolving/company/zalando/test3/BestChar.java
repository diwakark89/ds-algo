package com.problemsolving.company.zalando.test3;

import static org.assertj.core.api.Assertions.assertThat;

public class BestChar {
    public static void main(String[]args){
        BestChar ts1=new BestChar();
        String output;
        output=ts1.solution("hello");
        assertThat(output).isEqualTo("l");

        output=ts1.solution("helloo");
        assertThat(output).isEqualTo("l");

        output=ts1.solution("aaaa");
        assertThat(output).isEqualTo("a");

        output=ts1.solution("zaz");
        assertThat(output).isEqualTo("z");

        output=ts1.solution("zzzzaza");
        assertThat(output).isEqualTo("z");
    }

    String solution(String S) {
        int[] occurrences = new int[26];
        for (char ch : S.toCharArray()) {
            occurrences[ch - 'a']++;
        }

        char best_char = 'a';
        int  best_res  = 0;

        for (int i = 0; i < 26; i++) {
            if (occurrences[i] > best_res) {
                best_char = (char)((int)'a' + i);
                best_res  = occurrences[i];
            }
        }

        return Character.toString(best_char);
    }
}
