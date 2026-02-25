package com.problemsolving.company.zalando.test3;

public class BestChar {
    public static void main(String[]args){
        BestChar ts1=new BestChar();
        String output;
        output=ts1.solution("hello");
        assertEquals(output, "l");

        output=ts1.solution("helloo");
        assertEquals(output, "l");

        output=ts1.solution("aaaa");
        assertEquals(output, "a");

        output=ts1.solution("zaz");
        assertEquals(output, "z");

        output=ts1.solution("zzzzaza");
        assertEquals(output, "z");
    }

    private static void assertEquals(String actual, String expected) {
        if (expected == null ? actual != null : !expected.equals(actual)) {
            throw new AssertionError("Expected \"" + expected + "\" but got \"" + actual + "\"");
        }
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
