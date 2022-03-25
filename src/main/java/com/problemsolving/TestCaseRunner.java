package com.problemsolving;

import com.problemsolving.company.zalando.Assassins;
import com.problemsolving.company.zalando.TestClass1;
import com.problemsolving.geeksforgeeks.NextGreaterElement;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class TestCaseRunner {
    NextGreaterElement nextGreaterElement;
    Assassins assassins;
    @BeforeEach
    void setup(){
            nextGreaterElement =new NextGreaterElement();
            assassins= new Assassins();
    }



    @DisplayName("Should Print Next Greater Element")
    @ParameterizedTest(name = "{index}: {0}")
    @MethodSource("simpleArrayParameters")
    void shouldPrintNextGreaterElement(int []array) {
        nextGreaterElement.printNGE(array);

    }

    @ParameterizedTest(name = "{index}: {0}")
    @MethodSource("stringMatrix")
    void shouldFindThePath(String []array, boolean expected) {
        boolean result= assassins.Solution(array);
        assertEquals(expected,result);
    }

    static Stream<Arguments> stringMatrix() {
        return Stream.of(
                Arguments.of(new String[]{"X.....>", "..v..X.", ".>..X..", "A......"}, false),
                Arguments.of(new String[]{"...Xv", "AX..^", ".XX.."}, false),
                Arguments.of(new String[]{"A.v","..."}, false),
                Arguments.of(new String[]{"...",">.A"}, false)
                );
    }

    static Stream<Arguments> simpleArrayParameters() {
        return Stream.of(
                Arguments.of(new int[]{
                                11, 13, 21, 3
                        }
                ),
                Arguments.of(new int[]{
                        4, 5, 2, 25
                        }
                )
        );
    }


}
