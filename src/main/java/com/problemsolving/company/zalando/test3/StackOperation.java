package com.problemsolving.company.zalando.test3;

import java.util.Stack;

import static org.assertj.core.api.Assertions.assertThat;

public class StackOperation {
    public static void main(String[] args) {
        StackOperation ts2 = new StackOperation();
        int val;

        val = ts2.solution("4 5 6 - 7 +");
        assertThat(val).isEqualTo(8);
        val = ts2.solution("13 DUP 4 POP 5 DUP + DUP + -");
        assertThat(val).isEqualTo(7);
        val = ts2.solution("5 6 + -");
        assertThat(val).isEqualTo(-1);
        val = ts2.solution("3 DUP 5 - -");
        assertThat(val).isEqualTo(-1);
        val = ts2.solution("1048575 DUP +");
        assertThat(val).isEqualTo(-1);

        val = ts2.solution("1 POP 1");
        assertThat(val).isEqualTo(1);

        val = ts2.solution("1 POP");
        assertThat(val).isEqualTo(-1);

        val = ts2.solution("-1 1");
        assertThat(val).isEqualTo(-1);

        val = ts2.solution("DUP 1");
        assertThat(val).isEqualTo(-1);

        val = ts2.solution("POP 1");
        assertThat(val).isEqualTo(-1);

        val = ts2.solution("0 0 DUP");
        assertThat(val).isEqualTo(0);

        val = ts2.solution("0 0 DUP -1");
        assertThat(val).isEqualTo(-1);
    }


    public int solution(String S) {

        Stack<Integer> integerStack = new Stack<>();
        for (String input : S.split(" ")) {
            if ("POP".equals(input)) {
                if(integerStack.size()>0) {
                    integerStack.pop();
                }else{
                    return -1;
                }
            } else if ("DUP".equals(input)) {
                if(integerStack.size()>0){
                    int val = integerStack.peek();
                    integerStack.push(val);
                }else{
                    return -1;
                }
            } else if ("+".equals(input)) {
                if (integerStack.size() > 1) {
                    int val1 = integerStack.pop();
                    int val2 = integerStack.pop();
                    integerStack.push(val1 + val2);
                } else {
                    return -1;
                }
            } else if ("-".equals(input)) {
                if (integerStack.size() > 1) {
                    int val1 = integerStack.pop();
                    int val2 = integerStack.pop();
                    if (val1 < val2) {
                        return -1;
                    }
                    integerStack.push(val1 - val2);
                } else {
                    return -1;
                }
            } else {
                int val = getUnsignedInteger(input);
                if (val != -1) {
                    integerStack.push(val);
                } else {
                    return -1;
                }
            }
        }
        return integerStack.size() > 0 ? integerStack.peek() : -1;

    }

    public int getUnsignedInteger(String input) {
        try {
            int val = Integer.parseInt(input);
            if (val < 1048575 && val > -1) {
                return val;
            }
            return -1;
        } catch (NumberFormatException e) {
            return -1;
        }
    }
}
