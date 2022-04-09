package com.problemsolving.testCaseRunner;

import com.problemsolving.geeksforgeeks.SubArrayWithGivenSum;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import static org.assertj.core.api.Assertions.*;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayTestCaseRunner {
    SubArrayWithGivenSum givenSum;

    @BeforeEach
    void setup(){
        givenSum =new SubArrayWithGivenSum();
    }

    @ParameterizedTest(name = "{index}: {0}: {1}")
    @MethodSource("subArraySum")
    void shouldFindSum(int []array, int [] expected,int sum) {
        int []  result= givenSum.subArraySum(array,array.length,sum);

        assertThat(result).containsExactlyInAnyOrder(expected);
    }

    static Stream<Arguments> subArraySum() {
        return Stream.of(
                Arguments.of(new int[]{1, 4, 20, 3, 10, 5}, new int[]{2,4}, 33)
        );
    }

}
